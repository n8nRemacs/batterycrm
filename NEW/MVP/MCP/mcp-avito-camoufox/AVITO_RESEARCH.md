# Avito API Research

> Исследование возможностей доступа к Avito
> Обновлено: 2025-12-25

---

## 0. СРАВНЕНИЕ: Official API vs Camoufox

### Функции мессенджера

| Функция | Official API | Camoufox | Примечание |
|---------|:------------:|:--------:|------------|
| **Получение чатов** | ✅ | ✅ | Official: API, Camoufox: DOM |
| **Фильтр u2i/u2u** | ✅ | ❌ | u2i=по объявлению, u2u=между users |
| **Фильтр по item_id** | ✅ | ❌ | Чаты по конкретному объявлению |
| **Только непрочитанные** | ✅ | ❌ | `unread_only=true` |
| **Получение сообщений** | ✅ | ❌ | API 403, DOM не тестировали |
| **Отправка текста** | ✅ | ⚠️ | Camoufox: через automation |
| **Отправка изображений** | ✅ | ⚠️ | Требует upload + send |
| **Удаление сообщений** | ✅ | ❌ | Только в течение 1 часа |
| **Прочитать чат** | ✅ | ❌ | Пометить прочитанным |
| **Голосовые сообщения** | ✅ | ❌ | Получение файла по voice_id |
| **Загрузка изображений** | ✅ | ❌ | JPEG/HEIC/GIF/BMP/PNG до 24MB |
| **Webhook (real-time)** | ✅ | ❌ | WebSocket закрывается |
| **Blacklist** | ✅ | ❌ | Блокировка пользователя |

### Мульти-аккаунт

| Аспект | Official API | Camoufox |
|--------|:------------:|:--------:|
| **Кол-во аккаунтов** | 1 (OAuth) | 20+ |
| **Регистрация** | Avito Pro | Не нужна |
| **API ключи** | Обязательно | Не нужно |
| **Fingerprint изоляция** | N/A | ✅ |
| **IP ротация** | N/A | ✅ |

### Надёжность

| Аспект | Official API | Camoufox |
|--------|:------------:|:--------:|
| **Стабильность** | Высокая | Средняя |
| **Риск блокировки** | Низкий | Высокий |
| **Rate limits** | Строгие | Нет (осторожно) |
| **Поддержка** | Есть | Нет |
| **SLA** | Да | Нет |

### Вывод

**Используй Official API если:**
- Нужен 1 аккаунт
- Нужен webhook для real-time
- Важна стабильность
- Есть Avito Pro

**Используй Camoufox если:**
- Нужно много аккаунтов
- Нет Avito Pro
- Готов к нестабильности
- Нужны возможности "как покупатель"

---

## 1. Официальный Avito Messenger API

**Документация:** https://developers.avito.ru/api-catalog/messenger/documentation
**Base URL:** `https://api.avito.ru/`

### 1.1 Авторизация

```
OAuth 2.0
- client_credentials (свой аккаунт)
- authorization_code (сторонние приложения)

Token URL: https://api.avito.ru/token
Authorization URL: https://avito.ru/oauth

Scopes:
- messenger:read   - чтение сообщений
- messenger:write  - отправка/удаление сообщений
```

### 1.2 Все эндпоинты Messenger API

| Метод | Endpoint | Описание |
|-------|----------|----------|
| GET | `/messenger/v2/accounts/{user_id}/chats` | Список чатов |
| GET | `/messenger/v2/accounts/{user_id}/chats/{chat_id}` | Информация о чате |
| GET | `/messenger/v3/accounts/{user_id}/chats/{chat_id}/messages/` | Список сообщений |
| POST | `/messenger/v1/accounts/{user_id}/chats/{chat_id}/messages` | Отправить текст |
| POST | `/messenger/v1/accounts/{user_id}/chats/{chat_id}/messages/image` | Отправить изображение |
| POST | `/messenger/v1/accounts/{user_id}/chats/{chat_id}/messages/{message_id}` | Удалить сообщение |
| POST | `/messenger/v1/accounts/{user_id}/chats/{chat_id}/read` | Прочитать чат |
| POST | `/messenger/v1/accounts/{user_id}/uploadImages` | Загрузить изображение |
| GET | `/messenger/v1/accounts/{user_id}/getVoiceFiles` | Получить голосовые |
| POST | `/messenger/v2/accounts/{user_id}/blacklist` | Добавить в blacklist |
| POST | `/messenger/v3/webhook` | Включить webhook |
| POST | `/messenger/v1/webhook/unsubscribe` | Отключить webhook |
| POST | `/messenger/v1/subscriptions` | Список подписок |

