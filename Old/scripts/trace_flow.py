#!/usr/bin/env python3
"""
Trace request flow through workflows with execution path.

Usage:
    python trace_flow.py "normalize"
    python trace_flow.py --webhook "/api/android/appeals/:id/normalize"
    python trace_flow.py --workflow "API_Android_Normalize"
"""

import os
import sys
import json
import argparse

try:
    import psycopg2
    from psycopg2.extras import RealDictCursor
except ImportError:
    print("Error: psycopg2 not installed")
    sys.exit(1)

DEFAULT_DB_URL = "postgresql://supabase_admin:Mi31415926pS@185.221.214.83:6544/postgres"


def get_connection():
    return psycopg2.connect(
        os.getenv("DATABASE_URL", DEFAULT_DB_URL),
        cursor_factory=RealDictCursor
    )


def find_entry_workflow(conn, keyword=None, webhook=None, workflow=None):
    """Find the entry point workflow."""
    cur = conn.cursor()

    if workflow:
        cur.execute(
            "SELECT name, metadata FROM project_components WHERE type='workflow' AND name ILIKE %s",
            (f"%{workflow}%",)
        )
    elif webhook:
        cur.execute(
            "SELECT name, metadata FROM project_components WHERE type='workflow' AND metadata->>'webhook_path' ILIKE %s",
            (f"%{webhook}%",)
        )
    elif keyword:
        cur.execute(
            "SELECT name, metadata FROM project_components WHERE type='workflow' AND (name ILIKE %s OR metadata->>'webhook_path' ILIKE %s)",
            (f"%{keyword}%", f"%{keyword}%")
        )

    return cur.fetchall()


def get_workflow_nodes(conn, workflow_name):
    """Get all nodes for a workflow indexed by name."""
    cur = conn.cursor()
    cur.execute(
        "SELECT node_name, node_type, details FROM workflow_nodes WHERE workflow_name = %s",
        (workflow_name,)
    )
    return {row['node_name']: row for row in cur.fetchall()}


def get_node_connections(conn, workflow_name):
    """Get node connections for a workflow."""
    cur = conn.cursor()
    cur.execute("""
        SELECT from_node, to_node, output_type, output_index, condition_branch
        FROM node_connections
        WHERE workflow_name = %s
        ORDER BY from_node, output_index
    """, (workflow_name,))
    return cur.fetchall()


def get_called_workflows(conn, workflow_name):
    """Get workflows called by this workflow."""
    cur = conn.cursor()
    cur.execute("""
        SELECT tc.name
        FROM component_relations r
        JOIN project_components fc ON fc.id = r.from_component_id
        JOIN project_components tc ON tc.id = r.to_component_id
        WHERE fc.type = 'workflow' AND tc.type = 'workflow'
          AND r.relation_type = 'calls'
          AND fc.name = %s
    """, (workflow_name,))
    return [row['name'] for row in cur.fetchall()]


def find_entry_nodes(nodes, connections):
    """Find nodes that have no incoming connections (entry points)."""
    all_nodes = set(nodes.keys())
    nodes_with_incoming = set(c['to_node'] for c in connections)
    entry_nodes = all_nodes - nodes_with_incoming

    # Prioritize webhook and trigger nodes
    webhooks = [n for n in entry_nodes if 'webhook' in nodes.get(n, {}).get('node_type', '').lower()]
    triggers = [n for n in entry_nodes if 'trigger' in nodes.get(n, {}).get('node_type', '').lower()]

    if webhooks:
        return webhooks
    if triggers:
        return triggers
    return list(entry_nodes)[:1]


def build_adjacency(connections):
    """Build adjacency list from connections."""
    adj = {}
    for c in connections:
        from_node = c['from_node']
        if from_node not in adj:
            adj[from_node] = []
        adj[from_node].append({
            'to': c['to_node'],
            'branch': c['condition_branch'],
            'index': c['output_index']
        })
    return adj


def format_node_info(node, indent=""):
    """Format node details."""
    if not node:
        return []

    lines = []
    details = node.get('details') or {}
    node_type = node.get('node_type', '')

    # SQL query
    if details.get('sql'):
        sql = details['sql'].replace('\n', ' ')
        if len(sql) > 150:
            sql = sql[:150] + "..."
        lines.append(f"{indent}    SQL: {sql}")

    # Table/Operation
    if details.get('table'):
        op = details.get('operation', '')
        lines.append(f"{indent}    {op} -> {details['table']}")

    # Webhook path
    if details.get('webhook_path'):
        method = details.get('http_method', 'GET')
        lines.append(f"{indent}    {method} /{details['webhook_path']}")

    # URL for HTTP requests
    if details.get('url') and 'webhook' not in node_type.lower():
        url = details['url']
        if len(url) > 80:
            url = url[:80] + "..."
        lines.append(f"{indent}    URL: {url}")

    # Conditions
    if details.get('condition_text'):
        lines.append(f"{indent}    IF: {details['condition_text']}")

    # Code snippet
    if details.get('code'):
        code = details['code'].replace('\n', ' ')[:80]
        lines.append(f"{indent}    JS: {code}...")

    # Called workflow ID
    if details.get('workflow_id'):
        lines.append(f"{indent}    -> Workflow ID: {details['workflow_id']}")

    return lines


