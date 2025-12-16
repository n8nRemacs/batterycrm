# Android Messager — Roadmap & Deployment Guide

## Architecture Overview

```
┌─────────────────────────────────────────────────────────────────┐
│                         VPS SERVER                               │
│  ┌─────────────────────────────────────────────────────────┐    │
│  │                    tunnel-server                         │    │
│  │  - WebSocket hub for all phones                         │    │
│  │  - API for MCP servers                                  │    │
│  │  - Proxy Manager (load balancing)                       │    │
│  │  - AI Pipeline (future)                                 │    │
│  └─────────────────────────────────────────────────────────┘    │
│                              ▲                                   │
│                              │ WebSocket                         │
└──────────────────────────────┼──────────────────────────────────┘
                               │
        ┌──────────────────────┼──────────────────────┐
        │                      │                      │
        ▼                      ▼                      ▼
┌───────────────┐    ┌───────────────┐    ┌───────────────┐
│   Phone 1     │    │   Phone 2     │    │   Phone N     │
│ mobile-server │    │ mobile-server │    │ mobile-server │
│  - Telegram   │    │  - WhatsApp   │    │  - Proxy only │
│  - Avito      │    │  - VK         │    │               │
│  - Proxy      │    │  - Proxy      │    │               │
└───────────────┘    └───────────────┘    └───────────────┘
```

---

## Deployment Checklist

### Phase 1: VPS (tunnel-server) ✅ DEPLOYED

**Server:** 155.212.221.189:8800

| Step | Command / Action | Status |
|------|------------------|--------|
| 1 | SSH to server | ✅ |
| 2 | `scp` tunnel-server folder | ✅ |
| 3 | Create `.env` with secrets | ✅ |
| 4 | Docker network `eldoleado` | ✅ |
| 5 | `docker-compose up -d` | ✅ |
| 6 | Health check working | ✅ |
| 7 | Port 8800 open | ✅ |

**Deployment commands:**
```bash
# Re-deploy
cd /c/Users/User/Eldoleado/NEW/MVP/Android\ Messager/tunnel-server
scp -r app main.py requirements.txt Dockerfile docker-compose.yml root@155.212.221.189:/opt/eldoleado/tunnel-server/
ssh root@155.212.221.189 "cd /opt/eldoleado/tunnel-server && docker-compose down && docker-compose build --no-cache && docker-compose up -d"

# Check status
curl http://155.212.221.189:8800/api/health
ssh root@155.212.221.189 "docker logs tunnel-server --tail 50"
```

**Required `.env` for tunnel-server:**

```env
# Server
HOST=0.0.0.0
PORT=8800
LOG_LEVEL=INFO

# PostgreSQL (185.221.214.83)
POSTGRES_HOST=185.221.214.83
POSTGRES_PORT=6544
POSTGRES_DB=postgres
POSTGRES_USER=supabase_admin
POSTGRES_PASSWORD=<from_secrets>

# Neo4j (45.144.177.128)
NEO4J_URI=bolt+ssc://45.144.177.128:7687
NEO4J_USER=neo4j
NEO4J_PASSWORD=<from_secrets>

# Redis
REDIS_HOST=45.144.177.128
REDIS_PORT=6379

# Firebase (optional, for push)
GOOGLE_APPLICATION_CREDENTIALS=./firebase-credentials.json
```

**Nginx config (for WSS):**

```nginx
server {
    listen 443 ssl;
    server_name tunnel.eldoleado.ru;

    ssl_certificate /etc/letsencrypt/live/tunnel.eldoleado.ru/fullchain.pem;
    ssl_certificate_key /etc/letsencrypt/live/tunnel.eldoleado.ru/privkey.pem;

    location /ws {
        proxy_pass http://127.0.0.1:8800;
        proxy_http_version 1.1;
        proxy_set_header Upgrade $http_upgrade;
        proxy_set_header Connection "upgrade";
        proxy_set_header Host $host;
        proxy_read_timeout 86400;
    }

    location /api {
        proxy_pass http://127.0.0.1:8800;
        proxy_set_header Host $host;
        proxy_set_header X-Real-IP $remote_addr;
    }
}
```

---

### Phase 2: Android/Termux (mobile-server)

**Device:** Android phone with Termux installed

| Step | Command / Action | Status |
|------|------------------|--------|
| 1 | Install Termux from F-Droid | ⬜ |
| 2 | `pkg install python nodejs git` | ⬜ |
| 3 | Copy mobile-server to phone | ⬜ |
| 4 | `cp .env.example .env` | ⬜ |
| 5 | Fill `.env` (see below) | ⬜ |
| 6 | `./start.sh` | ⬜ |
| 7 | (Optional) Setup Termux:Boot for autostart | ⬜ |

