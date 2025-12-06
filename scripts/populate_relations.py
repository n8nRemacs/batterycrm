#!/usr/bin/env python3
"""
Populate component_relations table by analyzing project files.
Detects relationships:
- Workflow → Table (reads_from, writes_to)
- Workflow → Workflow (calls, triggers)
- Android → API (calls)
- Android → Android (uses, depends_on)
- Table → Table (references via FK)

Usage:
    python populate_relations.py [--dry-run]
"""

import os
import sys
import re
import json
import argparse
from pathlib import Path
from collections import defaultdict

try:
    import psycopg2
    from psycopg2.extras import RealDictCursor
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


def get_components(conn):
    """Fetch all components indexed by type+name."""
    with conn.cursor() as cur:
        cur.execute("SELECT id, type, name, file_path, metadata FROM project_components WHERE status = 'active'")
        components = cur.fetchall()

    # Index by type+name
    by_key = {}
    by_type = defaultdict(list)
    for c in components:
        key = (c['type'], c['name'])
        by_key[key] = c
        by_type[c['type']].append(c)

    return by_key, by_type


def analyze_workflow_tables(project_root, components_by_key):
    """Analyze workflows to find table reads/writes."""
    relations = []
    workflows_dir = project_root / "n8n_workflows"

    if not workflows_dir.exists():
        return relations

    # Get all table names for matching
    table_names = {name for (typ, name) in components_by_key.keys() if typ == 'table'}

    for json_file in workflows_dir.rglob("*.json"):
        try:
            with open(json_file, "r", encoding="utf-8") as f:
                data = json.load(f)

            workflow_name = data.get("name", json_file.stem)
            workflow_key = ("workflow", workflow_name)

            if workflow_key not in components_by_key:
                continue

            # Analyze each node
            for node in data.get("nodes", []):
                node_type = node.get("type", "").lower()
                params = node.get("parameters", {})

                # PostgreSQL nodes
                if "postgres" in node_type:
                    operation = params.get("operation", "")
                    query = params.get("query", "")
                    table = params.get("table", {})

                    # Get table name from various sources
                    tables_found = set()

                    # From table parameter
                    if isinstance(table, dict):
                        table_name = table.get("value", "")
                        if table_name:
                            tables_found.add(table_name.lower())
                    elif isinstance(table, str):
                        tables_found.add(table.lower())

                    # From query (SELECT, INSERT, UPDATE, DELETE)
                    if query:
                        # FROM table
                        matches = re.findall(r'\bFROM\s+([a-z_][a-z0-9_]*)', query, re.I)
                        tables_found.update(m.lower() for m in matches)

                        # JOIN table
                        matches = re.findall(r'\bJOIN\s+([a-z_][a-z0-9_]*)', query, re.I)
                        tables_found.update(m.lower() for m in matches)

                        # INSERT INTO table
                        matches = re.findall(r'\bINTO\s+([a-z_][a-z0-9_]*)', query, re.I)
                        tables_found.update(m.lower() for m in matches)

                        # UPDATE table
                        matches = re.findall(r'\bUPDATE\s+([a-z_][a-z0-9_]*)', query, re.I)
                        tables_found.update(m.lower() for m in matches)

                        # DELETE FROM table
                        matches = re.findall(r'\bDELETE\s+FROM\s+([a-z_][a-z0-9_]*)', query, re.I)
                        tables_found.update(m.lower() for m in matches)

                    # Determine relation type
                    for table_name in tables_found:
                        # Skip system tables
                        if table_name.startswith(('pg_', 'information_', 'project_', 'component_', 'knowledge_')):
                            continue

                        # Find matching table in components
                        table_key = ("table", table_name)
                        if table_key not in components_by_key:
                            # Try case-insensitive match
                            for t in table_names:
                                if t.lower() == table_name:
                                    table_key = ("table", t)
                                    break

                        if table_key not in components_by_key:
                            continue

                        # Determine operation type
                        rel_type = "uses"
                        if operation in ["select", "executeQuery"] or "SELECT" in query.upper():
                            rel_type = "reads_from"
                        elif operation in ["insert", "upsert"] or "INSERT" in query.upper():
                            rel_type = "writes_to"
                        elif operation in ["update"] or "UPDATE" in query.upper():
                            rel_type = "writes_to"
                        elif operation in ["delete"] or "DELETE" in query.upper():
                            rel_type = "deletes_from"

                        relations.append({
                            "from_type": "workflow",
                            "from_name": workflow_name,
                            "to_type": "table",
                            "to_name": table_key[1],
                            "relation_type": rel_type,
                            "description": f"Node: {node.get('name', 'unknown')}"
                        })

        except Exception as e:
            print(f"  Warning: Could not analyze {json_file}: {e}")

    return relations


