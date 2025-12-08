# START - Контекст для продолжения работы

## ПЕРВЫМ ДЕЛОМ — Синхронизация

**Если читаешь этот файл ВТОРОЙ раз после git pull — ПРОПУСТИ этот блок и переходи к следующей секции!**

```bash
cd "C:/Users/User/Documents/Eldoleado"
git pull
```

После git pull — ПЕРЕЧИТАЙ этот файл заново (Start.md), начиная со следующей секции (пропустив этот блок синхронизации, чтобы не зациклиться).

---

## Дата и время последнего обновления
**8 декабря 2025, 18:45 (UTC+4)**

---

## Что сделано в последних сессиях

### Сессия 08.12.2025 (продолжение) — Graph Matcher + Исправление дублей

1. **Graph Matcher webhook — СОЗДАН ✅**
   - Добавлен action `match_entities` в Neo4j Context Builder
   - Возвращает `device_action` (use_existing/create_new)
   - Возвращает `matched_device_id` если найдено существующее
   - Файл: `workflows_to_import/modified/BAT_Neo4j_Context_Builder_with_Matcher.json`

2. **Appeal Router с Graph Matcher — ОБНОВЛЁН ✅**
   - Добавлен вызов `match_entities` после Merge Results
   - SQL изменён: использует matched_device_id вместо создания нового
   - Файл: `workflows_to_import/modified/BAT_AI_Appeal_Router_with_Matcher.json`

3. **Проблема дублей устройств — РЕШЕНА ✅**
   - Теперь: извлечённые данные → матчинг с графом → create/use_existing
   - SQL использует PL/pgSQL с условной логикой

### Сессия 08.12.2025 — Neo4j интеграция + Логика обработки сообщений

1. **Neo4j Context Builder — ИСПРАВЛЕН ✅**
   - Проблема: HTTPS вместо HTTP для внутренних вызовов
   - Решение: Изменено на `http://45.144.177.128:7474/db/neo4j/tx/commit`

2. **Task Dispatcher с Neo4j контекстом — РАБОТАЕТ ✅**
   - Добавлен вызов Neo4j Context Builder
   - Контекст `{message_history}`, `{current_devices}` заполняется

3. **Worker обрабатывает задачи — РАБОТАЕТ ✅**
   - Worker 1 активен, забирает из `ai_extraction_queue`

4. **Спецификация логики обработки сообщений — СОЗДАНА ✅**
   - Файл: `docs/specs/message_processing_logic.md`
   - Описана логика: ЗАПИСАТЬ → ВЫТАЩИТЬ → АНАЛИЗИРОВАТЬ
   - Извлечение сущностей (brand, model, owner, problem)
   - Матчинг с графом
   - Управление фокусом (device_id, problem_id)

### Сессия 06.12.2025 — Android API Gateway

1. **Android API Gateway — РАЗВЁРНУТ ✅**
   - URL: `http://45.144.177.128:8780`
   - Health: ✅ Working
   - Swagger: `http://45.144.177.128:8780/docs`

---

## Текущее состояние проекта

### Что готово:

1. **Knowledge Base система** — 294 компонента, 1080 nodes
2. **Android приложение** — собирается, package `com.eldoleado.app`
3. **Android API Gateway** — FastAPI на 45.144.177.128:8780 ✅
4. **Neo4j Context Builder** — работает (HTTP) ✅
5. **Task Dispatcher** — создаёт задачи с контекстом ✅
6. **Worker** — обрабатывает задачи ✅
7. **Спецификация обработки сообщений** — `docs/specs/message_processing_logic.md` ✅
8. **GitHub** — https://github.com/n8nRemacs/Eldoleado
9. **n8n workflows** — 95+ штук

### Что требует исправления:

1. **Дубли устройств** — SQL в `BAT_AI_Appeal_Router` создаёт новые устройства вместо использования существующих

---

## Следующие шаги (приоритет)

### 1. Исправить логику создания устройств

**Проблема:** SQL `Update Full Data` / `Update Partial Data` всегда делает INSERT

**План реализации:**
1. **Graph Matcher** — новый webhook `/webhook/neo4j/match-entities`
   - Вход: `client_id` + извлечённые сущности
   - Выход: `{device_action, matched_device_id}`

2. **Entity Extractor** — выделить извлечение сущностей

3. **Исправить SQL** — условный INSERT/UPDATE на основе `device_action`

### 2. DNS + SSL для API
```
Добавить A-запись: android-api.eldoleado.ru → 45.144.177.128
Затем: certbot --nginx -d android-api.eldoleado.ru
```

### 3. Обновить Android приложение
- Заменить прямые вызовы n8n на API Gateway
- Base URL: `https://android-api.eldoleado.ru`

---

## Ключевые файлы для продолжения

| Файл | Описание |
|------|----------|
| `docs/specs/message_processing_logic.md` | Спецификация логики обработки |
| `Plans/Eldoleado_Мультичат_ТЗ_v2.md` | Бизнес-требования мультичата |
| `n8n_workflows/Core/BAT_AI_Appeal_Router.json` | Нужно исправить SQL |
| `n8n_workflows/Tool/BAT_AI_Task_Dispatcher.json` | Task Dispatcher |

---

## Серверы

| Сервер | IP/URL | Порт | Назначение |
|--------|--------|------|------------|
| n8n | n8n.n8nsrv.ru | 443 | Workflow automation |
| Neo4j | 45.144.177.128 | 7474/7687 | Graph database |
| PostgreSQL | 185.221.214.83 | 6544 | Main database |
| **Android API** | 45.144.177.128 | 8780 | API Gateway ✅ |
| Redis (RU) | 45.144.177.128 | 6379 | ai_extraction_queue |
| Redis (n8n) | 185.221.214.83 | 6379 | n8n cache |
| MCP Telegram | 217.145.79.27 | 443 | tg.eldoleado.ru |

---

## Database Connection

```
PostgreSQL: postgresql://supabase_admin:Mi31415926pS@185.221.214.83:6544/postgres
Neo4j: bolt://neo4j:Mi31415926pS@45.144.177.128:7687
Redis (RU): redis://:Mi31415926pSss!@45.144.177.128:6379
```

---

## Redis Quick Check

```bash
# Проверить очередь AI extraction (RU сервер!)
ssh root@45.144.177.128 'docker exec redis redis-cli --no-auth-warning -a Mi31415926pSss! LLEN "ai_extraction_queue"'

# Посмотреть содержимое
ssh root@45.144.177.128 'docker exec redis redis-cli --no-auth-warning -a Mi31415926pSss! LRANGE "ai_extraction_queue" 0 5'
```

---

## Документация

- `docs/specs/message_processing_logic.md` — логика обработки сообщений
- `Plans/Eldoleado_Мультичат_ТЗ_v2.md` — мультичат ТЗ
- `Plans/Eldoleado_Спецификация_Графа.md` — спецификация графа
- `CLAUDE.md` — инструкции для AI
- `Stop.md` — чеклист завершения сессии

---

**Перед завершением сессии**: обновить этот файл и git push
