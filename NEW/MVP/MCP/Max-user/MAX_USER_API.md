# MAX User API — Полное описание

## Обзор

MAX (ранее TamTam, ICQ) использует **WebSocket API** для мобильных и веб-клиентов. В отличие от Bot API (REST), User API работает через постоянное WebSocket-соединение с бинарным JSON-протоколом.

```
┌─────────────┐     WebSocket      ┌──────────────────────┐
│   Client    │◄──────────────────►│  ws-api.oneme.ru     │
│  (vkmax)    │   JSON packets     │  (MAX backend)       │
└─────────────┘                    └──────────────────────┘
```

---

## Подключение

**WebSocket URL:** `wss://ws-api.oneme.ru/websocket`

**Headers:**
```
Origin: https://web.max.ru
User-Agent: Mozilla/5.0 ...
```

---

## Структура пакета

Каждый пакет — JSON с 5 полями:

```json
{
  "ver": 11,        // Версия протокола (всегда 11)
  "cmd": 0,         // 0 = запрос, 1 = ответ
  "seq": 1,         // Порядковый номер (для матчинга request-response)
  "opcode": 64,     // ID метода (см. таблицу ниже)
  "payload": {}     // Данные метода
}
```

**Принцип работы:**
1. Клиент отправляет пакет с `cmd=0` и уникальным `seq`
2. Сервер отвечает пакетом с `cmd=1` и тем же `seq`
3. События (новые сообщения и т.д.) приходят с `cmd=1` без запроса

---

## Авторизация

### Схема авторизации

```
┌────────┐  1. Hello (opcode 6)     ┌────────┐
│        │─────────────────────────►│        │
│        │  2. Start Auth (17)      │        │
│ Client │─────────────────────────►│ Server │
│        │  3. SMS Code (18)        │        │
│        │─────────────────────────►│        │
│        │  4. Login Token ◄────────│        │
└────────┘                          └────────┘
```

### Шаг 1: Hello (opcode 6)

```json
{
  "ver": 11, "cmd": 0, "seq": 1, "opcode": 6,
  "payload": {
    "userAgent": {
      "deviceType": "WEB",
      "locale": "ru_RU",
      "osVersion": "Windows",
      "deviceName": "My Client",
      "appVersion": "25.11.2",
      "screen": "1920x1080",
      "timezone": "Europe/Moscow"
    },
    "deviceId": "uuid-v4-string"
  }
}
```

### Шаг 2: Запрос SMS (opcode 17)

```json
{
  "ver": 11, "cmd": 0, "seq": 2, "opcode": 17,
  "payload": {
    "phone": "+79001234567",
    "type": "START_AUTH",
    "language": "ru"
  }
}
```

**Ответ:** `payload.token` — токен для подтверждения SMS

### Шаг 3: Подтверждение SMS (opcode 18)

```json
{
  "ver": 11, "cmd": 0, "seq": 3, "opcode": 18,
  "payload": {
    "token": "sms_token_from_step_2",
    "verifyCode": "123456",
    "authTokenType": "CHECK_CODE"
  }
}
```

**Ответ:**
- `payload.profile` — данные профиля
- `payload.tokenAttrs.LOGIN.token` — токен для повторного входа

### Шаг 4 (опционально): 2FA (opcode 18)

Если включена двухфакторка:
```json
{
  "payload": {
    "token": "sms_token",
    "password": "2fa_password",
    "authTokenType": "CHECK_PASSWORD"
  }
}
```

### Повторный вход по токену (opcode 19)

```json
{
  "ver": 11, "cmd": 0, "seq": 1, "opcode": 19,
  "payload": {
    "interactive": true,
    "token": "saved_login_token",
    "chatsSync": 0,
    "contactsSync": 0,
    "chatsCount": 40
  }
}
```

---

## Keepalive

Каждые **30 секунд** отправлять:

```json
{"ver": 11, "cmd": 0, "seq": N, "opcode": 1, "payload": {"interactive": false}}
```

Иначе соединение закроется.

---

## Все Opcodes

### Авторизация (1-25)

