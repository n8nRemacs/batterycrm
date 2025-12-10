#!/usr/bin/env python3
"""
Populate project_components tables by scanning the project.
Extracts information from:
- n8n workflows (JSON files)
- Android source code (Kotlin files)
- Database migrations (SQL files)
- Documentation (MD files)

Usage:
    python populate_knowledge_base.py [--dry-run]

Environment variables:
    DATABASE_URL - PostgreSQL connection string
"""

import os
import sys
import re
import json
import argparse
from pathlib import Path
from datetime import datetime

try:
    import psycopg2
    from psycopg2.extras import RealDictCursor, Json
except ImportError:
    print("Error: psycopg2 not installed. Run: pip install psycopg2-binary")
    sys.exit(1)

# Default connection
DEFAULT_DB_URL = "postgresql://supabase_admin:Mi31415926pS@185.221.214.83:6544/postgres"

# Project root
SCRIPT_DIR = Path(__file__).parent
PROJECT_ROOT = SCRIPT_DIR.parent


def get_connection(db_url=None):
    """Create database connection."""
    url = db_url or os.getenv("DATABASE_URL", DEFAULT_DB_URL)
    return psycopg2.connect(url, cursor_factory=RealDictCursor)


def scan_workflows(project_root):
    """Scan n8n workflow JSON files."""
    components = []
    workflows_dir = project_root / "n8n_workflows"
    import_dir = project_root / "workflows_to_import"

    for base_dir in [workflows_dir, import_dir]:
        if not base_dir.exists():
            continue

        for json_file in base_dir.rglob("*.json"):
            try:
                with open(json_file, "r", encoding="utf-8") as f:
                    data = json.load(f)

                name = data.get("name", json_file.stem)
                category = json_file.parent.name if json_file.parent != base_dir else "Import"

                # Extract webhook path
                webhook_path = None
                is_active = data.get("active", False)
                tags = [t.get("name") for t in data.get("tags", []) if t.get("name")]

                for node in data.get("nodes", []):
                    if node.get("type", "").endswith(".webhook"):
                        params = node.get("parameters", {})
                        webhook_path = params.get("path")
                        break

                # Determine tables used (look for postgres nodes)
                tables_used = set()
                for node in data.get("nodes", []):
                    if "postgres" in node.get("type", "").lower():
                        query = node.get("parameters", {}).get("query", "")
                        # Simple regex to find table names
                        matches = re.findall(r'(?:FROM|INTO|UPDATE|JOIN)\s+([a-z_]+)', query, re.I)
                        tables_used.update(matches)

                rel_path = str(json_file.relative_to(project_root))

                components.append({
                    "type": "workflow",
                    "name": name,
                    "category": category,
                    "file_path": rel_path,
                    "tech_stack": "json",
                    "description": f"n8n workflow in {category}",
                    "metadata": {
                        "webhook_path": webhook_path,
                        "is_active": is_active,
                        "tags": tags,
                        "tables_used": list(tables_used)
                    }
                })

            except (json.JSONDecodeError, Exception) as e:
                print(f"  Warning: Could not parse {json_file}: {e}")

    return components


def scan_android(project_root):
    """Scan Android Kotlin source files."""
    components = []
    android_src = project_root / "app" / "src" / "main" / "java" / "com" / "eldoleado" / "app"

    if not android_src.exists():
        return components

    for kt_file in android_src.rglob("*.kt"):
        try:
            content = kt_file.read_text(encoding="utf-8")
            rel_path = str(kt_file.relative_to(project_root))
            name = kt_file.stem

            # Determine type based on content and location
            comp_type = "android_class"
            category = kt_file.parent.name
            extends = None
            description = None

            if "Activity" in name or ": AppCompatActivity" in content:
                comp_type = "android_activity"
                category = "ui"
                match = re.search(r'class\s+\w+\s*:\s*(\w+)', content)
                if match:
                    extends = match.group(1)

            elif "ViewModel" in name or ": ViewModel" in content:
                comp_type = "android_viewmodel"
                category = "viewmodel"
                # Find StateFlows
                flows = re.findall(r'val\s+(\w+)\s*:\s*StateFlow', content)
                description = f"StateFlows: {', '.join(flows)}" if flows else None

            elif "Repository" in name:
                comp_type = "android_repository"
                category = "data"

            elif "Adapter" in name:
                comp_type = "android_adapter"
                category = "adapters"

            elif kt_file.parent.name == "api":
                if "Service" in name:
                    comp_type = "android_api_service"
                else:
                    comp_type = "android_api"
                category = "api"

            elif kt_file.parent.name == "fcm":
                comp_type = "android_fcm"
                category = "fcm"

            elif "Entity" in name:
                comp_type = "android_entity"
                category = "database"

            elif "Dao" in name:
                comp_type = "android_dao"
                category = "database"

            components.append({
                "type": comp_type,
                "name": name,
                "category": category,
                "file_path": rel_path,
                "tech_stack": "kotlin",
                "description": description,
                "metadata": {
                    "extends": extends
                } if extends else {}
            })

        except Exception as e:
            print(f"  Warning: Could not parse {kt_file}: {e}")

    return components


