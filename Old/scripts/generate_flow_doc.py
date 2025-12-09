#!/usr/bin/env python3
"""
Generate comprehensive flow documentation for any scenario.

Usage:
    python generate_flow_doc.py "normalize"
    python generate_flow_doc.py --webhook "/api/android/appeals/:id/normalize"
    python generate_flow_doc.py --workflow "BAT IN MAX"
    python generate_flow_doc.py --channel max
    python generate_flow_doc.py --action send_response
    python generate_flow_doc.py --list-channels
    python generate_flow_doc.py --list-actions

Output: Markdown documentation with full execution path, DB operations, Redis ops, etc.
"""

import os
import sys
import re
import json
import argparse
from datetime import datetime
from collections import defaultdict

try:
    import psycopg2
    from psycopg2.extras import RealDictCursor
except ImportError:
    print("Error: psycopg2 not installed")
    sys.exit(1)

DEFAULT_DB_URL = "postgresql://supabase_admin:Mi31415926pS@185.221.214.83:6544/postgres"

# Predefined scenarios
CHANNELS = {
    'telegram': 'BAT IN Telegram',
    'avito': 'BAT IN Avito',
    'max': 'BAT IN MAX',
    'whatsapp': 'BAT IN WhatsApp',
    'vk': 'BAT IN VK',
    'phone': 'BAT IN Phone',
    'form': 'BAT IN Form',
}

ACTIONS = {
    'normalize': 'API_Android_Normalize',
    'send_response': 'API_Android_Send_Response',
    'take_appeal': 'API_Android_Take_Appeal',
    'reject': 'API_Android_Reject',
    'send_promo': 'API_Android_Send_Promo',
    'login': 'API_Android_Auth',
    'logout': 'API_Android_Logout',
    'appeals_list': 'API_Android_Appeals_List',
    'appeal_detail': 'API_Android_Appeal_Detail',
    'device_create': 'API_Android_Device_Create',
    'device_update': 'API_Android_Device_Update',
    'device_delete': 'API_Android_Device_Delete',
    'repair_create': 'API_Android_Repair_Create',
    'repair_update': 'API_Android_Repair_Update',
    'repair_delete': 'API_Android_Repair_Delete',
}