### 1.3 Параметры запросов

| Параметр | Описание | Значения |
|----------|----------|----------|
| `chat_types` | Тип чата | `u2i` (по объявлению), `u2u` (между users) |
| `item_ids` | Фильтр по объявлениям | `12345,6789` |
| `unread_only` | Только непрочитанные | `true/false` |
| `limit` | Количество | 1-100 (default: 100) |
| `offset` | Смещение | 0-1000 |

### 1.4 Типы сообщений

| Тип | Описание |
|-----|----------|
| `text` | Текст |
| `image` | Изображение |
| `link` | Ссылка с превью |
| `item` | Карточка объявления |
| `location` | Геолокация |
| `call` | Звонок |
| `voice` | Голосовое |
| `system` | Системное |
| `deleted` | Удалённое |

### 1.5 Webhook формат

```json
{
  "id": "abc",
  "timestamp": 123,
  "version": "v1.1",
  "payload": {
    "type": "message",
    "value": {
      "id": "msg_id",
      "chat_id": "chat_id",
      "chat_type": "u2i",
      "item_id": 123,
      "author_id": 123,
      "user_id": 456,
      "type": "text",
      "content": {"text": "Привет!"},
      "created": 123,
      "published_at": "2025-01-01T12:00:00Z"
    }
  }
}
```

### 1.6 Ограничения

| Ограничение | Значение |
|-------------|----------|
| Rate limit | X-RateLimit-Limit в заголовке |
| Текст сообщения | max 1000 символов |
| Размер изображения | max 24 MB |
| Разрешение изображения | max 75 Mpx |
| Удаление сообщения | в течение 1 часа |
| Голосовые ссылки | действительны 1 час |
| Webhook timeout | 2 секунды |

### 1.7 Требования

- Avito Pro аккаунт
- client_id + client_secret
- Регистрация приложения

---

## 2. Camoufox (Browser Automation)

### 2.1 Что даёт Camoufox сверх Official API

| Возможность | Статус | Описание |
|-------------|--------|----------|
| Множество аккаунтов | ✅ Работает | 20+ аккаунтов с изолированными fingerprint |
| Логин без API-ключей | ✅ Работает | Телефон + пароль + SMS |
| Сохранение сессий | ✅ Работает | Куки сохраняются на диск |
| Просмотр чатов | ✅ Работает | Через DOM парсинг |
| Просмотр "как покупатель" | ✅ Работает | Полный доступ к сайту |
| Отправка сообщений | ⚠️ Не тестировано | Через browser automation |
| WebSocket real-time | ❌ Не работает | Avito закрывает соединение |
| Internal API | ❌ Не работает | 403 "Неизвестный ключ" |

### 2.2 Технические детали

#### Fingerprint изоляция
```
/data/avito-camoufox/{account_id}/
  ├── fingerprint.json    # Уникальный отпечаток браузера
  ├── profile/            # Firefox профиль с cookies
  └── state.json          # Состояние сессии
```

#### IP ротация
- Сервер: 155.212.221.189 (заблокирован Avito)
- Рабочий IP: 217.114.14.17 (через iptables SNAT)
```bash
iptables -t nat -I POSTROUTING 1 -s 172.20.0.2 -j SNAT --to-source 217.114.14.17
```

---

## 3. Найденные внутренние API

### 3.1 Messenger API (через browser fetch)

```javascript
// Работает только с cookies браузера
// НЕ работает при прямом вызове (403)

GET  /api/1/profile/short           // Профиль (403)
POST /web/1/messenger/getChannels   // Чаты (403)
POST /web/1/messenger/getUserVisibleMessages  // Сообщения (403)
POST /web/1/messenger/postMessage   // Отправка (403)
```

