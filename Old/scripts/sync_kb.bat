@echo off
REM Knowledge Base Sync - for Windows Task Scheduler
REM Run: schtasks /create /tn "Eldoleado KB Sync" /tr "C:\Users\User\Documents\Eldoleado\scripts\sync_kb.bat" /sc hourly

cd /d C:\Users\User\Documents\Eldoleado
python scripts\full_sync.py --quick

REM Log completion
echo %date% %time% Sync completed >> logs\scheduler.log
