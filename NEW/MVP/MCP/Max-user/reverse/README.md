# MAX Reverse Engineering Report

## Summary

APK: MAX.apk (130MB)
Package: one.me (TamTam/VK Teams rebrand)
Decompiled: jadx 1.5.3

## Findings

### 1. Bot API (Official) - DOCUMENTED

Base URL: `https://platform-api.max.ru`
Documentation: https://dev.max.ru/docs-api

**Endpoints:**
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /me | Bot info |
| GET | /chats | List chats |
| GET | /chats/{chatId} | Get chat |
| GET | /chats/{chatId}/members | Chat members |
| POST | /messages | Send message |
| PUT | /messages/{id} | Edit message |
| DELETE | /messages/{id} | Delete message |
| GET | /updates | Long polling events |
| POST | /subscriptions | Webhook subscription |
| POST | /uploads | Get upload URL |
| POST | /answers | Callback answer |
| POST | /chats/{chatId}/actions | Typing indicator |

**Authentication:**
- `access_token` parameter in query string
- Token from @MasterBot

### 2. User API (Mobile App) - NEEDS TRAFFIC ANALYSIS

The mobile app uses a different protocol. Based on analysis:

**Suspected Architecture:**
- Base URL: likely `u.max.ru` or similar (not found in strings)
- Protocol: Proprietary (not standard WIM/ICQ)
- Auth: Phone number + SMS code -> session token

**Found URLs:**
- `download.max.ru` - File downloads
- `help.max.ru` - FAQ
- `legal.max.ru` - Legal docs

**Calls SDK:**
- Uses WebRTC for voice/video calls
- STUN/TURN servers for connectivity
- Endpoint passed via API

### 3. Configuration Keys (PmsKey)

Key configuration parameters found in `PmsKey.java`:
- `calls-endpoint` - Voice/video call server
- `max-msg-length` - Maximum message length
- `file-upload-max-size` - Max file upload size
- `max-attach-count` - Max attachments per message
- `chats-page-size` - Pagination size
- `max-video-duration-download` - Video limit

### 4. Code Structure

```
one/me/
├── login/          # Phone auth flow
├── messages/       # Message handling
├── chats/          # Chat management
├── dialogs/        # Dialog views
├── sdk/
│   ├── net/        # Network layer
│   ├── tasks/      # Background tasks
│   └── transfer/   # File transfers
├── devmenu/        # Dev tools (server switch)
└── calls/          # VoIP
```

## Next Steps

To fully document User API, need to:

1. **Traffic Interception** (recommended)
   ```bash
   # Setup mitmproxy
   mitmproxy --mode transparent --showhost

   # Configure Android proxy
   adb shell settings put global http_proxy 192.168.x.x:8080

   # Install mitmproxy CA cert on device
   ```

2. **Frida Hooking** (alternative)
   - Hook OkHttp/Retrofit calls
   - Log all HTTP requests/responses

3. **Dynamic Analysis**
   - Monitor app with Android Studio profiler
   - Check network calls in logcat

## Bot API vs User API Comparison

| Feature | Bot API | User API |
|---------|---------|----------|
| Base URL | platform-api.max.ru | TBD (traffic analysis needed) |
| Auth | access_token (bot) | Phone + SMS → session |
| Send Message | POST /messages | TBD |
| Receive | /updates or webhook | TBD (likely WebSocket) |
| File Upload | /uploads | TBD |
| Calls | Not supported | WebRTC |
| Rate Limits | Bot limits | User limits |

## References

- [MAX Bot API Docs](https://dev.max.ru/docs-api)
- [VK Teams Bot API](https://github.com/bug-ops/vkteams-bot)
- [ICQ Bot API (archived)](https://github.com/icq-bot)
