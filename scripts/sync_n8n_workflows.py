#!/usr/bin/env python3
"""
Sync n8n workflows with tag ELO to local files.

Usage:
    python scripts/sync_n8n_workflows.py

Or from Claude:
    "Выполни инструкцию из NEW/workflows/SYNC_AND_ANALYZE.md"
"""

import json
import os
import requests
from pathlib import Path
from datetime import datetime

# Configuration
N8N_API_URL = "https://n8n.n8nsrv.ru/api/v1"
N8N_API_KEY = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxZDUyMjJhMS04ZjUzLTQ5NDAtYjdkZS05M2RhZWFlMDQzOTMiLCJpc3MiOiJuOG4iLCJhdWQiOiJwdWJsaWMtYXBpIiwiaWF0IjoxNzY0NzY4NzE0LCJleHAiOjE3NzI0ODE2MDB9.JzC21XpXh7188Qlx2xWpZPHQysksg_Jj0hWuTgy6PmQ"

WORKFLOWS_DIR = Path(__file__).parent.parent / "NEW" / "workflows"

# Tag to folder mapping
TAG_MAPPING = {
    ("ELO", "In"): "Chanel Contour/ELO_In",
    ("ELO", "Out"): "Chanel Contour/ELO_Out",
    ("ELO", "Router"): "Chanel Contour",
    ("ELO", "Input"): "Input Contour",
    ("ELO", "Client"): "Client Contour",
    ("ELO", "AI"): "AI Contour",
    ("ELO", "API"): "API",
    ("ELO", "Graph"): "Graph Contour",
    ("ELO", "Core"): "AI Contour",  # Core usually means AI core
}

# Tags to skip
SKIP_TAGS = {"Archive", "Old", "Deprecated", "Test", "Backup"}

def get_headers():
    return {
        "X-N8N-API-KEY": N8N_API_KEY,
        "Accept": "application/json"
    }

def fetch_workflows():
    """Fetch all workflows from n8n API with limit 250."""
    url = f"{N8N_API_URL}/workflows?limit=250"
    response = requests.get(url, headers=get_headers())
    response.raise_for_status()
    data = response.json()
    return data.get("data", [])

def fetch_workflow_detail(workflow_id):
    """Fetch full workflow details."""
    url = f"{N8N_API_URL}/workflows/{workflow_id}"
    response = requests.get(url, headers=get_headers())
    response.raise_for_status()
    return response.json()

def get_workflow_tags(workflow):
    """Extract tag names from workflow."""
    tags = workflow.get("tags", [])
    return {tag.get("name", "") for tag in tags}

def should_sync(workflow):
    """Check if workflow should be synced based on tags, name, and archive status."""
    tags = get_workflow_tags(workflow)
    name = workflow.get("name", "")

    # Skip archived workflows
    if workflow.get("isArchived", False):
        return False, "Archived"

    # Check by tag OR by name prefix
    has_elo = "ELO" in tags or "Eldoleado" in tags or name.startswith("ELO_")

    if not has_elo:
        return False, "No ELO tag"

    # Skip archive/old tags
    if tags & SKIP_TAGS:
        return False, "Archive tag"

    return True, None

def determine_folder(tags, name):
    """Determine target folder based on tags and name."""
    tags_set = set(tags)

    # Check tag combinations
    for tag_combo, folder in TAG_MAPPING.items():
        if all(t in tags_set for t in tag_combo):
            return folder

    # Fallback: determine by name
    name_lower = name.lower()
    if "_in_" in name_lower or name_lower.startswith("elo_in"):
        return "Chanel Contour/ELO_In"
    if "_out_" in name_lower or name_lower.startswith("elo_out"):
        if "router" in name_lower:
            return "Chanel Contour"
        return "Chanel Contour/ELO_Out"
    if "input" in name_lower or "batcher" in name_lower or "processor" in name_lower:
        return "Input Contour"
    if "client" in name_lower or "resolve" in name_lower:
        return "Client Contour"
    if "ai" in name_lower or "core" in name_lower:
        return "AI Contour"
    if "api" in name_lower or "android" in name_lower:
        return "API"
    if "graph" in name_lower or "neo4j" in name_lower:
        return "Graph Contour"

    # Default
    return ""

def sanitize_filename(name):
    """Create safe filename from workflow name."""
    # Replace spaces and special chars
    safe_name = name.replace(" ", "_").replace("/", "_").replace("\\", "_")
    safe_name = "".join(c for c in safe_name if c.isalnum() or c in "_-.")
    return f"{safe_name}.json"

def save_workflow(workflow_data, folder, filename):
    """Save workflow JSON to file."""
    target_dir = WORKFLOWS_DIR / folder
    target_dir.mkdir(parents=True, exist_ok=True)

    target_file = target_dir / filename

    with open(target_file, "w", encoding="utf-8") as f:
        json.dump(workflow_data, f, indent=2, ensure_ascii=False)

    return target_file

def sync_workflows():
    """Main sync function."""
    print(f"=== n8n Workflow Sync ===")
    print(f"Timestamp: {datetime.now().isoformat()}")
    print(f"Target: {WORKFLOWS_DIR}")
    print()

    # Fetch all workflows
    print("Fetching workflow list...")
    workflows = fetch_workflows()
    print(f"Found {len(workflows)} total workflows")

    # Filter and sync
    synced = []
    skipped = []
    errors = []

    for wf in workflows:
        wf_id = wf.get("id")
        wf_name = wf.get("name", "unknown")
        tags = get_workflow_tags(wf)

        sync_ok, skip_reason = should_sync(wf)
        if not sync_ok:
            skipped.append((wf_name, skip_reason))
            continue

        try:
            # Fetch full workflow
            print(f"Fetching: {wf_name}...")
            full_wf = fetch_workflow_detail(wf_id)

            # Determine folder
            folder = determine_folder(tags, wf_name)
            filename = sanitize_filename(wf_name)

            # Save
            saved_path = save_workflow(full_wf, folder, filename)
            synced.append((wf_name, folder, filename))
            print(f"  -> Saved to: {folder}/{filename}")

        except Exception as e:
            errors.append((wf_name, str(e)))
            print(f"  ! Error: {e}")

    # Summary
    print()
    print("=== Sync Summary ===")
    print(f"Synced: {len(synced)}")
    print(f"Skipped: {len(skipped)}")
    print(f"Errors: {len(errors)}")

    if synced:
        print("\nSynced workflows:")
        for name, folder, filename in synced:
            print(f"  - {name} -> {folder}/{filename}")

    if errors:
        print("\nErrors:")
        for name, error in errors:
            print(f"  - {name}: {error}")

    # Write sync report
    report = {
        "timestamp": datetime.now().isoformat(),
        "synced": [{"name": n, "folder": f, "file": fn} for n, f, fn in synced],
        "skipped": [{"name": n, "reason": r} for n, r in skipped],
        "errors": [{"name": n, "error": e} for n, e in errors]
    }

    report_file = WORKFLOWS_DIR / "last_sync.json"
    with open(report_file, "w", encoding="utf-8") as f:
        json.dump(report, f, indent=2, ensure_ascii=False)

    print(f"\nReport saved to: {report_file}")

    return synced, skipped, errors

if __name__ == "__main__":
    sync_workflows()
