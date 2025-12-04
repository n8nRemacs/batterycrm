"""Start parser on server."""
import paramiko

ssh = paramiko.SSHClient()
ssh.set_missing_host_key_policy(paramiko.AutoAddPolicy())
ssh.connect('45.144.177.128', username='root', password='Mi31415926pSss!', timeout=30)

# Запускаем в фоне
cmd = 'cd /opt/ifixit-parser && nohup ./venv/bin/python -m src.parser.main full-parse --category Phone > parser.log 2>&1 & disown; sleep 1; echo "PID=$!"'
stdin, stdout, stderr = ssh.exec_command(cmd)
print("Output:", stdout.read().decode())
print("Errors:", stderr.read().decode())

# Проверяем процессы
stdin, stdout, stderr = ssh.exec_command('ps aux | grep "[i]fixit" | head -5')
print("Processes:", stdout.read().decode())

# Проверяем лог
stdin, stdout, stderr = ssh.exec_command('head -20 /opt/ifixit-parser/parser.log')
print("Log:", stdout.read().decode())

ssh.close()
print("Done!")
