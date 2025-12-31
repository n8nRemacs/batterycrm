# ТЗ: Unified MCP IN/OUT Architecture

**Дата:** 2025-12-31
**Статус:** Draft

---

## 1. Общее ТЗ для всех MCP

### 1.1 Архитектура

Каждый MCP-сервер — автономный модуль, включающий:

```
┌─────────────────────────────────────────────────────────────┐
│                    MCP-{channel}                            │
│                                                             │
│  ┌─────────────┐  ┌─────────────┐  ┌─────────────────────┐ │
│  │   IN Layer  │  │   Batcher   │  │     OUT Layer       │ │
│  │  (webhook)  │──▶│  (10-40s)  │  │  (BLPOP + send)     │ │
│  └─────────────┘  └──────┬──────┘  └──────────▲──────────┘ │
│                          │                     │            │
│                          ▼                     │            │
│                   queue:ready            queue:outgoing     │
└─────────────────────────────────────────────────────────────┘
```

### 1.2 Общие компоненты

| Компонент | Описание |
|-----------|----------|
| **Channel Adapter** | Работа с API канала (Baileys, MTProto, etc.) |
| **Normalizer** | Преобразование в единый формат |
| **Batcher** | Event-driven батчинг (setTimeout, не cron) |
| **Outbound Worker** | BLPOP из очереди + отправка |
| **Session Manager** | Управление сессиями |
| **Health Monitor** | Метрики, алерты |

### 1.3 Конфигурация (ENV)

```bash
# Общие для всех MCP
PORT=8766
HOST=0.0.0.0
REDIS_URL=redis://localhost:6379
DATABASE_URL=postgresql://user:pass@host:port/db
IP_NODE_ID=1

# Батчинг
BATCH_DEBOUNCE_MS=10000      # 10 сек тишины
BATCH_MAX_WAIT_MS=40000      # 40 сек максимум

# Алерты
ALERT_TELEGRAM_BOT_TOKEN=xxx
ALERT_TELEGRAM_CHAT_ID=xxx

# Опционально
API_KEY=xxx                  # Для защиты API
```

---

## 2. Unified Data Contracts

### 2.1 IN Packet (MCP → Core)

```typescript
interface MCPIncomingPacket {
  // ===== МУЛЬТИ-ТЕНАНТ =====
  tenant_id: string;              // UUID тенанта (из channel_account)

  // ===== МУЛЬТИ-ДОМЕН / МУЛЬТИ-ВЕРТИКАЛЬ =====
  domain_id: number | null;       // ID домена (tech=1, auto=2...)
  domain_code: string | null;     // "tech", "auto", "medicine"
  vertical_id: number | null;     // ID вертикали
  vertical_code: string | null;   // "phone_repair", "car_service"

  // ===== ОМНИКАНАЛЬНОСТЬ =====
  channel_id: number;             // ID канала (1=telegram_bot, 2=whatsapp...)
  channel_code: string;           // "whatsapp", "telegram_bot", "telegram_user"
  channel_account_id: string;     // UUID аккаунта канала

  // ===== ВНЕШНИЕ ИДЕНТИФИКАТОРЫ =====
  external_user_id: string;       // ID пользователя в канале
  external_chat_id: string;       // ID чата в канале
  external_message_ids: string[]; // ID сообщений (массив для батча)

  // ===== КЛИЕНТ (предзаполнение) =====
  client: {
    phone: string | null;         // Телефон (если есть)
    name: string | null;          // Имя (если есть)
    email: string | null;         // Email (если есть)
    username: string | null;      // Username в канале (@username)
  };

  // ===== КОНТЕНТ =====
  text: string;                   // Текст (объединённый для батча)

  media: {
    has_voice: boolean;
    voice_url: string | null;           // URL голосового
    voice_transcribed_text: string | null;

    has_images: boolean;
    images: Array<{
      url: string;
      thumbnail_url?: string;
      width?: number;
      height?: number;
      caption?: string;
    }>;

    has_video: boolean;
    videos: Array<{
      url: string;
      thumbnail_url?: string;
      duration?: number;
      caption?: string;
    }>;

    has_documents: boolean;
    documents: Array<{
      url: string;
      filename: string;
      mime_type?: string;
      size?: number;
    }>;

    has_sticker: boolean;
    sticker_url: string | null;

    has_location: boolean;
    location: {
      latitude: number;
      longitude: number;
      title?: string;
      address?: string;
    } | null;

    has_contact: boolean;
    contact: {
      phone: string;
      name: string;
      vcard?: string;
    } | null;
  };

  // ===== ВРЕМЯ =====
  timestamp: string;              // ISO datetime (последнего сообщения)

  // ===== БАТЧ МЕТАДАННЫЕ =====
  batch: {
    is_batched: boolean;          // true если несколько сообщений
    message_count: number;        // количество сообщений
    first_timestamp: string;      // время первого сообщения
    last_timestamp: string;       // время последнего
  };

  // ===== ТРЕЙСИНГ =====
  trace_id: string;               // UUID для сквозного трейсинга

  // ===== МЕТА =====
  meta: {
    provider: string;             // "baileys", "gramjs", "mtproto", "bot_api"
    ip_node_id: number | null;    // ID ноды MCP сервера
    session_id: string;           // ID сессии в канале
    is_group: boolean;            // Это групповой чат?
    group_id: string | null;      // ID группы (если is_group)
    reply_to_message_id: string | null;  // ID сообщения, на которое ответили
    forward_from: string | null;  // Переслано от кого
  };
}
```

