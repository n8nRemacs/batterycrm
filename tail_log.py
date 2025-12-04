"""Get full log from server."""
import paramiko
import sys
sys.stdout.reconfigure(encoding='utf-8')

ssh = paramiko.SSHClient()
ssh.set_missing_host_key_policy(paramiko.AutoAddPolicy())
ssh.connect('45.144.177.128', username='root', password='Mi31415926pSss!', timeout=15)

# Get log size
stdin, stdout, stderr = ssh.exec_command('wc -l /opt/ifixit-parser/parser.log; ls -lh /opt/ifixit-parser/parser.log')
print("Log stats:")
print(stdout.read().decode())

# Get last 200 lines
print("\nLast 200 lines:")
print("="*60)
stdin, stdout, stderr = ssh.exec_command('tail -200 /opt/ifixit-parser/parser.log')
print(stdout.read().decode())

ssh.close()
