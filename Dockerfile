FROM oracle/graalvm-ce:20.0.0-java8 as graalvm
# For JDK 11
#FROM oracle/graalvm-ce:20.0.0-java11 as graalvm
RUN gu install native-image

COPY . /home/app/customer
WORKDIR /home/app/customer

RUN native-image --no-server -cp build/libs/customer-*-all.jar

FROM frolvlad/alpine-glibc
RUN apk update && apk add libstdc++
EXPOSE 8080
COPY --from=graalvm /home/app/customer/customer /app/customer
ENTRYPOINT ["/app/customer"]