| Opcode | Метод | Описание |
|--------|-------|----------|
| 1 | KEEPALIVE | Пинг для поддержания соединения |
| 6 | HELLO | Инициализация устройства |
| 16 | CHANGE_PROFILE | Изменение имени/био |
| 17 | START_AUTH | Запрос SMS кода |
| 18 | VERIFY_CODE | Подтверждение SMS / 2FA |
| 19 | LOGIN_BY_TOKEN | Вход по сохранённому токену |
| 20 | QR_LOGIN | Вход по QR-коду |
| 21 | QR_CONFIRM | Подтверждение QR входа |
| 22 | SETTINGS | Настройки профиля/чатов |
| 23 | 2FA_MANAGE | Управление двухфакторкой |
| 24 | SESSIONS | Управление сессиями |

### Контакты и пользователи (32-40)

| Opcode | Метод | Описание |
|--------|-------|----------|
| 32 | GET_CONTACTS | Получить инфо о пользователях |
| 34 | CONTACT_ACTION | Добавить/заблокировать контакт |
| 35 | PRESENCE_SUBSCRIBE | Подписка на онлайн-статус |
| 36 | SET_PRESENCE | Установить свой статус |

### Чаты (48-60)

| Opcode | Метод | Описание |
|--------|-------|----------|
| 48 | GET_CHATS | Получить список чатов |
| 49 | GET_CHAT | Получить чат + историю сообщений |
| 50 | READ_MESSAGE | Прочитать / отметить непрочитанным |
| 51 | SET_TYPING | Индикатор печати |
| 52 | GET_TYPING | Кто сейчас печатает |
| 55 | CHAT_SETTINGS | Настройки чата (пин, название) |
| 56 | GET_INVITE_LINK | Получить ссылку-приглашение |
| 57 | JOIN_BY_LINK | Вступить по ссылке |
| 59 | GET_MEMBERS | Участники чата |

### Сообщения (64-70)

| Opcode | Метод | Описание |
|--------|-------|----------|
| 64 | SEND_MESSAGE | Отправить сообщение |
| 65 | UPLOAD_START | Начало загрузки файла |
| 66 | DELETE_MESSAGE | Удалить сообщение |
| 67 | EDIT_MESSAGE | Редактировать сообщение |

### Участники групп (75-80)

| Opcode | Метод | Описание |
|--------|-------|----------|
| 75 | LEAVE_CHAT | Покинуть чат |
| 77 | MANAGE_MEMBERS | Добавить/удалить/админ |

### Загрузка файлов (80-90)

| Opcode | Метод | Описание |
|--------|-------|----------|
| 80 | PHOTO_UPLOAD_URL | URL для загрузки фото |
| 82 | VIDEO_UPLOAD_URL | URL для загрузки видео |
| 83 | VIDEO_DOWNLOAD_URL | URL для скачивания видео |
| 84 | VOICE_UPLOAD_URL | URL для загрузки голосового |
| 85 | VOICE_DOWNLOAD_URL | URL для скачивания голосового |
| 87 | FILE_UPLOAD_URL | URL для загрузки файла |
| 88 | FILE_DOWNLOAD_URL | URL для скачивания файла |
| 89 | RESOLVE_LINK | Резолв ссылки на чат/канал |
| 90 | SEARCH | Поиск сообщений |

### События (128+)

| Opcode | Метод | Описание |
|--------|-------|----------|
| 128 | NEW_MESSAGE | Новое сообщение (входящее) |
| 129 | PRESENCE_UPDATE | Изменение онлайн-статуса |
| 136 | UPLOAD_COMPLETE | Загрузка файла завершена |
| 178 | REACTION | Реакция на сообщение |
| 181 | GET_REACTIONS | Получить реакции |

---

## Форматы данных

### Отправка сообщения (opcode 64)

```json
{
  "chatId": 123456789,
  "message": {
    "text": "Привет!",
    "cid": 1750000000000,  // Client ID - случайное число
    "elements": [],
    "attaches": []
  },
  "notify": true
}
```

### Типы вложений (attaches)

**Фото:**
```json
{"_type": "PHOTO", "photoToken": "token_from_upload"}
```

**Видео:**
```json
{"_type": "VIDEO", "videoId": 12345, "token": "token"}
```

**Файл:**
```json
{"_type": "FILE", "fileId": 12345}
```

**Голосовое:**
```json
{"_type": "VOICE", "voiceId": 12345, "duration": 5000}
```

**Стикер:**
```json
{"_type": "STICKER", "stickerId": 598965}
```