def scan_database(project_root):
    """Scan SQL migration files and extract table names."""
    components = []
    migrations_dir = project_root / "database" / "migrations"

    if not migrations_dir.exists():
        return components

    for sql_file in migrations_dir.glob("*.sql"):
        try:
            content = sql_file.read_text(encoding="utf-8")
            rel_path = str(sql_file.relative_to(project_root))

            # Extract CREATE TABLE statements
            tables = re.findall(r'CREATE\s+TABLE\s+(?:IF\s+NOT\s+EXISTS\s+)?([a-z_]+)', content, re.I)

            for table in tables:
                # Skip project_ tables (knowledge base itself)
                if table.startswith("project_") or table.startswith("component_") or table.startswith("knowledge_"):
                    continue

                components.append({
                    "type": "table",
                    "name": table,
                    "category": "database",
                    "file_path": rel_path,
                    "tech_stack": "sql",
                    "description": f"Table from {sql_file.name}",
                    "metadata": {
                        "migration_file": sql_file.name
                    }
                })

        except Exception as e:
            print(f"  Warning: Could not parse {sql_file}: {e}")

    return components


def scan_mcp_servers(project_root):
    """Scan MCP server directories."""
    components = []
    mcp_dir = project_root / "MCP"

    if not mcp_dir.exists():
        return components

    for server_dir in mcp_dir.iterdir():
        if server_dir.is_dir() and server_dir.name.startswith("mcp-"):
            app_file = server_dir / "app.py"
            if app_file.exists():
                rel_path = str(server_dir.relative_to(project_root))
                name = server_dir.name.replace("mcp-", "").upper()

                components.append({
                    "type": "mcp_server",
                    "name": f"MCP_{name}",
                    "category": "integration",
                    "file_path": rel_path,
                    "tech_stack": "python",
                    "description": f"MCP server for {name} integration",
                    "metadata": {
                        "docker": (server_dir / "Dockerfile").exists()
                    }
                })

    return components


def scan_docs(project_root):
    """Scan documentation files."""
    components = []
    docs_dirs = [
        project_root / "docs",
        project_root / "Plans"
    ]

    for docs_dir in docs_dirs:
        if not docs_dir.exists():
            continue

        for md_file in docs_dir.rglob("*.md"):
            try:
                content = md_file.read_text(encoding="utf-8")
                rel_path = str(md_file.relative_to(project_root))
                name = md_file.stem
                category = md_file.parent.name

                # Count lines
                lines = len(content.splitlines())

                # Get first heading as description
                description = None
                match = re.search(r'^#\s+(.+)$', content, re.MULTILINE)
                if match:
                    description = match.group(1)[:100]

                components.append({
                    "type": "doc",
                    "name": name,
                    "category": category,
                    "file_path": rel_path,
                    "tech_stack": "markdown",
                    "description": description,
                    "metadata": {
                        "lines": lines
                    }
                })

            except Exception as e:
                print(f"  Warning: Could not parse {md_file}: {e}")

    return components


def scan_scripts(project_root):
    """Scan script files."""
    components = []
    scripts_dir = project_root / "scripts"

    if not scripts_dir.exists():
        return components

    for script_file in scripts_dir.iterdir():
        if script_file.suffix in [".py", ".js", ".sh", ".bat"]:
            rel_path = str(script_file.relative_to(project_root))
            name = script_file.stem
            tech = {
                ".py": "python",
                ".js": "javascript",
                ".sh": "bash",
                ".bat": "batch"
            }.get(script_file.suffix, "unknown")

            components.append({
                "type": "script",
                "name": name,
                "category": "automation",
                "file_path": rel_path,
                "tech_stack": tech,
                "description": f"{tech.title()} script",
                "metadata": {}
            })

    return components


