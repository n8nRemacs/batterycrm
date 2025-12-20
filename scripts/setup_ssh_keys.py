#!/usr/bin/env python3
"""Setup SSH keys on remote servers without GUI password prompt"""

import subprocess
import os

SERVERS = {
    "n8n": {"host": "185.221.214.83", "password": "Mi31415926pS"},
    "ru": {"host": "45.144.177.128", "password": "Mi31415926pSss!"},
    "fi": {"host": "217.145.79.27", "password": "Mi31415926pSss!"},
    "new": {"host": "155.212.221.189", "password": "Mi31415926pSss!"},
}

def get_public_key():
    key_path = os.path.expanduser("~/.ssh/id_rsa.pub")
    if os.path.exists(key_path):
        with open(key_path, "r") as f:
            return f.read().strip()
    return None

def setup_key_via_echo(name, host, password, pub_key):
    """Use SSH with password via stdin to add key"""
    cmd = f'mkdir -p ~/.ssh && chmod 700 ~/.ssh && echo "{pub_key}" >> ~/.ssh/authorized_keys && chmod 600 ~/.ssh/authorized_keys && echo "Key added for {name}"'

    print(f"\n[{name}] Setting up SSH key on {host}...")

    # Try using plink (PuTTY) if available
    try:
        result = subprocess.run(
            ["plink", "-batch", "-pw", password, f"root@{host}", cmd],
            capture_output=True,
            text=True,
            timeout=30
        )
        if result.returncode == 0:
            print(f"[{name}] ✅ Success via plink")
            return True
        else:
            print(f"[{name}] plink failed: {result.stderr}")
    except FileNotFoundError:
        print(f"[{name}] plink not found, trying alternative...")
    except Exception as e:
        print(f"[{name}] plink error: {e}")

    return False

def main():
    pub_key = get_public_key()
    if not pub_key:
        print("❌ No SSH public key found. Run: ssh-keygen -t rsa -b 4096")
        return

    print(f"Public key: {pub_key[:50]}...")

    success = []
    failed = []

    for name, config in SERVERS.items():
        if setup_key_via_echo(name, config["host"], config["password"], pub_key):
            success.append(name)
        else:
            failed.append(name)

    print("\n" + "="*50)
    print(f"✅ Success: {', '.join(success) if success else 'none'}")
    print(f"❌ Failed: {', '.join(failed) if failed else 'none'}")

    if failed:
        print("\nFor failed servers, run manually:")
        for name in failed:
            cfg = SERVERS[name]
            print(f"  ssh-copy-id root@{cfg['host']}  # password: {cfg['password']}")

if __name__ == "__main__":
    main()