def analyze_workflow_calls(project_root, components_by_key):
    """Analyze workflows to find workflow-to-workflow calls."""
    relations = []
    workflows_dir = project_root / "n8n_workflows"
    import_dir = project_root / "workflows_to_import"

    # Collect all workflow directories
    all_dirs = [d for d in [workflows_dir, import_dir] if d.exists()]
    if not all_dirs:
        return relations

    # Build ID -> name mapping from all workflow files
    id_to_name = {}
    for base_dir in all_dirs:
        for json_file in base_dir.rglob("*.json"):
            try:
                with open(json_file, "r", encoding="utf-8") as f:
                    data = json.load(f)
                wf_id = data.get("id")
                wf_name = data.get("name", json_file.stem)
                if wf_id:
                    id_to_name[str(wf_id)] = wf_name
            except:
                pass

    # Build webhook path index
    webhook_index = {}
    for (typ, name), comp in components_by_key.items():
        if typ == "workflow":
            meta = comp.get("metadata") or {}
            if isinstance(meta, dict):
                webhook_path = meta.get("webhook_path")
                if webhook_path:
                    # Normalize path - multiple variations
                    path_clean = webhook_path.strip("/").lower()
                    webhook_index[path_clean] = name
                    # Also index without leading slash variations
                    if "/" in path_clean:
                        webhook_index[path_clean.split("/")[-1]] = name

    print(f"    ID mapping: {len(id_to_name)} workflows")
    print(f"    Webhook index: {len(webhook_index)} paths")

    for base_dir in all_dirs:
        for json_file in base_dir.rglob("*.json"):
            try:
                with open(json_file, "r", encoding="utf-8") as f:
                    data = json.load(f)

                workflow_name = data.get("name", json_file.stem)
                workflow_key = ("workflow", workflow_name)

                if workflow_key not in components_by_key:
                    continue

                for node in data.get("nodes", []):
                    node_type = node.get("type", "")
                    node_name = node.get("name", "")
                    params = node.get("parameters", {})

                    # 1. Execute Workflow node (by ID)
                    if "executeWorkflow" in node_type.lower() or node_type == "n8n-nodes-base.executeWorkflow":
                        # workflowId can be string, dict with value, or expression
                        wf_id_param = params.get("workflowId", {})

                        wf_id = None
                        if isinstance(wf_id_param, str):
                            wf_id = wf_id_param
                        elif isinstance(wf_id_param, dict):
                            wf_id = wf_id_param.get("value") or wf_id_param.get("__rl", False)
                            if wf_id_param.get("mode") == "id":
                                wf_id = wf_id_param.get("value")

                        if wf_id and str(wf_id) in id_to_name:
                            called_name = id_to_name[str(wf_id)]
                            if called_name != workflow_name:
                                relations.append({
                                    "from_type": "workflow",
                                    "from_name": workflow_name,
                                    "to_type": "workflow",
                                    "to_name": called_name,
                                    "relation_type": "calls",
                                    "description": f"Execute Workflow node: {node_name}"
                                })

                    # 2. HTTP Request to webhook
                    elif "httpRequest" in node_type.lower() or node_type == "n8n-nodes-base.httpRequest":
                        url = params.get("url", "")

                        # Handle expression in URL
                        if isinstance(url, dict):
                            url = str(url)

                        # Check if URL contains n8n webhook
                        if "webhook" in url.lower() or "n8n" in url.lower():
                            # Try multiple patterns to extract path
                            patterns = [
                                r'/webhook[/-]?(?:test/)?([^?\s"\']+)',
                                r'n8nsrv\.ru/webhook/([^?\s"\']+)',
                                r'/webhook/([^?\s"\']+)',
                            ]

                            for pattern in patterns:
                                match = re.search(pattern, url, re.I)
                                if match:
                                    called_path = match.group(1).strip("/").lower()

                                    # Try exact match first
                                    if called_path in webhook_index:
                                        called_workflow = webhook_index[called_path]
                                        if called_workflow != workflow_name:
                                            relations.append({
                                                "from_type": "workflow",
                                                "from_name": workflow_name,
                                                "to_type": "workflow",
                                                "to_name": called_workflow,
                                                "relation_type": "calls",
                                                "description": f"HTTP webhook: /{called_path}"
                                            })
                                        break

                                    # Try partial match (last segment)
                                    path_end = called_path.split("/")[-1] if "/" in called_path else called_path
                                    if path_end in webhook_index:
                                        called_workflow = webhook_index[path_end]
                                        if called_workflow != workflow_name:
                                            relations.append({
                                                "from_type": "workflow",
                                                "from_name": workflow_name,
                                                "to_type": "workflow",
                                                "to_name": called_workflow,
                                                "relation_type": "calls",
                                                "description": f"HTTP webhook: /{called_path}"
                                            })
                                        break

                    # 3. n8n Trigger node (workflow triggers another)
                    elif "n8nTrigger" in node_type:
                        # This workflow can be triggered by other workflows
                        pass  # Handled by reverse lookup

            except Exception as e:
                print(f"  Warning: Could not analyze {json_file}: {e}")

    return relations


