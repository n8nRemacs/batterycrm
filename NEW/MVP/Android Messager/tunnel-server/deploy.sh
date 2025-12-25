#!/bin/bash
# Deploy tunnel-server to VPS
# Usage: ./deploy.sh [host]

set -e

HOST="${1:-155.212.221.189}"
APP_DIR="/opt/eldoleado/tunnel-server"
USER="root"

echo "=== Deploying tunnel-server to $HOST ==="

# Check if .env exists locally
if [ ! -f ".env" ]; then
    echo "Warning: .env file not found. Make sure to create it on server."
fi

# Create directory on server
echo "Creating directory on server..."
ssh $USER@$HOST "mkdir -p $APP_DIR"

# Sync files (exclude unnecessary)
echo "Syncing files..."
rsync -avz --delete \
    --exclude '.env' \
    --exclude '__pycache__' \
    --exclude '*.pyc' \
    --exclude '.git' \
    --exclude 'logs/*' \
    --exclude '.venv' \
    --exclude 'venv' \
    ./ $USER@$HOST:$APP_DIR/

# Check if .env exists on server
echo "Checking .env on server..."
ssh $USER@$HOST "
    if [ ! -f $APP_DIR/.env ]; then
        echo 'Creating .env from example...'
        cp $APP_DIR/.env.example $APP_DIR/.env
        echo 'IMPORTANT: Edit $APP_DIR/.env with actual values!'
    fi
"

# Create external network if not exists
echo "Creating Docker network..."
ssh $USER@$HOST "docker network create eldoleado 2>/dev/null || true"

# Build and restart container
echo "Building and starting container..."
ssh $USER@$HOST "
    cd $APP_DIR
    docker-compose down --remove-orphans || true
    docker-compose build --no-cache
    docker-compose up -d
"

# Check status
echo "Checking container status..."
sleep 3
ssh $USER@$HOST "docker ps | grep tunnel-server"

# Show logs
echo ""
echo "=== Recent logs ==="
ssh $USER@$HOST "docker logs tunnel-server --tail 20"

echo ""
echo "=== Deployment complete ==="
echo "Tunnel server running at ws://$HOST:8800/ws"
echo ""
echo "Commands:"
echo "  Logs:    ssh $USER@$HOST 'docker logs -f tunnel-server'"
echo "  Restart: ssh $USER@$HOST 'cd $APP_DIR && docker-compose restart'"
echo "  Stop:    ssh $USER@$HOST 'cd $APP_DIR && docker-compose down'"
