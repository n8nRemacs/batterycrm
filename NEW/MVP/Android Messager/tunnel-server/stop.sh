#!/bin/bash
# Tunnel Server Stop Script

set -e

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
cd "$SCRIPT_DIR"

echo "=== Stopping Tunnel Server ==="

# Check if running with Docker
if [ "$1" = "docker" ] || docker-compose ps -q 2>/dev/null | grep -q .; then
    echo "Stopping Docker containers..."
    docker-compose down
    echo "Docker containers stopped."
    exit 0
fi

# Kill uvicorn processes
echo "Stopping uvicorn processes..."

# Find and kill by port
PID=$(lsof -ti :${PORT:-8000} 2>/dev/null || true)
if [ -n "$PID" ]; then
    echo "Killing process $PID on port ${PORT:-8000}..."
    kill -9 $PID 2>/dev/null || true
fi

# Also try pkill
pkill -f "uvicorn main:app" 2>/dev/null || true
pkill -f "python main.py" 2>/dev/null || true

echo "Tunnel Server stopped."
