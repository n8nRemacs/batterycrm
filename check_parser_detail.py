"""Detailed parser status check."""
import paramiko
import sys
sys.stdout.reconfigure(encoding='utf-8')

ssh = paramiko.SSHClient()
ssh.set_missing_host_key_policy(paramiko.AutoAddPolicy())
ssh.connect('45.144.177.128', username='root', password='Mi31415926pSss!', timeout=15)

# Kill old processes first
print("Killing old full-parse processes...")
ssh.exec_command("pkill -f 'full-parse --category Phone' 2>/dev/null")

# Check only smart-parse
stdin, stdout, stderr = ssh.exec_command('ps aux | grep smart-parse | grep -v grep')
procs = stdout.read().decode().strip()
print(f"Smart-parse process:\n{procs if procs else '  (none)'}")

# Get last 100 lines of log
print("\n" + "="*60)
print("Last 100 lines of log:")
print("="*60)
stdin, stdout, stderr = ssh.exec_command('tail -100 /opt/ifixit-parser/parser.log')
log = stdout.read().decode()
print(log)

ssh.close()
