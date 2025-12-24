# Start Session - План на следующую сессию

## Приоритет 1: n8n доработки для Avito

### 1.1 Normalize Message
- [ ] Добавить `client_name: $json.sender_name || $json.sender_id`
- [ ] Проверить что `propertyName` не null для Cache Get Tenant

### 1.2 ELO_Client_Resolve
- [ ] Искать клиента: `WHERE external_id = sender_id AND channel_type = 'avito'`
- [ ] Если не найден → создать:
  - `name` = sender_name
  - `external_id` = sender_id
  - `channel_type` = 'avito'
- [ ] Вернуть `client_id`

---

## Приоритет 2: Авторизация других каналов

### 2.1 MAX - QR авторизация
- [ ] WebSocket endpoint для QR авторизации
- [ ] opcode 20 (QR_LOGIN) из MAX User API
- [ ] Android: QR код → сканирование → connected

### 2.2 Telegram Bot
- [ ] Endpoint для регистрации по токену (@BotFather)
- [ ] Android: ввод токена → getMe → сохранение

### 2.3 Telegram User (позже)
- [ ] SMS авторизация
- [ ] api_id/api_hash в .env сервера

---

## Текущий статус каналов

| Канал | Incoming | Outgoing | Авторизация |
|-------|----------|----------|-------------|
| Avito | ✅ Android WebView | ⏳ | ✅ WebView cookies |
| WhatsApp | ✅ Baileys | ✅ | ✅ QR код |
| MAX | ⏳ | ⏳ | ⏳ QR код |
| Telegram Bot | ⏳ | ⏳ | ⏳ Token |
| Telegram User | ⏳ | ⏳ | ⏳ SMS |

---

## Серверы

| Сервер | IP | Сервисы |
|--------|-----|---------|
| MessagerOne | 155.212.221.189 | WhatsApp (8769), MAX (8768), Telegram (8761, 8762) |
| n8n | 185.221.214.83 | n8n, PostgreSQL, Redis |
| Android | Mobile IP | Avito WebSocket (обход QRATOR) |

---

## Важно!

- **Avito работает только с мобильного IP** — VPN отключать!
- `sender_id` — уникальный идентификатор (для БД)
- `sender_name` — имя для отображения (может повторяться у разных клиентов)

---

## Полезные команды

```bash
# Проверка сервисов
ssh root@155.212.221.189 "docker ps --format 'table {{.Names}}\t{{.Status}}'"

# Логи WhatsApp
ssh root@155.212.221.189 "docker logs mcp-whatsapp-arceos --tail 20"

# PostgreSQL
ssh root@185.221.214.83 "docker exec supabase-db psql -U postgres -c 'SELECT * FROM elo_clients LIMIT 5;'"
```

---

## Файлы проекта

### Android Avito
- `app/src/main/java/com/eldoleado/app/channels/avito/AvitoWebViewClient.kt`
- `app/src/main/java/com/eldoleado/app/channels/setup/AvitoSetupActivity.kt`

### Документация
- `123.md` — подробный отчёт по реализации
- `CLAUDE.md` — основной контекст проекта

---

*Последнее обновление: 2025-12-24*
