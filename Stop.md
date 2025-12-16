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
Delete temporary files from project root.

### 3. Update CORE_NEW context
```bash
python scripts/update_core_context.py
```

### 4. Git sync
```bash
git add -A && git commit -m "Session update: brief description" && git push
```

---

## Last session: 16 December 2025, 20:00 (UTC+4)

---

## What's done in this session

### 1. Миграция серверов

**RU Server (45.144.177.128):**
- Остановлены и удалены все MCP серверы
- Оставлены только: neo4j, redis, marzban (VPN)

**NEW Server (155.212.221.189):**
- Развёрнуты все сервисы для мессенджера
- Docker network `eldoleado` создана

### 2. Tunnel Proxy — Архитектура защиты от банов

**Проблема:** Мессенджеры банят серверные IP и определяют ботов по TLS fingerprint.

**Решение:** HTTP запросы выполняются на Android устройстве.

```
Android App (TunnelService)
    │
    │ WebSocket (мобильный IP + Android TLS fingerprint)
    ▼
tunnel-server:8765 ◄──── MCP серверы (POST /proxy)
    │
    ├── avito-messenger-api:8766
    ├── vk-community-api:8767
    └── max-bot-api:8768
```

**Что это даёт:**
- ✅ Мобильный IP (не серверный/datacenter)
- ✅ Android TLS fingerprint (OkHttp, не Python/aiohttp)
- ✅ Реальный Device ID
- ✅ Вся логика на сервере, телефон только прокси

### 3. Компоненты созданы

**tunnel-server** (на VPS):
- WebSocket сервер для подключения Android
- HTTP API `/proxy` для MCP серверов
- Маршрутизация запросов через подключенные устройства

**TunnelService.kt** (в Android приложении):
- Foreground Service с уведомлением
- Подключается к tunnel-server по WebSocket
- Выполняет HTTP запросы через OkHttp (Android TLS!)
- Поддержка бинарных данных, таймаутов, заголовков

### 4. Развёрнутые сервисы на NEW (155.212.221.189)

| Сервис | Порт | Описание |
|--------|------|----------|
| tunnel-server | 8765 | WebSocket + HTTP API |
| avito-messenger-api | 8766 | Avito MCP |
| vk-community-api | 8767 | VK MCP |
| max-bot-api | 8768 | MAX MCP |
| android-api | 8780 | API для приложения |
| redis | 6379 | Redis |

---

## Current system state

**NEW Server (155.212.221.189):**
- ✅ tunnel-server работает, ждёт подключения Android
- ✅ Все MCP серверы запущены
- ✅ android-api готов
- ✅ redis работает

**RU Server (45.144.177.128):**
- ✅ neo4j работает
- ✅ redis работает
- ✅ marzban (VPN) работает

**Android App:**
- ✅ TunnelService обновлён для внешних HTTP
- ⏳ Нужно настроить Tunnel URL в приложении
- ⏳ Нужно пересобрать APK

**n8n (185.221.214.83):**
- ⏳ Нужно активировать API_Android_* workflows

---

## NEXT STEPS

1. **Настроить Android приложение:**
   - Tunnel URL: `ws://155.212.221.189:8765/ws`
   - Tunnel Secret: `Mi31415926pSss!`

2. **Пересобрать APK** с новым TunnelService

3. **Включить TunnelService** в приложении

4. **Проверить подключение:**
   ```bash
   curl http://155.212.221.189:8765/devices
   ```

5. **Активировать n8n workflows**

6. **Тестировать** отправку сообщений через мобильный IP

---

## To continue

1. `git pull`
2. Read `Start.md`
3. Настроить Tunnel URL в Android приложении
4. Пересобрать и установить APK
5. Включить TunnelService и проверить подключение