class FlowDocGenerator:
    def __init__(self):
        self.conn = psycopg2.connect(DEFAULT_DB_URL, cursor_factory=RealDictCursor)
        self.visited_workflows = set()
        self.all_db_ops = []
        self.all_redis_ops = []
        self.all_http_ops = []
        self.all_ai_ops = []
        self.workflow_chain = []
        self.tables_affected = defaultdict(set)  # table -> set of operations

    def find_workflow(self, keyword=None, webhook=None, workflow=None, channel=None, action=None):
        """Find entry workflow by various criteria."""
        cur = self.conn.cursor()

        if channel:
            workflow = CHANNELS.get(channel.lower())
            if not workflow:
                print(f"Unknown channel: {channel}")
                print(f"Available: {', '.join(CHANNELS.keys())}")
                return []

        if action:
            workflow = ACTIONS.get(action.lower())
            if not workflow:
                print(f"Unknown action: {action}")
                print(f"Available: {', '.join(ACTIONS.keys())}")
                return []

        if workflow:
            cur.execute(
                "SELECT name, category, metadata FROM project_components WHERE type='workflow' AND name ILIKE %s",
                (f"%{workflow}%",)
            )
        elif webhook:
            cur.execute(
                "SELECT name, category, metadata FROM project_components WHERE type='workflow' AND metadata->>'webhook_path' ILIKE %s",
                (f"%{webhook}%",)
            )
        elif keyword:
            cur.execute(
                """SELECT name, category, metadata FROM project_components
                   WHERE type='workflow' AND (name ILIKE %s OR metadata->>'webhook_path' ILIKE %s)""",
                (f"%{keyword}%", f"%{keyword}%")
            )

        return cur.fetchall()

    def get_workflow_info(self, workflow_name):
        """Get workflow metadata."""
        cur = self.conn.cursor()
        cur.execute(
            "SELECT name, category, metadata FROM project_components WHERE type='workflow' AND name = %s",
            (workflow_name,)
        )
        return cur.fetchone()

    def get_workflow_nodes(self, workflow_name):
        """Get all nodes for a workflow."""
        cur = self.conn.cursor()
        cur.execute(
            "SELECT node_name, node_type, details FROM workflow_nodes WHERE workflow_name = %s",
            (workflow_name,)
        )
        return {row['node_name']: row for row in cur.fetchall()}

    def get_node_connections(self, workflow_name):
        """Get node connections."""
        cur = self.conn.cursor()
        cur.execute("""
            SELECT from_node, to_node, output_index, condition_branch
            FROM node_connections
            WHERE workflow_name = %s
            ORDER BY from_node, output_index
        """, (workflow_name,))
        return cur.fetchall()

    def get_called_workflows(self, workflow_name):
        """Get workflows called by this workflow."""
        cur = self.conn.cursor()
        cur.execute("""
            SELECT tc.name
            FROM component_relations r
            JOIN project_components fc ON fc.id = r.from_component_id
            JOIN project_components tc ON tc.id = r.to_component_id
            WHERE fc.type = 'workflow' AND tc.type = 'workflow'
              AND r.relation_type = 'calls' AND fc.name = %s
        """, (workflow_name,))
        return [row['name'] for row in cur.fetchall()]

    def extract_operations(self, workflow_name, nodes):
        """Extract all operations from workflow nodes."""
        for node_name, node in nodes.items():
            node_type = node.get('node_type', '').lower()
            details = node.get('details') or {}

            # Database operations
            if 'postgres' in node_type:
                sql = details.get('sql', '')
                op = details.get('operation', 'query')
                table = details.get('table', '')

                # Parse SQL to find tables and operation type
                sql_upper = sql.upper() if sql else ''
                tables = self.extract_tables_from_sql(sql)
                op_type = self.detect_sql_operation(sql_upper)

                for t in tables:
                    self.tables_affected[t].add(op_type)

                self.all_db_ops.append({
                    'workflow': workflow_name,
                    'node': node_name,
                    'operation': op_type,
                    'tables': tables,
                    'sql': sql[:300] if sql else ''
                })

            # Redis operations
            elif 'redis' in node_type:
                self.all_redis_ops.append({
                    'workflow': workflow_name,
                    'node': node_name,
                    'details': details
                })

            # HTTP operations
            elif 'httprequest' in node_type:
                url = details.get('url', '')
                method = details.get('method', 'GET')
                self.all_http_ops.append({
                    'workflow': workflow_name,
                    'node': node_name,
                    'method': method,
                    'url': url[:100] if url else ''
                })

            # AI operations
            elif 'agent' in node_type or 'openai' in node_type or 'ai' in node_type:
                self.all_ai_ops.append({
                    'workflow': workflow_name,
                    'node': node_name,
                    'type': node_type
                })

    def extract_tables_from_sql(self, sql):
        """Extract table names from SQL query."""
        if not sql:
            return []

        tables = set()
        sql_upper = sql.upper()

        # FROM table
        matches = re.findall(r'\bFROM\s+([a-z_][a-z0-9_]*)', sql, re.I)
        tables.update(m.lower() for m in matches)

        # JOIN table
        matches = re.findall(r'\bJOIN\s+([a-z_][a-z0-9_]*)', sql, re.I)
        tables.update(m.lower() for m in matches)

        # INSERT INTO table
        matches = re.findall(r'\bINTO\s+([a-z_][a-z0-9_]*)', sql, re.I)
        tables.update(m.lower() for m in matches)

        # UPDATE table
        matches = re.findall(r'\bUPDATE\s+([a-z_][a-z0-9_]*)', sql, re.I)
        tables.update(m.lower() for m in matches)

        # Skip CTE names and system tables
        tables = {t for t in tables if not t.startswith(('pg_', 'vals', 'v_', 'validated', 'cte'))}

        return list(tables)

    def detect_sql_operation(self, sql_upper):
        """Detect SQL operation type."""
        if 'INSERT' in sql_upper:
            return 'INSERT'
        elif 'UPDATE' in sql_upper:
            return 'UPDATE'
        elif 'DELETE' in sql_upper:
            return 'DELETE'
        else:
            return 'SELECT'

    def trace_workflow(self, workflow_name, depth=0):
        """Recursively trace workflow and collect all operations."""
        if workflow_name in self.visited_workflows:
            return

        self.visited_workflows.add(workflow_name)

        info = self.get_workflow_info(workflow_name)
        if not info:
            return

        nodes = self.get_workflow_nodes(workflow_name)
        connections = self.get_node_connections(workflow_name)

        # Add to chain
        webhook = (info.get('metadata') or {}).get('webhook_path', '')
        self.workflow_chain.append({
            'name': workflow_name,
            'depth': depth,
            'category': info.get('category', ''),
            'webhook': webhook,
            'nodes_count': len(nodes)
        })

        # Extract operations
        self.extract_operations(workflow_name, nodes)

        # Trace called workflows
        called = self.get_called_workflows(workflow_name)
        for called_wf in called:
            self.trace_workflow(called_wf, depth + 1)

    def build_execution_path(self, workflow_name, nodes, connections):
        """Build execution path as list of steps."""
        adj = defaultdict(list)
        for c in connections:
            adj[c['from_node']].append({
                'to': c['to_node'],
                'branch': c['condition_branch'],
                'index': c['output_index']
            })

        # Find entry nodes
        all_nodes = set(nodes.keys())
        nodes_with_incoming = set(c['to_node'] for c in connections)
        entry_nodes = all_nodes - nodes_with_incoming

        # Prioritize webhooks/triggers
        entries = []
        for n in entry_nodes:
            node_type = nodes.get(n, {}).get('node_type', '').lower()
            if 'webhook' in node_type or 'trigger' in node_type:
                entries.insert(0, n)
            else:
                entries.append(n)

        return entries[0] if entries else None, adj

    def generate_markdown(self, entry_workflow):
        """Generate markdown documentation."""
        lines = []

        # Header
        lines.append(f"# Flow Documentation: {entry_workflow}")
        lines.append(f"")
        lines.append(f"*Generated: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}*")
        lines.append("")
        lines.append("---")
        lines.append("")

        # Workflow chain
        lines.append("## Workflow Chain")
        lines.append("")
        lines.append("```")
        for wf in self.workflow_chain:
            indent = "  " * wf['depth']
            webhook = f" (/{wf['webhook']})" if wf['webhook'] else ""
            lines.append(f"{indent}{wf['name']}{webhook}")
        lines.append("```")
        lines.append("")

        # Database operations
        lines.append("## Database Operations")
        lines.append("")
        if self.all_db_ops:
            lines.append("| Workflow | Node | Operation | Tables |")
            lines.append("|----------|------|-----------|--------|")
            for op in self.all_db_ops:
                tables = ', '.join(op['tables'][:3])
                if len(op['tables']) > 3:
                    tables += f" (+{len(op['tables'])-3})"
                lines.append(f"| {op['workflow'][:30]} | {op['node'][:25]} | {op['operation']} | {tables} |")
            lines.append("")

            # Tables summary
            lines.append("### Tables Affected")
            lines.append("")
            lines.append("| Table | Operations |")
            lines.append("|-------|------------|")
            for table, ops in sorted(self.tables_affected.items()):
                lines.append(f"| {table} | {', '.join(sorted(ops))} |")
            lines.append("")
        else:
            lines.append("*No database operations*")
            lines.append("")

        # Redis operations
        lines.append("## Redis Operations")
        lines.append("")
        if self.all_redis_ops:
            lines.append("| Workflow | Node |")
            lines.append("|----------|------|")
            for op in self.all_redis_ops:
                lines.append(f"| {op['workflow'][:30]} | {op['node']} |")
            lines.append("")
        else:
            lines.append("*No Redis operations*")
            lines.append("")

        # HTTP operations
        lines.append("## External API Calls")
        lines.append("")
        if self.all_http_ops:
            lines.append("| Workflow | Node | Method | URL |")
            lines.append("|----------|------|--------|-----|")
            for op in self.all_http_ops:
                lines.append(f"| {op['workflow'][:25]} | {op['node'][:20]} | {op['method']} | {op['url'][:50]} |")
            lines.append("")
        else:
            lines.append("*No external API calls*")
            lines.append("")

        # AI operations
        lines.append("## AI Operations")
        lines.append("")
        if self.all_ai_ops:
            for op in self.all_ai_ops:
                lines.append(f"- **{op['workflow']}**: {op['node']} ({op['type']})")
            lines.append("")
        else:
            lines.append("*No AI operations*")
            lines.append("")

        # Detailed SQL
        lines.append("## SQL Details")
        lines.append("")
        for op in self.all_db_ops:
            if op['sql']:
                lines.append(f"### {op['workflow']} / {op['node']}")
                lines.append("")
                lines.append(f"**Operation:** {op['operation']} on {', '.join(op['tables'])}")
                lines.append("")
                lines.append("```sql")
                lines.append(op['sql'])
                lines.append("```")
                lines.append("")

        return '\n'.join(lines)

    def generate(self, keyword=None, webhook=None, workflow=None, channel=None, action=None):
        """Main generation method."""
        workflows = self.find_workflow(keyword, webhook, workflow, channel, action)

        if not workflows:
            print("No matching workflows found")
            return None

        print(f"Found {len(workflows)} workflow(s):")
        for wf in workflows:
            meta = wf.get('metadata') or {}
            webhook_path = meta.get('webhook_path', '-')
            print(f"  - {wf['name']} (/{webhook_path})")

        # Use first match
        entry_workflow = workflows[0]['name']

        print(f"\nTracing from: {entry_workflow}")
        self.trace_workflow(entry_workflow)

        print(f"  Workflows in chain: {len(self.workflow_chain)}")
        print(f"  DB operations: {len(self.all_db_ops)}")
        print(f"  Redis operations: {len(self.all_redis_ops)}")
        print(f"  HTTP calls: {len(self.all_http_ops)}")
        print(f"  AI operations: {len(self.all_ai_ops)}")
        print(f"  Tables affected: {len(self.tables_affected)}")

        return self.generate_markdown(entry_workflow)


