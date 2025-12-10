#!/usr/bin/env python3
"""
Generate KNOWLEDGE_BASE.md from PostgreSQL project_components tables.
This script queries the knowledge base and generates a human-readable markdown file.

Usage:
    python generate_knowledge_base.py [--output KNOWLEDGE_BASE.md]

Environment variables:
    DATABASE_URL - PostgreSQL connection string (default: from .env)
"""

import os
import sys
import argparse
from datetime import datetime
from collections import defaultdict

try:
    import psycopg2
    from psycopg2.extras import RealDictCursor
except ImportError:
    print("Error: psycopg2 not installed. Run: pip install psycopg2-binary")
    sys.exit(1)

# Default connection
DEFAULT_DB_URL = "postgresql://supabase_admin:Mi31415926pS@185.221.214.83:6544/postgres"


def get_connection(db_url=None):
    """Create database connection."""
    url = db_url or os.getenv("DATABASE_URL", DEFAULT_DB_URL)
    return psycopg2.connect(url, cursor_factory=RealDictCursor)


def fetch_components(conn):
    """Fetch all components grouped by type."""
    with conn.cursor() as cur:
        cur.execute("""
            SELECT
                id, type, name, code, category, subcategory,
                file_path, tech_stack, description, purpose,
                metadata, status
            FROM project_components
            WHERE status != 'deleted'
            ORDER BY type, category, name
        """)
        return cur.fetchall()


def fetch_relations(conn):
    """Fetch all component relations."""
    with conn.cursor() as cur:
        cur.execute("""
            SELECT
                r.relation_type,
                r.description,
                fc.type as from_type, fc.name as from_name,
                tc.type as to_type, tc.name as to_name
            FROM component_relations r
            JOIN project_components fc ON fc.id = r.from_component_id
            JOIN project_components tc ON tc.id = r.to_component_id
            ORDER BY r.relation_type, fc.name
        """)
        return cur.fetchall()


def fetch_stats(conn):
    """Fetch summary statistics."""
    with conn.cursor() as cur:
        # Component counts by type
        cur.execute("""
            SELECT type, count(*) as count
            FROM project_components
            WHERE status = 'active'
            GROUP BY type
            ORDER BY count DESC
        """)
        type_counts = cur.fetchall()

        # Relation counts
        cur.execute("""
            SELECT relation_type, count(*) as count
            FROM component_relations
            GROUP BY relation_type
            ORDER BY count DESC
        """)
        relation_counts = cur.fetchall()

        # Recent changes
        cur.execute("""
            SELECT
                change_type, component_type, component_name,
                change_description, changed_at
            FROM project_changelog
            ORDER BY changed_at DESC
            LIMIT 20
        """)
        recent_changes = cur.fetchall()

        return {
            "types": type_counts,
            "relations": relation_counts,
            "recent_changes": recent_changes
        }


