"""Start parser on server."""
import paramiko

ssh = paramiko.SSHClient()
ssh.set_missing_host_key_policy(paramiko.AutoAddPolicy())
ssh.connect('45.144.177.128', username='root', password='Mi31415926pSss!', timeout=10)

# Start parser using screen so it persists after SSH disconnect
# Using Samsung Galaxy S21 as a test - it's a specific device with guides
cmd = '''screen -dmS ifixit bash -c 'cd /opt/ifixit-parser && ./venv/bin/python -m src.parser.main full-parse --category "Samsung Galaxy S21" > parser.log 2>&1' '''
stdin, stdout, stderr = ssh.exec_command(cmd)
stdout.channel.recv_exit_status()

# Check it started
import time
time.sleep(3)
stdin, stdout, stderr = ssh.exec_command('screen -ls | grep ifixit')
screens = stdout.read().decode().strip()
print("Screen sessions:")
print(screens if screens else "  (no screen)")

stdin, stdout, stderr = ssh.exec_command('ps aux | grep -E "python.*ifixit|screen.*ifixit" | grep -v grep | head -3')
procs = stdout.read().decode().strip()
print("\nProcesses:")
print(procs if procs else "  (none yet)")

ssh.close()
print("\nParser started! It will run in background.")
print("To check progress: ssh root@45.144.177.128 'tail -f /opt/ifixit-parser/parser.log'")
print("Or attach to screen: ssh root@45.144.177.128 'screen -r ifixit'")
