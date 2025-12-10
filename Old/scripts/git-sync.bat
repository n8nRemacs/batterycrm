@echo off
cd /d "C:\Users\User\Dropbox\BattCRMApp"

:: Check for changes
git status -s > nul 2>&1
git diff --quiet && git diff --cached --quiet
if %errorlevel%==0 (
    echo No changes to sync
    exit /b 0
)

:: Add all changes
git add -A

:: Commit with timestamp
git commit -m "Auto-sync: %date% %time%"

:: Push to GitHub
git push origin main

echo Synced to GitHub successfully
