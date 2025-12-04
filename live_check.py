"""Live parser check."""
import paramiko
import sys
sys.stdout.reconfigure(encoding='utf-8')

ssh = paramiko.SSHClient()
ssh.set_missing_host_key_policy(paramiko.AutoAddPolicy())
ssh.connect('45.144.177.128', username='root', password='Mi31415926pSss!', timeout=15)

# Process stats
print("=== Process Status ===")
stdin, stdout, stderr = ssh.exec_command('ps aux | grep smart-parse | grep -v grep')
procs = stdout.read().decode().strip()
print(procs if procs else "  (no smart-parse running)")

# Check API request count from process memory (strace)
# Better - check DB stats directly

print("\n=== PostgreSQL Stats ===")
stdin, stdout, stderr = ssh.exec_command('''
cd /opt/ifixit-parser && ./venv/bin/python -c "
import asyncio
from src.loader.postgres import PostgresClient

async def check():
    async with PostgresClient() as pg:
        stats = await pg.get_stats()
        print(f'Categories: {stats.get(\"categories\", 0)}')
        print(f'Brands: {stats.get(\"brands\", 0)}')
        print(f'Devices: {stats.get(\"devices\", 0)}')
        print(f'Guides: {stats.get(\"guides\", 0)}')
        print(f'Steps: {stats.get(\"steps\", 0)}')
        print(f'Tools: {stats.get(\"tools\", 0)}')

asyncio.run(check())
"
''')
print(stdout.read().decode())
err = stderr.read().decode()
if err:
    print(f"Errors: {err[:500]}")

print("\n=== Neo4j Stats ===")
stdin, stdout, stderr = ssh.exec_command('''
cd /opt/ifixit-parser && ./venv/bin/python -c "
import asyncio
from src.loader.neo4j import Neo4jClient

async def check():
    async with Neo4jClient() as neo4j:
        stats = await neo4j.get_stats()
        for label, count in stats.items():
            print(f'{label}: {count}')

asyncio.run(check())
"
''')
print(stdout.read().decode())
err = stderr.read().decode()
if err:
    print(f"Errors: {err[:500]}")

ssh.close()
