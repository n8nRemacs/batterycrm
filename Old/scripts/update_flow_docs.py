#!/usr/bin/env python3
"""
Incremental flow documentation updater.
Only regenerates docs affected by changed workflows.

Usage:
    python update_flow_docs.py                    # Check and update all affected
    python update_flow_docs.py --workflow "BAT IN MAX"  # Update docs using this workflow
    python update_flow_docs.py --all              # Force regenerate all
"""

import os
import sys
import re
import json
import argparse
from datetime import datetime
from collections import defaultdict
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
DOCS_DIR = PROJECT_ROOT / "docs" / "flows"

# Channels and Actions definitions
CHANNELS = {
    'telegram': ('BAT IN Telegram', 'Входящее сообщение из Telegram'),
    'avito': ('BAT IN Avito', 'Входящее сообщение из Avito'),
    'max': ('BAT IN MAX', 'Входящее сообщение из MAX.ru'),
    'whatsapp': ('BAT IN WhatsApp', 'Входящее сообщение из WhatsApp'),
    'vk': ('BAT IN VK', 'Входящее сообщение из VK'),
    'phone': ('BAT IN Phone', 'Входящий звонок'),
    'form': ('BAT IN Form', 'Заявка с формы на сайте'),
}

ACTIONS = {
    'normalize': ('API_Android_Normalize', 'Нормализация текста ответа'),
    'send_response': ('API_Android_Send_Response', 'Отправка ответа клиенту'),
    'take_appeal': ('API_Android_Take_Appeal', 'Взять обращение в работу'),
    'reject': ('API_Android_Reject', 'Отклонить обращение'),
    'send_promo': ('API_Android_Send_Promo', 'Отправить промо-материал'),
    'login': ('API_Android_Auth', 'Авторизация оператора'),
    'logout': ('API_Android_Logout', 'Выход из системы'),
    'appeals_list': ('API_Android_Appeals_List', 'Список обращений'),
    'appeal_detail': ('API_Android_Appeal_Detail', 'Детали обращения'),
    'device_create': ('API_Android_Device_Create', 'Добавить устройство'),
    'device_update': ('API_Android_Device_Update', 'Обновить устройство'),
    'device_delete': ('API_Android_Device_Delete', 'Удалить устройство'),
    'repair_create': ('API_Android_Repair_Create', 'Добавить ремонт'),
    'repair_update': ('API_Android_Repair_Update', 'Обновить ремонт'),
    'repair_delete': ('API_Android_Repair_Delete', 'Удалить ремонт'),
}