### 2.2 OUT Packet (Core → MCP)

```typescript
interface MCPOutgoingPacket {
  // ===== ИДЕНТИФИКАЦИЯ =====
  tenant_id: string;              // UUID тенанта
  channel_account_id: string;     // UUID аккаунта (какой сессией отправлять)
  channel_code: string;           // "whatsapp", "telegram_bot"...

  // ===== АДРЕСАТ =====
  external_chat_id: string;       // Куда отправлять

  // ===== ССЫЛКИ В СИСТЕМЕ =====
  dialog_id: string;              // UUID диалога
  client_id: string;              // UUID клиента
  message_id: string;             // UUID сообщения в нашей БД

  // ===== ОТПРАВИТЕЛЬ =====
  actor: {
    type: "operator" | "ai" | "system";
    id: string | null;            // UUID оператора/AI
    name: string | null;          // Имя (для логов)
  };

  // ===== КОНТЕНТ =====
  content: {
    type: "text" | "image" | "video" | "audio" | "document" |
          "sticker" | "location" | "contact";

    // Для text
    text?: string;

    // Для media (image, video, audio, document, sticker)
    media_url?: string;           // URL для скачивания
    media_base64?: string;        // Или base64
    mime_type?: string;
    filename?: string;
    caption?: string;

    // Для location
    latitude?: number;
    longitude?: number;
    location_title?: string;
    location_address?: string;

    // Для contact
    contact_phone?: string;
    contact_name?: string;
    contact_vcard?: string;
  };

  // ===== ОПЦИИ =====
  options: {
    reply_to_message_id?: string; // Ответить на сообщение

    // Кнопки (если канал поддерживает)
    buttons?: Array<{
      type: "reply" | "url" | "callback";
      text: string;
      url?: string;
      callback_data?: string;
    }>;

    // Форматирование
    parse_mode?: "markdown" | "html" | "plain";

    // Уведомления
    disable_notification?: boolean;

    // Preview
    disable_link_preview?: boolean;
  };

  // ===== МЕТА =====
  trace_id: string;               // UUID для трейсинга
  priority: "low" | "normal" | "high";
  created_at: string;             // Когда создано в Core
}
```

### 2.3 Redis Queues

| Queue | Direction | Format |
|-------|-----------|--------|
| `queue:ready` | MCP → Core | MCPIncomingPacket (JSON) |
| `queue:outgoing:{channel_code}` | Core → MCP | MCPOutgoingPacket (JSON) |

**Примеры очередей outgoing:**
- `queue:outgoing:whatsapp`
- `queue:outgoing:telegram_bot`
- `queue:outgoing:telegram_user`
- `queue:outgoing:avito`

### 2.4 Резолв tenant/domain/vertical

При получении сообщения MCP делает один запрос:

