#!/bin/bash
# n8n API (только чтение) - список workflows
# Использование: ./n8n_workflows.sh [limit]

LIMIT="${1:-10}"
curl -s -X GET "https://n8n.n8nsrv.ru/api/v1/workflows?limit=$LIMIT" \
  -H "X-N8N-API-KEY: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxZDUyMjJhMS04ZjUzLTQ5NDAtYjdkZS05M2RhZWFlMDQzOTMiLCJpc3MiOiJuOG4iLCJhdWQiOiJwdWJsaWMtYXBpIiwiaWF0IjoxNzY0NzY4NzE0LCJleHAiOjE3NzI0ODE2MDB9.JzC21XpXh7188Qlx2xWpZPHQysksg_Jj0hWuTgy6PmQ" \
  | python -c "import sys,json; data=json.load(sys.stdin); print('\n'.join([f\"{w['id']}: {w['name']} ({'active' if w['active'] else 'inactive'})\" for w in data['data']]))"