**Причина 403:** API требует специальные заголовки:
- `X-Avito-Session`
- CSRF токен
- Возможно проверка TLS fingerprint

### 3.2 WebSocket

```
wss://socket.avito.ru/?use_seq=true&seq=0&id_version=v2&my_hash_id={USER_ID}&app_name=web&app_version=7.456.1
```

**Статус:** Подключается, но сразу закрывается
**Возможные причины:**
- Проверка origin/referer
- Проверка cookies
- Rate limiting
- Требуется предварительная авторизация через HTTP

### 3.3 Fallback механизм

```
https://www.avito.ru/web/1/socket/fallback
```

Avito использует HTTP fallback вместо WebSocket. Требует исследования.

---

## 4. Паттерны URL

### 4.1 Messenger channel IDs

```
/profile/messenger/channel/a2u-{MY_USER_ID}-{OTHER_USER_ID}
/profile/messenger/channel/u2i-{BASE64_ID}
```

- `a2u` = account to user (между пользователями)
- `u2i` = user to item (по объявлению)
- Первое число в `a2u-XXX-YYY` = ID текущего пользователя

### 4.2 User ID извлечение

```javascript
// Найден в ссылках мессенджера
const match = href.match(/a2u-(\d+)-/);
// Результат: 191717891
```

### 4.3 Public profile

```
/user/{PUBLIC_HASH_ID}
```

Public ID отличается от numeric ID. Пока не удалось извлечь.

---

## 5. Рабочие endpoints (mcp-avito-camoufox)

### 5.1 Авторизация

| Endpoint | Метод | Описание |
|----------|-------|----------|
| `/account/{id}/create` | POST | Создать сессию |
| `/account/{id}/login` | POST | Логин (телефон + пароль) |
| `/account/{id}/sms` | POST | Ввести SMS код |
| `/account/{id}/request-sms` | POST | Запросить SMS вместо push |
| `/account/{id}/start` | POST | Запустить браузер для сохранённой сессии |

### 5.2 Навигация

| Endpoint | Метод | Описание |
|----------|-------|----------|
| `/account/{id}/messenger` | POST | Перейти в мессенджер, получить чаты из DOM |
| `/account/{id}/page` | GET | Получить содержимое страницы |
| `/account/{id}/goto-profile` | POST | Перейти в профиль |

### 5.3 Отладка

| Endpoint | Метод | Описание |
|----------|-------|----------|
| `/account/{id}/extract-hash-id` | POST | Извлечь hash_id из страницы |
| `/account/{id}/debug-scripts` | GET | Показать скрипты с user ID |
| `/account/{id}/debug-links` | GET | Показать ссылки с user ID |
| `/account/{id}/debug-ws` | GET | Проверить WebSocket на странице |
| `/account/{id}/cookies` | GET | Показать cookies |

### 5.4 Мониторинг

| Endpoint | Метод | Описание |
|----------|-------|----------|
| `/account/{id}/status` | GET | Статус аккаунта |
| `/account/{id}/health` | GET | Здоровье сессии |
| `/health` | GET | Здоровье сервиса |
| `/accounts` | GET | Список всех аккаунтов |

---

## 6. TODO / Требует исследования

### 6.1 Высокий приоритет

- [ ] Понять как Avito авторизует WebSocket
- [ ] Исследовать `/web/1/socket/fallback`
- [ ] Найти способ получить CSRF токен для API
- [ ] Реализовать polling для новых сообщений

### 6.2 Средний приоритет

- [ ] Извлечение public_id для WebSocket
- [ ] Перехват Avito's собственного WebSocket
- [ ] MutationObserver для отслеживания новых сообщений в DOM

### 6.3 Низкий приоритет

- [ ] Автоматический ответ на сообщения
- [ ] Интеграция с n8n webhook
- [ ] Статистика по чатам

---

## 7. Cookies (важные)

