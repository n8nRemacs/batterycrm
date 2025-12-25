# Start Session - План на следующую сессию

## Инфраструктура

| Сервер | IP | Сервисы |
|--------|-----|---------|
| **Messenger** | 155.212.221.189 (ext: 217.114.14.17) | mcp-avito-camoufox :8793 |
| **n8n** | 185.221.214.83 | n8n, PostgreSQL, Redis |

---

## Приоритет 1: Avito Polling

Webhook от Avito не работает без платной подписки. Решение — polling.

### Импорт workflow

1. Открыть n8n: https://n8n.n8nsrv.ru
2. Import → From File
3. Выбрать: `NEW/MVP/MCP/mcp-avito-camoufox/n8n-avito-polling.json`
4. Настроить Redis credentials
5. Активировать

### Что делает polling

```
Каждые 15 сек:
  GET /chats?unread_only=true
    ↓
  Новые сообщения → Redis Queue
```

---

## Приоритет 2: Отправка через Camoufox

Official API требует платную подписку для отправки. Альтернатива — Camoufox.

### Endpoint уже есть:
```bash
POST http://155.212.221.189:8793/account/{id}/send
{
  "chat_id": "u2i-xxx",
  "text": "Ответ клиенту"
}
```

### Проблема:
Использует internal API (`/web/1/messenger/postMessage`) → 403

### Нужно:
Реализовать отправку через браузерную автоматизацию:
1. Открыть чат по chat_id
2. Ввести текст в input
3. Нажать кнопку отправки

---

## Avito API — Статус

| Функция | Статус |
|---------|--------|
| GET /chats + last_message | ✅ Бесплатно |
| Webhook подписка | ✅ Создаётся |
| Webhook от Avito | ❌ Не приходит (платно) |
| GET /messages | ❌ 402 (платно) |
| POST /messages | ❌ 402 (платно) |

---

## Credentials

### Avito API (n8n-1)
```
Client_id: MS0TjX2bwNcLapoX7YCc
Client_secret: QrhNXcvAzZexWOaFE99kMiRPDSE1hTZwkUYX4RFN
User ID: 157920214
```

### Avito Camoufox
```
Phone: 79171708077
Password: Mi31415926pS
```

---

## Ключевые файлы

| Файл | Описание |
|------|----------|
| `mcp-avito-camoufox/AVITO_RESEARCH.md` | Полное исследование API |
| `mcp-avito-camoufox/n8n-avito-polling.json` | Workflow для импорта |
| `mcp-avito-camoufox/server.py` | REST API :8793 |
| `mcp-avito-camoufox/avito_channel.py` | Browser automation |

---

## SSH

```bash
ssh root@155.212.221.189  # Messenger
ssh root@185.221.214.83   # n8n
```

---

*Последнее обновление: 2025-12-25*
