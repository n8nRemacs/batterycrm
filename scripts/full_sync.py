#!/usr/bin/env python3
"""
Full Knowledge Base synchronization pipeline.
Runs all sync steps in sequence.

Usage:
    python full_sync.py           # Full sync
    python full_sync.py --quick   # Skip flow docs regeneration
    python full_sync.py --watch   # Watch mode (sync every N minutes)
    python full_sync.py --stop    # Create stop signal file
"""

import os
import sys
import signal
import argparse
import subprocess
import time
from datetime import datetime
from pathlib import Path

SCRIPT_DIR = Path(__file__).parent
PROJECT_ROOT = SCRIPT_DIR.parent
LOG_FILE = PROJECT_ROOT / "logs" / "sync.log"
STOP_FILE = PROJECT_ROOT / "logs" / ".stop_sync"

# Global flag for graceful shutdown
should_stop = False

def signal_handler(signum, frame):
    global should_stop
    should_stop = True
    log("STOP signal received, finishing current step...")

signal.signal(signal.SIGINT, signal_handler)
signal.signal(signal.SIGTERM, signal_handler)

def check_stop():
    """Check if stop was requested."""
    global should_stop
    if STOP_FILE.exists():
        STOP_FILE.unlink()
        should_stop = True
    return should_stop


def log(message):
    """Log message to console and file."""
    timestamp = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
    line = f"[{timestamp}] {message}"
    print(line)

    LOG_FILE.parent.mkdir(parents=True, exist_ok=True)
    with open(LOG_FILE, "a", encoding="utf-8") as f:
        f.write(line + "\n")


def run_script(script_name, args=None):
    """Run a Python script and return success status."""
    script_path = SCRIPT_DIR / script_name
    if not script_path.exists():
        log(f"  ERROR: Script not found: {script_name}")
        return False

    cmd = [sys.executable, str(script_path)]
    if args:
        cmd.extend(args)

    try:
        result = subprocess.run(
            cmd,
            cwd=str(PROJECT_ROOT),
            capture_output=True,
            text=True,
            timeout=300  # 5 min timeout
        )

        if result.returncode != 0:
            log(f"  ERROR: {script_name} failed")
            if result.stderr:
                log(f"  {result.stderr[:200]}")
            return False

        # Extract key stats from output
        output = result.stdout
        if "Total:" in output:
            for line in output.split("\n"):
                if "Total:" in line or "Done!" in line or "Inserted" in line:
                    log(f"  {line.strip()}")

        return True

    except subprocess.TimeoutExpired:
        log(f"  ERROR: {script_name} timed out")
        return False
    except Exception as e:
        log(f"  ERROR: {script_name}: {e}")
        return False


def full_sync(quick=False):
    """Run full sync pipeline."""
    log("=" * 50)
    log("FULL SYNC STARTED")
    log("=" * 50)

    start_time = time.time()
    results = {}

    # Step 1: Sync from n8n
    if check_stop():
        log("STOPPED before step 1")
        return False
    log("\n[1/5] Syncing workflows from n8n...")
    results['n8n_sync'] = run_script("sync_and_update_kb.py")

    # Step 2: Populate workflow nodes
    if check_stop():
        log("STOPPED before step 2")
        return False
    log("\n[2/5] Extracting workflow nodes...")
    results['nodes'] = run_script("populate_workflow_nodes.py")

    # Step 3: Populate node connections
    if check_stop():
        log("STOPPED before step 3")
        return False
    log("\n[3/5] Extracting node connections...")
    results['connections'] = run_script("populate_node_connections.py")

    # Step 4: Update relations
    if check_stop():
        log("STOPPED before step 4")
        return False
    log("\n[4/5] Updating relations...")
    results['relations'] = run_script("populate_relations.py")

    # Step 5: Update flow docs (skip if quick mode)
    if check_stop():
        log("STOPPED before step 5")
        return False
    if quick:
        log("\n[5/5] Skipping flow docs (quick mode)")
        results['docs'] = True
    else:
        log("\n[5/5] Updating flow documentation...")
        results['docs'] = run_script("update_flow_docs.py", ["--all"])

    # Summary
    elapsed = time.time() - start_time
    success = all(results.values())

    log("\n" + "=" * 50)
    log(f"SYNC {'COMPLETED' if success else 'FAILED'}")
    log(f"Time: {elapsed:.1f}s")
    log("Results:")
    for step, ok in results.items():
        status = "OK" if ok else "FAILED"
        log(f"  {step}: {status}")
    log("=" * 50)

    return success


def watch_mode(interval_minutes=30):
    """Run sync periodically."""
    log(f"Starting watch mode (interval: {interval_minutes} min)")
    log("Press Ctrl+C to stop")

    while True:
        try:
            full_sync(quick=True)  # Quick sync in watch mode
            log(f"\nNext sync in {interval_minutes} minutes...")
            time.sleep(interval_minutes * 60)
        except KeyboardInterrupt:
            log("\nWatch mode stopped")
            break


def create_stop_signal():
    """Create stop signal file."""
    STOP_FILE.parent.mkdir(parents=True, exist_ok=True)
    STOP_FILE.touch()
    print(f"Stop signal created: {STOP_FILE}")
    print("Running sync will stop after current step completes.")


def main():
    parser = argparse.ArgumentParser(description="Full KB sync")
    parser.add_argument("--quick", "-q", action="store_true", help="Quick sync (skip docs)")
    parser.add_argument("--watch", "-w", action="store_true", help="Watch mode")
    parser.add_argument("--interval", "-i", type=int, default=30, help="Watch interval (minutes)")
    parser.add_argument("--stop", "-s", action="store_true", help="Send stop signal to running sync")
    args = parser.parse_args()

    if args.stop:
        create_stop_signal()
        return

    if args.watch:
        watch_mode(args.interval)
    else:
        success = full_sync(quick=args.quick)
        sys.exit(0 if success else 1)


if __name__ == "__main__":
    main()
