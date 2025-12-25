# Avito Camoufox Service

Multi-account Avito with isolated browser fingerprints using Camoufox.

## Features

- **Isolated sessions**: Each account = separate Camoufox browser
- **Unique fingerprints**: Each browser has unique fingerprint (saved on disk)
- **Persistent**: Cookies and sessions survive restart
- **Scale**: Support for 20+ accounts (2 IP × 10)
- **Real browser**: No TLS fingerprint issues (QRATOR bypass)
- **Auto-maintenance**: Health checks, auto-reconnect, cookie refresh
- **Android integration**: Push notifications when re-auth needed

## Architecture

```
┌─────────────────────────────────────────────────────────────┐
│  Android App                                                │
│  ├── Enter phone/password                                  │
│  ├── POST /account/{id}/login                              │
│  ├── (If SMS required) Enter SMS code                      │
│  └── POST /account/{id}/sms                                │
└─────────────────────────────────────────────────────────────┘
                          ↓
┌─────────────────────────────────────────────────────────────┐
│  Avito Camoufox Service :8793                               │
│                                                             │
│  SessionManager                                             │
│  ├── account_1/ (Camoufox + fingerprint_1)                 │
│  ├── account_2/ (Camoufox + fingerprint_2)                 │
│  └── ... up to 20 accounts                                 │
│                                                             │
│  AvitoChannel (per account)                                │
│  ├── Login with credentials                                │
│  ├── WebSocket listener (heartbeat + reconnect)            │
│  ├── Get chats/messages                                    │
│  └── Send messages                                         │
└─────────────────────────────────────────────────────────────┘
                          ↓
┌─────────────────────────────────────────────────────────────┐
│  n8n Webhook                                                │
│  ← Real-time messages forwarded                            │
└─────────────────────────────────────────────────────────────┘
```

## Installation

```bash
# Install Python dependencies
pip install -r requirements.txt

# Download Camoufox Firefox build
camoufox fetch

# Create data directory
mkdir -p /data/avito-camoufox
```

## Usage

### Start server

```bash
python server.py
```

### API Endpoints

#### Account Management

```bash
# Create account (generates unique fingerprint)
POST /account/{account_id}/create

# Login with phone/password
POST /account/{account_id}/login
Body: {"phone": "+7...", "password": "..."}

# Submit SMS code (if required)
POST /account/{account_id}/sms
Body: {"code": "1234"}

# Get account status
GET /account/{account_id}/status

# Close account
DELETE /account/{account_id}

# List all accounts
GET /accounts
```

#### Avito Operations

```bash
# Get profile
GET /account/{account_id}/profile

# Get chats
GET /account/{account_id}/chats

# Get messages
GET /account/{account_id}/messages/{chat_id}

# Send message
POST /account/{account_id}/send
Body: {"chat_id": "...", "text": "Hello!"}
```

#### WebSocket

```bash
# Start real-time listener
POST /account/{account_id}/listen/start

# Stop listener
POST /account/{account_id}/listen/stop

# Get WebSocket status
GET /account/{account_id}/ws/status
```

## Directory Structure

```
/data/avito-camoufox/
├── account_1/
│   ├── fingerprint.json    # Saved fingerprint (reused)
│   ├── profile/            # Firefox profile (cookies)
│   └── state.json          # Session state
├── account_2/
│   └── ...
```

## Flow

### Initial Login
1. **Android** collects phone/password from user
2. **Android** calls `POST /account/{id}/login`
3. **Server** starts Camoufox, enters credentials on Avito
4. **Avito** sends SMS to user's phone
5. If SMS required → returns `{"status": "sms_required"}`
6. **Android** shows SMS input field
7. **User** enters SMS code received on phone
8. **Android** calls `POST /account/{id}/sms`
9. **Server** submits code, completes login
10. **Server** auto-starts WebSocket listener
11. **Server** starts session health monitoring

### Session Maintenance (automatic)
- **Every 5 min**: Health check (API call)
- **WebSocket disconnect**: Auto-reconnect with exponential backoff
- **Cookie near expiry**: Try silent refresh
- **Session dies**: Push webhook to Android

### Re-authentication
1. **Server** detects session died
2. **Server** calls webhook → n8n → Android push
3. **Android** polls `GET /account/{id}/pending-auth`
4. **Android** shows login form to user
5. Flow repeats from step 1
