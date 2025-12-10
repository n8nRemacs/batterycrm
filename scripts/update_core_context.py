#!/usr/bin/env python3
"""
Update CORE_NEW/CONTEXT.md with current project state.
Run before commit or at end of session.

Usage:
    python scripts/update_core_context.py
    python scripts/update_core_context.py --check  # Only check, don't update

What it does:
1. Scans CORE_NEW/docs/ for documentation status
2. Counts tables from 02_DATABASE_SCHEMA.md
3. Counts Neo4j labels from 03_NEO4J_SCHEMA.md
4. Counts API endpoints from 04_API_CONTRACTS.md
5. Scans n8n_workflows/ for ELO_* workflows
6. Updates CONTEXT.md with current stats
"""

import os
import re
import sys
import argparse
from datetime import datetime
from pathlib import Path

SCRIPT_DIR = Path(__file__).parent
PROJECT_ROOT = SCRIPT_DIR.parent
CORE_NEW_DIR = PROJECT_ROOT / "CORE_NEW"
CONTEXT_FILE = CORE_NEW_DIR / "CONTEXT.md"


def count_postgres_tables():
    """Count elo_* tables from schema file."""
    schema_file = CORE_NEW_DIR / "docs" / "02_DATABASE_SCHEMA.md"
    if not schema_file.exists():
        return 0, []

    content = schema_file.read_text(encoding="utf-8")
    tables = re.findall(r'CREATE TABLE (elo_\w+)', content)
    return len(tables), tables


def count_neo4j_labels():
    """Count Neo4j labels from schema."""
    schema_file = CORE_NEW_DIR / "docs" / "03_NEO4J_SCHEMA.md"
    if not schema_file.exists():
        # Try alternative name
        schema_file = CORE_NEW_DIR / "docs" / "03_GRAPH_SCHEMA.md"
    if not schema_file.exists():
        return 0, []

    content = schema_file.read_text(encoding="utf-8")
    # Match (:Label { patterns in Cypher
    labels = re.findall(r'\(:([A-Z][a-zA-Z_]+)\s*\{', content)
    # Also match (:label) patterns without braces
    labels += re.findall(r'\(:([A-Z][a-zA-Z_]+)\)', content)
    unique_labels = list(set(labels))
    return len(unique_labels), unique_labels


def count_api_endpoints():
    """Count API endpoints from contracts."""
    api_file = CORE_NEW_DIR / "docs" / "04_API_CONTRACTS.md"
    if not api_file.exists():
        return 0, []

    content = api_file.read_text(encoding="utf-8")
    # Match patterns like "### GET /dialogs" or "### POST /dialogs/{id}/messages"
    endpoints = re.findall(r'###\s+(GET|POST|PATCH|PUT|DELETE)\s+(/\S+)', content)
    return len(endpoints), endpoints


def count_elo_workflows():
    """Count ELO_* workflows in n8n_workflows/."""
    workflows_dir = PROJECT_ROOT / "n8n_workflows"
    if not workflows_dir.exists():
        return 0, []

    elo_workflows = []
    for json_file in workflows_dir.rglob("*.json"):
        if json_file.name.startswith("ELO_"):
            elo_workflows.append(json_file.stem)

    return len(elo_workflows), elo_workflows


def get_docs_status():
    """Get status of CORE_NEW documentation files."""
    docs_dir = CORE_NEW_DIR / "docs"
    if not docs_dir.exists():
        return []

    expected_docs = [
        ("00_VISION.md", "Видение продукта"),
        ("01_CORE_DESIGN.md", "Архитектура ядра"),
        ("02_DATABASE_SCHEMA.md", "PostgreSQL схема"),
        ("03_NEO4J_SCHEMA.md", "Neo4j схема"),
        ("03_GRAPH_SCHEMA.md", "Neo4j схема"),  # Alternative name
        ("04_API_CONTRACTS.md", "API контракты"),
        ("05_AI_ARCHITECTURE.md", "AI архитектура"),
    ]

    status = []
    seen = set()
    for filename, desc in expected_docs:
        if filename in seen:
            continue
        filepath = docs_dir / filename
        if filepath.exists():
            status.append((filename, desc, "✅"))
            seen.add(filename)
        elif filename not in ["03_GRAPH_SCHEMA.md"]:  # Skip alternative if main exists
            status.append((filename, desc, "❌"))

    return status


