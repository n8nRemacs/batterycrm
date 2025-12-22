import express, { Request, Response, NextFunction } from "express";
import makeWASocket, {
  DisconnectReason,
  useMultiFileAuthState,
  fetchLatestBaileysVersion,
  makeCacheableSignalKeyStore,
  WAMessageKey,
  delay,
} from "@arceos/baileys";
import * as QRCode from "qrcode";
import pino from "pino";
import * as path from "path";
import * as fs from "fs";

const logger = pino({ level: "info" });

// Config
const PORT = parseInt(process.env.PORT || "8769");
const SESSIONS_DIR = process.env.SESSIONS_DIR || "./sessions";
const WEBHOOK_URL = process.env.WEBHOOK_URL || "";

// Session storage
interface Session {
  socket: ReturnType<typeof makeWASocket> | null;
  qr: string | null;
  qrImage: string | null;
  status: string;
  phone: string | null;
  name: string | null;
  webhookUrl: string;
}

const sessions: Map<string, Session> = new Map();

// Humanization delays
const humanDelay = async (min = 500, max = 2000) => {
  const ms = Math.floor(Math.random() * (max - min + 1)) + min;
  await delay(ms);
};

// Create session with anti-ban settings
async function createSession(sessionId: string, webhookUrl: string = WEBHOOK_URL) {
  const sessionPath = path.join(SESSIONS_DIR, sessionId);
  fs.mkdirSync(sessionPath, { recursive: true });

  const { state, saveCreds } = await useMultiFileAuthState(sessionPath);
  const { version, isLatest } = await fetchLatestBaileysVersion();

  logger.info({ version, isLatest }, "Using Baileys version");

  const session: Session = {
    socket: null,
    qr: null,
    qrImage: null,
    status: "connecting",
    phone: null,
    name: null,
    webhookUrl,
  };
  sessions.set(sessionId, session);

  const socket = makeWASocket({
    version,
    auth: {
      creds: state.creds,
      keys: makeCacheableSignalKeyStore(state.keys, logger),
    },
    logger,
    printQRInTerminal: true,

    // Anti-ban settings from @ArceoS/baileys
    browser: ["Chrome (Linux)", "Chrome", "128.0.6613.120"], // Real browser fingerprint
    syncFullHistory: false,
    markOnlineOnConnect: false, // Don't mark online immediately
    generateHighQualityLinkPreview: true,

    // Message retry
    getMessage: async (key: WAMessageKey) => {
      return { conversation: "" };
    },
  });

  session.socket = socket;

  // Connection events
  socket.ev.on("connection.update", async (update) => {
    const { connection, lastDisconnect, qr } = update;

    if (qr) {
      session.qr = qr;
      session.qrImage = await QRCode.toDataURL(qr);
      session.status = "qr";
      logger.info({ sessionId }, "QR code generated");
    }

    if (connection === "close") {
      const statusCode = (lastDisconnect?.error as any)?.output?.statusCode;
      const shouldReconnect = statusCode !== DisconnectReason.loggedOut;

      logger.warn({ sessionId, statusCode, shouldReconnect }, "Connection closed");
      session.status = "disconnected";

      if (shouldReconnect) {
        // Humanized reconnect delay
        await humanDelay(3000, 10000);
        createSession(sessionId, webhookUrl);
      } else {
        sessions.delete(sessionId);
      }
    } else if (connection === "open") {
      session.status = "connected";
      session.qr = null;
      session.qrImage = null;

      const user = socket.user;
      if (user) {
        session.phone = user.id.split(":")[0].split("@")[0];
        session.name = user.name || "Unknown";
      }

      logger.info({ sessionId, phone: session.phone, name: session.name }, "Connected");

      // Humanized online presence (delayed)
      setTimeout(async () => {
        await socket.sendPresenceUpdate("available");
      }, Math.random() * 5000 + 2000);
    }
  });

  // Save credentials
  socket.ev.on("creds.update", saveCreds);

  // Forward incoming messages to webhook
  socket.ev.on("messages.upsert", async (m) => {
    if (!session.webhookUrl) return;

    for (const msg of m.messages) {
      if (msg.key.fromMe) continue;
      if (!msg.message) continue;

      // Humanized read receipt delay
      await humanDelay(1000, 3000);

      try {
        const response = await fetch(session.webhookUrl, {
          method: "POST",
          headers: { "Content-Type": "application/json" },
          body: JSON.stringify({
            sessionId,
            message: msg,
            type: m.type,
          }),
        });
        logger.info({ sessionId, msgId: msg.key.id }, "Message forwarded to webhook");
      } catch (err) {
        logger.error({ err, sessionId }, "Failed to forward message");
      }
    }
  });

  return session;
}