```sql
SELECT
  ca.tenant_id,
  ca.id as channel_account_id,
  ca.channel_id,
  c.code as channel_code,
  ca.session_id,
  v.id as vertical_id,
  v.code as vertical_code,
  d.id as domain_id,
  d.code as domain_code
FROM elo_t_channel_accounts ca
JOIN elo_channels c ON ca.channel_id = c.id
LEFT JOIN elo_verticals v ON ca.vertical_id = v.id
LEFT JOIN elo_domains d ON v.domain_id = d.id
WHERE ca.session_id = $1
  AND ca.is_active = true;
```

---

## 3. MCP WhatsApp (Baileys)

### 3.1 Специфика канала

| Параметр | Значение |
|----------|----------|
| Порт | 8766 |
| Библиотека | @whiskeysockets/baileys |
| Provider | `baileys` |
| channel_id | 2 |
| channel_code | `whatsapp` |
| Формат chat_id | `{phone}@s.whatsapp.net` |
| Формат group_id | `{id}@g.us` |
| Max message length | 4096 |
| Поддержка медиа | Все типы |

### 3.2 Входящие события (Baileys → Normalizer)

```typescript
// Сырое событие от Baileys
interface BaileysIncomingEvent {
  event: "message" | "call" | "presence" | "receipt";
  sessionId: string;
  sessionHash: string;
  timestamp: number;
  data: {
    messageId: string;
    from: string;              // "79991234567"
    fromName: string | null;
    to: string;
    isGroup: boolean;
    groupId?: string;
    timestamp: number;
    type: "text" | "image" | "video" | "audio" | "document" |
          "sticker" | "location" | "contact";
    text?: string;
    caption?: string;
    media?: {
      url: string;
      mimetype: string;
      filesize?: number;
    };
    quotedMessageId?: string;
    mentions?: string[];
  };
}
```

### 3.3 Нормализация WhatsApp

```typescript
function normalizeWhatsApp(event: BaileysIncomingEvent, account: ChannelAccount): MCPIncomingPacket {
  const data = event.data;
  const phone = '+' + data.from;

  return {
    tenant_id: account.tenant_id,
    domain_id: account.domain_id,
    domain_code: account.domain_code,
    vertical_id: account.vertical_id,
    vertical_code: account.vertical_code,

    channel_id: 2,
    channel_code: 'whatsapp',
    channel_account_id: account.id,

    external_user_id: data.from,
    external_chat_id: data.from + '@s.whatsapp.net',
    external_message_ids: [data.messageId],

    client: {
      phone: phone,
      name: data.fromName,
      email: null,
      username: null,
    },

    text: data.text || data.caption || '',

    media: {
      has_voice: data.type === 'audio',
      voice_url: data.type === 'audio' ? data.media?.url : null,
      voice_transcribed_text: null,  // будет заполнено после транскрипции
      has_images: data.type === 'image',
      images: data.type === 'image' ? [{
        url: data.media?.url,
        caption: data.caption,
      }] : [],
      has_video: data.type === 'video',
      videos: data.type === 'video' ? [{
        url: data.media?.url,
        caption: data.caption,
      }] : [],
      has_documents: data.type === 'document',
      documents: data.type === 'document' ? [{
        url: data.media?.url,
        filename: data.media?.filename || 'document',
        mime_type: data.media?.mimetype,
      }] : [],
      has_sticker: data.type === 'sticker',
      sticker_url: data.type === 'sticker' ? data.media?.url : null,
      has_location: data.type === 'location',
      location: null,  // TODO: parse location
      has_contact: data.type === 'contact',
      contact: null,   // TODO: parse contact
    },

    timestamp: new Date(data.timestamp).toISOString(),

    batch: {
      is_batched: false,
      message_count: 1,
      first_timestamp: new Date(data.timestamp).toISOString(),
      last_timestamp: new Date(data.timestamp).toISOString(),
    },

    trace_id: crypto.randomUUID(),

    meta: {
      provider: 'baileys',
      ip_node_id: account.ip_node_id,
      session_id: event.sessionId,
      is_group: data.isGroup,
      group_id: data.groupId || null,
      reply_to_message_id: data.quotedMessageId || null,
      forward_from: null,
    },
  };
}
```

### 3.4 Отправка WhatsApp

