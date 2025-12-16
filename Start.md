# START - Context for Continuing Work

## FIRST — Sync

**If reading this file SECOND time after git pull — SKIP this block and go to next section!**

```bash
cd "C:/Users/User/Documents/Eldoleado"
git pull
```

After git pull — REREAD this file from the beginning (Start.md), starting from the next section (skipping this sync block to avoid loops).

---

## Last update date and time
**16 December 2025, 20:00 (UTC+4)**

---

## Проект: Омниканальный мессенджер для сервисных центров

### Что это
Мобильное приложение для операторов сервисных центров. Позволяет общаться с клиентами через разные мессенджеры (Avito, VK, MAX, Telegram, WhatsApp) из одного интерфейса.

### Текущий статус
- ✅ Android приложение готово
- ✅ Серверы настроены
- ✅ Tunnel Proxy для защиты от банов готов
- ⏳ Нужно настроить приложение и протестировать

---

## Архитектура: Защита от банов мессенджеров

### Проблема
Мессенджеры (Avito, VK, WhatsApp) банят:
1. **Серверные IP** — datacenter IP в чёрных списках
2. **TLS Fingerprint** — Python/aiohttp/requests определяются как боты
3. **Device ID** — отсутствие реального устройства

### Решение: Tunnel Proxy

```
┌─────────────────────────────────────────────────────────────────┐
│  Android телефон                                                 │
│                                                                  │
│  TunnelService (Foreground Service)                             │
│       │                                                          │
│       │ OkHttp ──► api.avito.ru                                 │
│       │         ──► api.vk.com                                   │
│       │         ──► и т.д.                                       │
│       │                                                          │
│       │ ✅ Мобильный IP                                          │
│       │ ✅ Android TLS fingerprint                               │
│       │ ✅ Реальный Device ID                                    │
│       │                                                          │
│       ▼                                                          │
│  WebSocket подключение к серверу                                │
└───────────────────────────┬─────────────────────────────────────┘
                            │
                            │ WebSocket (wss://155.212.221.189:8765/ws)
                            │
┌───────────────────────────▼─────────────────────────────────────┐
│  NEW Server (155.212.221.189)                                    │
│                                                                  │
│  tunnel-server:8765                                              │
│       │                                                          │
│       │ HTTP API: POST /proxy                                    │
│       │                                                          │
│       ▼                                                          │
│  ┌─────────────┐  ┌─────────────┐  ┌─────────────┐              │
│  │ avito:8766  │  │ vk:8767     │  │ max:8768    │              │
│  │ MCP сервер  │  │ MCP сервер  │  │ MCP сервер  │              │
│  └─────────────┘  └─────────────┘  └─────────────┘              │
│                                                                  │
│  android-api:8780 ◄── Мобильное приложение (UI)                 │
│  redis:6379                                                      │
└─────────────────────────────────────────────────────────────────┘
```

### Как это работает

1. **MCP сервер** хочет отправить запрос к Avito API
2. Вместо прямого запроса отправляет `POST /proxy` на tunnel-server
3. **tunnel-server** пересылает запрос по WebSocket на Android
4. **TunnelService** выполняет запрос через OkHttp (мобильный IP + Android TLS)
5. Ответ возвращается обратно по той же цепочке

---

## Серверы

| Server | IP | Что там | Статус |
|--------|-----|---------|--------|
| **NEW** | 155.212.221.189 | tunnel-server, MCP, android-api, redis | ✅ Готов |
| **RU** | 45.144.177.128 | neo4j, redis, marzban | ✅ Готов |
| **n8n** | 185.221.214.83 | n8n, postgresql | ⏳ Активировать workflows |
| **FI** | 217.145.79.27 | telegram, whatsapp | ⚠️ Проверить |

### NEW Server — Порты

| Сервис | Порт | Описание |
|--------|------|----------|
| tunnel-server | 8765 | WebSocket для Android + HTTP API для MCP |
| avito-messenger-api | 8766 | Avito MCP |
| vk-community-api | 8767 | VK MCP |
| max-bot-api | 8768 | MAX MCP |
| android-api | 8780 | API для мобильного приложения |
| redis | 6379 | Redis |

