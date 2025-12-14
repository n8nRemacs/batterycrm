# STOP - Session Completion Checklist

> **IMPORTANT:** When updating this file ALWAYS specify date AND time in format: `DD Month YYYY, HH:MM (UTC+4)`

---

## MANDATORY before closing session:

### 1. Update Start.md

**IMPORTANT:** ALWAYS add sync block at the beginning of Start.md:

```markdown
## FIRST — Sync

**If reading this file SECOND time after git pull — SKIP this block and go to next section!**

\`\`\`bash
cd "C:/Users/User/Documents/Eldoleado"
git pull
\`\`\`

After git pull — REREAD this file from the beginning (Start.md), starting from the next section (skipping this sync block to avoid loops).

---
```

Then update "What's done" section — add everything done in this session.

### 2. Clean project
Delete temporary files from project root:
```bash
# Check what's in root
ls -la *.py *.tmp *.log *.bak 2>/dev/null

# Typical garbage to delete:
# - One-time scripts (check_*.py, test_*.py, deploy_*.py)
# - Archives (*.tar.gz, *.zip)
# - Logs (*.log)
# - Backups (*.bak, *~)
```

Move temporary scripts to `Old/scripts/` or delete.

### 3. Update CORE_NEW context
```bash
python scripts/update_core_context.py
```
Script automatically updates `CORE_NEW/CONTEXT.md` with current data:
- PostgreSQL table count
- Neo4j label count
- API endpoint count
- Workflow count
- Documentation status

### 4. Git sync
```bash
git add -A && git commit -m "Session update: brief description" && git push
```

---

## Last session: 13 December 2025, 17:30 (UTC+4)

---

## What's done in this session

### ELO_Input_Worker — отладка и рефакторинг

**Проблемы найдены и задокументированы:**

1. **n8n Redis node quirks:**
   - POP возвращает данные в `propertyName` или `value`
   - KEYS возвращает ключи как свойства объекта
   - GET возвращает значение в имени ключа
   - SET требует `String()` для числовых значений

2. **IF nodes:** требуют `looseTypeValidation: true`

3. **Архитектурная проблема:** батчинг и дебаунсинг не работают в одном цикле воркфлоу

**Решение принято:** разделить на 2 воркфлоу:
- `ELO_Input_Batcher` — только батчинг
- `ELO_Input_Processor` — только проверка deadline и отправка

---

### MCP Contours отключены

Решено использовать только n8n workflows без MCP contour серверов:
- input-contour (8771) — disabled
- client-contour (8772) — disabled
- graph-tool (8773) — disabled
- ai-tool (8774) — disabled

MCP messengers остаются активными (telegram, whatsapp, avito, vk, max).

---

## Текущее состояние системы

```
Channel IN → ELO_In_* → queue:incoming → [Batcher] → batch:* → [Processor] → Client → Core AI → Out
                                              ↑                      ↑
                                         TODO: создать          TODO: создать
```

**Работает:**
- ELO_In_Telegram — принимает сообщения, кладёт в queue:incoming
- ELO_Out_Router — роутит ответы по каналам
- ELO_Client_Resolve — резолвит клиента

**Не работает:**
- ELO_Input_Worker — требует разделения на Batcher + Processor

---

## Ключевые файлы сессии

| Файл | Описание |
|------|----------|
| `NEW/workflows/Input Contour/ELO_Input_Worker.json` | Текущая версия (нерабочая) |
| `Start.md` | Обновлён с новым контекстом |

---

## НА ЧЁМ ОСТАНОВИЛИСЬ

### Создать 2 воркфлоу вместо 1:

**1. ELO_Input_Batcher:**
```
Schedule (3s) → Pop Message → Parse → If Empty?
                                        ↓ No
                              Get First Seen → Calc Deadline → Push to Batch → Set Deadline → END
```

**2. ELO_Input_Processor:**
```
Schedule (3s) → Get All Batches → Prepare Check → If Has Batches?
                                                      ↓ Yes
                                        Split → Get Deadline → Check If Due?
                                                                    ↓ Yes
                                              Collect All → Merge → Send to Client Resolve → Cleanup
```

---

## Redis структура

```
queue:incoming          — входящие сообщения
batch:{channel}:{chat}  — накопленные сообщения (LIST)
deadline:{channel}:{chat} — когда обрабатывать (STRING, TTL 120s)
first_seen:{channel}:{chat} — первое сообщение (STRING, TTL 120s)
dlq:input_contour       — ошибки
```

---

## To continue

1. **git pull** — sync latest changes
2. **Read Start.md** — full context
3. **Create ELO_Input_Batcher** — batching only
4. **Create ELO_Input_Processor** — deadline check and send
5. **Test** — 3 messages → 1 merged → Client Resolve