```typescript
async function sendWhatsApp(packet: MCPOutgoingPacket): Promise<void> {
  const session = sessionManager.getSession(packet.channel_account_id);

  switch (packet.content.type) {
    case 'text':
      await session.sendText({
        to: packet.external_chat_id,
        text: packet.content.text,
        quotedMessageId: packet.options.reply_to_message_id,
      });
      break;

    case 'image':
      await session.sendImage({
        to: packet.external_chat_id,
        url: packet.content.media_url,
        caption: packet.content.caption,
      });
      break;

    // ... другие типы
  }
}
```

---

## 4. MCP Telegram Bot

### 4.1 Специфика канала

| Параметр | Значение |
|----------|----------|
| Порт | 8767 |
| Библиотека | node-telegram-bot-api или grammy |
| Provider | `bot_api` |
| channel_id | 1 |
| channel_code | `telegram_bot` |
| Формат chat_id | number (int64) |
| Max message length | 4096 |
| Поддержка медиа | Все типы |
| Поддержка кнопок | Inline + Reply |

### 4.2 Входящие события (Bot API → Normalizer)

```typescript
// Telegram Bot API Update
interface TelegramBotUpdate {
  update_id: number;
  message?: {
    message_id: number;
    from: {
      id: number;
      is_bot: boolean;
      first_name: string;
      last_name?: string;
      username?: string;
      language_code?: string;
    };
    chat: {
      id: number;
      type: "private" | "group" | "supergroup" | "channel";
      title?: string;
      username?: string;
    };
    date: number;
    text?: string;
    caption?: string;
    photo?: Array<{
      file_id: string;
      file_unique_id: string;
      width: number;
      height: number;
      file_size?: number;
    }>;
    voice?: {
      file_id: string;
      duration: number;
      mime_type?: string;
      file_size?: number;
    };
    video?: { ... };
    document?: { ... };
    sticker?: { ... };
    location?: { latitude: number; longitude: number };
    contact?: { phone_number: string; first_name: string; ... };
    reply_to_message?: { message_id: number };
  };
  callback_query?: { ... };
}
```

### 4.3 Нормализация Telegram Bot

```typescript
function normalizeTelegramBot(update: TelegramBotUpdate, account: ChannelAccount): MCPIncomingPacket {
  const msg = update.message;
  const from = msg.from;

  return {
    tenant_id: account.tenant_id,
    domain_id: account.domain_id,
    domain_code: account.domain_code,
    vertical_id: account.vertical_id,
    vertical_code: account.vertical_code,

    channel_id: 1,
    channel_code: 'telegram_bot',
    channel_account_id: account.id,

    external_user_id: String(from.id),
    external_chat_id: String(msg.chat.id),
    external_message_ids: [String(msg.message_id)],

    client: {
      phone: null,  // Telegram Bot API не даёт телефон
      name: [from.first_name, from.last_name].filter(Boolean).join(' '),
      email: null,
      username: from.username || null,
    },

    text: msg.text || msg.caption || '',

    media: {
      has_voice: !!msg.voice,
      voice_url: msg.voice ? await getFileUrl(msg.voice.file_id) : null,
      voice_transcribed_text: null,
      has_images: !!msg.photo,
      images: msg.photo ? [{
        url: await getFileUrl(msg.photo[msg.photo.length - 1].file_id),
        width: msg.photo[msg.photo.length - 1].width,
        height: msg.photo[msg.photo.length - 1].height,
        caption: msg.caption,
      }] : [],
      has_video: !!msg.video,
      videos: [],
      has_documents: !!msg.document,
      documents: [],
      has_sticker: !!msg.sticker,
      sticker_url: null,
      has_location: !!msg.location,
      location: msg.location ? {
        latitude: msg.location.latitude,
        longitude: msg.location.longitude,
      } : null,
      has_contact: !!msg.contact,
      contact: msg.contact ? {
        phone: msg.contact.phone_number,
        name: msg.contact.first_name,
      } : null,
    },

    timestamp: new Date(msg.date * 1000).toISOString(),

    batch: {
      is_batched: false,
      message_count: 1,
      first_timestamp: new Date(msg.date * 1000).toISOString(),
      last_timestamp: new Date(msg.date * 1000).toISOString(),
    },

    trace_id: crypto.randomUUID(),

    meta: {
      provider: 'bot_api',
      ip_node_id: account.ip_node_id,
      session_id: account.session_id,  // bot token
      is_group: msg.chat.type !== 'private',
      group_id: msg.chat.type !== 'private' ? String(msg.chat.id) : null,
      reply_to_message_id: msg.reply_to_message ? String(msg.reply_to_message.message_id) : null,
      forward_from: null,
    },
  };
}
```

