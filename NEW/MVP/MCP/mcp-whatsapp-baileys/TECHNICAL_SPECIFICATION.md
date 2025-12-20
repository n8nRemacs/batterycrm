# WhatsApp Integration — Technical Specification

**Version:** 1.0
**Date:** 2025-12-20
**Author:** Eldoleado Team
**Status:** Draft

---

## Table of Contents

1. [Executive Summary](#1-executive-summary)
2. [Problem Statement](#2-problem-statement)
3. [Solution Overview](#3-solution-overview)
4. [Current Implementation](#4-current-implementation)
5. [Target Architecture](#5-target-architecture)
6. [Functional Requirements](#6-functional-requirements)
7. [Technical Requirements](#7-technical-requirements)
8. [API Specification](#8-api-specification)
9. [Humanization System](#9-humanization-system)
10. [Self-Healing System](#10-self-healing-system)
11. [Protocol Monitor](#11-protocol-monitor)
12. [Deployment](#12-deployment)
13. [Testing Strategy](#13-testing-strategy)
14. [Appendix A: History](#appendix-a-how-we-solved-whatsapp-connection)
15. [Appendix B: Proxy Setup](#appendix-b-proxy-configuration)

---

## 1. Executive Summary

### Goal
Create a robust, self-healing WhatsApp integration for Eldoleado omnichannel messenger that:
- Connects reliably via residential proxy
- Simulates human behavior (anti-detection)
- Auto-recovers from failures without manual intervention
- Detects WhatsApp protocol changes early

### Key Metrics
| Metric | Target |
|--------|--------|
| Uptime | 99.5% |
| Message delivery success | 99% |
| Auto-recovery time | < 60 seconds |
| Detection rate (ban) | < 1% monthly |

---

## 2. Problem Statement

### 2.1 WhatsApp Anti-Bot Protection

WhatsApp actively blocks unofficial API clients using:

1. **IP-based blocking**
   - Datacenter IPs are blacklisted
   - VPN exit nodes are flagged
   - Only residential IPs pass through

2. **Behavior analysis**
   - Instant message sending (no typing delay)
   - Consistent timing patterns
   - High message frequency

3. **Protocol fingerprinting**
   - Browser/client identification
   - WebSocket connection patterns
   - TLS fingerprinting

### 2.2 Problems We Encountered

| Date | Problem | Error Code | Root Cause |
|------|---------|------------|------------|
| 2025-12-19 | Connection hangs | - | nodejs-mobile WebSocket limitations |
| 2025-12-19 | Connection refused | 405 | Datacenter IP blocked |
| 2025-12-19 | Timeout | 408 | VPN routing through datacenter |
| 2025-12-20 | Connection closed | 428 | Expired QR code |
| 2025-12-20 | Restart required | 515 | WhatsApp server restart |

### 2.3 Failed Approaches

1. **nodejs-mobile in APK** — WebSocket hangs on Android
2. **Server Baileys without proxy** — 405/408 errors
3. **VPN on workstation** — Routes through datacenter, blocked

---

## 3. Solution Overview

### 3.1 Working Solution

**Baileys + Residential Proxy (SOCKS5)**

```
┌─────────────────┐      ┌──────────────────┐      ┌─────────────────┐
│   Application   │ ───► │  SOCKS5 Proxy    │ ───► │  WhatsApp       │
│   (Baileys)     │      │  (Residential)   │      │  Servers        │
└─────────────────┘      └──────────────────┘      └─────────────────┘
     localhost            res.geonix.com:10000      web.whatsapp.com
```

### 3.2 Why It Works

1. **Residential IP** — Appears as real user device
2. **SOCKS5 protocol** — Transparent proxying, no header modification
3. **Baileys library** — Maintained, multi-device support, proven reliability

### 3.3 Technology Stack

| Component | Technology | Version |
|-----------|------------|---------|
| Runtime | Node.js | 18+ |
| WhatsApp Client | @whiskeysockets/baileys | latest |
| Proxy Agent | socks-proxy-agent | 8.x |
| HTTP Server | Express | 4.x |
| State Storage | File-based / Redis | - |
| Queue (future) | BullMQ | 5.x |

---

## 4. Current Implementation

### 4.1 Project Structure

```
mcp-whatsapp-baileys/
├── src/
│   ├── index.ts          # Express server, routes
│   ├── baileys.ts        # BaileysClient class
│   ├── session.ts        # SessionManager class
│   └── types.ts          # TypeScript interfaces
├── sessions/             # Auth credentials storage
│   └── {sessionId}/
│       ├── creds.json
│       └── app-state-sync-*.json
├── package.json
└── tsconfig.json
```

### 4.2 Key Classes

#### BaileysClient (baileys.ts)

```typescript
class BaileysClient {
  // Connection
  async connect(): Promise<void>
  async disconnect(): Promise<void>
  async logout(): Promise<void>

  // Messaging
  async sendText(request: TextMessageRequest): Promise<SendMessageResponse>
  async sendImage(request: MediaMessageRequest): Promise<SendMessageResponse>
  async sendVideo(request: MediaMessageRequest): Promise<SendMessageResponse>
  async sendAudio(request: MediaMessageRequest): Promise<SendMessageResponse>
  async sendDocument(request: MediaMessageRequest): Promise<SendMessageResponse>
  async sendLocation(request: LocationMessageRequest): Promise<SendMessageResponse>
  async sendContact(request: ContactMessageRequest): Promise<SendMessageResponse>
  async sendReaction(request: ReactionMessageRequest): Promise<SendMessageResponse>

  // Presence
  async sendTyping(jid: string, composing: boolean): Promise<void>
  async markAsRead(jid: string, messageIds: string[]): Promise<void>

  // Utils
  async isOnWhatsApp(phone: string): Promise<boolean>
  async getProfilePicture(jid: string): Promise<string | null>
  async getGroupInfo(groupId: string): Promise<GroupInfo>
}
```

#### SessionManager (session.ts)

```typescript
class SessionManager {
  async createSession(request: CreateSessionRequest): Promise<{sessionId, hash}>
  async deleteSession(sessionId: string): Promise<void>
  async disconnectSession(sessionId: string): Promise<void>
  async reconnectSession(sessionId: string): Promise<void>
  async restoreSessions(): Promise<void>

  getSession(sessionId: string): BaileysClient | undefined
  getSessionByHash(hash: string): BaileysClient | undefined
  listSessions(): SessionInfo[]
}
```

### 4.3 Current API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /health | Health check |
| GET | /sessions | List all sessions |
| POST | /sessions | Create new session |
| GET | /sessions/:id | Get session info |
| GET | /sessions/:id/qr | Get QR code |
| GET | /sessions/:id/status | Get connection status |
| DELETE | /sessions/:id | Delete session |
| POST | /sessions/:id/disconnect | Disconnect (keep creds) |
| POST | /sessions/:id/reconnect | Reconnect session |
| POST | /messages/text | Send text message |
| POST | /messages/image | Send image |
| POST | /messages/video | Send video |
| POST | /messages/audio | Send audio/voice |
| POST | /messages/document | Send document |
| POST | /messages/location | Send location |
| POST | /messages/contact | Send contact |
| POST | /messages/reaction | Send reaction |

### 4.4 Current Limitations

| Limitation | Impact | Priority |
|------------|--------|----------|
| No humanization | Higher ban risk | HIGH |
| Fixed reconnect delay | Slow recovery | MEDIUM |
| No message queue | Lost messages on error | HIGH |
| No health metrics | Blind to issues | MEDIUM |
| No protocol monitoring | Slow to detect changes | LOW |

---

## 5. Target Architecture

### 5.1 High-Level Architecture

```
┌─────────────────────────────────────────────────────────────────────────┐
│                           Load Balancer (nginx)                          │
└─────────────────────────────────────────────────────────────────────────┘
                                    │
              ┌─────────────────────┼─────────────────────┐
              ▼                     ▼                     ▼
┌─────────────────────┐ ┌─────────────────────┐ ┌─────────────────────┐
│  WhatsApp Worker 1  │ │  WhatsApp Worker 2  │ │  WhatsApp Worker N  │
│  (Sessions 1-50)    │ │  (Sessions 51-100)  │ │  (Sessions N*50+)   │
└─────────────────────┘ └─────────────────────┘ └─────────────────────┘
              │                     │                     │
              └─────────────────────┼─────────────────────┘
                                    ▼
┌─────────────────────────────────────────────────────────────────────────┐
│                              Redis Cluster                               │
│  ┌──────────────┐  ┌──────────────┐  ┌──────────────┐                   │
│  │ Session Store│  │ Message Queue│  │ Cache/Dedup │                   │
│  └──────────────┘  └──────────────┘  └──────────────┘                   │
└─────────────────────────────────────────────────────────────────────────┘
                                    │
              ┌─────────────────────┼─────────────────────┐
              ▼                     ▼                     ▼
┌─────────────────────┐ ┌─────────────────────┐ ┌─────────────────────┐
│   Proxy Pool        │ │   Webhook Delivery  │ │   Metrics/Alerts    │
│   (Residential)     │ │   (Retry Queue)     │ │   (Prometheus)      │
└─────────────────────┘ └─────────────────────┘ └─────────────────────┘
```

### 5.2 Component Diagram

```
┌─────────────────────────────────────────────────────────────────┐
│                        mcp-whatsapp-baileys                      │
├─────────────────────────────────────────────────────────────────┤
│                                                                  │
│  ┌──────────────┐  ┌──────────────┐  ┌──────────────┐          │
│  │   HTTP API   │  │  WebSocket   │  │   Webhooks   │          │
│  │   (Express)  │  │   (future)   │  │   (axios)    │          │
│  └──────┬───────┘  └──────┬───────┘  └──────┬───────┘          │
│         │                 │                 │                   │
│         └─────────────────┼─────────────────┘                   │
│                           ▼                                      │
│  ┌─────────────────────────────────────────────────────────┐   │
│  │                   Session Manager                        │   │
│  │  ┌─────────────┐  ┌─────────────┐  ┌─────────────┐      │   │
│  │  │  Session 1  │  │  Session 2  │  │  Session N  │      │   │
│  │  └──────┬──────┘  └──────┬──────┘  └──────┬──────┘      │   │
│  └─────────┼────────────────┼────────────────┼──────────────┘   │
│            │                │                │                   │
│            └────────────────┼────────────────┘                   │
│                             ▼                                    │
│  ┌─────────────────────────────────────────────────────────┐   │
│  │                   Baileys Client                         │   │
│  │  ┌───────────┐  ┌───────────┐  ┌───────────┐            │   │
│  │  │ Connection│  │  Message  │  │  Presence │            │   │
│  │  │  Manager  │  │  Handler  │  │  Manager  │            │   │
│  │  └─────┬─────┘  └─────┬─────┘  └─────┬─────┘            │   │
│  └────────┼──────────────┼──────────────┼───────────────────┘   │
│           │              │              │                        │
│           └──────────────┼──────────────┘                        │
│                          ▼                                       │
│  ┌─────────────────────────────────────────────────────────┐   │
│  │                NEW: Enhancement Layer                    │   │
│  │  ┌───────────┐  ┌───────────┐  ┌───────────┐            │   │
│  │  │Humanization│ │Self-Healing│ │ Protocol  │            │   │
│  │  │  Engine   │  │  Watchdog │  │  Monitor  │            │   │
│  │  └───────────┘  └───────────┘  └───────────┘            │   │
│  └─────────────────────────────────────────────────────────┘   │
│                          │                                       │
│                          ▼                                       │
│  ┌─────────────────────────────────────────────────────────┐   │
│  │                   Proxy Manager                          │   │
│  │  - Proxy pool rotation                                   │   │
│  │  - Health checking                                       │   │
│  │  - Fallback handling                                     │   │
│  └─────────────────────────────────────────────────────────┘   │
│                                                                  │
└─────────────────────────────────────────────────────────────────┘
```

---

## 6. Functional Requirements

### 6.1 Session Management

| ID | Requirement | Priority |
|----|-------------|----------|
| FR-SM-01 | Create session with optional proxy URL | MUST |
| FR-SM-02 | Generate QR code for authentication | MUST |
| FR-SM-03 | Support pairing code (phone number) authentication | SHOULD |
| FR-SM-04 | Persist session credentials across restarts | MUST |
| FR-SM-05 | Auto-restore sessions on server startup | MUST |
| FR-SM-06 | Delete session and clear credentials | MUST |
| FR-SM-07 | Disconnect session keeping credentials | SHOULD |
| FR-SM-08 | Reconnect existing session | MUST |
| FR-SM-09 | List all active sessions with status | MUST |
| FR-SM-10 | Session hash for secure webhook identification | MUST |

### 6.2 Messaging

| ID | Requirement | Priority |
|----|-------------|----------|
| FR-MSG-01 | Send text messages | MUST |
| FR-MSG-02 | Send images with caption | MUST |
| FR-MSG-03 | Send videos with caption | MUST |
| FR-MSG-04 | Send audio/voice messages | MUST |
| FR-MSG-05 | Send documents with filename | MUST |
| FR-MSG-06 | Send location with name/address | SHOULD |
| FR-MSG-07 | Send contact cards (vCard) | SHOULD |
| FR-MSG-08 | Send reactions (emoji) | SHOULD |
| FR-MSG-09 | Reply to specific message (quote) | MUST |
| FR-MSG-10 | Send to groups | MUST |
| FR-MSG-11 | Receive incoming messages via webhook | MUST |
| FR-MSG-12 | Download media from incoming messages | SHOULD |
| FR-MSG-13 | Message delivery status tracking | SHOULD |

### 6.3 Humanization

| ID | Requirement | Priority |
|----|-------------|----------|
| FR-HUM-01 | Simulate typing before sending | MUST |
| FR-HUM-02 | Variable typing delay based on text length | MUST |
| FR-HUM-03 | Random delay jitter (±20%) | SHOULD |
| FR-HUM-04 | Presence subscription before typing | MUST |
| FR-HUM-05 | Read receipt simulation | SHOULD |
| FR-HUM-06 | Online/offline presence management | COULD |
| FR-HUM-07 | Configurable humanization profiles | SHOULD |
| FR-HUM-08 | Disable humanization option (for testing) | MUST |

### 6.4 Self-Healing

| ID | Requirement | Priority |
|----|-------------|----------|
| FR-SH-01 | Auto-reconnect on connection loss | MUST |
| FR-SH-02 | Exponential backoff for retries | MUST |
| FR-SH-03 | Maximum retry limit with alerting | MUST |
| FR-SH-04 | Connection health ping | SHOULD |
| FR-SH-05 | Watchdog timer for stale connections | SHOULD |
| FR-SH-06 | Automatic session cleanup on logout | MUST |
| FR-SH-07 | Graceful shutdown with session save | MUST |

### 6.5 Proxy Management

| ID | Requirement | Priority |
|----|-------------|----------|
| FR-PM-01 | SOCKS5 proxy support | MUST |
| FR-PM-02 | Per-session proxy configuration | MUST |
| FR-PM-03 | Default proxy for all sessions | SHOULD |
| FR-PM-04 | Proxy pool rotation | COULD |
| FR-PM-05 | Proxy health checking | COULD |
| FR-PM-06 | Fallback to backup proxy | COULD |

---

## 7. Technical Requirements

### 7.1 Performance

| Metric | Requirement |
|--------|-------------|
| Concurrent sessions | 100 per instance |
| Messages per second (per session) | 10 |
| API response time (p95) | < 500ms |
| Memory per session | < 50MB |
| Startup time | < 30 seconds |

### 7.2 Reliability

| Metric | Requirement |
|--------|-------------|
| Uptime | 99.5% |
| Data loss | 0% for persisted sessions |
| Message delivery | 99% within 60 seconds |
| Auto-recovery | < 60 seconds |

### 7.3 Security

| Requirement | Implementation |
|-------------|----------------|
| Credential encryption | AES-256 for stored credentials |
| API authentication | Bearer token / API key |
| Webhook signing | HMAC-SHA256 signature |
| Proxy credentials | Environment variables, not hardcoded |
| Session isolation | Separate directories per session |

### 7.4 Monitoring

| Metric | Type |
|--------|------|
| Active sessions count | Gauge |
| Connection status per session | Gauge |
| Messages sent/received | Counter |
| Errors by type | Counter |
| API latency | Histogram |
| Reconnection attempts | Counter |

---

## 8. API Specification

### 8.1 Authentication

```
Authorization: Bearer <API_KEY>
```

### 8.2 Common Response Format

```typescript
interface ApiResponse<T> {
  success: boolean;
  data?: T;
  error?: {
    code: string;
    message: string;
  };
}
```

### 8.3 Endpoints

#### POST /sessions — Create Session

**Request:**
```typescript
interface CreateSessionRequest {
  sessionId?: string;      // Auto-generated if not provided
  webhookUrl?: string;     // Webhook for incoming messages
  proxyUrl?: string;       // socks5://user:pass@host:port
  tenantId?: string;       // Multi-tenant identifier
}
```

**Response:**
```typescript
interface CreateSessionResponse {
  sessionId: string;
  hash: string;            // For webhook verification
  status: 'connecting' | 'qr';
}
```

#### GET /sessions/:id/qr — Get QR Code

**Response:**
```typescript
interface QRResponse {
  qr: string;              // Raw QR string
  qrImage: string;         // Base64 data URL
  expiresIn: number;       // Seconds until expiration
}
```

#### POST /messages/text — Send Text (Humanized)

**Request:**
```typescript
interface SendTextRequest {
  sessionId: string;
  to: string;              // Phone number or JID
  text: string;
  quotedMessageId?: string;

  // Humanization options
  humanize?: boolean;      // Default: true
  typingDelay?: number;    // Override calculated delay (ms)
  readBefore?: boolean;    // Simulate reading before reply
}
```

**Response:**
```typescript
interface SendMessageResponse {
  messageId: string;
  timestamp: number;
  status: 'sent' | 'pending';
}
```

#### POST /messages/text/bulk — Bulk Send (NEW)

**Request:**
```typescript
interface BulkSendRequest {
  sessionId: string;
  messages: Array<{
    to: string;
    text: string;
    delay?: number;        // Delay after this message (ms)
  }>;

  // Bulk options
  batchSize?: number;      // Default: 10
  batchDelay?: number;     // Delay between batches (ms)
}
```

#### GET /sessions/:id/health — Health Check (NEW)

**Response:**
```typescript
interface HealthResponse {
  status: 'healthy' | 'degraded' | 'unhealthy';
  connection: SessionStatus;
  lastActivity: string;    // ISO timestamp
  reconnectAttempts: number;
  messagesLast24h: {
    sent: number;
    received: number;
    failed: number;
  };
  proxyStatus: 'connected' | 'error' | 'unknown';
}
```

### 8.4 Webhook Events

**Payload format:**
```typescript
interface WebhookPayload {
  event: WebhookEventType;
  sessionId: string;
  sessionHash: string;     // For verification
  timestamp: number;
  data: any;

  // Signature header: X-Webhook-Signature
  // Signature: HMAC-SHA256(payload, webhookSecret)
}
```

**Event types:**

| Event | Description |
|-------|-------------|
| `message` | Incoming message |
| `message.ack` | Message delivery status |
| `call` | Incoming call |
| `presence` | Contact presence update |
| `connection.update` | Connection status change |
| `qr.update` | New QR code generated |

---

## 9. Humanization System

### 9.1 Overview

The humanization system simulates natural human typing behavior to avoid detection by WhatsApp's anti-bot systems.

### 9.2 Typing Simulation Algorithm

```typescript
interface HumanizationConfig {
  enabled: boolean;

  // Typing speed
  charsPerSecond: {
    min: number;           // Default: 3
    max: number;           // Default: 8
  };

  // Delays
  preTypingDelay: {
    min: number;           // Default: 500ms
    max: number;           // Default: 2000ms
  };
  postTypingDelay: {
    min: number;           // Default: 300ms
    max: number;           // Default: 800ms
  };

  // Presence
  subscribePresence: boolean;  // Default: true
  showPaused: boolean;         // Default: true

  // Limits
  maxTypingDuration: number;   // Default: 25000ms (WhatsApp limit ~30s)
  chunkTypingInterval: number; // Default: 20000ms
}
```

### 9.3 Humanized Send Flow

```
┌──────────────────────────────────────────────────────────────────┐
│                    Humanized Message Send                         │
└──────────────────────────────────────────────────────────────────┘
                              │
                              ▼
┌──────────────────────────────────────────────────────────────────┐
│  1. Subscribe to recipient's presence                            │
│     await sock.presenceSubscribe(jid)                            │
│     delay: 200-400ms (random)                                    │
└──────────────────────────────────────────────────────────────────┘
                              │
                              ▼
┌──────────────────────────────────────────────────────────────────┐
│  2. Pre-typing delay (thinking time)                             │
│     delay: 500-2000ms (random)                                   │
└──────────────────────────────────────────────────────────────────┘
                              │
                              ▼
┌──────────────────────────────────────────────────────────────────┐
│  3. Show typing indicator                                        │
│     await sock.sendPresenceUpdate('composing', jid)              │
└──────────────────────────────────────────────────────────────────┘
                              │
                              ▼
┌──────────────────────────────────────────────────────────────────┐
│  4. Typing duration (based on message length)                    │
│     duration = text.length / charsPerSecond * 1000               │
│     duration = clamp(duration, 1000, 25000)                      │
│     duration = duration * (0.8 + Math.random() * 0.4) // ±20%   │
│                                                                   │
│     if duration > 20000:                                         │
│       // Chunk into 20s intervals                                │
│       while remaining > 0:                                       │
│         delay(min(20000, remaining))                             │
│         sock.sendPresenceUpdate('composing', jid) // Refresh     │
│         remaining -= 20000                                       │
│     else:                                                        │
│       delay(duration)                                            │
└──────────────────────────────────────────────────────────────────┘
                              │
                              ▼
┌──────────────────────────────────────────────────────────────────┐
│  5. Stop typing (paused)                                         │
│     await sock.sendPresenceUpdate('paused', jid)                 │
└──────────────────────────────────────────────────────────────────┘
                              │
                              ▼
┌──────────────────────────────────────────────────────────────────┐
│  6. Post-typing delay (before send)                              │
│     delay: 300-800ms (random)                                    │
└──────────────────────────────────────────────────────────────────┘
                              │
                              ▼
┌──────────────────────────────────────────────────────────────────┐
│  7. Send message                                                 │
│     await sock.sendMessage(jid, { text })                        │
└──────────────────────────────────────────────────────────────────┘
```

### 9.4 Humanization Profiles

```typescript
const PROFILES = {
  // Fast typing (experienced user)
  fast: {
    charsPerSecond: { min: 6, max: 10 },
    preTypingDelay: { min: 300, max: 800 },
    postTypingDelay: { min: 200, max: 400 },
  },

  // Normal typing (average user)
  normal: {
    charsPerSecond: { min: 3, max: 6 },
    preTypingDelay: { min: 500, max: 2000 },
    postTypingDelay: { min: 300, max: 800 },
  },

  // Slow typing (careful/elderly user)
  slow: {
    charsPerSecond: { min: 1, max: 3 },
    preTypingDelay: { min: 1000, max: 3000 },
    postTypingDelay: { min: 500, max: 1500 },
  },

  // No humanization (testing/automation)
  instant: {
    enabled: false,
  },
};
```

### 9.5 Anti-Spam Measures

| Measure | Implementation |
|---------|----------------|
| Rate limiting | Max 10 messages/minute per recipient |
| Burst protection | Max 3 rapid messages, then 30s cooldown |
| Daily limits | Configurable per session (default: 1000) |
| Duplicate detection | 5-minute cache for same text+recipient |
| New contact warming | First message to new contact: extra 5s delay |

---

## 10. Self-Healing System

### 10.1 Connection Watchdog

```typescript
interface WatchdogConfig {
  // Ping interval
  pingInterval: number;        // Default: 30000ms (30s)
  pingTimeout: number;         // Default: 10000ms (10s)

  // Reconnection
  maxReconnectAttempts: number; // Default: 10
  reconnectBackoff: {
    initial: number;           // Default: 1000ms
    multiplier: number;        // Default: 2
    max: number;               // Default: 60000ms (1 min)
  };

  // Stale detection
  maxInactivity: number;       // Default: 300000ms (5 min)

  // Alerting
  alertAfterAttempts: number;  // Default: 3
  alertWebhook?: string;
}
```

### 10.2 Reconnection Flow

```
┌────────────────────────────────────────────────────────────────────┐
│                     Connection Lost                                 │
└────────────────────────────────────────────────────────────────────┘
                              │
                              ▼
┌────────────────────────────────────────────────────────────────────┐
│  Analyze disconnect reason                                         │
│                                                                     │
│  statusCode = lastDisconnect?.error?.output?.statusCode            │
└────────────────────────────────────────────────────────────────────┘
                              │
              ┌───────────────┼───────────────┐
              ▼               ▼               ▼
     ┌─────────────┐  ┌─────────────┐  ┌─────────────┐
     │ 401 LogOut  │  │ 403 Banned  │  │   Other     │
     │ 440 Replaced│  │             │  │             │
     └──────┬──────┘  └──────┬──────┘  └──────┬──────┘
            │                │                │
            ▼                ▼                ▼
     ┌─────────────┐  ┌─────────────┐  ┌─────────────┐
     │ Delete      │  │ Delete      │  │ Schedule    │
     │ Session     │  │ Session     │  │ Reconnect   │
     │             │  │ Alert Admin │  │             │
     └─────────────┘  └─────────────┘  └──────┬──────┘
                                              │
                                              ▼
                        ┌─────────────────────────────────────────┐
                        │  Calculate backoff delay                 │
                        │  delay = initial * (multiplier ^ attempt)│
                        │  delay = min(delay, maxDelay)            │
                        │  delay = delay * (0.5 + random)  // Jitter│
                        └─────────────────────────────────────────┘
                                              │
                                              ▼
                        ┌─────────────────────────────────────────┐
                        │  Wait for delay                          │
                        └─────────────────────────────────────────┘
                                              │
                                              ▼
                        ┌─────────────────────────────────────────┐
                        │  Attempt reconnection                    │
                        └─────────────────────────────────────────┘
                                              │
                        ┌─────────────────────┴────────────────────┐
                        ▼                                          ▼
              ┌─────────────────┐                      ┌─────────────────┐
              │    Success      │                      │    Failure      │
              └────────┬────────┘                      └────────┬────────┘
                       │                                        │
                       ▼                                        ▼
              ┌─────────────────┐                      ┌─────────────────┐
              │ Reset attempts  │                      │ attempts++      │
              │ Resume normal   │                      │ if < max:       │
              │ operation       │                      │   goto backoff  │
              └─────────────────┘                      │ else:           │
                                                       │   give up       │
                                                       │   alert admin   │
                                                       └─────────────────┘
```

### 10.3 Health Check Implementation

```typescript
class ConnectionWatchdog {
  private pingTimer: NodeJS.Timer;
  private lastActivity: Date;

  start() {
    this.pingTimer = setInterval(() => this.checkHealth(), this.config.pingInterval);
  }

  async checkHealth() {
    const inactiveTime = Date.now() - this.lastActivity.getTime();

    if (inactiveTime > this.config.maxInactivity) {
      logger.warn(`Session ${this.sessionId} inactive for ${inactiveTime}ms`);
      await this.forceReconnect();
      return;
    }

    if (this.status !== 'connected') {
      return; // Reconnection already in progress
    }

    try {
      // Send ping (check if socket responds)
      const start = Date.now();
      await this.socket.query({
        tag: 'iq',
        attrs: { type: 'get', to: '@s.whatsapp.net' },
        content: [{ tag: 'ping', attrs: {} }]
      });
      const latency = Date.now() - start;

      this.metrics.ping.observe(latency);
      this.lastActivity = new Date();

    } catch (error) {
      logger.error(`Ping failed for session ${this.sessionId}:`, error);
      await this.handleDisconnect('ping_timeout');
    }
  }
}
```

### 10.4 Disconnect Reason Codes

| Code | Reason | Action |
|------|--------|--------|
| 401 | loggedOut | Delete session, notify user |
| 403 | forbidden | Delete session, alert admin (possible ban) |
| 408 | timedOut | Reconnect with backoff |
| 411 | multideviceMismatch | Reconnect |
| 428 | connectionClosed | Reconnect immediately |
| 440 | connectionReplaced | Delete session (logged in elsewhere) |
| 500 | internalError | Reconnect with backoff |
| 503 | unavailable | Reconnect with longer backoff |
| 515 | restartRequired | Reconnect immediately |

---

## 11. Protocol Monitor

### 11.1 Purpose

Detect WhatsApp protocol changes early to enable quick fixes without waiting for community updates.

### 11.2 Monitoring Points

| Point | What to Monitor |
|-------|-----------------|
| Connection handshake | Noise protocol version, server responses |
| Error responses | New error codes, changed messages |
| Message format | Proto structure changes |
| API endpoints | New/removed endpoints |
| QR/Pairing | Authentication flow changes |

### 11.3 Anomaly Detection

```typescript
interface ProtocolMonitor {
  // Log all unknown error codes
  onUnknownError(code: number, message: string): void;

  // Log unexpected message structures
  onUnexpectedMessage(type: string, content: any): void;

  // Track success/failure rates
  trackOperation(operation: string, success: boolean, details?: any): void;

  // Generate report
  generateReport(): ProtocolReport;
}

interface ProtocolReport {
  period: { start: Date; end: Date };

  operations: {
    [operation: string]: {
      total: number;
      success: number;
      failure: number;
      unknownErrors: Array<{ code: number; count: number }>;
    };
  };

  anomalies: Array<{
    timestamp: Date;
    type: 'unknown_error' | 'unexpected_message' | 'connection_pattern';
    details: any;
  }>;

  recommendations: string[];
}
```

### 11.4 Alert Conditions

| Condition | Threshold | Action |
|-----------|-----------|--------|
| Unknown error code | Any occurrence | Log + alert |
| Success rate drop | < 95% over 1 hour | Alert |
| New disconnect reason | Any occurrence | Log + investigate |
| Handshake failure | > 3 consecutive | Alert + investigate |

---

## 12. Deployment

### 12.1 Environment Variables

```bash
# Server
PORT=3003
HOST=0.0.0.0
NODE_ENV=production

# Proxy (default for all sessions)
DEFAULT_PROXY_URL=socks5://user:pass@host:port

# Redis (optional, for clustering)
REDIS_URL=redis://localhost:6379

# Webhook
DEFAULT_WEBHOOK_URL=https://your-server.com/webhook
WEBHOOK_SECRET=your-secret-for-signing

# API Security
API_KEY=your-api-key

# Directories
SESSIONS_DIR=/data/sessions

# Limits
MAX_SESSIONS_PER_INSTANCE=100
MAX_RECONNECT_ATTEMPTS=10

# Humanization
HUMANIZATION_ENABLED=true
HUMANIZATION_PROFILE=normal

# Monitoring
METRICS_ENABLED=true
METRICS_PORT=9090
```

### 12.2 Docker Compose

```yaml
version: '3.8'

services:
  whatsapp:
    build: .
    ports:
      - "3003:3003"
      - "9090:9090"  # Metrics
    environment:
      - PORT=3003
      - NODE_ENV=production
      - DEFAULT_PROXY_URL=${PROXY_URL}
      - REDIS_URL=redis://redis:6379
      - SESSIONS_DIR=/data/sessions
      - API_KEY=${API_KEY}
    volumes:
      - whatsapp-sessions:/data/sessions
    depends_on:
      - redis
    restart: unless-stopped
    healthcheck:
      test: ["CMD", "curl", "-f", "http://localhost:3003/health"]
      interval: 30s
      timeout: 10s
      retries: 3

  redis:
    image: redis:7-alpine
    volumes:
      - redis-data:/data
    restart: unless-stopped

volumes:
  whatsapp-sessions:
  redis-data:
```

### 12.3 Nginx Configuration

```nginx
upstream whatsapp {
    server 127.0.0.1:3003;
    keepalive 32;
}

server {
    listen 443 ssl http2;
    server_name whatsapp.eldoleado.ru;

    ssl_certificate /etc/letsencrypt/live/whatsapp.eldoleado.ru/fullchain.pem;
    ssl_certificate_key /etc/letsencrypt/live/whatsapp.eldoleado.ru/privkey.pem;

    location / {
        proxy_pass http://whatsapp;
        proxy_http_version 1.1;
        proxy_set_header Upgrade $http_upgrade;
        proxy_set_header Connection 'upgrade';
        proxy_set_header Host $host;
        proxy_set_header X-Real-IP $remote_addr;
        proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
        proxy_set_header X-Forwarded-Proto $scheme;
        proxy_cache_bypass $http_upgrade;
        proxy_read_timeout 86400;
    }
}
```

### 12.4 Systemd Service

```ini
[Unit]
Description=WhatsApp Baileys API
After=network.target redis.service

[Service]
Type=simple
User=whatsapp
WorkingDirectory=/opt/mcp-whatsapp-baileys
ExecStart=/usr/bin/node dist/index.js
Restart=always
RestartSec=10
Environment=NODE_ENV=production
Environment=PORT=3003
EnvironmentFile=/opt/mcp-whatsapp-baileys/.env

[Install]
WantedBy=multi-user.target
```

---

## 13. Testing Strategy

### 13.1 Unit Tests

| Component | Tests |
|-----------|-------|
| Humanization | Delay calculation, jitter, chunking |
| Retry logic | Backoff calculation, attempt limits |
| Message parsing | All message types, edge cases |
| JID formatting | Phone numbers, groups, edge cases |

### 13.2 Integration Tests

| Scenario | Description |
|----------|-------------|
| Session lifecycle | Create → QR → Connect → Disconnect → Reconnect → Delete |
| Message flow | Send text → Receive webhook → Reply |
| Reconnection | Simulate disconnect → Verify auto-reconnect |
| Proxy failover | Primary fails → Falls back to secondary |

### 13.3 Load Tests

| Test | Parameters | Target |
|------|------------|--------|
| Concurrent sessions | 100 sessions | All connected |
| Message throughput | 100 msg/s | < 1% failure |
| Reconnection storm | 50 simultaneous | All recovered < 60s |

### 13.4 Monitoring Tests

| Test | Description |
|------|-------------|
| Metrics export | Verify Prometheus metrics |
| Alert firing | Trigger conditions, verify alerts |
| Health endpoint | Check all status codes |

---

## Appendix A: How We Solved WhatsApp Connection

### Timeline

**2025-12-19 Morning**
- Started with nodejs-mobile embedded in Android APK
- WhatsApp connection hung at "connecting" state
- Root cause: WebSocket limitations in nodejs-mobile

**2025-12-19 Afternoon**
- Moved to server-side Baileys on Finnish server (217.145.79.27)
- Got 405 errors immediately
- Discovered: WhatsApp blocks datacenter IPs

**2025-12-19 Evening**
- Tried running Baileys locally
- Same 405/408 errors
- Discovered: VPN (OpenVPN) routes through datacenter

**2025-12-20 Morning**
- Found solution: Residential proxy from geonix.com
- Added SOCKS5 proxy support to mcp-whatsapp-baileys
- SUCCESS: QR code generated, scanned, connected!

### Code Changes Made

**1. Added socks-proxy-agent dependency**
```bash
npm install socks-proxy-agent
```

**2. Modified baileys.ts**
```typescript
import { SocksProxyAgent } from 'socks-proxy-agent';

// In BaileysClientOptions
proxyUrl?: string; // socks5://user:pass@host:port

// In connect() method
let agent: SocksProxyAgent | undefined;
if (this.proxyUrl) {
  agent = new SocksProxyAgent(this.proxyUrl);
}

this.socket = makeWASocket({
  // ... other options
  agent,
});
```

**3. Modified session.ts**
```typescript
// In SessionManagerOptions
defaultProxyUrl?: string;

// In createSession()
const proxyUrl = request.proxyUrl || this.defaultProxyUrl;
```

**4. Modified types.ts**
```typescript
// In CreateSessionRequest
proxyUrl?: string;
```

### Lessons Learned

1. **Always test with residential proxy** — Datacenter IPs are heavily monitored
2. **VPN doesn't help** — VPN exit nodes are also datacenter IPs
3. **nodejs-mobile has limitations** — WebSocket reliability issues
4. **Server-side is better** — More control, easier debugging
5. **Proxy pooling is important** — Single proxy can get rate-limited

---

## Appendix B: Proxy Configuration

### Current Proxy (geonix.com)

```
Provider: geonix.com
Type: SOCKS5 Residential
Host: res.geonix.com
Port: 10000
Login: 4bac75b003ba6c8f
Password: 1Cl0A5wm
Plan: 1GB traffic
Expires: 2026-01-20
URL: socks5://4bac75b003ba6c8f:1Cl0A5wm@res.geonix.com:10000
```

### Usage in API

```bash
# Create session with proxy
curl -X POST http://localhost:3003/sessions \
  -H "Content-Type: application/json" \
  -d '{
    "sessionId": "my-session",
    "proxyUrl": "socks5://4bac75b003ba6c8f:1Cl0A5wm@res.geonix.com:10000"
  }'
```

### Recommended Proxy Providers

| Provider | Type | Price | Notes |
|----------|------|-------|-------|
| geonix.com | Residential | ~$3/GB | Currently using, works well |
| bright.data | Residential | $15/GB | Premium, high reliability |
| oxylabs.io | Residential | $15/GB | Large IP pool |
| smartproxy.com | Residential | $12.5/GB | Good for high volume |

### Proxy Pool Setup (Future)

```typescript
interface ProxyPool {
  proxies: ProxyConfig[];
  strategy: 'round-robin' | 'least-used' | 'random';
  healthCheck: {
    enabled: boolean;
    interval: number;
    timeout: number;
  };
}

interface ProxyConfig {
  url: string;
  weight: number;        // For weighted selection
  maxSessions: number;   // Sessions per proxy
  region?: string;       // Geographic targeting
}
```

---

## Document History

| Version | Date | Author | Changes |
|---------|------|--------|---------|
| 1.0 | 2025-12-20 | Eldoleado Team | Initial version |

---

*End of Technical Specification*
