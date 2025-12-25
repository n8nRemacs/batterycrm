#!/bin/bash
# Neo4j доступ через SSH + docker (bolt+ssc для self-signed cert)
# Использование: ./neo4j.sh "MATCH (n) RETURN count(n) as total;"

QUERY="${1:-RETURN 1 as test;}"
ssh root@155.212.221.189 "docker exec neo4j cypher-shell -a 'bolt+ssc://localhost:7687' -u neo4j -p 'Mi31415926pS' \"$QUERY\""
