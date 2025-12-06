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
**6 декабря 2025, 12:45 (UTC+4)**

---

## Что сделано в последних сессиях

### Сессия 06.12.2025 — Android API Gateway

1. **Анализ архитектуры для 1000 тенантов**
   - Шардирование тенантов по серверам n8n (1-200 → shard-1, 201-400 → shard-2)
   - HTTP webhooks для AI Workers вместо внутренних workflow triggers
   - Резервный сервер с auto-failover через nginx
   - **Решение:** сначала стабильный монолит, масштабирование по мере роста

2. **Android API Gateway — РАЗВЁРНУТ ✅**
   ```
   MCP/api-android/
   ├── app.py              # 22 endpoint'а
   ├── config.py           # Settings
   ├── n8n_client.py       # HTTP client для n8n
   ├── auth.py             # JWT authentication
   └── docker-compose.yml
   ```
   - URL: `http://45.144.177.128:8780`
   - Health: ✅ Working
   - Swagger: `http://45.144.177.128:8780/docs`

3. **Nginx + SSL — ПОДГОТОВЛЕН**
   - Конфиг создан: `/etc/nginx/sites-available/android-api`
   - Ждёт DNS: `android-api.eldoleado.ru → 45.144.177.128`

### Сессия 05.12.2025 — Telegram Flow Debug

1. **BAT Queue Processor** — исправлены Pop Message nodes
2. **BAT Batch Debouncer** — исправлен Parse Job
3. **Проблема:** Get Batch Queue возвращает null (race condition?)

---

## Текущее состояние проекта

### Что готово:

1. **Knowledge Base система** — 294 компонента, 1080 nodes
2. **Android приложение** — собирается, package `com.eldoleado.app`
3. **Android API Gateway** — FastAPI на 45.144.177.128:8780 ✅
4. **API для devices/repairs** — CREATE/UPDATE/DELETE + Detail с devices[]
5. **Мультиконтекст backend** — conversation_focus, disambiguation, touchpoints
6. **GitHub** — https://github.com/n8nRemacs/Eldoleado
7. **Neo4j** — CRUD + Touchpoints работает
8. **n8n workflows** — 95+ штук
9. **Telegram MCP proxy** — работает на tg.eldoleado.ru
10. **Touchpoints система** — 4 типа (inbound, outbound, promo, mutual)

---

## Следующие шаги

1. **DNS + SSL для API:**
   ```
   Добавить A-запись: android-api.eldoleado.ru → 45.144.177.128
   Затем: certbot --nginx -d android-api.eldoleado.ru
   ```

2. **Дебаг Telegram flow:**
   - Проверить Redis напрямую после Queue Processor
   - Тест: остановить все Debouncer, отправить сообщение, проверить Redis

3. **Обновить Android приложение:**
   - Заменить прямые вызовы n8n на API Gateway
   - Base URL: `https://android-api.eldoleado.ru`

4. **Импортировать workflows в n8n:**
   - `BAT_AI_Appeal_Router.json` — заменить
   - `BAT_Disambiguation_Handler.json` — создать новый

---

## Серверы

| Сервер | IP/URL | Порт | Назначение |
|--------|--------|------|------------|
| n8n | n8n.n8nsrv.ru | 443 | Workflow automation |
| Neo4j | 45.144.177.128 | 7474/7687 | Graph database |
| PostgreSQL | 185.221.214.83 | 6544 | Main database |
| **Android API** | 45.144.177.128 | 8780 | API Gateway ✅ |
| Redis | 185.221.214.83 | 6379 | Queues/cache |
| MCP Telegram | 217.145.79.27 | 443 | tg.eldoleado.ru |

---

## Database Connection

```
PostgreSQL: postgresql://supabase_admin:Mi31415926pS@185.221.214.83:6544/postgres
Neo4j: bolt://neo4j:Mi31415926pS@45.144.177.128:7687
Redis: на сервере n8n (185.221.214.83)
```

---

## API Gateway Endpoints

```
POST /api/auth/login        — Логин оператора
POST /api/auth/logout       — Выход
GET  /api/appeals           — Список обращений
GET  /api/appeals/{id}      — Детали
POST /api/appeals/{id}/take — Взять в работу
POST /api/appeals/{id}/send — Отправить сообщение
POST /api/appeals/{id}/devices    — Добавить устройство
PATCH /api/devices/{id}           — Обновить устройство
POST /api/devices/{id}/repairs    — Добавить ремонт
...
Полный список: http://45.144.177.128:8780/docs
```

---

## Документация

- `Plans/Eldoleado_Спецификация_Графа.md` — спецификация графа
- `Plans/Eldoleado full.md` — база знаний
- `CLAUDE.md` — инструкции для AI
- `Stop.md` — чеклист завершения сессии

---

**Перед завершением сессии**: обновить этот файл и git push
