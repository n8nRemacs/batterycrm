#!/usr/bin/env python3
"""
Extract detailed node information from workflows.
Stores: node types, SQL queries, IF/Switch conditions, webhook paths.

Usage:
    python populate_workflow_nodes.py [--dry-run]
"""

import os
import sys
import re
import json
import argparse
from pathlib import Path

try:
    import psycopg2
    from psycopg2.extras import RealDictCursor, Json
except ImportError:
    print("Error: psycopg2 not installed. Run: pip install psycopg2-binary")
    sys.exit(1)

DEFAULT_DB_URL = "postgresql://supabase_admin:Mi31415926pS@185.221.214.83:6544/postgres"
SCRIPT_DIR = Path(__file__).parent
PROJECT_ROOT = SCRIPT_DIR.parent


def get_connection(db_url=None):
    url = db_url or os.getenv("DATABASE_URL", DEFAULT_DB_URL)
    return psycopg2.connect(url, cursor_factory=RealDictCursor)


def extract_node_details(node):
    """Extract important details from a node."""
    node_type = node.get("type", "")
    params = node.get("parameters", {})

    details = {
        "type": node_type,
        "type_short": node_type.split(".")[-1] if "." in node_type else node_type,
    }

    # Webhook node
    if "webhook" in node_type.lower():
        details["webhook_path"] = params.get("path", "")
        details["http_method"] = params.get("httpMethod", "GET")

    # Postgres node
    elif "postgres" in node_type.lower():
        details["operation"] = params.get("operation", "")
        query = params.get("query", "")
        if query:
            # Clean up query
            details["sql"] = query.strip()
        table = params.get("table", {})
        if isinstance(table, dict):
            details["table"] = table.get("value", "")
        elif isinstance(table, str):
            details["table"] = table

    # HTTP Request
    elif "httpRequest" in node_type.lower():
        details["url"] = params.get("url", "")
        details["method"] = params.get("method", "GET")

    # IF node
    elif node_type == "n8n-nodes-base.if" or "if" in node_type.lower():
        conditions = params.get("conditions", {})
        details["conditions"] = conditions
        # Try to extract readable condition
        if isinstance(conditions, dict):
            cond_list = []
            for cond_type, cond_items in conditions.items():
                if isinstance(cond_items, list):
                    for item in cond_items:
                        val1 = item.get("value1", "")
                        val2 = item.get("value2", "")
                        op = item.get("operation", "equals")
                        cond_list.append(f"{val1} {op} {val2}")
            details["condition_text"] = " AND ".join(cond_list) if cond_list else ""

    # Switch node
    elif "switch" in node_type.lower():
        rules = params.get("rules", {})
        details["rules"] = rules
        # Extract rule conditions
        if isinstance(rules, dict):
            rule_items = rules.get("rules", [])
            if isinstance(rule_items, list):
                rule_texts = []
                for rule in rule_items:
                    output = rule.get("outputKey", rule.get("output", ""))
                    conditions = rule.get("conditions", {})
                    rule_texts.append(f"{output}: {conditions}")
                details["rules_text"] = rule_texts

    # Code/Function node
    elif "code" in node_type.lower() or "function" in node_type.lower():
        js_code = params.get("jsCode", params.get("functionCode", ""))
        if js_code:
            details["code"] = js_code[:500]  # First 500 chars

    # Execute Workflow
    elif "executeWorkflow" in node_type.lower():
        wf_id = params.get("workflowId", {})
        if isinstance(wf_id, dict):
            details["workflow_id"] = wf_id.get("value", "")
        else:
            details["workflow_id"] = str(wf_id)

    # Set node
    elif "set" in node_type.lower():
        assignments = params.get("assignments", {})
        details["assignments"] = assignments

    return details


