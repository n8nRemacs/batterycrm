@echo off
REM Neo4j query wrapper - no password prompt
REM Usage: neo4j "MATCH (n) RETURN count(n);"

set QUERY=%~1
if "%QUERY%"=="" set QUERY=RETURN 1 as test;

ssh root@155.212.221.189 "docker exec neo4j cypher-shell -a 'bolt+ssc://localhost:7687' -u neo4j -p 'Mi31415926pS' \"%QUERY%\""
