# Start Session - План на следующую сессию

## Инфраструктура

| Сервер | IP | Сервисы |
|--------|-----|---------|
| **Messenger** | 155.212.221.189 | MCP: telegram :8761, whatsapp :8769, avito :8793 |
| **n8n** | 185.221.214.83 | n8n, PostgreSQL, Redis |
| **HTTPS Gateway** | msg.eldoleado.ru | nginx + Let's Encrypt |

---

## Приоритет 1: Исправить Telegram Resolver

`ELO_In_Telegram_Bot` вызывает неактивный `BAT_Tenant_Resolver`.

### Решение (выбрать одно)

**Вариант A: Активировать BAT_Tenant_Resolver**
1. n8n → Найти `BAT_Tenant_Resolver`
2. Активировать toggle

**Вариант B: Изменить ELO_In_Telegram_Bot** (рекомендуется)
1. Открыть `ELO_In_Telegram_Bot`
2. Нода "Execute Tenant Resolver"
3. Изменить workflow на `ELO_Client_Resolve` (ID: `OHjjTQDguN2G6xin`)

### Проверка
```bash
# Отправить сообщение @remacsbot
# Проверить Redis кеш
ssh root@185.221.214.83 "docker exec n8n-redis redis-cli KEYS 'cache:tenant:telegram:*'"
```

---

## Приоритет 2: WhatsApp Credential Маппинг

В `ELO_Client_Resolve` → `Validate Input` добавить `session_id`:

```javascript
// Изменить:
case 'whatsapp': credential = input.profile_id || input.meta?.raw?.sessionId; break;
// На:
case 'whatsapp': credential = input.session_id || input.profile_id || input.meta?.raw?.sessionId; break;
```

---

## Приоритет 3: Avito Polling

Webhook от Avito не работает без платной подписки.

### Импорт workflow

1. n8n → Import → From File
2. Файл: `NEW/MVP/MCP/mcp-avito-camoufox/n8n-avito-polling.json`
3. Настроить Redis credentials
4. Активировать

---

## Телеграм бот

| Параметр | Значение |
|----------|----------|
| Bot | @remacsbot |
| Token | 6939426823:AAEEvJCRUvZh5F_ihH1AzJTbiWntARqseIY |
| MCP | http://155.212.221.189:8761 |
| Webhook | https://msg.eldoleado.ru/telegram/webhook/telegram/4a0b29da2bfb1429 |

### Перерегистрация бота (если нужно)

```bash
curl -X POST "http://155.212.221.189:8761/setup?base_url=https://msg.eldoleado.ru/telegram" \
  -H "X-API-Key: eldoleado_mcp_2024" \
  -H "Content-Type: application/json" \
  -d '{"token": "6939426823:AAEEvJCRUvZh5F_ihH1AzJTbiWntARqseIY"}'
```

---

## Workflows — Статус

| Workflow | Статус | Примечание |
|----------|--------|------------|
| ELO_In_Telegram_Bot | ✅ Active | Webhook telegram-in |
| ELO_Client_Resolve | ✅ Active | Tenant/Client resolver |
| BAT_Tenant_Resolver | ❌ Inactive | **Нужно исправить!** |
| ELO_In_WhatsApp | ✅ Active | |
| ELO_Out_Telegram_Bot | ✅ Active | |

---

## Ключевые файлы

| Файл | Описание |
|------|----------|
| `NEW/DOCS/NEW_Channel_Add.md` | Руководство по добавлению каналов |
| `123.md` | Текущие проблемы и решения |
| `Stop.md` | Что сделано |

---

## SSH

```bash
ssh root@155.212.221.189  # Messenger
ssh root@185.221.214.83   # n8n
```

---

*Последнее обновление: 2025-12-26*