| Cookie | Описание | Срок |
|--------|----------|------|
| `sessid` | ID сессии | ~1 год |
| `auth` | Токен авторизации | ~1 год |
| `rt` | Refresh token | ~1 год |
| `f` | ? | ~2 недели |
| `ft` | ? | ~2 недели |
| `u` | User ID? | ~1 год |

---

## 8. Известные проблемы

### 8.1 IP блокировка

**Симптом:** Страница с CAPTCHA "Доступ ограничен"
**Решение:** Использовать другой IP через iptables SNAT

### 8.2 Mobile URL не работает

**Симптом:** m.avito.ru показывает "Страница не найдена"
**Решение:** Использовать www.avito.ru

### 8.3 Session не активна после рестарта

**Симптом:** Channel не в dict после перезапуска контейнера
**Решение:** Вызвать `/account/{id}/start` для восстановления

---

## 9. Архитектура сервиса

```
┌─────────────────────────────────────────────────────────────┐
│                    Android App                               │
│  AvitoCamoufoxSetupActivity.kt                              │
└─────────────────────┬───────────────────────────────────────┘
                      │ HTTP API
                      ▼
┌─────────────────────────────────────────────────────────────┐
│              mcp-avito-camoufox (FastAPI)                   │
│                    Port 8793                                 │
├─────────────────────────────────────────────────────────────┤
│  server.py          │ REST API endpoints                    │
│  avito_channel.py   │ Browser automation, DOM parsing       │
│  session_manager.py │ Session persistence                   │
│  session_keeper.py  │ Health monitoring (не используется)   │
└─────────────────────┬───────────────────────────────────────┘
                      │ Playwright
                      ▼
┌─────────────────────────────────────────────────────────────┐
│                    Camoufox Browser                          │
│  - Уникальный fingerprint на аккаунт                        │
│  - Cookies сохраняются в /data/avito-camoufox/              │
│  - Headless режим                                           │
└─────────────────────────────────────────────────────────────┘
```

---

## 10. Сравнение подходов

| Критерий | Official API | Camoufox |
|----------|--------------|----------|
| Регистрация | Avito Pro | Не нужна |
| Мульти-аккаунт | 1 аккаунт | 20+ аккаунтов |
| Rate limits | Строгие | Нет (осторожно) |
| Надёжность | Высокая | Средняя (может сломаться) |
| Real-time | Webhook (платно!) | Не работает |
| Сложность | Простая | Высокая |
| Риски | Нет | Блокировка аккаунта |

---

## 11. Webhook — Требует платную подписку!

**Важное открытие (2025-12-25):**

- `POST /messenger/v3/webhook` — создаёт подписку ✅ (бесплатно)
- Но Avito **НЕ отправляет** webhooks без платной подписки ❌

### Проверено:

1. Подписка создана успешно (`{"ok": true}`)
2. Подписка видна в `/messenger/v1/subscriptions`
3. Сообщения приходят (видны в `GET /chats`)
4. Webhook на n8n **не приходит**

### Вывод:

Для real-time уведомлений нужна **платная подписка Avito API**.

---

## 12. Решение — Polling

Вместо webhook используем polling:

```
Каждые 15 секунд:
  GET /messenger/v2/.../chats?unread_only=true
    ↓
  Если есть новые (direction=in, read=null)
    ↓
  Обработать last_message
```

### Преимущества:

- ✅ Работает бесплатно
- ✅ Получаем текст сообщения
- ✅ 4 запроса в минуту — безопасно

### Недостатки:

- ⚠️ Задержка до 15 секунд
- ⚠️ Нет полной истории (только last_message)

### n8n Workflow:

```
NEW/MVP/MCP/mcp-avito-camoufox/n8n-avito-polling.json
```

---

## 13. Credentials

### n8n-1 (production)
```
Client_id: MS0TjX2bwNcLapoX7YCc
Client_secret: QrhNXcvAzZexWOaFE99kMiRPDSE1hTZwkUYX4RFN
User ID: 157920214 (РемАкс)
Webhook URL: https://n8n.n8nsrv.ru/webhook/avito
```

### Camoufox
```
Phone: 79171708077
Password: Mi31415926pS
```

---

*Документ обновлён: 2025-12-25*
