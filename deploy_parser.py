"""Deploy ifixit-parser to server."""
import paramiko
from scp import SCPClient

SERVER = "45.144.177.128"
PASSWORD = "Mi31415926pSss!"
LOCAL_ARCHIVE = r"c:\Users\User\Documents\Eldoleado\ifixit-parser.tar.gz"
REMOTE_PATH = "/opt/"

def deploy():
    print(f"Connecting to {SERVER}...")
    ssh = paramiko.SSHClient()
    ssh.set_missing_host_key_policy(paramiko.AutoAddPolicy())
    ssh.connect(SERVER, username="root", password=PASSWORD, timeout=30)

    print("Uploading archive...")
    with SCPClient(ssh.get_transport()) as scp:
        scp.put(LOCAL_ARCHIVE, REMOTE_PATH)
    print("Archive uploaded!")

    # Extract and setup
    commands = [
        "rm -rf /opt/ifixit-parser",
        "mkdir -p /opt/ifixit-parser",
        "cd /opt && tar -xzf ifixit-parser.tar.gz -C ifixit-parser",
        "cd /opt/ifixit-parser && python3 -m venv venv",
        "cd /opt/ifixit-parser && ./venv/bin/pip install --upgrade pip",
        "cd /opt/ifixit-parser && ./venv/bin/pip install -e .",
    ]

    for cmd in commands:
        print(f"Running: {cmd}")
        stdin, stdout, stderr = ssh.exec_command(cmd)
        exit_code = stdout.channel.recv_exit_status()
        out = stdout.read().decode()
        err = stderr.read().decode()
        if out:
            print(f"  stdout: {out[:500]}")
        if err:
            print(f"  stderr: {err[:500]}")
        if exit_code != 0:
            print(f"  [ERROR] Exit code: {exit_code}")

    # Test import
    print("\nTesting parser...")
    stdin, stdout, stderr = ssh.exec_command(
        "cd /opt/ifixit-parser && ./venv/bin/python -c 'from src.parser.main import app; print(\"OK\")'"
    )
    out = stdout.read().decode()
    err = stderr.read().decode()
    print(f"Test result: {out}")
    if err:
        print(f"Test errors: {err}")

    ssh.close()
    print("\nDeployment complete!")

if __name__ == "__main__":
    deploy()
