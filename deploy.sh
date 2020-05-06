#!/bin/bash

./mvnw wildfly:start &&

./mvnw package &&

./mvnw wildfly:deploy