### 4.4 Отправка Telegram Bot

```typescript
async function sendTelegramBot(packet: MCPOutgoingPacket): Promise<void> {
  const bot = getBotByAccountId(packet.channel_account_id);
  const chatId = parseInt(packet.external_chat_id);

  const options: any = {};
  if (packet.options.reply_to_message_id) {
    options.reply_to_message_id = parseInt(packet.options.reply_to_message_id);
  }
  if (packet.options.parse_mode) {
    options.parse_mode = packet.options.parse_mode === 'markdown' ? 'MarkdownV2' : 'HTML';
  }
  if (packet.options.buttons) {
    options.reply_markup = {
      inline_keyboard: packet.options.buttons.map(btn => [{
        text: btn.text,
        url: btn.url,
        callback_data: btn.callback_data,
      }]),
    };
  }

  switch (packet.content.type) {
    case 'text':
      await bot.sendMessage(chatId, packet.content.text, options);
      break;
    case 'image':
      await bot.sendPhoto(chatId, packet.content.media_url, {
        ...options,
        caption: packet.content.caption,
      });
      break;
    // ... другие типы
  }
}
```

---

## 5. MCP Telegram User (MTProto)

### 5.1 Специфика канала

| Параметр | Значение |
|----------|----------|
| Порт | 8768 |
| Библиотека | gramjs (MTProto) |
| Provider | `mtproto` или `gramjs` |
| channel_id | 8 |
| channel_code | `telegram_user` |
| Формат chat_id | number (int64) |
| Max message length | 4096 |
| Особенность | Работает как обычный пользователь |
| Ограничения | Rate limits строже, нужна авторизация по телефону |

### 5.2 Отличия от Telegram Bot

| Аспект | Bot API | MTProto (User) |
|--------|---------|----------------|
| Авторизация | Bot Token | Телефон + код |
| Получение телефона контакта | Нет | Да (если есть в контактах) |
| Чтение истории | Ограничено | Полная история |
| Отправка от имени | Бот | Обычный пользователь |
| Доступ к группам | По invite | Как обычный юзер |
| Rate limits | Мягче | Строже |

### 5.3 Входящие события (GramJS → Normalizer)

```typescript
// GramJS NewMessage event
interface GramJSNewMessage {
  message: {
    id: number;
    peerId: {
      className: "PeerUser" | "PeerChat" | "PeerChannel";
      userId?: bigint;
      chatId?: bigint;
      channelId?: bigint;
    };
    fromId?: {
      userId: bigint;
    };
    message: string;
    date: number;
    media?: {
      className: "MessageMediaPhoto" | "MessageMediaDocument" | ...;
      photo?: { ... };
      document?: { ... };
    };
    replyTo?: {
      replyToMsgId: number;
    };
  };
  sender?: {
    id: bigint;
    firstName?: string;
    lastName?: string;
    username?: string;
    phone?: string;  // <-- MTProto может дать телефон!
  };
  chat?: {
    id: bigint;
    title?: string;
    className: string;
  };
}
```

### 5.4 Нормализация Telegram User

```typescript
function normalizeTelegramUser(event: GramJSNewMessage, account: ChannelAccount): MCPIncomingPacket {
  const msg = event.message;
  const sender = event.sender;

  // MTProto может дать телефон контакта!
  const phone = sender?.phone ? '+' + sender.phone : null;

  return {
    tenant_id: account.tenant_id,
    domain_id: account.domain_id,
    domain_code: account.domain_code,
    vertical_id: account.vertical_id,
    vertical_code: account.vertical_code,

    channel_id: 8,
    channel_code: 'telegram_user',
    channel_account_id: account.id,

    external_user_id: String(sender?.id || msg.fromId?.userId),
    external_chat_id: String(getPeerId(msg.peerId)),
    external_message_ids: [String(msg.id)],

    client: {
      phone: phone,  // <-- Телефон доступен через MTProto!
      name: [sender?.firstName, sender?.lastName].filter(Boolean).join(' '),
      email: null,
      username: sender?.username || null,
    },

    text: msg.message || '',

    media: {
      // ... аналогично Bot API, но другой формат медиа
      has_voice: msg.media?.className === 'MessageMediaDocument' &&
                 msg.media.document?.mimeType?.startsWith('audio/'),
      // ...
    },

    timestamp: new Date(msg.date * 1000).toISOString(),

    batch: {
      is_batched: false,
      message_count: 1,
      first_timestamp: new Date(msg.date * 1000).toISOString(),
      last_timestamp: new Date(msg.date * 1000).toISOString(),
    },

    trace_id: crypto.randomUUID(),

    meta: {
      provider: 'gramjs',
      ip_node_id: account.ip_node_id,
      session_id: account.session_id,
      is_group: msg.peerId.className !== 'PeerUser',
      group_id: msg.peerId.className !== 'PeerUser' ? String(getPeerId(msg.peerId)) : null,
      reply_to_message_id: msg.replyTo ? String(msg.replyTo.replyToMsgId) : null,
      forward_from: null,
    },
  };
}
```