---

## Настройка Android приложения

### 1. Указать Tunnel URL

В настройках приложения (или в коде SessionManager):

```kotlin
sessionManager.setTunnelUrl("ws://155.212.221.189:8765/ws")
sessionManager.setTunnelSecret("Mi31415926pSss!")
```

### 2. TunnelService

Файл: `NEW/MVP/app_original/src/main/java/com/eldoleado/app/tunnel/TunnelService.kt`

Это Foreground Service который:
- Подключается к tunnel-server по WebSocket
- Получает HTTP запросы в формате JSON
- Выполняет их через OkHttp
- Возвращает ответы

### 3. Включение TunnelService

```kotlin
// Запуск
TunnelService.start(context)

// Остановка
TunnelService.stop(context)
```

### 4. Проверка подключения

```bash
# На сервере или локально
curl http://155.212.221.189:8765/health
# {"status": "ok", "service": "tunnel-server", "devices": 0}

curl http://155.212.221.189:8765/devices
# {"devices": []} — если Android не подключен
# {"devices": [{"device_id": "...", "model": "Pixel 6", "active": 0}]} — если подключен
```

---

## Ключевые файлы

| Файл | Описание |
|------|----------|
| `NEW/MVP/tunnel-proxy/README.md` | Документация по tunnel proxy |
| `NEW/MVP/tunnel-proxy/params.md` | Все параметры и секреты |
| `NEW/MVP/tunnel-proxy/server/tunnel_server.py` | Серверная часть tunnel |
| `NEW/MVP/app_original/src/.../tunnel/TunnelService.kt` | Android сервис |
| `app/build/outputs/apk/debug/app-debug.apk` | Собранный APK |

---

## Секреты

| Параметр | Значение | Где используется |
|----------|----------|------------------|
| TUNNEL_SECRET | Mi31415926pSss! | tunnel-server ↔ Android |
| TUNNEL_API_KEY | BattCRM_Tunnel_Secret_2024 | MCP → tunnel-server |
| JWT_SECRET | Eldoleado-JWT-Secret-2024-Mi31415926 | android-api |
| Redis Password | Mi31415926pSss! | redis |

---

## TODO

### ⬜ Осталось сделать

1. **Настроить Android приложение**
   - Указать Tunnel URL в SessionManager или настройках
   - Добавить UI для включения/выключения TunnelService

2. **Пересобрать APK**
   ```bash
   cd C:/Users/User/Documents/Eldoleado
   ./gradlew.bat :app:assembleDebug
   ```

3. **Установить и протестировать**
   - Установить APK на телефон
   - Включить TunnelService
   - Проверить `curl http://155.212.221.189:8765/devices`

4. **Активировать n8n workflows**
   - Зайти в n8n.n8nsrv.ru
   - Включить API_Android_* workflows

5. **Интегрировать MCP серверы с tunnel**
   - MCP серверы должны использовать `POST /proxy` вместо прямых HTTP запросов

---

## SSH доступ (MCP)

```bash
# Через Claude MCP SSH:
ssh_exec("new", "docker ps")
ssh_exec("ru", "docker ps")
ssh_exec("n8n", "docker ps")
ssh_exec("fi", "docker ps")
```

Пароль для всех: `Mi31415926pSss!`

---

## Quick Commands

```bash
# Проверить tunnel-server
curl http://155.212.221.189:8765/health
curl http://155.212.221.189:8765/devices

# Проверить MCP серверы
curl http://155.212.221.189:8766/health  # avito
curl http://155.212.221.189:8767/health  # vk
curl http://155.212.221.189:8768/health  # max
curl http://155.212.221.189:8780/health  # android-api

# Логи на сервере
ssh root@155.212.221.189
docker logs tunnel-server
docker logs avito-messenger-api
```

---

## Сборка APK

```bash
cd C:/Users/User/Documents/Eldoleado
export JAVA_HOME="/c/Program Files/Android/Android Studio/jbr"
./gradlew.bat :app:assembleDebug
```

APK: `app/build/outputs/apk/debug/app-debug.apk`

---

**Before ending session:** update Start.md, Stop.md, git push
