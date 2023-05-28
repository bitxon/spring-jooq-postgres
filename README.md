# Spring & jOOQ & FlyWay & Postgres

This PoC verifies how Transactions works for JOOQ with Spring

Application has two maven build profiles
- testcontainers
- local

### Build with testcontainers
```shell
./mvnw clean verify
```

### Build with local Database
```shell
docker-compose up -d
```
```shell
./mvnw clean verify -P '!testcontainers, local'
```