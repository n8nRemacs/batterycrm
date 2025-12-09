#!/bin/bash
# Auto-sync script for BatteryCRM
# Run: ./scripts/git-sync.sh "commit message"

cd "$(dirname "$0")/.."

# Check for changes
if [[ -z $(git status -s) ]]; then
    echo "No changes to commit"
    exit 0
fi

# Add all changes (except ignored)
git add -A

# Commit with message or auto-generated
MESSAGE="${1:-Auto-sync: $(date '+%Y-%m-%d %H:%M:%S')}"
git commit -m "$MESSAGE

🤖 Generated with [Claude Code](https://claude.com/claude-code)

Co-Authored-By: Claude <noreply@anthropic.com>"

# Push to GitHub
git push origin main

echo "✓ Synced to GitHub"
