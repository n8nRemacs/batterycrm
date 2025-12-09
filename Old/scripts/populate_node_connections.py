#!/usr/bin/env python3
"""
Extract node connections from workflows for execution path tracing.

Usage:
    python populate_node_connections.py
"""

import os
import sys
import json
from pathlib import Path

try:
    import psycopg2
    from psycopg2.extras import RealDictCursor
except ImportError:
    print("Error: psycopg2 not installed")
    sys.exit(1)

DEFAULT_DB_URL = "postgresql://supabase_admin:Mi31415926pS@185.221.214.83:6544/postgres"
SCRIPT_DIR = Path(__file__).parent
PROJECT_ROOT = SCRIPT_DIR.parent


def get_connection():
    return psycopg2.connect(
        os.getenv("DATABASE_URL", DEFAULT_DB_URL),
        cursor_factory=RealDictCursor
    )


def create_tables(conn):
    """Create node_connections table."""
    with conn.cursor() as cur:
        cur.execute("""
            CREATE TABLE IF NOT EXISTS node_connections (
                id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
                workflow_name VARCHAR(255) NOT NULL,
                from_node VARCHAR(255) NOT NULL,
                to_node VARCHAR(255) NOT NULL,
                output_type VARCHAR(50) DEFAULT 'main',
                output_index INTEGER DEFAULT 0,
                condition_branch VARCHAR(100),  -- for IF: 'true'/'false', for Switch: branch name
                created_at TIMESTAMP WITH TIME ZONE DEFAULT NOW(),
                UNIQUE(workflow_name, from_node, to_node, output_type, output_index)
            );

            CREATE INDEX IF NOT EXISTS idx_node_conn_workflow ON node_connections(workflow_name);
            CREATE INDEX IF NOT EXISTS idx_node_conn_from ON node_connections(from_node);
            CREATE INDEX IF NOT EXISTS idx_node_conn_to ON node_connections(to_node);
        """)
    conn.commit()
    print("Table node_connections ready")


def extract_connections(project_root):
    """Extract all node connections from workflow files."""
    connections = []
    workflows_dir = project_root / "n8n_workflows"
    import_dir = project_root / "workflows_to_import"

    all_dirs = [d for d in [workflows_dir, import_dir] if d.exists()]

    for base_dir in all_dirs:
        for json_file in base_dir.rglob("*.json"):
            try:
                with open(json_file, "r", encoding="utf-8") as f:
                    data = json.load(f)

                workflow_name = data.get("name", json_file.stem)
                wf_connections = data.get("connections", {})

                # Build node type index for condition branch detection
                node_types = {}
                for node in data.get("nodes", []):
                    node_types[node.get("name", "")] = node.get("type", "")

                for from_node, outputs in wf_connections.items():
                    from_type = node_types.get(from_node, "")

                    for output_type, target_arrays in outputs.items():
                        for idx, target_list in enumerate(target_arrays):
                            # Determine condition branch for IF/Switch nodes
                            condition_branch = None
                            if "if" in from_type.lower():
                                condition_branch = "true" if idx == 0 else "false"
                            elif "switch" in from_type.lower():
                                condition_branch = f"branch_{idx}"

                            for target in target_list:
                                to_node = target.get("node", "")
                                if to_node:
                                    connections.append({
                                        "workflow_name": workflow_name,
                                        "from_node": from_node,
                                        "to_node": to_node,
                                        "output_type": output_type,
                                        "output_index": idx,
                                        "condition_branch": condition_branch
                                    })

            except Exception as e:
                print(f"  Warning: {json_file}: {e}")

    return connections


def insert_connections(conn, connections):
    """Insert connections into database."""
    with conn.cursor() as cur:
        # Clear existing
        cur.execute("DELETE FROM node_connections")

        inserted = 0
        for c in connections:
            try:
                cur.execute("""
                    INSERT INTO node_connections
                        (workflow_name, from_node, to_node, output_type, output_index, condition_branch)
                    VALUES (%s, %s, %s, %s, %s, %s)
                    ON CONFLICT DO NOTHING
                """, (
                    c["workflow_name"],
                    c["from_node"],
                    c["to_node"],
                    c["output_type"],
                    c["output_index"],
                    c["condition_branch"]
                ))
                inserted += 1
            except Exception as e:
                print(f"  Error: {e}")

    conn.commit()
    return inserted


def main():
    print(f"Project root: {PROJECT_ROOT}")
    print("")

    print("Extracting node connections...")
    connections = extract_connections(PROJECT_ROOT)
    print(f"  Found {len(connections)} connections")

    print("\nConnecting to database...")
    conn = get_connection()

    create_tables(conn)

    print("Inserting connections...")
    inserted = insert_connections(conn, connections)
    print(f"\nDone! Inserted {inserted} connections")

    # Show stats
    with conn.cursor() as cur:
        cur.execute("""
            SELECT workflow_name, count(*) as cnt
            FROM node_connections
            GROUP BY workflow_name
            ORDER BY cnt DESC
            LIMIT 10
        """)
        print("\nTop workflows by connections:")
        for row in cur.fetchall():
            print(f"  {row['workflow_name']}: {row['cnt']}")

    conn.close()


if __name__ == "__main__":
    main()