def get_mcp_servers():
    """Get MCP server info."""
    mcp_dir = PROJECT_ROOT / "MCP"
    if not mcp_dir.exists():
        return []

    servers = []
    for server_dir in mcp_dir.iterdir():
        if server_dir.is_dir() and server_dir.name.startswith("mcp-"):
            app_file = server_dir / "app.py"
            if app_file.exists():
                name = server_dir.name
                servers.append(name)

    return servers


def update_context_file(stats, dry_run=False):
    """Update CONTEXT.md with new stats."""
    if not CONTEXT_FILE.exists():
        print(f"Error: {CONTEXT_FILE} not found")
        return False

    content = CONTEXT_FILE.read_text(encoding="utf-8")

    # Update timestamp
    now = datetime.now().strftime("%Y-%m-%d %H:%M")
    content = re.sub(
        r'\*Последнее обновление: .+\*',
        f'*Последнее обновление: {now} (UTC+4)*',
        content
    )

    # Update Quick Stats table
    old_stats_pattern = r'(\| Категория \| Количество \| Статус \|.*?\n\|[-|]+\n)(.*?)(\n---)'

    new_stats = f"""| PostgreSQL таблицы (elo_*) | {stats['pg_tables']} | {'✅ Созданы' if stats['pg_tables'] > 0 else 'TODO'} |
| Neo4j лейблы (ELO_*) | {stats['neo4j_labels']} | {'✅ Созданы' if stats['neo4j_labels'] > 0 else 'TODO'} |
| API v2 эндпоинты | {stats['api_endpoints']} | {'✅ Описаны' if stats['api_endpoints'] > 0 else 'TODO'} |
| n8n workflows (ELO_*) | {stats['workflows']} | {'✅' if stats['workflows'] > 0 else 'TODO'} |
| MCP серверы | {stats['mcp_servers']} | v2.0.0 |"""

    content = re.sub(
        old_stats_pattern,
        r'\1' + new_stats + r'\3',
        content,
        flags=re.DOTALL
    )

    if dry_run:
        print("\n[DRY RUN] Would update CONTEXT.md with:")
        print(f"  PostgreSQL tables: {stats['pg_tables']}")
        print(f"  Neo4j labels: {stats['neo4j_labels']}")
        print(f"  API endpoints: {stats['api_endpoints']}")
        print(f"  Workflows: {stats['workflows']}")
        print(f"  MCP servers: {stats['mcp_servers']}")
        return True

    CONTEXT_FILE.write_text(content, encoding="utf-8")
    return True


def main():
    parser = argparse.ArgumentParser(description="Update CORE_NEW context")
    parser.add_argument("--check", "-c", action="store_true", help="Check only, don't update")
    parser.add_argument("--verbose", "-v", action="store_true", help="Verbose output")
    args = parser.parse_args()

    print("Scanning CORE_NEW project state...")
    print("")

    # Collect stats
    pg_count, pg_tables = count_postgres_tables()
    print(f"PostgreSQL tables (elo_*): {pg_count}")
    if args.verbose and pg_tables:
        for t in pg_tables[:5]:
            print(f"  - {t}")
        if len(pg_tables) > 5:
            print(f"  ... and {len(pg_tables) - 5} more")

    neo4j_count, neo4j_labels = count_neo4j_labels()
    print(f"Neo4j labels (ELO_*): {neo4j_count}")
    if args.verbose and neo4j_labels:
        for l in neo4j_labels:
            print(f"  - {l}")

    api_count, api_endpoints = count_api_endpoints()
    print(f"API v2 endpoints: {api_count}")

    wf_count, workflows = count_elo_workflows()
    print(f"n8n workflows (ELO_*): {wf_count}")

    mcp_servers = get_mcp_servers()
    print(f"MCP servers: {len(mcp_servers)}")

    # Docs status
    print("\nDocumentation status:")
    docs_status = get_docs_status()
    for filename, desc, status in docs_status:
        # Use ASCII-safe status for Windows console
        safe_status = "[OK]" if status == "✅" else "[--]"
        print(f"  {safe_status} {filename}")

    stats = {
        "pg_tables": pg_count,
        "neo4j_labels": neo4j_count,
        "api_endpoints": api_count,
        "workflows": wf_count,
        "mcp_servers": len(mcp_servers)
    }

    # Update file
    print("")
    if args.check:
        update_context_file(stats, dry_run=True)
        print("\nNo changes made (--check mode)")
    else:
        if update_context_file(stats):
            print(f"Updated: {CONTEXT_FILE}")
        else:
            print("Failed to update CONTEXT.md")
            sys.exit(1)


if __name__ == "__main__":
    main()