### 5.5 Отправка Telegram User

```typescript
async function sendTelegramUser(packet: MCPOutgoingPacket): Promise<void> {
  const client = getGramJSClient(packet.channel_account_id);
  const peer = await client.getInputEntity(packet.external_chat_id);

  switch (packet.content.type) {
    case 'text':
      await client.sendMessage(peer, {
        message: packet.content.text,
        replyTo: packet.options.reply_to_message_id ?
          parseInt(packet.options.reply_to_message_id) : undefined,
        parseMode: packet.options.parse_mode,
      });
      break;

    case 'image':
      await client.sendFile(peer, {
        file: packet.content.media_url,
        caption: packet.content.caption,
        forceDocument: false,
      });
      break;

    // ... другие типы
  }
}
```

---

## 6. Сравнительная таблица

| Параметр | WhatsApp | Telegram Bot | Telegram User |
|----------|----------|--------------|---------------|
| **channel_id** | 2 | 1 | 8 |
| **channel_code** | whatsapp | telegram_bot | telegram_user |
| **Порт** | 8766 | 8767 | 8768 |
| **Библиотека** | Baileys | node-telegram-bot-api | GramJS |
| **Provider** | baileys | bot_api | gramjs |
| **Телефон клиента** | Всегда есть | Нет | Если в контактах |
| **Username** | Нет | Да | Да |
| **Формат chat_id** | phone@s.whatsapp.net | number | number |
| **Кнопки** | Ограничено | Полная поддержка | Полная поддержка |
| **Markdown** | WhatsApp-style | MarkdownV2/HTML | MarkdownV2/HTML |

---

## 7. Реализация Batcher (общая)

```typescript
class Batcher {
  private redis: Redis;
  private timers: Map<string, NodeJS.Timeout> = new Map();
  private config: {
    debounceMs: number;  // 10000
    maxWaitMs: number;   // 40000
  };

  async addMessage(packet: MCPIncomingPacket): Promise<void> {
    const batchKey = `${packet.channel_code}:${packet.external_chat_id}`;

    // Добавляем в Redis list
    await this.redis.rpush(`batch:${batchKey}`, JSON.stringify(packet));

    const now = Date.now();

    // Проверяем first_seen
    let firstSeen = await this.redis.get(`first_seen:${batchKey}`);
    if (!firstSeen) {
      firstSeen = String(now);
      await this.redis.setex(`first_seen:${batchKey}`, 120, firstSeen);
    }

    // Вычисляем deadline
    const maxDeadline = parseInt(firstSeen) + this.config.maxWaitMs;
    const debounceDeadline = now + this.config.debounceMs;
    const deadline = Math.min(maxDeadline, debounceDeadline);

    // Отменяем старый таймер
    const existingTimer = this.timers.get(batchKey);
    if (existingTimer) {
      clearTimeout(existingTimer);
    }

    // Устанавливаем новый таймер
    const waitMs = deadline - now;
    const timer = setTimeout(() => this.flushBatch(batchKey), waitMs);
    this.timers.set(batchKey, timer);
  }

  private async flushBatch(batchKey: string): Promise<void> {
    // Получаем все сообщения
    const messages = await this.redis.lrange(`batch:${batchKey}`, 0, -1);
    if (messages.length === 0) return;

    const packets: MCPIncomingPacket[] = messages.map(m => JSON.parse(m));

    // Мержим
    const merged = this.mergePackets(packets);

    // Отправляем в queue:ready
    await this.redis.rpush('queue:ready', JSON.stringify(merged));

    // Очищаем
    await this.redis.del(
      `batch:${batchKey}`,
      `first_seen:${batchKey}`
    );
    this.timers.delete(batchKey);
  }

  private mergePackets(packets: MCPIncomingPacket[]): MCPIncomingPacket {
    const first = packets[0];
    const last = packets[packets.length - 1];

    // Объединяем тексты
    const texts = packets.map(p => p.text).filter(Boolean);
    const mergedText = texts.join('\n\n');

    // Собираем все message_ids
    const allMessageIds = packets.flatMap(p => p.external_message_ids);

    // Объединяем медиа
    const allImages = packets.flatMap(p => p.media.images);
    const allVideos = packets.flatMap(p => p.media.videos);
    const allDocuments = packets.flatMap(p => p.media.documents);

    return {
      ...last,  // Берём последний как базу
      text: mergedText,
      external_message_ids: allMessageIds,
      media: {
        ...last.media,
        has_images: allImages.length > 0,
        images: allImages,
        has_video: allVideos.length > 0,
        videos: allVideos,
        has_documents: allDocuments.length > 0,
        documents: allDocuments,
      },
      batch: {
        is_batched: packets.length > 1,
        message_count: packets.length,
        first_timestamp: first.timestamp,
        last_timestamp: last.timestamp,
      },
    };
  }
}
```