class FlowDocUpdater:
    def __init__(self):
        self.conn = psycopg2.connect(DEFAULT_DB_URL, cursor_factory=RealDictCursor)

    def reset(self):
        self.visited_workflows = set()
        self.all_db_ops = []
        self.all_redis_ops = []
        self.all_http_ops = []
        self.all_ai_ops = []
        self.workflow_chain = []
        self.tables_affected = defaultdict(set)
        self.participating_workflows = set()
        self.participating_nodes = set()

    def get_workflow_info(self, workflow_name):
        cur = self.conn.cursor()
        cur.execute(
            "SELECT name, category, metadata FROM project_components WHERE type='workflow' AND name = %s",
            (workflow_name,)
        )
        return cur.fetchone()

    def get_workflow_nodes(self, workflow_name):
        cur = self.conn.cursor()
        cur.execute(
            "SELECT node_name, node_type, details FROM workflow_nodes WHERE workflow_name = %s",
            (workflow_name,)
        )
        return {row['node_name']: row for row in cur.fetchall()}

    def get_called_workflows(self, workflow_name):
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

    def extract_tables_from_sql(self, sql):
        if not sql:
            return []
        tables = set()
        matches = re.findall(r'\bFROM\s+([a-z_][a-z0-9_]*)', sql, re.I)
        tables.update(m.lower() for m in matches)
        matches = re.findall(r'\bJOIN\s+([a-z_][a-z0-9_]*)', sql, re.I)
        tables.update(m.lower() for m in matches)
        matches = re.findall(r'\bINTO\s+([a-z_][a-z0-9_]*)', sql, re.I)
        tables.update(m.lower() for m in matches)
        matches = re.findall(r'\bUPDATE\s+([a-z_][a-z0-9_]*)', sql, re.I)
        tables.update(m.lower() for m in matches)
        tables = {t for t in tables if not t.startswith(('pg_', 'vals', 'v_', 'validated', 'cte', 'with'))}
        return list(tables)

    def detect_sql_operation(self, sql):
        if not sql:
            return 'SELECT'
        sql_upper = sql.upper()
        if 'INSERT' in sql_upper:
            return 'INSERT'
        elif 'UPDATE' in sql_upper:
            return 'UPDATE'
        elif 'DELETE' in sql_upper:
            return 'DELETE'
        return 'SELECT'

    def extract_operations(self, workflow_name, nodes):
        for node_name, node in nodes.items():
            self.participating_nodes.add(f"{workflow_name}::{node_name}")
            node_type = node.get('node_type', '').lower()
            details = node.get('details') or {}

            if 'postgres' in node_type:
                sql = details.get('sql', '')
                tables = self.extract_tables_from_sql(sql)
                op_type = self.detect_sql_operation(sql)
                for t in tables:
                    self.tables_affected[t].add(op_type)
                self.all_db_ops.append({
                    'workflow': workflow_name,
                    'node': node_name,
                    'operation': op_type,
                    'tables': tables,
                    'sql': sql[:500] if sql else ''
                })

            elif 'redis' in node_type:
                self.all_redis_ops.append({
                    'workflow': workflow_name,
                    'node': node_name
                })

            elif 'httprequest' in node_type:
                url = details.get('url', '')
                method = details.get('method', 'GET')
                self.all_http_ops.append({
                    'workflow': workflow_name,
                    'node': node_name,
                    'method': method,
                    'url': url[:100] if url else ''
                })

            elif any(x in node_type for x in ['agent', 'openai', 'ai', 'lmchat']):
                self.all_ai_ops.append({
                    'workflow': workflow_name,
                    'node': node_name,
                    'type': node_type
                })

    def trace_workflow(self, workflow_name, depth=0):
        if workflow_name in self.visited_workflows:
            return
        self.visited_workflows.add(workflow_name)
        self.participating_workflows.add(workflow_name)

        info = self.get_workflow_info(workflow_name)
        if not info:
            return

        nodes = self.get_workflow_nodes(workflow_name)
        webhook = (info.get('metadata') or {}).get('webhook_path', '')

        self.workflow_chain.append({
            'name': workflow_name,
            'depth': depth,
            'category': info.get('category', ''),
            'webhook': webhook,
            'nodes_count': len(nodes)
        })

        self.extract_operations(workflow_name, nodes)

        for called_wf in self.get_called_workflows(workflow_name):
            self.trace_workflow(called_wf, depth + 1)

    def generate_markdown(self, title, description, entry_workflow, doc_key, doc_type):
        lines = []

        # YAML frontmatter with metadata for incremental updates
        lines.append("---")
        lines.append(f"doc_key: {doc_key}")
        lines.append(f"doc_type: {doc_type}")
        lines.append(f"entry_workflow: {entry_workflow}")
        lines.append(f"participating_workflows:")
        for wf in sorted(self.participating_workflows):
            lines.append(f"  - {wf}")
        lines.append(f"generated: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}")
        lines.append("---")
        lines.append("")

        lines.append(f"# {title}")
        lines.append("")
        lines.append(f"**{description}**")
        lines.append("")
        lines.append(f"*Сгенерировано: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}*")
        lines.append("")
        lines.append("---")
        lines.append("")

        # Summary
        lines.append("## Сводка")
        lines.append("")
        lines.append(f"- **Точка входа:** `{entry_workflow}`")
        lines.append(f"- **Workflows в цепочке:** {len(self.workflow_chain)}")
        lines.append(f"- **Операций с БД:** {len(self.all_db_ops)}")
        lines.append(f"- **Операций Redis:** {len(self.all_redis_ops)}")
        lines.append(f"- **Вызовов AI:** {len(self.all_ai_ops)}")
        lines.append(f"- **Затронуто таблиц:** {len(self.tables_affected)}")
        lines.append("")

        # Workflow chain
        lines.append("## Цепочка Workflows")
        lines.append("")
        lines.append("```")
        for wf in self.workflow_chain:
            indent = "  " * wf['depth']
            webhook = f" (/{wf['webhook']})" if wf['webhook'] else ""
            arrow = "-> " if wf['depth'] > 0 else ""
            lines.append(f"{indent}{arrow}{wf['name']}{webhook}")
        lines.append("```")
        lines.append("")

        # Tables affected
        if self.tables_affected:
            lines.append("## Затронутые таблицы")
            lines.append("")
            lines.append("| Таблица | Операции |")
            lines.append("|---------|----------|")
            for table, ops in sorted(self.tables_affected.items()):
                ops_ru = []
                for op in sorted(ops):
                    if op == 'SELECT':
                        ops_ru.append('чтение')
                    elif op == 'INSERT':
                        ops_ru.append('**создание**')
                    elif op == 'UPDATE':
                        ops_ru.append('**изменение**')
                    elif op == 'DELETE':
                        ops_ru.append('**удаление**')
                lines.append(f"| `{table}` | {', '.join(ops_ru)} |")
            lines.append("")

        # Database operations
        if self.all_db_ops:
            lines.append("## Операции с базой данных")
            lines.append("")
            for op in self.all_db_ops:
                op_ru = {'SELECT': 'Чтение', 'INSERT': 'Создание', 'UPDATE': 'Изменение', 'DELETE': 'Удаление'}.get(op['operation'], op['operation'])
                tables_str = ', '.join(f"`{t}`" for t in op['tables'][:3])
                lines.append(f"### {op['node']}")
                lines.append("")
                lines.append(f"**Workflow:** {op['workflow']}")
                lines.append(f"")
                lines.append(f"**Операция:** {op_ru} из {tables_str}")
                lines.append("")
                if op['sql']:
                    lines.append("```sql")
                    lines.append(op['sql'])
                    lines.append("```")
                lines.append("")

        # Redis
        if self.all_redis_ops:
            lines.append("## Операции Redis")
            lines.append("")
            for op in self.all_redis_ops:
                lines.append(f"- **{op['workflow']}**: {op['node']}")
            lines.append("")

        # AI
        if self.all_ai_ops:
            lines.append("## AI Операции")
            lines.append("")
            for op in self.all_ai_ops:
                lines.append(f"- **{op['workflow']}**: {op['node']} ({op['type']})")
            lines.append("")

        # HTTP
        if self.all_http_ops:
            lines.append("## Внешние API вызовы")
            lines.append("")
            for op in self.all_http_ops:
                lines.append(f"- **{op['workflow']}**: {op['method']} {op['url']}")
            lines.append("")

        return '\n'.join(lines)

    def generate_for_workflow(self, workflow_name, title, description, doc_key, doc_type):
        self.reset()
        info = self.get_workflow_info(workflow_name)
        if not info:
            return None, set()
        self.trace_workflow(workflow_name)
        md = self.generate_markdown(title, description, workflow_name, doc_key, doc_type)
        return md, self.participating_workflows.copy()

    def parse_doc_metadata(self, filepath):
        """Parse YAML frontmatter from existing doc to get participating workflows."""
        if not filepath.exists():
            return None

        content = filepath.read_text(encoding='utf-8')
        if not content.startswith('---'):
            return None

        # Find end of frontmatter
        end_idx = content.find('---', 3)
        if end_idx == -1:
            return None

        frontmatter = content[3:end_idx].strip()
        metadata = {}

        current_key = None
        current_list = []

        for line in frontmatter.split('\n'):
            if line.startswith('  - '):
                current_list.append(line[4:].strip())
            elif ':' in line:
                if current_key and current_list:
                    metadata[current_key] = current_list
                    current_list = []
                key, value = line.split(':', 1)
                current_key = key.strip()
                value = value.strip()
                if value:
                    metadata[current_key] = value

        if current_key and current_list:
            metadata[current_key] = current_list

        return metadata

    def find_affected_docs(self, changed_workflow):
        """Find all docs that include the changed workflow."""
        affected = []

        if not DOCS_DIR.exists():
            return affected

        for md_file in DOCS_DIR.glob("*.md"):
            if md_file.name == "README.md":
                continue

            metadata = self.parse_doc_metadata(md_file)
            if not metadata:
                continue

            participating = metadata.get('participating_workflows', [])
            if changed_workflow in participating:
                affected.append({
                    'file': md_file,
                    'doc_key': metadata.get('doc_key'),
                    'doc_type': metadata.get('doc_type'),
                    'entry_workflow': metadata.get('entry_workflow')
                })

        return affected

    def build_workflow_to_docs_index(self):
        """Build index: workflow -> list of docs using it."""
        index = defaultdict(list)

        if not DOCS_DIR.exists():
            return index

        for md_file in DOCS_DIR.glob("*.md"):
            if md_file.name == "README.md":
                continue

            metadata = self.parse_doc_metadata(md_file)
            if not metadata:
                continue

            participating = metadata.get('participating_workflows', [])
            for wf in participating:
                index[wf].append({
                    'file': md_file.name,
                    'doc_key': metadata.get('doc_key'),
                    'doc_type': metadata.get('doc_type')
                })

        return index


