#!/usr/bin/env python3
"""
Convert BAT_* workflows to ELO_* format.
- Renames workflows from BAT_IN_* to ELO_In_*, BAT_OUT_* to ELO_Out_*
- Changes tag "BattCRM" to "Eldoleado"
- Updates references to other workflows (e.g., BAT_Tenant_Resolver -> ELO_Core_Tenant_Resolver)
"""

import json
import os
import re
from pathlib import Path

PROJECT_ROOT = Path(__file__).parent.parent
OLD_WORKFLOWS = PROJECT_ROOT / "Old" / "n8n_workflows"
NEW_WORKFLOWS = PROJECT_ROOT / "workflows_to_import"

# Mapping of old workflow names to new
WORKFLOW_NAME_MAP = {
    # In workflows (with underscores)
    "BAT_IN_Telegram": "ELO_In_Telegram",
    "BAT_IN_WhatsApp": "ELO_In_WhatsApp",
    "BAT_IN_Avito": "ELO_In_Avito",
    "BAT_IN_VK": "ELO_In_VK",
    "BAT_IN_MAX": "ELO_In_MAX",
    "BAT_IN_Form": "ELO_In_Form",
    "BAT_IN_Phone": "ELO_In_Phone",
    # In workflows (with spaces - actual names in n8n)
    "BAT IN Telegram": "ELO_In_Telegram",
    "BAT IN WhatsApp": "ELO_In_WhatsApp",
    "BAT IN Avito": "ELO_In_Avito",
    "BAT IN VK": "ELO_In_VK",
    "BAT IN MAX": "ELO_In_MAX",
    "BAT IN Form": "ELO_In_Form",
    "BAT IN Phone": "ELO_In_Phone",
    # Out workflows (with underscores)
    "BAT_OUT_Telegram": "ELO_Out_Telegram",
    "BAT_OUT_WhatsApp": "ELO_Out_WhatsApp",
    "BAT_OUT_Avito": "ELO_Out_Avito",
    "BAT_OUT_VK": "ELO_Out_VK",
    "BAT_OUT_MAX": "ELO_Out_MAX",
    # Out workflows (with spaces)
    "BAT OUT Telegram": "ELO_Out_Telegram",
    "BAT OUT WhatsApp": "ELO_Out_WhatsApp",
    "BAT OUT Avito": "ELO_Out_Avito",
    "BAT OUT VK": "ELO_Out_VK",
    "BAT OUT MAX": "ELO_Out_MAX",
    # Core workflows (will be created separately, but map references)
    "BAT_Tenant_Resolver": "ELO_Core_Tenant_Resolver",
    "BAT_Appeal_Manager": "ELO_Core_Dialog_Engine",
    "BAT AI Appeal Router": "ELO_Core_AI_Router",
    "BAT_AI_Appeal_Router": "ELO_Core_AI_Router",
    "BAT_Client_Manager": "ELO_Core_Client_Manager",
    "BAT_Message_Router": "ELO_Core_Message_Router",
    "BAT_Universal_Batcher": "ELO_Core_Batcher",
    "BAT Queue Processor": "ELO_Core_Queue_Processor",
}

TAG_NAME_MAP = {
    "BattCRM": "Eldoleado",
}


def convert_workflow(input_path: Path, output_dir: Path) -> Path:
    """Convert a single workflow file."""
    with open(input_path, "r", encoding="utf-8") as f:
        workflow = json.load(f)

    old_name = workflow.get("name", "")

    # Rename workflow
    if old_name in WORKFLOW_NAME_MAP:
        workflow["name"] = WORKFLOW_NAME_MAP[old_name]
    else:
        # Generic rename: BAT_ -> ELO_
        workflow["name"] = re.sub(r"^BAT_", "ELO_", old_name)

    # Remove ID to let n8n assign new one
    if "id" in workflow:
        del workflow["id"]

    # Update tags
    if "tags" in workflow:
        for tag in workflow["tags"]:
            if tag.get("name") in TAG_NAME_MAP:
                tag["name"] = TAG_NAME_MAP[tag["name"]]
            # Remove tag IDs to let n8n assign new ones
            if "id" in tag:
                del tag["id"]

    # Update workflow references in nodes
    content_str = json.dumps(workflow)
    for old, new in WORKFLOW_NAME_MAP.items():
        content_str = content_str.replace(f'"cachedResultName": "{old}"', f'"cachedResultName": "{new}"')
    workflow = json.loads(content_str)

    # Determine output subfolder
    new_name = workflow["name"]
    if "_In_" in new_name:
        subfolder = "ELO_In"
    elif "_Out_" in new_name:
        subfolder = "ELO_Out"
    else:
        subfolder = "ELO_Core"

    output_path = output_dir / subfolder / f"{new_name}.json"
    output_path.parent.mkdir(parents=True, exist_ok=True)

    with open(output_path, "w", encoding="utf-8") as f:
        json.dump(workflow, f, indent=2, ensure_ascii=False)

    return output_path


def main():
    print("Converting BAT_* workflows to ELO_* format...")
    print(f"Source: {OLD_WORKFLOWS}")
    print(f"Target: {NEW_WORKFLOWS}")
    print()

    converted = []

    # Convert In workflows
    in_dir = OLD_WORKFLOWS / "In"
    if in_dir.exists():
        for json_file in in_dir.glob("*.json"):
            output = convert_workflow(json_file, NEW_WORKFLOWS)
            print(f"  {json_file.name} -> {output.relative_to(NEW_WORKFLOWS)}")
            converted.append(output)

    # Convert Out workflows
    out_dir = OLD_WORKFLOWS / "Out"
    if out_dir.exists():
        for json_file in out_dir.glob("*.json"):
            output = convert_workflow(json_file, NEW_WORKFLOWS)
            print(f"  {json_file.name} -> {output.relative_to(NEW_WORKFLOWS)}")
            converted.append(output)

    print()
    print(f"Converted {len(converted)} workflows")
    print()
    print("Next steps:")
    print("1. Review converted files in workflows_to_import/")
    print("2. Import manually via n8n UI")
    print("3. Update workflow IDs in references after import")


if __name__ == "__main__":
    main()