---

## 8. Outbound Worker (общий)

```typescript
class OutboundWorker {
  private redis: Redis;
  private channelCode: string;
  private sender: ChannelSender;  // WhatsAppSender | TelegramBotSender | ...
  private running = false;

  async start(): Promise<void> {
    this.running = true;
    const queueKey = `queue:outgoing:${this.channelCode}`;

    while (this.running) {
      try {
        // BLPOP с таймаутом 30 сек
        const result = await this.redis.blpop(queueKey, 30);

        if (result) {
          const [, json] = result;
          const packet: MCPOutgoingPacket = JSON.parse(json);
          await this.processPacket(packet);
        }
      } catch (error) {
        console.error('OutboundWorker error:', error);
        await sleep(5000);
      }
    }
  }

  private async processPacket(packet: MCPOutgoingPacket): Promise<void> {
    try {
      await this.sender.send(packet);

      // Успешно отправлено - можно записать в лог/метрики
      console.log(`Sent message to ${packet.external_chat_id}`);

    } catch (error) {
      console.error('Failed to send:', error);
      // TODO: retry logic или dead letter queue
    }
  }

  stop(): void {
    this.running = false;
  }
}
```

---

## 9. Файловая структура (пример для WhatsApp)

```
MCP/
  mcp-whatsapp/
    src/
      index.ts              # Express app, startup

      # Адаптер канала
      adapters/
        baileys.ts          # Работа с Baileys
        session.ts          # Session manager

      # IN pipeline
      inbound/
        webhook.ts          # POST /webhook/incoming
        normalizer.ts       # Raw → MCPIncomingPacket
        batcher.ts          # Батчинг с таймерами
        transcriber.ts      # Транскрипция голоса

      # OUT pipeline
      outbound/
        worker.ts           # BLPOP + send
        sender.ts           # Отправка разных типов

      # Общее
      types.ts              # MCPIncomingPacket, MCPOutgoingPacket
      config.ts             # Конфигурация
      db.ts                 # PostgreSQL queries
      redis.ts              # Redis client
      metrics.ts            # Метрики
      alerts.ts             # Алерты

    package.json
    Dockerfile
    docker-compose.yml
```

---

## 10. Миграция (шаги)

1. **Добавить таблицу elo_domains** (если нет)
2. **Обновить elo_verticals** — добавить FK на domain_id
3. **Обновить MCP WhatsApp** — добавить Normalizer + Batcher + Outbound Worker
4. **Тестирование** WhatsApp
5. **Обновить MCP Telegram Bot**
6. **Обновить MCP Telegram User**
7. **Отключить n8n workflows** (ELO_In_*, ELO_Out_*, Batcher, Processor)

---

*ТЗ подготовлено для утверждения*
