#!/bin/bash
# PostgreSQL доступ через SSH + docker
# Использование: ./pg.sh "SELECT * FROM elo_tenants LIMIT 5;"

QUERY="${1:-SELECT version();}"
ssh root@185.221.214.83 "docker exec supabase-db psql -U postgres -c \"$QUERY\""