def trace_execution_path(nodes, adjacency, start_node, indent="", visited=None):
    """Trace and print execution path from start node."""
    if visited is None:
        visited = set()

    if start_node in visited:
        print(f"{indent}[LOOP -> {start_node}]")
        return

    visited.add(start_node)

    node = nodes.get(start_node)
    if not node:
        print(f"{indent}[?] {start_node}")
        return

    # Node type markers
    node_type = node.get('node_type', '')
    marker = ""
    if 'webhook' in node_type.lower():
        marker = "[WEBHOOK]"
    elif 'postgres' in node_type.lower():
        marker = "[DB]"
    elif 'if' in node_type.lower():
        marker = "[IF]"
    elif 'switch' in node_type.lower():
        marker = "[SWITCH]"
    elif 'executeWorkflow' in node_type.lower():
        marker = "[CALL]"
    elif 'httpRequest' in node_type.lower():
        marker = "[HTTP]"
    elif 'code' in node_type.lower() or 'function' in node_type.lower():
        marker = "[CODE]"
    elif 'redis' in node_type.lower():
        marker = "[REDIS]"
    elif 'respond' in node_type.lower():
        marker = "[RESPOND]"
    elif 'agent' in node_type.lower() or 'openai' in node_type.lower():
        marker = "[AI]"

    print(f"{indent}{marker:10} {start_node}")

    # Show node details
    for line in format_node_info(node, indent):
        print(line)

    # Follow connections
    next_nodes = adjacency.get(start_node, [])

    if not next_nodes:
        return

    # Sort by index for proper order
    next_nodes = sorted(next_nodes, key=lambda x: x['index'])

    for i, next_info in enumerate(next_nodes):
        next_node = next_info['to']
        branch = next_info['branch']

        if branch:
            print(f"{indent}  |")
            print(f"{indent}  +--[{branch}]-->")
        elif len(next_nodes) > 1:
            print(f"{indent}  |")
            print(f"{indent}  +--[out_{i}]-->")
        else:
            print(f"{indent}  |")
            print(f"{indent}  v")

        trace_execution_path(nodes, adjacency, next_node, indent, visited.copy())


def trace_workflow(conn, workflow_name, depth=0, visited_workflows=None):
    """Trace workflow execution with full path."""
    if visited_workflows is None:
        visited_workflows = set()

    if workflow_name in visited_workflows:
        print(f"{'  ' * depth}[Already traced: {workflow_name}]")
        return

    visited_workflows.add(workflow_name)

    indent = "  " * depth
    print(f"\n{indent}{'=' * 60}")
    print(f"{indent}WORKFLOW: {workflow_name}")
    print(f"{indent}{'=' * 60}")

    nodes = get_workflow_nodes(conn, workflow_name)
    connections = get_node_connections(conn, workflow_name)

    if not nodes:
        print(f"{indent}(no nodes found)")
        return

    adjacency = build_adjacency(connections)
    entry_nodes = find_entry_nodes(nodes, connections)

    print(f"{indent}\nExecution path:")
    print(f"{indent}{'-' * 40}")

    for entry in entry_nodes:
        trace_execution_path(nodes, adjacency, entry, indent)

    # Trace called workflows
    called = get_called_workflows(conn, workflow_name)
    if called:
        print(f"\n{indent}Calls external workflows:")
        for called_wf in called:
            trace_workflow(conn, called_wf, depth + 1, visited_workflows)


def main():
    parser = argparse.ArgumentParser(description="Trace request flow")
    parser.add_argument("keyword", nargs="?", help="Keyword to search")
    parser.add_argument("--webhook", "-w", help="Search by webhook path")
    parser.add_argument("--workflow", "-f", help="Search by workflow name")
    args = parser.parse_args()

    if not args.keyword and not args.webhook and not args.workflow:
        parser.print_help()
        sys.exit(1)

    conn = get_connection()

    workflows = find_entry_workflow(conn, args.keyword, args.webhook, args.workflow)

    if not workflows:
        print("No matching workflows found")
        sys.exit(1)

    print(f"Found {len(workflows)} matching workflow(s):")
    for wf in workflows:
        meta = wf['metadata'] or {}
        webhook = meta.get('webhook_path', '-')
        print(f"  - {wf['name']} (/{webhook})")

    for wf in workflows[:2]:
        trace_workflow(conn, wf['name'])

    conn.close()


if __name__ == "__main__":
    main()
