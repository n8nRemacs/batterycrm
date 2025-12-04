# Workflows to Import

Workflows в этой папке предназначены для ручного импорта в n8n.

## Структура

```
workflows_to_import/
├── new/        # Новые workflows (ещё не существуют на сервере)
├── modified/   # Изменённые существующие workflows
└── README.md   # Этот файл
```

## Как импортировать

1. Откройте n8n: https://n8n.n8nsrv.ru
2. Для НОВОГО workflow:
   - Нажмите "Add workflow"
   - Import from file → выберите JSON из `new/`
3. Для ИЗМЕНЁННОГО workflow:
   - Откройте существующий workflow
   - Settings → Import from file → выберите JSON из `modified/`
   - Или удалите старый и импортируйте новый

## После импорта

```bash
# Синхронизировать KB с сервера
python scripts/full_sync.py
```

## Naming Convention

- `BAT IN {Channel}` - входящие каналы (Telegram, Avito, MAX...)
- `API_Android_{Action}` - Android API endpoints
- `BAT {Component}` - внутренние компоненты
- `Tool - {Name}` - утилиты
