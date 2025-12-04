Run full Knowledge Base synchronization:
1. Sync workflows from n8n server
2. Update project_components table
3. Update component_relations table
4. Extract workflow nodes and connections
5. Regenerate flow documentation

Execute: `python scripts/full_sync.py`

After completion, show summary of what was updated.
