@echo off
REM PostgreSQL query wrapper - no password prompt
REM Usage: pg "SELECT * FROM elo_tenants;"

set QUERY=%~1
if "%QUERY%"=="" set QUERY=SELECT version();

ssh root@185.221.214.83 "docker exec supabase-db psql -U postgres -c \"%QUERY%\""
