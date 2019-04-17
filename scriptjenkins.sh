#!/bin/bash
USER_TOKEN=1159d55804f6b9ac05d7656dc93dbbf5c1
JOB_TOKEN=WotJGteZDsh8Z95fc6uFtvn6bjTqjmOF
WEB_LINK=http://admin:$USER_TOKEN@localhost:8080/job/team1/job/Test/build?token=TOKEN_NAME 

curl -X POST $WEB_LINK

