# mcp-Browser-Service

Multi-tenant headless browser microservice for Avito, WhatsApp, MAX.

## Концепция

```
┌─────────────────────────────────────────────────────────────┐
│                    Browser Service :8792                     │
├─────────────────────────────────────────────────────────────┤
│  Chromium (headless, 1 instance)                            │
│  ├── Tenant "remaks" (Context 1)                            │
│  │   ├── Fingerprint: Chrome/120, 1920x1080, Moscow         │
│  │   ├── Avito Page → WebSocket listener                    │
│  │   ├── WhatsApp Page                                      │
│  │   └── Session: /data/remaks/session.json                 │
│  │                                                          │
│  ├── Tenant "autoservice" (Context 2)                       │
│  │   ├── Fingerprint: Chrome/122, 1366x768, Samara          │
│  │   ├── Avito Page                                         │
│  │   └── Session: /data/autoservice/session.json            │
│  │                                                          │
│  └── ... (до 100 тенантов)                                  │
└─────────────────────────────────────────────────────────────┘
```

## Ключевые фичи

- **Изоляция по тенантам** — каждый тенант получает отдельный BrowserContext
- **Уникальный fingerprint** — User-Agent, viewport, timezone генерируются детерминистически
- **Persistent sessions** — сессии сохраняются на диск, переживают рестарты
- **Лёгкий** — один Chromium на все тенанты, ~100-200MB на тенанта
- **REST API** — управление через HTTP

## API

### Session Management

```bash
# Создать сессию для тенанта
POST /session/{tenant_id}/create

# Закрыть сессию
DELETE /session/{tenant_id}

# Статус сессии
GET /session/{tenant_id}/status
```

### Channel Operations

```bash
# Открыть канал
POST /session/{tenant_id}/channel/{channel}/open
# channel: avito, whatsapp, max

# Начать логин (для QR)
POST /session/{tenant_id}/channel/{channel}/login

# Получить QR код (WhatsApp, MAX)
GET /session/{tenant_id}/channel/{channel}/qr

# Получить чаты
GET /session/{tenant_id}/channel/{channel}/chats

# Получить сообщения
GET /session/{tenant_id}/channel/{channel}/messages/{chat_id}

# Отправить сообщение
POST /session/{tenant_id}/channel/{channel}/send
{"chat_id": "...", "text": "Hello"}

# Слушать новые сообщения
POST /session/{tenant_id}/channel/{channel}/listen/start
```

### Avito Specific

```bash
# Профиль
GET /session/{tenant_id}/avito/profile
```

## Пример использования

```python
import httpx

BASE = "http://155.212.221.189:8792"
TENANT = "remaks"

# 1. Создать сессию
httpx.post(f"{BASE}/session/{TENANT}/create")

# 2. Открыть Avito
httpx.post(f"{BASE}/session/{TENANT}/channel/avito/open")

# 3. Залогиниться (в браузере появится форма)
# Для Avito - ввести логин/пароль
httpx.post(f"{BASE}/session/{TENANT}/channel/avito/login",
           json={"wait_timeout": 300})

# 4. Получить чаты
chats = httpx.get(f"{BASE}/session/{TENANT}/channel/avito/chats").json()

# 5. Получить сообщения
messages = httpx.get(
    f"{BASE}/session/{TENANT}/channel/avito/messages/{chats[0]['id']}"
).json()

# 6. Отправить сообщение
httpx.post(f"{BASE}/session/{TENANT}/channel/avito/send",
           json={"chat_id": chats[0]['id'], "text": "Привет!"})
```

## Деплой

```bash
# На сервере 155.212.221.189
cd /opt/mcp-browser-service
docker-compose up -d

# Проверка
curl http://localhost:8792/health
```

## Ресурсы

| Тенантов | RAM | CPU |
|----------|-----|-----|
| 1-10 | ~500MB | 0.5 |
| 10-50 | ~2GB | 1 |
| 50-100 | ~4GB | 2 |

## Файлы

```
mcp-Browser-Service/
├── server.py           # FastAPI сервер
├── browser_manager.py  # Управление контекстами
├── fingerprint.py      # Генерация отпечатков
├── channels.py         # Логика каналов
├── requirements.txt
├── Dockerfile
└── docker-compose.yml
```

## Преимущества перед Android WebView

| | Android WebView | Browser Service |
|--|-----------------|-----------------|
| Где работает | На телефоне | На сервере |
| Зависимость от телефона | Да | Нет |
| Масштабируемость | 1 телефон = 1 аккаунт | 1 сервер = 100 тенантов |
| Стабильность | Зависит от WiFi/батареи | 24/7 uptime |
| Fingerprint | Реальный мобильный | Реальный десктопный |
