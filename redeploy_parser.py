"""Redeploy and start smart_parse on server."""
import paramiko
from scp import SCPClient
import sys
sys.stdout.reconfigure(encoding='utf-8')

SERVER = "45.144.177.128"
PASSWORD = "Mi31415926pSss!"
LOCAL_ARCHIVE = r"c:\Users\User\Documents\Eldoleado\ifixit-parser.tar.gz"

def deploy():
    print(f"Connecting to {SERVER}...")
    ssh = paramiko.SSHClient()
    ssh.set_missing_host_key_policy(paramiko.AutoAddPolicy())
    ssh.connect(SERVER, username="root", password=PASSWORD, timeout=30)

    # Kill existing parser processes
    print("Stopping existing parser...")
    ssh.exec_command("pkill -f 'python.*ifixit' 2>/dev/null; screen -X -S ifixit quit 2>/dev/null")

    print("Uploading archive...")
    with SCPClient(ssh.get_transport()) as scp:
        scp.put(LOCAL_ARCHIVE, "/opt/")
    print("Archive uploaded!")

    # Extract (preserve venv)
    commands = [
        "cd /opt/ifixit-parser && rm -rf src scripts tests *.py *.toml *.md 2>/dev/null || true",
        "cd /opt && tar -xzf ifixit-parser.tar.gz -C ifixit-parser",
    ]

    for cmd in commands:
        print(f"Running: {cmd[:60]}...")
        stdin, stdout, stderr = ssh.exec_command(cmd)
        exit_code = stdout.channel.recv_exit_status()
        if exit_code != 0:
            err = stderr.read().decode()
            print(f"  Error: {err[:200]}")

    # Reinstall in case of new deps
    print("Reinstalling package...")
    stdin, stdout, stderr = ssh.exec_command("cd /opt/ifixit-parser && ./venv/bin/pip install -e . -q")
    stdout.channel.recv_exit_status()

    # Test import
    print("Testing import...")
    stdin, stdout, stderr = ssh.exec_command(
        "cd /opt/ifixit-parser && ./venv/bin/python -c 'from src.parser.main import app; print(\"OK\")'"
    )
    out = stdout.read().decode().strip()
    err = stderr.read().decode().strip()
    print(f"Test: {out}")
    if err:
        print(f"Errors: {err[:300]}")

    # Check smart_parse command exists
    print("\nChecking smart_parse command...")
    stdin, stdout, stderr = ssh.exec_command(
        "cd /opt/ifixit-parser && ./venv/bin/python -m src.parser.main --help"
    )
    help_text = stdout.read().decode()
    if "smart-parse" in help_text:
        print("✓ smart_parse command available!")
    else:
        print("✗ smart_parse not found in help")
        print(help_text[:500])

    # Start smart_parse
    print("\nStarting smart_parse in screen...")
    cmd = '''screen -dmS ifixit bash -c 'cd /opt/ifixit-parser && ./venv/bin/python -m src.parser.main smart-parse --max-level 15 --batch 20 --delay 3 > parser.log 2>&1' '''
    stdin, stdout, stderr = ssh.exec_command(cmd)
    stdout.channel.recv_exit_status()

    # Verify started
    import time
    time.sleep(3)

    stdin, stdout, stderr = ssh.exec_command('screen -ls | grep ifixit')
    screens = stdout.read().decode().strip()
    print(f"\nScreen sessions:\n{screens if screens else '  (none)'}")

    stdin, stdout, stderr = ssh.exec_command('ps aux | grep -E "python.*ifixit" | grep -v grep | head -3')
    procs = stdout.read().decode().strip()
    print(f"\nProcesses:\n{procs if procs else '  (none)'}")

    stdin, stdout, stderr = ssh.exec_command('head -20 /opt/ifixit-parser/parser.log 2>/dev/null')
    log = stdout.read().decode().strip()
    print(f"\nInitial log:\n{log if log else '  (empty)'}")

    ssh.close()
    print("\n" + "="*50)
    print("Deployment complete! Smart parser is running.")
    print("Monitor: ssh root@45.144.177.128 'tail -f /opt/ifixit-parser/parser.log'")
    print("="*50)

if __name__ == "__main__":
    deploy()
