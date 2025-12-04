"""Quick check parser status."""
import paramiko
import sys
sys.stdout.reconfigure(encoding='utf-8')

ssh = paramiko.SSHClient()
ssh.set_missing_host_key_policy(paramiko.AutoAddPolicy())
ssh.connect('45.144.177.128', username='root', password='Mi31415926pSss!', timeout=10)

# Check screens
stdin, stdout, stderr = ssh.exec_command('screen -ls')
print("Screen sessions:")
print(stdout.read().decode())

# Check if running
stdin, stdout, stderr = ssh.exec_command('ps aux | grep -E "python|ifixit" | grep -v grep')
procs = stdout.read().decode().strip()
print("\nAll Python processes:")
print(procs if procs else "  (none)")

# Check log
stdin, stdout, stderr = ssh.exec_command('ls -la /opt/ifixit-parser/parser.log 2>/dev/null; tail -30 /opt/ifixit-parser/parser.log 2>/dev/null || echo "No log"')
print("\nLog info and tail:")
print(stdout.read().decode())

ssh.close()