def insert_components(conn, components, dry_run=False, log_changes=True):
    """Insert components into database with changelog logging."""
    if dry_run:
        print("\n[DRY RUN] Would insert:")
        for comp in components:
            print(f"  - {comp['type']}: {comp['name']}")
        return {"inserted": len(components), "created": 0, "updated": 0}

    inserted = 0
    created = 0
    updated = 0

    with conn.cursor() as cur:
        for comp in components:
            try:
                # Check if exists
                cur.execute(
                    "SELECT id FROM project_components WHERE type = %(type)s AND name = %(name)s",
                    comp
                )
                existing = cur.fetchone()
                is_new = existing is None

                # Insert/update
                cur.execute("""
                    INSERT INTO project_components
                        (type, name, category, file_path, tech_stack, description, metadata, status)
                    VALUES
                        (%(type)s, %(name)s, %(category)s, %(file_path)s, %(tech_stack)s, %(description)s, %(metadata)s, 'active')
                    ON CONFLICT (type, name) DO UPDATE SET
                        category = EXCLUDED.category,
                        file_path = EXCLUDED.file_path,
                        tech_stack = EXCLUDED.tech_stack,
                        description = COALESCE(EXCLUDED.description, project_components.description),
                        metadata = project_components.metadata || EXCLUDED.metadata,
                        updated_at = NOW(),
                        last_verified_at = NOW()
                    RETURNING id
                """, {
                    **comp,
                    "metadata": Json(comp.get("metadata", {}))
                })
                result = cur.fetchone()
                comp_id = result["id"] if result else None

                inserted += 1
                if is_new:
                    created += 1
                    # Log to changelog
                    if log_changes and comp_id:
                        cur.execute("""
                            INSERT INTO project_changelog
                                (component_id, component_type, component_name, change_type, change_description, changed_by)
                            VALUES (%s, %s, %s, 'created', 'Auto-discovered by populate_knowledge_base.py', 'auto-sync')
                        """, (comp_id, comp["type"], comp["name"]))
                else:
                    updated += 1

            except Exception as e:
                print(f"  Error inserting {comp['name']}: {e}")

    conn.commit()
    return {"inserted": inserted, "created": created, "updated": updated}


def main():
    parser = argparse.ArgumentParser(description="Populate knowledge base from project files")
    parser.add_argument("--dry-run", action="store_true", help="Don't actually insert, just show what would be done")
    parser.add_argument("--db-url", help="Database connection URL")
    args = parser.parse_args()

    print(f"Project root: {PROJECT_ROOT}")
    print("")

    # Collect all components
    all_components = []

    print("Scanning workflows...")
    workflows = scan_workflows(PROJECT_ROOT)
    print(f"  Found {len(workflows)} workflows")
    all_components.extend(workflows)

    print("Scanning Android source...")
    android = scan_android(PROJECT_ROOT)
    print(f"  Found {len(android)} Android components")
    all_components.extend(android)

    print("Scanning database migrations...")
    tables = scan_database(PROJECT_ROOT)
    print(f"  Found {len(tables)} tables")
    all_components.extend(tables)

    print("Scanning MCP servers...")
    mcps = scan_mcp_servers(PROJECT_ROOT)
    print(f"  Found {len(mcps)} MCP servers")
    all_components.extend(mcps)

    print("Scanning documentation...")
    docs = scan_docs(PROJECT_ROOT)
    print(f"  Found {len(docs)} documents")
    all_components.extend(docs)

    print("Scanning scripts...")
    scripts = scan_scripts(PROJECT_ROOT)
    print(f"  Found {len(scripts)} scripts")
    all_components.extend(scripts)

    print(f"\nTotal: {len(all_components)} components")
    print("")

    # Insert into database
    if args.dry_run:
        insert_components(None, all_components, dry_run=True)
    else:
        print("Connecting to database...")
        try:
            conn = get_connection(args.db_url)
            print("Inserting components...")
            result = insert_components(conn, all_components)
            print(f"\nDone! Inserted/updated {result['inserted']} components")
            if result['created'] > 0:
                print(f"  New: {result['created']}, Updated: {result['updated']}")
            conn.close()
        except Exception as e:
            print(f"Error: {e}")
            print("\nMake sure:")
            print("1. Database is accessible")
            print("2. Migration 016_project_knowledge_base.sql has been applied")
            sys.exit(1)


if __name__ == "__main__":
    main()
