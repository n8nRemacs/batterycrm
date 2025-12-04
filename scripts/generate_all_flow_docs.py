#!/usr/bin/env python3
"""
Generate flow documentation for all channels and actions in Russian.
"""

import os
import sys
import re
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

# Channels with Russian descriptions
CHANNELS = {
    'telegram': ('BAT IN Telegram', 'Входящее сообщение из Telegram'),
    'avito': ('BAT IN Avito', 'Входящее сообщение из Avito'),
    'max': ('BAT IN MAX', 'Входящее сообщение из MAX.ru'),
    'whatsapp': ('BAT IN WhatsApp', 'Входящее сообщение из WhatsApp'),
    'vk': ('BAT IN VK', 'Входящее сообщение из VK'),
    'phone': ('BAT IN Phone', 'Входящий звонок'),
    'form': ('BAT IN Form', 'Заявка с формы на сайте'),
}

# Actions with Russian descriptions
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


class FlowDocGeneratorRU:
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

    def generate_markdown(self, title, description, entry_workflow):
        lines = []

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
            arrow = "→ " if wf['depth'] > 0 else ""
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

    def generate_for_workflow(self, workflow_name, title, description):
        self.reset()
        info = self.get_workflow_info(workflow_name)
        if not info:
            return None
        self.trace_workflow(workflow_name)
        return self.generate_markdown(title, description, workflow_name)


def main():
    DOCS_DIR.mkdir(parents=True, exist_ok=True)

    generator = FlowDocGeneratorRU()

    print("Генерация документации потоков...")
    print("=" * 60)

    # Generate for channels
    print("\n[IN] ВХОДЯЩИЕ КАНАЛЫ:")
    for key, (workflow, desc) in CHANNELS.items():
        title = f"Поток: {desc}"
        md = generator.generate_for_workflow(workflow, title, desc)
        if md:
            filename = f"channel_{key}.md"
            filepath = DOCS_DIR / filename
            filepath.write_text(md, encoding='utf-8')
            print(f"  + {key:12} -> {filename}")
        else:
            print(f"  - {key:12} (workflow not found)")

    # Generate for actions
    print("\n[ACTION] ДЕЙСТВИЯ ОПЕРАТОРА:")
    for key, (workflow, desc) in ACTIONS.items():
        title = f"Действие: {desc}"
        md = generator.generate_for_workflow(workflow, title, desc)
        if md:
            filename = f"action_{key}.md"
            filepath = DOCS_DIR / filename
            filepath.write_text(md, encoding='utf-8')
            print(f"  + {key:15} -> {filename}")
        else:
            print(f"  - {key:15} (workflow not found)")

    # Generate index
    print("\n[INDEX] Creating index...")
    index_lines = [
        "# Документация потоков Eldoleado",
        "",
        f"*Сгенерировано: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}*",
        "",
        "---",
        "",
        "## Входящие каналы",
        "",
        "| Канал | Описание | Документация |",
        "|-------|----------|--------------|",
    ]
    for key, (workflow, desc) in CHANNELS.items():
        index_lines.append(f"| {key} | {desc} | [channel_{key}.md](channel_{key}.md) |")

    index_lines.extend([
        "",
        "## Действия оператора",
        "",
        "| Действие | Описание | Документация |",
        "|----------|----------|--------------|",
    ])
    for key, (workflow, desc) in ACTIONS.items():
        index_lines.append(f"| {key} | {desc} | [action_{key}.md](action_{key}.md) |")

    index_lines.extend([
        "",
        "---",
        "",
        "## Использование",
        "",
        "```bash",
        "# Сгенерировать всё заново",
        "python scripts/generate_all_flow_docs.py",
        "",
        "# Сгенерировать один поток",
        "python scripts/generate_flow_doc.py --channel max",
        "python scripts/generate_flow_doc.py --action normalize",
        "```",
    ])

    index_path = DOCS_DIR / "README.md"
    index_path.write_text('\n'.join(index_lines), encoding='utf-8')
    print(f"  + README.md")

    print("\n" + "=" * 60)
    print(f"Готово! Документация в: {DOCS_DIR}")
    print(f"Всего файлов: {len(CHANNELS) + len(ACTIONS) + 1}")


if __name__ == "__main__":
    main()