def analyze_android_api(project_root, components_by_key):
    """Analyze Android code to find API calls."""
    relations = []
    android_src = project_root / "app" / "src" / "main" / "java" / "com" / "eldoleado" / "app"

    if not android_src.exists():
        return relations

    # Build API endpoint index from workflow webhooks
    api_index = {}
    for (typ, name), comp in components_by_key.items():
        if typ == "workflow":
            meta = comp.get("metadata") or {}
            if isinstance(meta, dict):
                webhook_path = meta.get("webhook_path")
                if webhook_path and "api" in webhook_path.lower():
                    # Normalize path
                    path_key = webhook_path.strip("/").lower()
                    api_index[path_key] = name

    for kt_file in android_src.rglob("*.kt"):
        try:
            content = kt_file.read_text(encoding="utf-8")
            file_name = kt_file.stem

            # Determine component type
            comp_type = None
            if "Repository" in file_name:
                comp_type = "android_repository"
            elif "ViewModel" in file_name:
                comp_type = "android_viewmodel"
            elif "Activity" in file_name:
                comp_type = "android_activity"
            elif kt_file.parent.name == "api":
                if "Service" in file_name:
                    comp_type = "android_api_service"
                else:
                    comp_type = "android_api"

            if not comp_type:
                continue

            comp_key = (comp_type, file_name)
            if comp_key not in components_by_key:
                # Try generic android_class
                comp_key = ("android_class", file_name)

            if comp_key not in components_by_key:
                continue

            # Find API path annotations
            api_paths = re.findall(r'@(?:GET|POST|PUT|DELETE|PATCH)\s*\(\s*["\']([^"\']+)["\']', content)

            for path in api_paths:
                path_key = path.strip("/").lower()

                # Find matching workflow
                for api_path, workflow_name in api_index.items():
                    if path_key in api_path or api_path in path_key:
                        relations.append({
                            "from_type": comp_type,
                            "from_name": file_name,
                            "to_type": "workflow",
                            "to_name": workflow_name,
                            "relation_type": "calls",
                            "description": f"API call: {path}"
                        })
                        break

        except Exception as e:
            print(f"  Warning: Could not analyze {kt_file}: {e}")

    return relations


