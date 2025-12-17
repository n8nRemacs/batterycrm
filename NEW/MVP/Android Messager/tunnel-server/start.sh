#!/bin/bash
# Tunnel Server Startup Script

set -e

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
cd "$SCRIPT_DIR"

echo "=== Tunnel Server ==="

# Check if running with Docker
if [ "$1" = "docker" ] || [ -f "/.dockerenv" ]; then
    echo "Starting with Docker Compose..."
    docker-compose up -d
    echo "Tunnel server started. Showing logs..."
    docker-compose logs -f --tail=100
    exit 0
fi

# Check .env
if [ ! -f .env ]; then
    echo "WARNING: .env not found. Copy .env.example to .env and configure."
    if [ -f .env.example ]; then
        cp .env.example .env
    fi
fi

# Virtual environment
if [ ! -d "venv" ]; then
    echo "Creating virtual environment..."
    python3 -m venv venv
fi

source venv/bin/activate
pip install -q -r requirements.txt

# Start server
echo "Starting Tunnel Server on port ${PORT:-8000}..."
uvicorn main:app --host 0.0.0.0 --port ${PORT:-8000} --reload
