#!/usr/bin/env python3
"""
HTTP webhook handler for triggering KB sync.
Run this as a background service, then call from n8n when workflow saved.

Usage:
    python webhook_sync_handler.py              # Start server on port 5555
    python webhook_sync_handler.py --port 8080  # Custom port

Trigger sync:
    curl http://localhost:5555/sync
    curl http://localhost:5555/sync?workflow=BAT_IN_MAX  # Update specific workflow docs
"""

import os
import sys
import json
import argparse
import subprocess
import threading
from datetime import datetime
from pathlib import Path
from http.server import HTTPServer, BaseHTTPRequestHandler
from urllib.parse import urlparse, parse_qs

SCRIPT_DIR = Path(__file__).parent
PROJECT_ROOT = SCRIPT_DIR.parent

# Track last sync to avoid spam
last_sync_time = None
MIN_SYNC_INTERVAL = 60  # seconds


class SyncHandler(BaseHTTPRequestHandler):
    def log_message(self, format, *args):
        timestamp = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
        print(f"[{timestamp}] {args[0]}")

    def do_GET(self):
        parsed = urlparse(self.path)
        query = parse_qs(parsed.query)

        if parsed.path == "/sync":
            self.handle_sync(query)
        elif parsed.path == "/status":
            self.handle_status()
        elif parsed.path == "/health":
            self.send_json({"status": "ok"})
        else:
            self.send_error(404, "Not found")

    def do_POST(self):
        # Handle POST same as GET for /sync
        if self.path.startswith("/sync"):
            content_length = int(self.headers.get('Content-Length', 0))
            body = self.rfile.read(content_length).decode('utf-8') if content_length else '{}'
            try:
                data = json.loads(body) if body else {}
            except:
                data = {}

            workflow = data.get('workflow')
            self.handle_sync({'workflow': [workflow]} if workflow else {})
        else:
            self.send_error(404, "Not found")

    def handle_sync(self, query):
        global last_sync_time

        # Rate limiting
        now = datetime.now()
        if last_sync_time:
            elapsed = (now - last_sync_time).total_seconds()
            if elapsed < MIN_SYNC_INTERVAL:
                self.send_json({
                    "status": "skipped",
                    "reason": f"Rate limited. Wait {MIN_SYNC_INTERVAL - elapsed:.0f}s"
                })
                return

        workflow = query.get('workflow', [None])[0]

        # Run sync in background thread
        def run_sync():
            global last_sync_time
            last_sync_time = datetime.now()

            if workflow:
                # Update only affected docs
                print(f"Updating docs for workflow: {workflow}")
                subprocess.run([
                    sys.executable,
                    str(SCRIPT_DIR / "update_flow_docs.py"),
                    "--workflow", workflow
                ], cwd=str(PROJECT_ROOT))
            else:
                # Full quick sync
                print("Running full sync...")
                subprocess.run([
                    sys.executable,
                    str(SCRIPT_DIR / "full_sync.py"),
                    "--quick"
                ], cwd=str(PROJECT_ROOT))

        thread = threading.Thread(target=run_sync)
        thread.start()

        self.send_json({
            "status": "started",
            "workflow": workflow,
            "time": now.isoformat()
        })

    def handle_status(self):
        self.send_json({
            "status": "running",
            "last_sync": last_sync_time.isoformat() if last_sync_time else None,
            "project": str(PROJECT_ROOT)
        })

    def send_json(self, data):
        self.send_response(200)
        self.send_header("Content-Type", "application/json")
        self.end_headers()
        self.wfile.write(json.dumps(data).encode())


def main():
    parser = argparse.ArgumentParser(description="KB Sync Webhook Handler")
    parser.add_argument("--port", "-p", type=int, default=5555)
    parser.add_argument("--host", default="0.0.0.0")
    args = parser.parse_args()

    server = HTTPServer((args.host, args.port), SyncHandler)
    print(f"KB Sync Webhook Server")
    print(f"=" * 40)
    print(f"Listening on http://{args.host}:{args.port}")
    print(f"")
    print(f"Endpoints:")
    print(f"  GET  /sync              - Full quick sync")
    print(f"  GET  /sync?workflow=X   - Update docs for workflow X")
    print(f"  POST /sync              - Same, accepts JSON body")
    print(f"  GET  /status            - Server status")
    print(f"  GET  /health            - Health check")
    print(f"")
    print(f"Press Ctrl+C to stop")
    print(f"=" * 40)

    try:
        server.serve_forever()
    except KeyboardInterrupt:
        print("\nServer stopped")


if __name__ == "__main__":
    main()
