# MAX Voice/Video Calls Architecture

## Overview

MAX (formerly TamTam/ICQ) uses the **OK.ru externcalls SDK** for voice and video calls. The architecture consists of:

```
+-------------------+     WebSocket/WebTransport     +-------------------+
|                   |  (Signaling)                   |                   |
|   MAX Client      |<------------------------------>|   MAX Server      |
|                   |                                |                   |
|   WebRTC          |     SRTP/DTLS                  |   Media Server    |
|   (Media)         |<------------------------------>|   (SFU)           |
+-------------------+                                +-------------------+
          |
          v
   STUN/TURN Servers
```

## Key Components

### 1. Main WebSocket API (User API)
- **URL:** `wss://ws-api.oneme.ru/websocket`
- **Purpose:** Authentication, messaging, presence, call initiation events
- **Protocol:** JSON packets with opcodes

### 2. Call Signaling (Separate Connection)
- **WebTransport URL:** `wss://vcalls.max.ru/...` (HTTP/3 based)
- **WebSocket Fallback:** `wss://msgws.max.ru/...`
- **Purpose:** SDP offer/answer exchange, ICE candidates
- **Protocol:** JSON messages over WebSocket/WebTransport

### 3. Media Transport (WebRTC)
- **Protocol:** WebRTC with SRTP
- **Codecs:** Opus (audio), VP8/VP9/H264 (video)
- **ICE:** STUN/TURN servers provided by MAX

---

## Call Flow

### Outgoing Call (Caller)

```
1. User API: Get STUN/TURN servers
          |
2. vchat.startConversation API call
          |
3. Server returns: conversationId, signalingEndpoint, iceServers
          |
4. Open signaling WebSocket/WebTransport to signalingEndpoint
          |
5. WebRTC: Create PeerConnection with iceServers
          |
6. WebRTC: Create offer (SDP)
          |
7. Signaling: Send offer to server
          |
8. Wait for answer (SDP) from callee
          |
9. WebRTC: Set remote description
          |
10. Exchange ICE candidates via signaling
          |
11. Media flows directly (P2P) or via server (SFU)
```

### Incoming Call (Callee)

```
1. Push notification or WebSocket event with conversationId
          |
2. vchat.joinConversation API call
          |
3. Server returns: signalingEndpoint, iceServers
          |
4. Open signaling WebSocket/WebTransport
          |
5. Receive offer (SDP) from caller
          |
6. WebRTC: Create PeerConnection, set remote description
          |
7. WebRTC: Create answer (SDP)
          |
8. Signaling: Send answer to server
          |
9. Exchange ICE candidates
          |
10. Media flows
```

---

## API Methods

### REST API (vchat.*)

| Method | Description |
|--------|-------------|
| `vchat.startConversation` | Initiate a call |
| `vchat.joinConversation` | Join an existing call |
| `vchat.joinConversationByLink` | Join by invite link |
| `vchat.hangupConversation` | End the call |
| `vchat.createJoinLink` | Create invite link |
| `vchat.removeJoinLink` | Remove invite link |
| `vchat.getConversationParams` | Get call parameters |
| `vchat.clientStats` | Send call analytics |

### Parameters (vchat.startConversation)

```json
{
  "turnServers": "turn:turn.max.ru:443",
  "conversationId": "uuid-v4",
  "isVideo": true,
  "createJoinLink": false,
  "protocolVersion": 6,
  "domainId": "optional",
  "payload": "optional"
}
```

### Response

```json
{
  "conversationId": "uuid",
  "signalingEndpoint": "wss://vcalls.max.ru/...",
  "iceServers": [
    {"urls": ["stun:stun.max.ru:443"]},
    {"urls": ["turn:turn.max.ru:443"], "username": "...", "credential": "..."}
  ]
}
```

---

## Signaling Protocol

### WebTransport/WebSocket Messages

Messages are JSON with type field:

```json
// SDP Offer
{
  "type": "offer",
  "sdp": "v=0\r\no=- ...",
  "conversationId": "uuid"
}

// SDP Answer
{
  "type": "answer",
  "sdp": "v=0\r\no=- ...",
  "conversationId": "uuid"
}

// ICE Candidate
{
  "type": "candidate",
  "candidate": "candidate:... typ host ...",
  "sdpMid": "audio",
  "sdpMLineIndex": 0
}

// Hangup
{
  "type": "hangup",
  "reason": "user_hangup"
}
```

---

## WebRTC Configuration

### ICE Servers (from server response)

```javascript
{
  iceServers: [
    { urls: "stun:stun.max.ru:443" },
    {
      urls: "turn:turn.max.ru:443",
      username: "1234567890:user_id",
      credential: "base64_password"
    }
  ],
  iceTransportPolicy: "all" // or "relay" for forced TURN
}
```

### Media Constraints

```javascript
{
  audio: {
    echoCancellation: true,
    noiseSuppression: true,
    autoGainControl: true
  },
  video: {
    width: { ideal: 1280 },
    height: { ideal: 720 },
    frameRate: { ideal: 30 }
  }
}
```

---

## SDK Classes (from decompiled code)

| Class | Purpose |
|-------|---------|
| `ConversationFactory` | Creates call instances |
| `ConversationImpl` | Main call logic |
| `SignalingTransportBuilder` | Creates signaling connection |
| `WTSignaling` | WebTransport signaling |
| `MediaConnectionManager` | WebRTC connection management |
| `CameraManager` | Camera control |
| `MicrophoneManager` | Audio control |
| `ScreenCaptureManager` | Screen sharing |

---

## Implementation Complexity

### Why calls are "very complex":

1. **Multiple protocols:**
   - WebSocket for User API
   - WebTransport/WebSocket for signaling
   - WebRTC for media

2. **Native code required:**
   - WebRTC is a native library (libwebrtc)
   - Python has `aiortc` but it's limited

3. **Codec support:**
   - Hardware codec acceleration
   - Software fallbacks

4. **NAT traversal:**
   - STUN for direct connections
   - TURN relay for firewalled networks

5. **Error handling:**
   - Network changes
   - Codec negotiation failures
   - ICE connection failures

---

## Integration Options

### Option 1: Python with aiortc (Limited)

```python
import aiortc
from aiortc import RTCPeerConnection, RTCSessionDescription

# Limitations:
# - No hardware codec acceleration
# - Limited video codec support
# - High CPU usage for video
# - Good for audio-only or testing
```

### Option 2: Native Android/iOS

Use MAX's own SDK (ru.ok.android.externcalls.sdk)
- Full WebRTC support
- Hardware codecs
- Native UI integration

### Option 3: Electron/WebView

```javascript
// Use browser's WebRTC implementation
const pc = new RTCPeerConnection(config);
// Connect to MAX signaling server
// Full browser codec support
```

### Option 4: External WebRTC Service

Integrate with Twilio, Vonage, etc.
- Not compatible with MAX directly
- Would need bridge/gateway

---

## Recommendations for Eldoleado

### Short-term (MVP)
- **Don't implement calls** - focus on messaging which is working
- If needed, forward call events to native MAX app via intent

### Medium-term
- Use Electron/WebView for web-based calls
- Integrate browser WebRTC with MAX signaling

### Long-term
- Native Android implementation using MAX SDK
- Full voice/video support

---

## Files to Study

| File | Path |
|------|------|
| Conversation SDK | `ru/ok/android/externcalls/sdk/` |
| Signaling | `ru/ok/android/externcalls/sdk/signaling/` |
| WebTransport | `ru/ok/android/externcalls/sdk/wt/` |
| WebRTC wrapper | `org/webrtc/` |
| Call UI | `one/me/calls/` |

---

## Event Opcodes (Suspected)

Based on code analysis, call-related events likely use opcodes:
- **192-196** - Call signaling events (unconfirmed)
- **Push notifications** - Incoming call alerts

Note: The exact opcodes need traffic capture to confirm.