def scan_workflow_nodes(project_root):
    """Scan all workflows and extract node details."""
    nodes_data = []
    workflows_dir = project_root / "n8n_workflows"
    import_dir = project_root / "workflows_to_import"

    all_dirs = [d for d in [workflows_dir, import_dir] if d.exists()]

    for base_dir in all_dirs:
        for json_file in base_dir.rglob("*.json"):
            try:
                with open(json_file, "r", encoding="utf-8") as f:
                    data = json.load(f)

                workflow_name = data.get("name", json_file.stem)
                workflow_id = data.get("id", "")

                for node in data.get("nodes", []):
                    node_name = node.get("name", "")
                    node_type = node.get("type", "")

                    # Skip trigger/manual nodes for cleaner output
                    if "manualTrigger" in node_type:
                        continue

                    details = extract_node_details(node)

                    nodes_data.append({
                        "workflow_name": workflow_name,
                        "workflow_id": workflow_id,
                        "node_name": node_name,
                        "node_type": details.get("type_short", node_type),
                        "details": details
                    })

            except Exception as e:
                print(f"  Warning: {json_file}: {e}")

    return nodes_data


def create_nodes_table(conn):
    """Create workflow_nodes table if not exists."""
    with conn.cursor() as cur:
        cur.execute("""
            CREATE TABLE IF NOT EXISTS workflow_nodes (
                id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
                workflow_name VARCHAR(255) NOT NULL,
                workflow_id VARCHAR(100),
                node_name VARCHAR(255) NOT NULL,
                node_type VARCHAR(100) NOT NULL,
                details JSONB DEFAULT '{}',
                created_at TIMESTAMP WITH TIME ZONE DEFAULT NOW(),
                UNIQUE(workflow_name, node_name)
            );

            CREATE INDEX IF NOT EXISTS idx_workflow_nodes_workflow ON workflow_nodes(workflow_name);
            CREATE INDEX IF NOT EXISTS idx_workflow_nodes_type ON workflow_nodes(node_type);
        """)
    conn.commit()
    print("Table workflow_nodes ready")


def insert_nodes(conn, nodes_data, dry_run=False):
    """Insert nodes into database."""
    if dry_run:
        print(f"\n[DRY RUN] Would insert {len(nodes_data)} nodes")
        return len(nodes_data)

    inserted = 0
    with conn.cursor() as cur:
        # Clear existing data
        cur.execute("DELETE FROM workflow_nodes")

        for node in nodes_data:
            try:
                cur.execute("""
                    INSERT INTO workflow_nodes
                        (workflow_name, workflow_id, node_name, node_type, details)
                    VALUES (%s, %s, %s, %s, %s)
                    ON CONFLICT (workflow_name, node_name) DO UPDATE SET
                        workflow_id = EXCLUDED.workflow_id,
                        node_type = EXCLUDED.node_type,
                        details = EXCLUDED.details
                """, (
                    node["workflow_name"],
                    node["workflow_id"],
                    node["node_name"],
                    node["node_type"],
                    Json(node["details"])
                ))
                inserted += 1
            except Exception as e:
                print(f"  Error: {node['workflow_name']}/{node['node_name']}: {e}")

    conn.commit()
    return inserted


def main():
    parser = argparse.ArgumentParser(description="Extract workflow node details")
    parser.add_argument("--dry-run", action="store_true")
    parser.add_argument("--db-url", help="Database URL")
    args = parser.parse_args()

    print(f"Project root: {PROJECT_ROOT}")
    print("")

    print("Scanning workflow nodes...")
    nodes = scan_workflow_nodes(PROJECT_ROOT)
    print(f"  Found {len(nodes)} nodes")

    # Count by type
    by_type = {}
    for n in nodes:
        t = n["node_type"]
        by_type[t] = by_type.get(t, 0) + 1

    print("\nBy type:")
    for t, c in sorted(by_type.items(), key=lambda x: -x[1])[:15]:
        print(f"  {t}: {c}")

    if args.dry_run:
        print(f"\n[DRY RUN] Would insert {len(nodes)} nodes")
        return

    print("\nConnecting to database...")
    conn = get_connection(args.db_url)

    create_nodes_table(conn)

    print("Inserting nodes...")
    inserted = insert_nodes(conn, nodes)
    print(f"\nDone! Inserted {inserted} nodes")

    conn.close()


if __name__ == "__main__":
    main()
