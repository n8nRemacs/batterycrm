#!/usr/bin/env python3
"""
Full sync pipeline:
1. Fetch workflows from n8n server
2. Save to local JSON files (n8n_workflows/)
3. Git add + commit (if changes)
4. Update Knowledge Base (components + relations)

Usage:
    python sync_and_update_kb.py [--no-commit] [--no-kb] [--dry-run]

Environment:
    N8N_API_KEY - n8n API key (default: built-in)
    N8N_URL - n8n server URL (default: https://n8n.n8nsrv.ru)
"""

import os
import sys
import json
import argparse
import subprocess
from pathlib import Path
from datetime import datetime
from urllib.request import Request, urlopen
from urllib.error import URLError, HTTPError

# Configuration
N8N_URL = os.getenv("N8N_URL", "https://n8n.n8nsrv.ru")
N8N_API_KEY = os.getenv("N8N_API_KEY", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxZDUyMjJhMS04ZjUzLTQ5NDAtYjdkZS05M2RhZWFlMDQzOTMiLCJpc3MiOiJuOG4iLCJhdWQiOiJwdWJsaWMtYXBpIiwiaWF0IjoxNzY0NzY4NzE0LCJleHAiOjE3NzI0ODE2MDB9.JzC21XpXh7188Qlx2xWpZPHQysksg_Jj0hWuTgy6PmQ")

SCRIPT_DIR = Path(__file__).parent
PROJECT_ROOT = SCRIPT_DIR.parent
WORKFLOWS_DIR = PROJECT_ROOT / "n8n_workflows"

# Tag to folder mapping
TAG_TO_FOLDER = {
    "API": "API",
    "Core": "Core",
    "In": "In",
    "Out": "Out",
    "Tool": "Tool",
    "TaskWork": "TaskWork",
}

# Required tag for our workflows
REQUIRED_TAG = "BattCRM"


def fetch_workflows():
    """Fetch all workflows from n8n API."""
    # Set limit=200 to get all workflows (default is 100, max ~250)
    url = f"{N8N_URL}/api/v1/workflows?limit=200"
    headers = {
        "X-N8N-API-KEY": N8N_API_KEY,
        "Accept": "application/json"
    }

    req = Request(url, headers=headers)

    try:
        with urlopen(req, timeout=30) as response:
            data = json.loads(response.read().decode("utf-8"))
            return data.get("data", [])
    except HTTPError as e:
        print(f"HTTP Error {e.code}: {e.reason}")
        sys.exit(1)
    except URLError as e:
        print(f"URL Error: {e.reason}")
        sys.exit(1)


def filter_workflows(workflows):
    """Filter workflows by required tag and not archived."""
    filtered = []

    for w in workflows:
        tags = [t["name"] for t in w.get("tags", [])]

        # Must have required tag
        if REQUIRED_TAG not in tags:
            continue

        # Skip archived
        if w.get("isArchived", False):
            continue

        # Determine section/folder
        section = "Other"
        for tag in tags:
            if tag in TAG_TO_FOLDER:
                section = tag
                break

        filtered.append({
            "id": w["id"],
            "name": w["name"],
            "section": section,
            "active": w.get("active", False),
            "tags": tags,
            "data": w
        })

    return filtered


def save_workflows(workflows, dry_run=False):
    """Save workflows to local JSON files. Returns list of changed files."""
    changed_files = []

    for w in workflows:
        section = w["section"]
        folder = TAG_TO_FOLDER.get(section, section)
        folder_path = WORKFLOWS_DIR / folder

        if not dry_run:
            folder_path.mkdir(parents=True, exist_ok=True)

        # Safe filename
        safe_name = w["name"].replace(" ", "_").replace("/", "_").replace(":", "_")
        filename = f"{safe_name}.json"
        filepath = folder_path / filename

        # Prepare workflow data (clean structure)
        workflow_data = {
            "id": w["data"]["id"],
            "name": w["data"]["name"],
            "active": w["data"].get("active", False),
            "nodes": w["data"].get("nodes", []),
            "connections": w["data"].get("connections", {}),
            "settings": w["data"].get("settings", {}),
            "tags": w["data"].get("tags", []),
            "updatedAt": w["data"].get("updatedAt"),
            "createdAt": w["data"].get("createdAt"),
        }

        new_content = json.dumps(workflow_data, ensure_ascii=False, indent=2)

        # Check if file changed
        is_new = not filepath.exists()
        is_changed = False

        if not is_new:
            try:
                old_content = filepath.read_text(encoding="utf-8")
                is_changed = old_content != new_content
            except:
                is_changed = True

        if is_new or is_changed:
            rel_path = filepath.relative_to(PROJECT_ROOT)
            changed_files.append({
                "path": str(rel_path),
                "name": w["name"],
                "status": "new" if is_new else "modified"
            })

            if not dry_run:
                filepath.write_text(new_content, encoding="utf-8")

    return changed_files


def git_commit(changed_files, dry_run=False):
    """Add and commit changed files to git."""
    if not changed_files:
        return None

    # Prepare commit message
    new_count = sum(1 for f in changed_files if f["status"] == "new")
    mod_count = sum(1 for f in changed_files if f["status"] == "modified")

    parts = []
    if new_count:
        parts.append(f"{new_count} new")
    if mod_count:
        parts.append(f"{mod_count} updated")

    message = f"Sync {', '.join(parts)} workflows from n8n"

    if dry_run:
        print(f"\n[DRY RUN] Would commit: {message}")
        return message

    try:
        # Git add
        files_to_add = [f["path"] for f in changed_files]
        subprocess.run(
            ["git", "add"] + files_to_add,
            cwd=PROJECT_ROOT,
            check=True,
            capture_output=True
        )

        # Git commit
        result = subprocess.run(
            ["git", "commit", "-m", message],
            cwd=PROJECT_ROOT,
            check=True,
            capture_output=True,
            text=True
        )

        return message

    except subprocess.CalledProcessError as e:
        print(f"Git error: {e.stderr}")
        return None


def update_knowledge_base(dry_run=False):
    """Run populate scripts to update KB."""
    if dry_run:
        print("\n[DRY RUN] Would update knowledge base")
        return

    # Run populate_knowledge_base.py
    print("\nUpdating components...")
    result = subprocess.run(
        [sys.executable, str(SCRIPT_DIR / "populate_knowledge_base.py")],
        cwd=PROJECT_ROOT,
        capture_output=True,
        text=True
    )
    if result.returncode != 0:
        print(f"Error: {result.stderr}")
    else:
        # Extract summary
        for line in result.stdout.split("\n"):
            if "Found" in line or "Done" in line or "Total" in line:
                print(f"  {line.strip()}")

    # Run populate_relations.py
    print("\nUpdating relations...")
    result = subprocess.run(
        [sys.executable, str(SCRIPT_DIR / "populate_relations.py")],
        cwd=PROJECT_ROOT,
        capture_output=True,
        text=True
    )
    if result.returncode != 0:
        print(f"Error: {result.stderr}")
    else:
        for line in result.stdout.split("\n"):
            if "Found" in line or "Done" in line or "Total" in line:
                print(f"  {line.strip()}")

    # Generate markdown
    print("\nGenerating KNOWLEDGE_BASE.md...")
    result = subprocess.run(
        [sys.executable, str(SCRIPT_DIR / "generate_knowledge_base.py")],
        cwd=PROJECT_ROOT,
        capture_output=True,
        text=True
    )
    if result.returncode != 0:
        print(f"Error: {result.stderr}")
    else:
        for line in result.stdout.split("\n"):
            if "Done" in line or "Generated" in line:
                print(f"  {line.strip()}")


def main():
    parser = argparse.ArgumentParser(description="Sync n8n workflows and update KB")
    parser.add_argument("--no-commit", action="store_true", help="Don't git commit")
    parser.add_argument("--no-kb", action="store_true", help="Don't update knowledge base")
    parser.add_argument("--dry-run", action="store_true", help="Don't make any changes")
    args = parser.parse_args()

    print("=" * 50)
    print("SYNC AND UPDATE KNOWLEDGE BASE")
    print("=" * 50)
    print(f"Time: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}")
    print(f"n8n URL: {N8N_URL}")
    print("")

    # Step 1: Fetch from n8n
    print("Step 1: Fetching workflows from n8n...")
    all_workflows = fetch_workflows()
    print(f"  Total workflows on server: {len(all_workflows)}")

    # Step 2: Filter
    workflows = filter_workflows(all_workflows)
    print(f"  {REQUIRED_TAG} workflows: {len(workflows)}")

    # Count by section
    by_section = {}
    for w in workflows:
        s = w["section"]
        by_section[s] = by_section.get(s, 0) + 1
    print("  By section:", ", ".join(f"{k}={v}" for k, v in sorted(by_section.items())))

    # Step 3: Save to files
    print("\nStep 2: Saving to local files...")
    changed = save_workflows(workflows, dry_run=args.dry_run)

    if changed:
        print(f"  Changed files: {len(changed)}")
        for f in changed[:10]:
            status = "+" if f["status"] == "new" else "~"
            print(f"    [{status}] {f['name']}")
        if len(changed) > 10:
            print(f"    ... and {len(changed) - 10} more")
    else:
        print("  No changes detected")

    # Step 4: Git commit
    if not args.no_commit and changed:
        print("\nStep 3: Git commit...")
        commit_msg = git_commit(changed, dry_run=args.dry_run)
        if commit_msg:
            print(f"  Committed: {commit_msg}")
    elif args.no_commit:
        print("\nStep 3: Git commit... SKIPPED (--no-commit)")
    else:
        print("\nStep 3: Git commit... SKIPPED (no changes)")

    # Step 5: Update KB
    if not args.no_kb:
        print("\nStep 4: Updating Knowledge Base...")
        update_knowledge_base(dry_run=args.dry_run)
    else:
        print("\nStep 4: Updating Knowledge Base... SKIPPED (--no-kb)")

    print("\n" + "=" * 50)
    print("DONE!")
    print("=" * 50)


if __name__ == "__main__":
    main()