def analyze_android_dependencies(project_root, components_by_key):
    """Analyze Android code to find internal dependencies."""
    relations = []
    android_src = project_root / "app" / "src" / "main" / "java" / "com" / "eldoleado" / "app"

    if not android_src.exists():
        return relations

    # Get all Android component names
    android_components = {}
    for (typ, name), comp in components_by_key.items():
        if typ.startswith("android_"):
            android_components[name] = typ

    for kt_file in android_src.rglob("*.kt"):
        try:
            content = kt_file.read_text(encoding="utf-8")
            file_name = kt_file.stem

            # Find component type
            comp_type = android_components.get(file_name)
            if not comp_type:
                continue

            # Find constructor injections and property references
            for other_name, other_type in android_components.items():
                if other_name == file_name:
                    continue

                # Check if this component uses the other
                # Look for: private val xxxRepository, @Inject xxx, etc.
                patterns = [
                    rf'\b{other_name}\b',  # Direct reference
                    rf'private\s+(?:val|var)\s+\w*{other_name.lower()}\w*\s*:',  # Property
                    rf'@Inject\s+.*{other_name}',  # Injection
                ]

                for pattern in patterns:
                    if re.search(pattern, content, re.I):
                        # Determine relation type
                        rel_type = "uses"
                        if "Repository" in other_name:
                            rel_type = "depends_on"
                        elif "ViewModel" in other_name and "Activity" in file_name:
                            rel_type = "uses"

                        relations.append({
                            "from_type": comp_type,
                            "from_name": file_name,
                            "to_type": other_type,
                            "to_name": other_name,
                            "relation_type": rel_type,
                            "description": "Code reference"
                        })
                        break

        except Exception as e:
            print(f"  Warning: Could not analyze {kt_file}: {e}")

    return relations


def analyze_table_references(project_root, components_by_key):
    """Analyze SQL migrations to find table FK references."""
    relations = []
    migrations_dir = project_root / "database" / "migrations"

    if not migrations_dir.exists():
        return relations

    # Get all table names
    table_names = {name for (typ, name) in components_by_key.keys() if typ == 'table'}

    for sql_file in migrations_dir.glob("*.sql"):
        try:
            content = sql_file.read_text(encoding="utf-8")

            # Find REFERENCES clauses
            # Pattern: column_name TYPE REFERENCES other_table(column)
            matches = re.findall(
                r'(\w+)\s+(?:UUID|INTEGER|BIGINT)\s+(?:NOT\s+NULL\s+)?REFERENCES\s+(\w+)\s*\(',
                content, re.I
            )

            # Also find current table being created
            create_matches = re.findall(r'CREATE\s+TABLE\s+(?:IF\s+NOT\s+EXISTS\s+)?(\w+)', content, re.I)

            current_table = None
            lines = content.split('\n')
            for line in lines:
                # Track current CREATE TABLE
                create_match = re.search(r'CREATE\s+TABLE\s+(?:IF\s+NOT\s+EXISTS\s+)?(\w+)', line, re.I)
                if create_match:
                    current_table = create_match.group(1).lower()

                # Find REFERENCES in this line
                ref_match = re.search(r'REFERENCES\s+(\w+)\s*\(', line, re.I)
                if ref_match and current_table:
                    ref_table = ref_match.group(1).lower()

                    # Skip system tables
                    if ref_table.startswith(('project_', 'component_', 'knowledge_')):
                        continue

                    # Find matching tables
                    from_key = None
                    to_key = None

                    for t in table_names:
                        if t.lower() == current_table:
                            from_key = ("table", t)
                        if t.lower() == ref_table:
                            to_key = ("table", t)

                    if from_key and to_key and from_key != to_key:
                        if from_key in components_by_key and to_key in components_by_key:
                            relations.append({
                                "from_type": "table",
                                "from_name": from_key[1],
                                "to_type": "table",
                                "to_name": to_key[1],
                                "relation_type": "references",
                                "description": f"Foreign key in {sql_file.name}"
                            })

        except Exception as e:
            print(f"  Warning: Could not analyze {sql_file}: {e}")

    return relations