**Геолокация:**
```json
{"_type": "LOCATION", "lat": 55.7558, "lon": 37.6173}
```

**Контакт:**
```json
{"_type": "CONTACT", "contactId": 123456}
```

**Опрос:**
```json
{
  "_type": "POLL",
  "question": "Как дела?",
  "options": [{"text": "Хорошо"}, {"text": "Отлично"}],
  "anonymous": false,
  "multipleChoice": false
}
```

### Ответ на сообщение

```json
{
  "message": {
    "text": "Ответ",
    "link": {
      "type": "REPLY",
      "messageId": "original_message_id"
    }
  }
}
```

### Пересылка

```json
{
  "message": {
    "text": "",
    "link": {
      "type": "FORWARD",
      "chatId": 123,
      "messageIds": ["msg1", "msg2"]
    }
  }
}
```

### Создание группы

```json
{
  "message": {
    "cid": 175xxx,
    "attaches": [{
      "_type": "CONTROL",
      "event": "new",
      "chatType": "CHAT",  // или "CHANNEL"
      "title": "Название группы",
      "userIds": [123, 456]
    }]
  }
}
```

---

## Загрузка файлов

### Схема загрузки

```
1. Запрос URL (opcode 80/82/84/87)
   └── Ответ: upload_url

2. POST файла на upload_url
   └── Ответ: token/id

3. Отправка сообщения с attach
   └── opcode 64 + attaches
```

### Пример загрузки фото

```python
# 1. Получить URL
resp = await client.invoke_method(opcode=80, payload={"count": 1})
upload_url = resp["payload"]["url"]

# 2. Загрузить файл
async with aiohttp.ClientSession() as session:
    data = aiohttp.FormData()
    data.add_field('file', file_bytes, filename='photo.jpg')
    await session.post(upload_url, data=data)

# 3. Отправить сообщение
token = resp_json["photos"]["0"]["token"]
await send_message(client, chat_id, "", attaches=[{
    "_type": "PHOTO",
    "photoToken": token
}])
```

---

## События (Incoming)

События приходят с `cmd=1` без запроса. Обработка через callback:

```python
async def on_event(client, packet):
    opcode = packet.get("opcode")
    payload = packet.get("payload", {})

    if opcode == 128:  # Новое сообщение
        chat_id = payload["chatId"]
        text = payload["message"]["text"]
        print(f"Новое сообщение в {chat_id}: {text}")

    elif opcode == 129:  # Онлайн-статус
        user_id = payload["userId"]
        status = payload["presence"]
        print(f"Пользователь {user_id} теперь {status}")

client.set_callback(on_event)
```

---

## Сравнение с Bot API

| Аспект | Bot API | User API |
|--------|---------|----------|
| Протокол | REST HTTP | WebSocket |
| URL | platform-api.max.ru | ws-api.oneme.ru |
| Авторизация | access_token (бот) | Телефон + SMS |
| Real-time | Long polling / Webhook | WebSocket push |
| Возможности | Ограничены | Полные |
| Создание групп | Нет | Да |
| Звонки | Нет | Да (отдельный протокол) |
| 2FA | Нет | Да |

---

## Ограничения и лимиты

- **Keepalive:** каждые 30 сек
- **Макс. размер сообщения:** ~4000 символов
- **Макс. файл:** 4 GB
- **Макс. участников группы:** 10000
- **Rate limits:** не документированы, но есть

---

## Безопасность

- Все соединения через WSS (TLS)
- Токены имеют срок жизни
- 2FA опционально
- Сессии можно завершать удалённо

---

## Библиотека vkmax

Расширенная версия: `vkmax-reference/`

```python
from vkmax import MaxClient
from vkmax.functions import (
    send_message, get_chat_history, send_voice,
    get_user_presence, verify_2fa_password
)

client = MaxClient()
await client.connect()
await client.login_by_token(token, device_id)

# Отправить сообщение
await send_message(client, chat_id=123, text="Привет!")

# История
history = await get_chat_history(client, chat_id=123, count=50)

# Голосовое
await send_voice(client, chat_id=123, voice_path="audio.ogg")
```

---

## Ссылки

- [vkmax GitHub](https://github.com/nsdkinx/vkmax)
- [MAX Bot API](https://dev.max.ru/docs-api)
- [Web-клиент](https://web.max.ru)
