#!/bin/bash
# Setup SSH keys on all servers without GUI password prompt

SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"
ASKPASS_SCRIPT="$SCRIPT_DIR/ssh_askpass.sh"
chmod +x "$ASKPASS_SCRIPT"

PUB_KEY=$(cat ~/.ssh/id_rsa.pub)

setup_server() {
    local name=$1
    local host=$2
    local pass=$3

    echo ""
    echo "[$name] Setting up SSH key on $host..."

    export SSH_PASSWORD="$pass"
    export SSH_ASKPASS="$ASKPASS_SCRIPT"
    export DISPLAY=:0

    # Use setsid to force SSH_ASKPASS usage
    setsid -w ssh -o StrictHostKeyChecking=no -o PreferredAuthentications=password \
        root@$host "mkdir -p ~/.ssh && echo '$PUB_KEY' >> ~/.ssh/authorized_keys && chmod 700 ~/.ssh && chmod 600 ~/.ssh/authorized_keys" </dev/null 2>&1

    if [ $? -eq 0 ]; then
        echo "[$name] ✅ Success"
        return 0
    else
        echo "[$name] ❌ Failed"
        return 1
    fi
}

echo "Setting up SSH keys..."
echo "Public key: ${PUB_KEY:0:50}..."

# Setup all servers
setup_server "n8n" "185.221.214.83" "Mi31415926pS"
setup_server "msg" "155.212.221.189" "Mi31415926pSss!"

echo ""
echo "Testing connections..."
for host in 185.221.214.83 155.212.221.189; do
    ssh -o BatchMode=yes -o ConnectTimeout=5 root@$host "echo 'OK'" 2>/dev/null && echo "✅ $host" || echo "❌ $host"
done
