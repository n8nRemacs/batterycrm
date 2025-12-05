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
**5 декабря 2025, 17:30 (UTC+4)**

---

## Что сделано в этой сессии (05.12.2025)

### Telegram Flow Debug — В ПРОЦЕССЕ

1. **BAT Queue Processor** — исправлены Pop Message nodes
   - Добавлен `propertyName: "value"` ко всем 10 нодам Pop Message
   - Заменён Execute Workflow на Redis Push для debounce queue

2. **BAT Batch Debouncer** — исправлен Parse Job
   - Теперь корректно обрабатывает и объект и строку из Redis
   - Добавлен `propertyName: "value"` в Pop Batch Job
   - Добавлен `key` параметр в Get Batch Queue

3. **Проблема: Get Batch Queue возвращает null**
   - Queue Processor кладёт сообщения в `queue:batch:*`
   - Debouncer получает job из `queue:debounce:pending`
   - Но при попытке прочитать `queue:batch:*` — пусто
   - Возможно race condition или старые executions удалили данные

---

## Файлы для импорта в n8n

```
workflows_to_import/modified/
├── BAT_Queue_Processor.json      ← ВАЖНО: Push to Debounce вместо Execute Workflow
├── BAT_Batch_Debouncer_10.json   ← исправлен Parse Job + propertyName
├── BAT_AI_Appeal_Router.json
└── BAT_IN_Telegram.json
```

---

## Текущее состояние проекта

### Что готово:

1. **Knowledge Base система** — 294 компонента, 1080 nodes
2. **Android приложение** — собирается, package `com.eldoleado.app`
3. **API для devices/repairs** — CREATE/UPDATE/DELETE + Detail с devices[]
4. **Мультиконтекст backend** — conversation_focus, disambiguation, touchpoints
5. **GitHub** — https://github.com/n8nRemacs/Eldoleado
6. **Neo4j** — CRUD + Touchpoints работает
7. **n8n workflows** — 95+ штук
8. **Telegram MCP proxy** — работает на tg.eldoleado.ru
9. **Client Merge** — спроектировано (таблица + Neo4j MERGED_INTO)

---

## Следующие шаги

1. **Дебаг Telegram flow** (приоритет!):
   - Проверить Redis напрямую после Queue Processor
   - Убедиться что `queue:batch:*` содержит данные
   - Тест чистого прохода: остановить все Debouncer, отправить сообщение, проверить Redis

2. **После фикса flow:**
   - Протестировать полный цикл до AI ответа
   - Проверить отправку ответа обратно в Telegram

3. **Android UI для мультиконтекста**

---

## Серверы

| Сервер | IP/URL | Назначение |
|--------|--------|------------|
| n8n | n8n.n8nsrv.ru / 185.221.214.83 | Workflow + Redis |
| Neo4j | 45.144.177.128:7474 | Graph database |
| PostgreSQL | 185.221.214.83:6544 | Main database |
| MCP Telegram | 217.145.79.27 (tg.eldoleado.ru) | Telegram proxy |

---

## Database Connection

```
PostgreSQL: postgresql://supabase_admin:Mi31415926pS@185.221.214.83:6544/postgres
Neo4j: bolt://neo4j:Mi31415926pS@45.144.177.128:7687
Redis: на сервере n8n (185.221.214.83)
```

---

## Документация

- `Plans/Eldoleado_Спецификация_Графа.md` — спецификация графа
- `Plans/Eldoleado full.md` — база знаний
- `CLAUDE.md` — инструкции для AI
- `Stop.md` — чеклист завершения сессии

---

**Перед завершением сессии**: обновить этот файл и git push