def analyze_doc_relations(project_root, components_by_key):
    """Analyze documentation files to find what they document."""
    relations = []
    docs_dirs = [project_root / "docs", project_root / "Plans"]

    # Build index of component names for matching
    component_names = {}
    for (typ, name), comp in components_by_key.items():
        # Index by name (lowercase for matching)
        component_names[name.lower()] = (typ, name)
        # Also index by name variants
        if name.startswith("BAT "):
            component_names[name[4:].lower()] = (typ, name)
        if name.startswith("API_Android_"):
            component_names[name[12:].lower()] = (typ, name)
        if name.startswith("MCP_"):
            component_names[name[4:].lower()] = (typ, name)

    for docs_dir in docs_dirs:
        if not docs_dir.exists():
            continue

        for md_file in docs_dir.rglob("*.md"):
            try:
                content = md_file.read_text(encoding="utf-8")
                doc_name = md_file.stem
                doc_key = ("doc", doc_name)

                if doc_key not in components_by_key:
                    continue

                # Find references to components in the document
                found_refs = set()

                # 1. Look for workflow names (BAT*, API_Android_*)
                workflow_patterns = [
                    r'\bBAT[_ ]IN[_ ]\w+',
                    r'\bBAT[_ ]OUT[_ ]\w+',
                    r'\bBAT[_ ]\w+',
                    r'\bAPI_Android_\w+',
                    r'\bAPI_Operator_\w+',
                ]
                for pattern in workflow_patterns:
                    matches = re.findall(pattern, content, re.I)
                    for match in matches:
                        # Normalize name
                        name_normalized = match.replace("_", " ").strip()
                        wf_key = ("workflow", name_normalized)
                        if wf_key in components_by_key:
                            found_refs.add(("workflow", name_normalized, "documents"))
                        else:
                            # Try with underscores
                            wf_key2 = ("workflow", match)
                            if wf_key2 in components_by_key:
                                found_refs.add(("workflow", match, "documents"))

                # 2. Look for MCP server references
                mcp_patterns = [
                    r'\bmcp-(\w+)',
                    r'\bMCP[_ ](\w+)',
                ]
                for pattern in mcp_patterns:
                    matches = re.findall(pattern, content, re.I)
                    for match in matches:
                        mcp_name = f"MCP_{match.upper()}"
                        mcp_key = ("mcp_server", mcp_name)
                        if mcp_key in components_by_key:
                            found_refs.add(("mcp_server", mcp_name, "documents"))

                # 3. Look for table references
                table_patterns = [
                    r'\b(appeals|clients|messages|tenants|devices|repairs|appeal_devices)\b',
                    r'\bFROM\s+([a-z_]+)',
                    r'\bINTO\s+([a-z_]+)',
                    r'\btable:\s*`?([a-z_]+)`?',
                ]
                for pattern in table_patterns:
                    matches = re.findall(pattern, content, re.I)
                    for match in matches:
                        table_key = ("table", match.lower())
                        if table_key in components_by_key:
                            found_refs.add(("table", match.lower(), "documents"))

                # 4. Look for Android component references
                android_patterns = [
                    r'\b(\w+Activity)\b',
                    r'\b(\w+ViewModel)\b',
                    r'\b(\w+Repository)\b',
                    r'\b(\w+Service)\b',
                ]
                for pattern in android_patterns:
                    matches = re.findall(pattern, content)
                    for match in matches:
                        # Check all android types
                        for android_type in ["android_activity", "android_viewmodel", "android_repository", "android_api_service"]:
                            android_key = (android_type, match)
                            if android_key in components_by_key:
                                found_refs.add((android_type, match, "documents"))

                # Create relations
                for ref_type, ref_name, rel_type in found_refs:
                    relations.append({
                        "from_type": "doc",
                        "from_name": doc_name,
                        "to_type": ref_type,
                        "to_name": ref_name,
                        "relation_type": rel_type,
                        "description": f"Documentation reference"
                    })

            except Exception as e:
                print(f"  Warning: Could not analyze {md_file}: {e}")

    return relations


def deduplicate_relations(relations):
    """Remove duplicate relations."""
    seen = set()
    unique = []
    for rel in relations:
        key = (rel["from_type"], rel["from_name"], rel["to_type"], rel["to_name"], rel["relation_type"])
        if key not in seen:
            seen.add(key)
            unique.append(rel)
    return unique