def update_affected_docs(updater, changed_workflow):
    """Update all docs affected by a workflow change."""
    affected = updater.find_affected_docs(changed_workflow)

    if not affected:
        print(f"No docs found using workflow: {changed_workflow}")
        return 0

    print(f"Found {len(affected)} docs using '{changed_workflow}':")

    updated = 0
    for doc_info in affected:
        doc_key = doc_info['doc_key']
        doc_type = doc_info['doc_type']
        entry_workflow = doc_info['entry_workflow']
        filepath = doc_info['file']

        # Find the definition
        if doc_type == 'channel':
            definitions = CHANNELS
            prefix = "Поток: "
        else:
            definitions = ACTIONS
            prefix = "Действие: "

        if doc_key not in definitions:
            print(f"  - {filepath.name}: unknown key '{doc_key}', skipping")
            continue

        workflow_name, desc = definitions[doc_key]
        title = f"{prefix}{desc}"

        md, _ = updater.generate_for_workflow(workflow_name, title, desc, doc_key, doc_type)
        if md:
            filepath.write_text(md, encoding='utf-8')
            print(f"  + {filepath.name} (updated)")
            updated += 1
        else:
            print(f"  - {filepath.name} (workflow not found)")

    return updated


def show_index(updater):
    """Show which workflows affect which docs."""
    index = updater.build_workflow_to_docs_index()

    print("Workflow -> Docs Index")
    print("=" * 60)

    for wf in sorted(index.keys()):
        docs = index[wf]
        print(f"\n{wf}:")
        for doc in docs:
            print(f"  -> {doc['file']} ({doc['doc_type']}: {doc['doc_key']})")