// Express app
const app = express();
app.use(express.json({ limit: "50mb" }));

// Health check
app.get("/health", (req, res) => {
  res.json({
    status: "ok",
    service: "mcp-whatsapp-arceos",
    version: "1.0.0",
    sessions: sessions.size,
  });
});

// List sessions
app.get("/sessions", (req, res) => {
  const list = Array.from(sessions.entries()).map(([id, s]) => ({
    id,
    status: s.status,
    phone: s.phone,
    name: s.name,
  }));
  res.json({ success: true, data: { sessions: list } });
});

// Create session
app.post("/sessions", async (req, res) => {
  try {
    const { sessionId, webhookUrl } = req.body;
    if (!sessionId) {
      return res.status(400).json({ success: false, error: "sessionId required" });
    }
    if (sessions.has(sessionId)) {
      return res.status(400).json({ success: false, error: "Session exists" });
    }

    await createSession(sessionId, webhookUrl);
    res.json({ success: true, data: { sessionId, message: "Session created" } });
  } catch (err: any) {
    res.status(500).json({ success: false, error: err.message });
  }
});

// Get QR code
app.get("/sessions/:sessionId/qr", async (req, res) => {
  const session = sessions.get(req.params.sessionId);
  if (!session) {
    return res.status(404).json({ success: false, error: "Session not found" });
  }

  if (session.status === "connected") {
    return res.json({ success: true, data: { status: "connected" } });
  }

  res.json({
    success: true,
    data: {
      status: session.status,
      qr: session.qr,
      qrImage: session.qrImage,
    },
  });
});

// Get session status
app.get("/sessions/:sessionId", (req, res) => {
  const session = sessions.get(req.params.sessionId);
  if (!session) {
    return res.status(404).json({ success: false, error: "Session not found" });
  }

  res.json({
    success: true,
    data: {
      sessionId: req.params.sessionId,
      status: session.status,
      phone: session.phone,
      name: session.name,
    },
  });
});

// Send text message with humanization
app.post("/messages/text", async (req, res) => {
  try {
    const { sessionId, to, text } = req.body;
    const session = sessions.get(sessionId);

    if (!session || !session.socket) {
      return res.status(404).json({ success: false, error: "Session not found" });
    }

    if (session.status !== "connected") {
      return res.status(400).json({ success: false, error: "Session not connected" });
    }

    const jid = to.includes("@") ? to : `${to}@s.whatsapp.net`;

    // Humanization: typing indicator
    await session.socket.sendPresenceUpdate("composing", jid);

    // Humanized typing delay based on message length
    const typingDelay = Math.min(text.length * 50, 5000) + Math.random() * 1000;
    await delay(typingDelay);

    // Send message
    const result = await session.socket.sendMessage(jid, { text });

    // Stop typing
    await session.socket.sendPresenceUpdate("paused", jid);

    res.json({
      success: true,
      data: {
        messageId: result?.key.id,
        timestamp: Date.now(),
        status: "sent",
      },
    });
  } catch (err: any) {
    res.status(500).json({ success: false, error: err.message });
  }
});

// Delete session
app.delete("/sessions/:sessionId", async (req, res) => {
  const session = sessions.get(req.params.sessionId);
  if (!session) {
    return res.status(404).json({ success: false, error: "Session not found" });
  }

  try {
    if (session.socket) {
      await session.socket.logout();
    }
    sessions.delete(req.params.sessionId);

    // Delete session files
    const sessionPath = path.join(SESSIONS_DIR, req.params.sessionId);
    fs.rmSync(sessionPath, { recursive: true, force: true });

    res.json({ success: true, data: { message: "Session deleted" } });
  } catch (err: any) {
    res.status(500).json({ success: false, error: err.message });
  }
});

// Restore existing sessions on startup
async function restoreSessions() {
  if (!fs.existsSync(SESSIONS_DIR)) {
    fs.mkdirSync(SESSIONS_DIR, { recursive: true });
    return;
  }

  const dirs = fs.readdirSync(SESSIONS_DIR);
  for (const dir of dirs) {
    const sessionPath = path.join(SESSIONS_DIR, dir);
    if (fs.statSync(sessionPath).isDirectory()) {
      logger.info({ sessionId: dir }, "Restoring session");
      await createSession(dir);
      // Stagger session restores
      await humanDelay(2000, 5000);
    }
  }
}

// Start server
async function main() {
  await restoreSessions();

  app.listen(PORT, "0.0.0.0", () => {
    logger.info({ port: PORT }, "Server started");
  });
}

main().catch((err) => {
  logger.error({ err }, "Failed to start");
  process.exit(1);
});
