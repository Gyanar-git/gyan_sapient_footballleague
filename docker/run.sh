#!/bin/env bash

echo "Starting Gyan's Foot Ball League application for Sapient"

docker run --name football-league-gyan -i -d --env-file env.list football-league-gyan