def insert_relations(conn, relations, dry_run=False):
    """Insert relations into database."""
    if dry_run:
        print("\n[DRY RUN] Would insert:")
        by_type = defaultdict(list)
        for rel in relations:
            by_type[rel["relation_type"]].append(rel)
        for rel_type, rels in sorted(by_type.items()):
            print(f"\n  {rel_type} ({len(rels)}):")
            for rel in rels[:10]:
                print(f"    {rel['from_type']}:{rel['from_name']} -> {rel['to_type']}:{rel['to_name']}")
            if len(rels) > 10:
                print(f"    ...and {len(rels) - 10} more")
        return len(relations)

    inserted = 0
    errors = 0

    with conn.cursor() as cur:
        for rel in relations:
            try:
                # Get component IDs
                cur.execute(
                    "SELECT id FROM project_components WHERE type = %s AND name = %s",
                    (rel["from_type"], rel["from_name"])
                )
                from_row = cur.fetchone()

                cur.execute(
                    "SELECT id FROM project_components WHERE type = %s AND name = %s",
                    (rel["to_type"], rel["to_name"])
                )
                to_row = cur.fetchone()

                if not from_row or not to_row:
                    continue

                # Insert relation
                cur.execute("""
                    INSERT INTO component_relations
                        (from_component_id, to_component_id, relation_type, description)
                    VALUES (%s, %s, %s, %s)
                    ON CONFLICT (from_component_id, to_component_id, relation_type)
                    DO UPDATE SET
                        description = COALESCE(EXCLUDED.description, component_relations.description),
                        verified_at = NOW()
                """, (from_row["id"], to_row["id"], rel["relation_type"], rel.get("description")))

                inserted += 1

            except Exception as e:
                errors += 1
                if errors <= 5:
                    print(f"  Error: {rel['from_name']} → {rel['to_name']}: {e}")

    conn.commit()
    return inserted


def main():
    parser = argparse.ArgumentParser(description="Populate component relations")
    parser.add_argument("--dry-run", action="store_true", help="Don't insert, just show")
    parser.add_argument("--db-url", help="Database connection URL")
    args = parser.parse_args()

    print(f"Project root: {PROJECT_ROOT}")
    print("")

    # Connect to database
    print("Connecting to database...")
    conn = get_connection(args.db_url)

    # Get existing components
    print("Fetching components...")
    components_by_key, components_by_type = get_components(conn)
    print(f"  Found {len(components_by_key)} components")
    print("")

    all_relations = []

    # Analyze workflow -> table relations
    print("Analyzing workflow -> table relations...")
    wf_table_rels = analyze_workflow_tables(PROJECT_ROOT, components_by_key)
    print(f"  Found {len(wf_table_rels)} relations")
    all_relations.extend(wf_table_rels)

    # Analyze workflow -> workflow calls
    print("Analyzing workflow -> workflow calls...")
    wf_wf_rels = analyze_workflow_calls(PROJECT_ROOT, components_by_key)
    print(f"  Found {len(wf_wf_rels)} relations")
    all_relations.extend(wf_wf_rels)

    # Analyze Android -> API calls
    print("Analyzing Android -> API calls...")
    android_api_rels = analyze_android_api(PROJECT_ROOT, components_by_key)
    print(f"  Found {len(android_api_rels)} relations")
    all_relations.extend(android_api_rels)

    # Analyze Android internal dependencies
    print("Analyzing Android internal dependencies...")
    android_deps = analyze_android_dependencies(PROJECT_ROOT, components_by_key)
    print(f"  Found {len(android_deps)} relations")
    all_relations.extend(android_deps)

    # Analyze table FK references
    print("Analyzing table FK references...")
    table_refs = analyze_table_references(PROJECT_ROOT, components_by_key)
    print(f"  Found {len(table_refs)} relations")
    all_relations.extend(table_refs)

    # Analyze doc -> component relations
    print("Analyzing doc -> component relations...")
    doc_rels = analyze_doc_relations(PROJECT_ROOT, components_by_key)
    print(f"  Found {len(doc_rels)} relations")
    all_relations.extend(doc_rels)

    # Deduplicate
    print("\nDeduplicating...")
    all_relations = deduplicate_relations(all_relations)
    print(f"Total unique relations: {len(all_relations)}")

    # Insert
    print("")
    inserted = insert_relations(conn, all_relations, dry_run=args.dry_run)

    if not args.dry_run:
        print(f"\nDone! Inserted/updated {inserted} relations")

    conn.close()


if __name__ == "__main__":
    main()
