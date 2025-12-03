#!/usr/bin/env python3
import json
import os

WORKFLOWS_FILE = "c:/Users/User/Documents/Eldoleado/temp_workflows.json"
OUTPUT_DIR = "c:/Users/User/Documents/Eldoleado/n8n_workflows"

TAG_TO_FOLDER = {
    "API": "API",
    "Core": "Core",
    "In": "In",
    "Out": "Out",
    "Tool": "Tool",
    "TaskWork": "TaskWork",
}

def main():
    with open(WORKFLOWS_FILE, 'r', encoding='utf-8') as f:
        data = json.load(f)

    workflows = data.get('data', [])
    print(f"Total workflows: {len(workflows)}")

    # Сохраняем workflows с тегом BattCRM (в любой позиции)
    all_workflows = []
    for w in workflows:
        tags = [t['name'] for t in w.get('tags', [])]
        # Проверяем наличие BattCRM в любой позиции
        if 'BattCRM' not in tags:
            continue
        # Пропускаем архивные workflows
        if w.get('isArchived', False):
            continue
        # Определяем секцию по тегам (приоритет: API, Core, In, Out, Tool, TaskWork)
        section = 'Other'
        for tag in tags:
            if tag in TAG_TO_FOLDER:
                section = tag
                break
        all_workflows.append({
            'id': w['id'],
            'name': w['name'],
            'section': section,
            'active': w.get('active', False),
            'tags': tags,
            'data': w
        })

    print(f"BattCRM workflows to save: {len(all_workflows)}")

    by_section = {}
    for w in all_workflows:
        section = w['section']
        if section not in by_section:
            by_section[section] = []
        by_section[section].append(w)

    print("\n=== Workflows by section ===")
    for section, items in sorted(by_section.items()):
        folder = TAG_TO_FOLDER.get(section, section)
        print(f"\n{section} ({folder}/):")
        for w in items:
            status = "[+]" if w['active'] else "[-]"
            print(f"  {status} {w['name']}")

    print("\n=== Saving files ===")
    for w in all_workflows:
        section = w['section']
        folder = TAG_TO_FOLDER.get(section, section)
        folder_path = os.path.join(OUTPUT_DIR, folder)
        os.makedirs(folder_path, exist_ok=True)

        safe_name = w['name'].replace(' ', '_').replace('/', '_').replace(':', '_')
        filename = f"{safe_name}.json"
        filepath = os.path.join(folder_path, filename)

        workflow_data = {
            'id': w['data']['id'],
            'name': w['data']['name'],
            'active': w['data'].get('active', False),
            'nodes': w['data'].get('nodes', []),
            'connections': w['data'].get('connections', {}),
            'settings': w['data'].get('settings', {}),
            'tags': w['data'].get('tags', []),
            'updatedAt': w['data'].get('updatedAt'),
            'createdAt': w['data'].get('createdAt'),
        }

        with open(filepath, 'w', encoding='utf-8') as f:
            json.dump(workflow_data, f, ensure_ascii=False, indent=2)

        print(f"  {folder}/{filename}")

    print(f"\nDone! Saved {len(all_workflows)} workflows")

if __name__ == '__main__':
    main()