**Required `.env` for mobile-server:**

```env
# Tunnel Connection
TUNNEL_URL=ws://155.212.221.189:8800/ws   # <-- NEW SERVER
TUNNEL_SECRET=<generate_random_32_chars>
SERVER_ID=phone_1  # unique per phone

# Tenant/Proxy Settings (NEW)
TENANT_ID=your_tenant_id          # Required for proxy registration
NODE_TYPE=operator                 # "operator" or "client"
WIFI_ONLY=true                     # Only use proxy on WiFi
MAX_REQUESTS_PER_HOUR=10           # Rate limit for proxy requests
STATUS_UPDATE_INTERVAL=60          # Status updates frequency (seconds)

# Telegram (from my.telegram.org)
TELEGRAM_API_ID=12345678
TELEGRAM_API_HASH=abcdef1234567890
TELEGRAM_PHONE=+79001234567

# Avito (from browser cookies/OAuth)
AVITO_SESSID=<from_browser>
AVITO_ACCESS_TOKEN=<oauth_token>
AVITO_REFRESH_TOKEN=<oauth_refresh>

# MAX (VK Teams)
MAX_TOKEN=<from_login>

# VK
VK_ACCESS_TOKEN=<from_vk_app>

LOG_LEVEL=INFO
```

---

### Phase 3: Android App ✅ PROTOCOL READY

**For:** Native Android app with TunnelService (proxy support)

| Step | Action | Status |
|------|--------|--------|
| 1 | Open `app_original` in Android Studio | ⬜ |
| 2 | Add `google-services.json` from Firebase | ⬜ |
| 3 | Configure tunnel URL in SessionManager | ⬜ |
| 4 | Build APK | ⬜ |
| 5 | Install on phone | ⬜ |

**TunnelService features implemented:**
- ✅ WebSocket connection with auto-reconnect
- ✅ `hello` message with tenant_id, node_type, device info
- ✅ `proxy_status` updates (WiFi, battery level)
- ✅ `http_request` handler for local services
- ✅ `proxy_fetch` handler for mobile IP proxy
- ✅ Foreground service with notification

---

## External APIs Required

### Mandatory

| API | Purpose | How to Get |
|-----|---------|------------|
| **Telegram API** | Telegram channel | https://my.telegram.org → API development tools |
| **Avito OAuth** | Avito messenger | Avito Pro account → API settings |

### Optional

| API | Purpose | How to Get |
|-----|---------|------------|
| **WhatsApp** | WhatsApp channel | Automatic via QR (Baileys) |
| **VK API** | VK communities | https://vk.com/dev → Create app |
| **MAX (VK Teams)** | Corporate messenger | Login credentials |
| **Firebase** | Push notifications | https://console.firebase.google.com |

---

## Three Operation Modes

Configure in `mobile-server/config.yaml`:

### Mode 1: Messenger Only
```yaml
channels:
  whatsapp:
    enabled: true
  telegram:
    enabled: true
  avito:
    enabled: true
  http_proxy:
    enabled: false  # <-- disabled
```

### Mode 2: Proxy Only
```yaml
channels:
  whatsapp:
    enabled: false
  telegram:
    enabled: false
  avito:
    enabled: false
  http_proxy:
    enabled: true  # <-- only proxy
```

### Mode 3: Both (Full)
```yaml
channels:
  whatsapp:
    enabled: true
  telegram:
    enabled: true
  avito:
    enabled: true
  http_proxy:
    enabled: true  # <-- everything enabled
```

---

## API Endpoints

### tunnel-server API

| Endpoint | Method | Purpose |
|----------|--------|---------|
| `/ws` | WebSocket | Phone tunnel connection |
| `/api/send` | POST | Send message via tunnel |
| `/api/status` | GET | Server status |
| `/api/servers` | GET | Connected phones list |
| `/api/proxy/fetch` | POST | Execute proxy request |
| `/api/proxy/stats` | GET | Proxy statistics |
| `/api/proxy/nodes` | GET | Available proxy nodes |
| `/webhook/{source}` | POST | Incoming webhooks |

### Proxy API Examples

**Send message:**
```bash
curl -X POST https://tunnel.eldoleado.ru/api/send \
  -H "Content-Type: application/json" \
  -d '{
    "server_id": "phone_1",
    "service": "telegram",
    "method": "POST",
    "path": "/send",
    "body": {
      "chat_id": "123456",
      "text": "Hello!"
    }
  }'
```