def main():
    parser = argparse.ArgumentParser(description="Generate flow documentation")
    parser.add_argument("keyword", nargs="?", help="Keyword to search")
    parser.add_argument("--webhook", "-w", help="Search by webhook path")
    parser.add_argument("--workflow", "-f", help="Search by workflow name")
    parser.add_argument("--channel", "-c", help="Channel: telegram, avito, max, whatsapp, vk, phone, form")
    parser.add_argument("--action", "-a", help="Action: normalize, send_response, take_appeal, etc.")
    parser.add_argument("--output", "-o", help="Output file (default: stdout)")
    parser.add_argument("--list-channels", action="store_true", help="List available channels")
    parser.add_argument("--list-actions", action="store_true", help="List available actions")
    args = parser.parse_args()

    if args.list_channels:
        print("Available channels:")
        for ch, wf in CHANNELS.items():
            print(f"  {ch:12} -> {wf}")
        return

    if args.list_actions:
        print("Available actions:")
        for act, wf in ACTIONS.items():
            print(f"  {act:15} -> {wf}")
        return

    if not any([args.keyword, args.webhook, args.workflow, args.channel, args.action]):
        parser.print_help()
        print("\nExamples:")
        print("  python generate_flow_doc.py --channel max")
        print("  python generate_flow_doc.py --action normalize")
        print("  python generate_flow_doc.py --webhook '/api/android'")
        print("  python generate_flow_doc.py 'appeal'")
        return

    generator = FlowDocGenerator()
    markdown = generator.generate(
        keyword=args.keyword,
        webhook=args.webhook,
        workflow=args.workflow,
        channel=args.channel,
        action=args.action
    )

    if markdown:
        if args.output:
            with open(args.output, 'w', encoding='utf-8') as f:
                f.write(markdown)
            print(f"\nSaved to: {args.output}")
        else:
            print("\n" + "=" * 70)
            print(markdown)


if __name__ == "__main__":
    main()