def main():
    parser = argparse.ArgumentParser(description="Incremental flow doc updater")
    parser.add_argument("--workflow", "-w", help="Update docs affected by this workflow")
    parser.add_argument("--all", "-a", action="store_true", help="Regenerate all docs")
    parser.add_argument("--index", "-i", action="store_true", help="Show workflow->docs index")
    args = parser.parse_args()

    DOCS_DIR.mkdir(parents=True, exist_ok=True)
    updater = FlowDocUpdater()

    if args.index:
        show_index(updater)
        return

    if args.workflow:
        print(f"Updating docs affected by: {args.workflow}")
        updated = update_affected_docs(updater, args.workflow)
        print(f"\nUpdated {updated} docs")
        return

    if args.all:
        print("Regenerating ALL flow docs...")
        print("=" * 60)

        # Channels
        print("\n[IN] Channels:")
        for key, (workflow, desc) in CHANNELS.items():
            title = f"Поток: {desc}"
            md, _ = updater.generate_for_workflow(workflow, title, desc, key, 'channel')
            if md:
                filename = f"channel_{key}.md"
                filepath = DOCS_DIR / filename
                filepath.write_text(md, encoding='utf-8')
                print(f"  + {key:12} -> {filename}")
            else:
                print(f"  - {key:12} (workflow not found)")

        # Actions
        print("\n[ACTION] Actions:")
        for key, (workflow, desc) in ACTIONS.items():
            title = f"Действие: {desc}"
            md, _ = updater.generate_for_workflow(workflow, title, desc, key, 'action')
            if md:
                filename = f"action_{key}.md"
                filepath = DOCS_DIR / filename
                filepath.write_text(md, encoding='utf-8')
                print(f"  + {key:15} -> {filename}")
            else:
                print(f"  - {key:15} (workflow not found)")

        print(f"\nDone! Total: {len(CHANNELS) + len(ACTIONS)} docs")
        return

    # Default: show help
    parser.print_help()
    print("\nExamples:")
    print("  python update_flow_docs.py --index              # Show workflow->docs mapping")
    print("  python update_flow_docs.py --workflow 'BAT IN MAX'  # Update affected docs")
    print("  python update_flow_docs.py --all                # Regenerate everything")


if __name__ == "__main__":
    main()