**Proxy fetch (price scraping):**
```bash
curl -X POST https://tunnel.eldoleado.ru/api/proxy/fetch \
  -H "Content-Type: application/json" \
  -d '{
    "tenant_id": "tenant_1",
    "url": "https://competitor.ru/price",
    "method": "GET",
    "timeout": 30
  }'
```

---

## Database Tables Used

### PostgreSQL (elo_*)

| Table | Purpose |
|-------|---------|
| `elo_tenants` | Multi-tenant config |
| `elo_channel_accounts` | Phone/channel mapping |
| `elo_dialogs` | Conversations |
| `elo_events` | Message events |

### Neo4j

| Label | Purpose |
|-------|---------|
| `Client` | Customer profiles |
| `Device` | Customer devices |
| `Dialog` | Conversation links |

---

## Security Checklist

| Item | Status |
|------|--------|
| TUNNEL_SECRET unique per phone | ⬜ |
| WSS (not WS) in production | ⬜ |
| Firewall: only 443, 22 open | ⬜ |
| No secrets in git | ⬜ |
| Rate limiting on proxy | ⬜ (built-in) |
| wifi_only for client proxies | ⬜ (built-in) |

---

## Monitoring

### Logs

```bash
# tunnel-server
tail -f logs/tunnel-server.log

# mobile-server
tail -f logs/mobile-server.log
```

### Health Check

```bash
# Server status
curl https://tunnel.eldoleado.ru/api/status

# Connected phones
curl https://tunnel.eldoleado.ru/api/servers

# Proxy stats
curl https://tunnel.eldoleado.ru/api/proxy/stats
```

---

## Troubleshooting

| Problem | Solution |
|---------|----------|
| Phone disconnects | Check TUNNEL_SECRET matches |
| "No proxy nodes" | Ensure phone is on WiFi (wifi_only=true) |
| Telegram auth fails | Re-run with fresh session |
| WebSocket timeout | Check nginx proxy_read_timeout |
| SSL errors | Verify certbot certificates |

---

## Implemented Features

### Multi-Tenant Proxy System ✅

- **ProxyManager** — балансировка запросов между телефонами
- **ProxyNode types:** `operator` (сотрудники) и `client` (клиенты с бонусами)
- **Rate limiting** — max_requests_per_hour per node
- **WiFi-only mode** — прокси только на WiFi
- **Status updates** — WiFi/battery мониторинг
- **Auto-registration** — телефоны регистрируются при hello

### WebSocket Protocol ✅

| Action | Direction | Description |
|--------|-----------|-------------|
| `hello` | Client→Server | Registration with tenant_id, services |
| `proxy_status` | Client→Server | WiFi/battery status updates |
| `http_request` | Server→Client | Proxy to local services |
| `proxy_fetch` | Server→Client | Direct URL fetch via mobile IP |
| `proxy_response` | Client→Server | Response from proxy_fetch |
| `ping`/`pong` | Both | Heartbeat |

---

## Future Enhancements

- [ ] AI Pipeline integration (Level 3-5)
- [ ] Push notifications via FCM
- [ ] Admin dashboard
- [ ] Automatic phone provisioning
- [x] ~~Proxy bonus system~~ (implemented in ProxyManager)
- [ ] Geographic load balancing
- [ ] SSL/WSS via nginx reverse proxy

---

## Quick Start Commands

```bash
# === VPS (already deployed) ===
# Check status
curl http://155.212.221.189:8800/api/health
ssh root@155.212.221.189 "docker logs tunnel-server --tail 20"

# Restart
ssh root@155.212.221.189 "cd /opt/eldoleado/tunnel-server && docker-compose restart"

# === Phone (Termux) ===
cd mobile-server
cp .env.example .env
nano .env  # fill: TUNNEL_URL=ws://155.212.221.189:8800/ws, TENANT_ID, etc.
pip install -r requirements.txt
python -m tunnel_proxy.proxy

# === Test connection ===
curl http://155.212.221.189:8800/api/health
# {"status":"ok","tunnels_connected":0,"version":"1.0.0"}

# After phone connects:
curl http://155.212.221.189:8800/api/servers
# {"servers": ["phone_1"]}
```

---

## Current Status (2025-12-17)

| Component | Status | Location |
|-----------|--------|----------|
| tunnel-server | ✅ Running | 155.212.221.189:8800 |
| mobile-server | ✅ Code ready | Needs Termux setup |
| Android app | ✅ Protocol ready | Needs build + deploy |
| SSL/WSS | ⬜ Pending | Need nginx reverse proxy |
