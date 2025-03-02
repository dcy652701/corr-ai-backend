# CorrAi

At Movement, our AI-powered trading agents deliver a transparent and decentralized trading experience. Every robot’s trading activity is recorded on-chain, ensuring public and verifiable performance data. With unified digital identities across multiple chains, managing and tracking robots is seamless. Plus, our no-code backtesting and AI-assisted strategy tools let you optimize your trading ideas without the technical hassle. Hire proven trading robots in our dynamic marketplace and benefit from fair, open collaboration.

# Start Guide

## Business server

### Before running

Java 8

apache maven 3.8+

### Compile

```shel
mvn -DskipTests=True clean package
```

### Start server

```shell
nohup java -jar corr-module-infra-biz.jar --spring.profiles.active=test --server.port=17772 > corr-module-infra-biz.log 2>&1 & echo $! > corr-module-infra-biz.pid
nohup java -jar corr-module-system-biz.jar --spring.profiles.active=test --server.port=17773 > corr-module-system-biz.log 2>&1 & echo $! > corr-module-system-biz.pid
nohup java -jar corr-module-member-biz.jar --spring.profiles.active=test --server.port=17774 > corr-module-member-biz.log 2>&1 & echo $! > corr-module-member-biz.pid
nohup java -jar corr-module-metadata-biz.jar --spring.profiles.active=test --server.port=17775 > corr-module-metadata-biz.log 2>&1 & echo $! > corr-module-metadata-biz.pid
nohup java -jar corr-gateway.jar --spring.profiles.active=test --server.port=17770 > corr-gateway.log 2>&1 & echo $! > corr-gateway.pid
nohup java -jar corr-module-gpt-biz.jar --spring.profiles.active=test --server.port=17777 > corr-module-gpt-biz.log 2>&1 & echo $! > corr-module-gpt-biz.pid
```

## Ai server

### Envirements

Python 3.12

### Dependencies

```pip
# please see requirements.txt in CorraiGAG directory
```

Start server

```shell
python -m uvicorn main:app --reload
```