def generate_markdown(components, relations, stats):
    """Generate markdown content."""
    lines = []

    # Header
    lines.append("# ELDOLEADO KNOWLEDGE BASE")
    lines.append("")
    lines.append(f"*Auto-generated: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}*")
    lines.append("")
    lines.append("---")
    lines.append("")

    # Quick stats
    lines.append("## Quick Stats")
    lines.append("")
    lines.append("| Component Type | Count |")
    lines.append("|----------------|-------|")
    total = 0
    for row in stats["types"]:
        lines.append(f"| {row['type']} | {row['count']} |")
        total += row['count']
    lines.append(f"| **TOTAL** | **{total}** |")
    lines.append("")

    lines.append("| Relation Type | Count |")
    lines.append("|---------------|-------|")
    for row in stats["relations"]:
        lines.append(f"| {row['relation_type']} | {row['count']} |")
    lines.append("")
    lines.append("---")
    lines.append("")

    # Components by type
    components_by_type = defaultdict(list)
    for comp in components:
        components_by_type[comp['type']].append(comp)

    # Type order for better readability
    type_order = [
        'workflow', 'table', 'android_activity', 'android_viewmodel',
        'android_repository', 'api_endpoint', 'mcp_server',
        'neo4j_node', 'neo4j_relation', 'script', 'doc'
    ]

    for comp_type in type_order:
        if comp_type not in components_by_type:
            continue

        comps = components_by_type[comp_type]
        type_title = comp_type.replace('_', ' ').title()

        lines.append(f"## {type_title}s ({len(comps)})")
        lines.append("")

        # Group by category if available
        by_category = defaultdict(list)
        for c in comps:
            cat = c.get('category') or 'Other'
            by_category[cat].append(c)

        for category, cat_comps in sorted(by_category.items()):
            if len(by_category) > 1:
                lines.append(f"### {category}")
                lines.append("")

            for comp in cat_comps:
                # Component header
                status_badge = "" if comp['status'] == 'active' else f" [{comp['status']}]"
                lines.append(f"#### {comp['name']}{status_badge}")
                lines.append("")

                # Description
                if comp.get('description'):
                    lines.append(f"*{comp['description']}*")
                    lines.append("")

                # Details table
                details = []
                if comp.get('file_path'):
                    details.append(f"- **File:** `{comp['file_path']}`")
                if comp.get('tech_stack'):
                    details.append(f"- **Tech:** {comp['tech_stack']}")
                if comp.get('subcategory'):
                    details.append(f"- **Subcategory:** {comp['subcategory']}")

                # Metadata specifics
                meta = comp.get('metadata') or {}
                if isinstance(meta, dict):
                    if meta.get('webhook_path'):
                        details.append(f"- **Webhook:** `{meta['webhook_path']}`")
                    if meta.get('method'):
                        details.append(f"- **Method:** {meta['method']}")
                    if meta.get('extends'):
                        details.append(f"- **Extends:** {meta['extends']}")
                    if meta.get('tags'):
                        details.append(f"- **Tags:** {', '.join(meta['tags'])}")

                if details:
                    lines.extend(details)
                    lines.append("")

        lines.append("---")
        lines.append("")

    # Handle any remaining types
    for comp_type, comps in components_by_type.items():
        if comp_type in type_order:
            continue
        type_title = comp_type.replace('_', ' ').title()
        lines.append(f"## {type_title}s ({len(comps)})")
        lines.append("")
        for comp in comps:
            lines.append(f"- **{comp['name']}** - {comp.get('description', 'No description')}")
        lines.append("")
        lines.append("---")
        lines.append("")

    # Relations section
    lines.append("## Component Relations")
    lines.append("")

    relations_by_type = defaultdict(list)
    for rel in relations:
        relations_by_type[rel['relation_type']].append(rel)

    for rel_type, rels in sorted(relations_by_type.items()):
        rel_title = rel_type.replace('_', ' ').title()
        lines.append(f"### {rel_title} ({len(rels)})")
        lines.append("")

        # Limit to first 50 for readability
        for rel in rels[:50]:
            from_str = f"{rel['from_type']}:{rel['from_name']}"
            to_str = f"{rel['to_type']}:{rel['to_name']}"
            lines.append(f"- `{from_str}` → `{to_str}`")

        if len(rels) > 50:
            lines.append(f"- *...and {len(rels) - 50} more*")
        lines.append("")

    lines.append("---")
    lines.append("")

    # Recent changes
    if stats.get("recent_changes"):
        lines.append("## Recent Changes")
        lines.append("")
        lines.append("| Date | Type | Component | Description |")
        lines.append("|------|------|-----------|-------------|")
        for change in stats["recent_changes"]:
            date_str = change['changed_at'].strftime('%Y-%m-%d %H:%M') if change['changed_at'] else '-'
            lines.append(f"| {date_str} | {change['change_type']} | {change['component_name']} | {change['change_description'][:50]}... |")
        lines.append("")

    return "\n".join(lines)


def main():
    parser = argparse.ArgumentParser(description="Generate KNOWLEDGE_BASE.md from database")
    parser.add_argument("--output", "-o", default="KNOWLEDGE_BASE.md", help="Output file path")
    parser.add_argument("--db-url", help="Database connection URL")
    args = parser.parse_args()

    print(f"Connecting to database...")
    try:
        conn = get_connection(args.db_url)
    except Exception as e:
        print(f"Error connecting to database: {e}")
        print("\nMake sure the database is accessible and tables exist.")
        print("Run migration 016_project_knowledge_base.sql first.")
        sys.exit(1)

    try:
        print("Fetching components...")
        components = fetch_components(conn)
        print(f"  Found {len(components)} components")

        print("Fetching relations...")
        relations = fetch_relations(conn)
        print(f"  Found {len(relations)} relations")

        print("Fetching statistics...")
        stats = fetch_stats(conn)

        print("Generating markdown...")
        content = generate_markdown(components, relations, stats)

        # Determine output path
        output_path = args.output
        if not os.path.isabs(output_path):
            # Default to project root
            script_dir = os.path.dirname(os.path.abspath(__file__))
            project_root = os.path.dirname(script_dir)
            output_path = os.path.join(project_root, output_path)

        print(f"Writing to {output_path}...")
        with open(output_path, "w", encoding="utf-8") as f:
            f.write(content)

        print(f"\nDone! Generated {len(content)} bytes")
        print(f"Output: {output_path}")

    finally:
        conn.close()


if __name__ == "__main__":
    main()
