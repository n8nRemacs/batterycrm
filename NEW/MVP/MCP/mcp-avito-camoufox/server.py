"""
Avito Camoufox Service - Multi-account Avito with isolated fingerprints.

Architecture:
- Each account = isolated Camoufox browser
- Each browser = unique fingerprint (saved on disk)
- Support for 20+ accounts (2 IP × 10)
- Android sends credentials → Server logs in
- Automatic session maintenance

Flow:
1. Android: User enters phone/password
2. Android: POST /account/{id}/login → Server
3. Server: Camoufox enters credentials on Avito
4. Avito: Sends SMS to user's phone
5. Android: User enters SMS code
6. Android: POST /account/{id}/sms → Server
7. Server: Completes login, starts WebSocket
8. Server: Auto-maintains session (health checks, reconnects)
9. If session dies → webhook to Android for re-auth

Endpoints:
- POST /account/{id}/create      Create account session
- POST /account/{id}/login       Login with phone/password
- POST /account/{id}/sms         Submit SMS code
- GET  /account/{id}/status      Get account status
- GET  /account/{id}/health      Get session health
- GET  /account/{id}/chats       Get chats
- POST /account/{id}/send        Send message
- POST /account/{id}/listen      Start WebSocket listener
- DELETE /account/{id}           Close account session

- GET  /accounts                 List all accounts
- GET  /health                   Health check
- GET  /health/all               All sessions health
"""

import asyncio
import json
import logging
from pathlib import Path
from typing import Optional, Dict, Any
from contextlib import asynccontextmanager

from fastapi import FastAPI, HTTPException, BackgroundTasks
from pydantic import BaseModel

from session_manager import SessionManager, Session
from avito_channel import AvitoChannel
from session_keeper import session_keeper, CookieRefresher

logging.basicConfig(
    level=logging.INFO,
    format="%(asctime)s [%(levelname)s] %(name)s: %(message)s"
)
logger = logging.getLogger("avito-camoufox")

# Configuration
DATA_DIR = Path("/data/avito-camoufox")
PORT = 8793
MAX_ACCOUNTS = 20  # 2 IP × 10 accounts

# Global state
manager: Optional[SessionManager] = None
channels: Dict[str, AvitoChannel] = {}
pending_auth: Dict[str, str] = {}  # account_id -> reason


def on_auth_required(account_id: str, reason: str):
    """Callback when re-authentication is required."""
    pending_auth[account_id] = reason
    logger.warning(f"[{account_id}] Auth required: {reason}")


@asynccontextmanager
async def lifespan(app: FastAPI):
    """Initialize on startup, cleanup on shutdown."""
    global manager

    logger.info(f"Starting Avito Camoufox Service on port {PORT}")
    logger.info(f"Data directory: {DATA_DIR}")
    logger.info(f"Max accounts: {MAX_ACCOUNTS}")

    # Create session manager
    manager = SessionManager(data_dir=DATA_DIR, max_sessions=MAX_ACCOUNTS)

    # Setup session keeper callback
    session_keeper.set_auth_callback(on_auth_required)

    yield

    # Cleanup
    logger.info("Shutting down...")
    await session_keeper.stop_all()
    for channel in channels.values():
        await channel.stop_listening()
    await manager.close_all()
    logger.info("Shutdown complete")


app = FastAPI(
    title="Avito Camoufox Service",
    description="Multi-account Avito with isolated browser fingerprints",
    version="1.0.0",
    lifespan=lifespan,
)


# === Models ===

class LoginRequest(BaseModel):
    phone: str
    password: str


class SMSRequest(BaseModel):
    code: str


class SendMessageRequest(BaseModel):
    chat_id: str
    text: str


# === Health ===

@app.get("/health")
async def health():
    """Health check."""
    stats = await manager.get_stats() if manager else {}
    return {
        "service": "avito-camoufox",
        "status": "ok",
        "port": PORT,
        **stats,
    }


# === Account Management ===

@app.get("/accounts")
async def list_accounts():
    """List all accounts (active and saved)."""
    if not manager:
        raise HTTPException(500, "Not initialized")

    return {
        "active": manager.get_active_sessions(),
        "all": manager.get_all_accounts(),
    }


@app.post("/account/{account_id}/create")
async def create_account(account_id: str):
    """Create account session (generates unique fingerprint)."""
    if not manager:
        raise HTTPException(500, "Not initialized")

    try:
        session = await manager.get_session(account_id)
        return {
            "account_id": account_id,
            "status": "created",
            "logged_in": session.state.logged_in,
            "fingerprint_saved": (session.data_dir / "fingerprint.json").exists(),
        }
    except RuntimeError as e:
        raise HTTPException(400, str(e))


@app.post("/account/{account_id}/start")
async def start_account(account_id: str):
    """Start browser for an already logged-in session."""
    if not manager:
        raise HTTPException(500, "Not initialized")

    session = await manager.get_session(account_id)

    if not session.state.logged_in:
        raise HTTPException(400, "Session not logged in. Use /login first")

    # Start browser if needed
    await manager.start_browser(session)

    # Create channel handler if not exists
    if account_id not in channels:
        channel = AvitoChannel(
            page=session.page,
            account_id=account_id,
        )
        channels[account_id] = channel

    return {
        "account_id": account_id,
        "status": "started",
        "logged_in": session.state.logged_in,
        "browser_running": session.browser is not None,
    }


@app.delete("/account/{account_id}")
async def close_account(account_id: str):
    """Close account session."""
    if not manager:
        raise HTTPException(500, "Not initialized")

    if account_id in channels:
        await channels[account_id].stop_listening()
        del channels[account_id]

    await manager.close_session(account_id)
    return {"account_id": account_id, "status": "closed"}


@app.get("/account/{account_id}/status")
async def account_status(account_id: str):
    """Get account status."""
    if not manager:
        raise HTTPException(500, "Not initialized")

    if account_id not in manager._sessions:
        # Load from disk
        session = await manager.get_session(account_id)
    else:
        session = manager._sessions[account_id]

    ws_status = None
    if account_id in channels:
        ws_status = await channels[account_id].get_ws_status()

    return {
        "account_id": account_id,
        "state": session.state.to_dict(),
        "browser_running": session.browser is not None,
        "websocket": ws_status,
    }


# === Login ===

@app.post("/account/{account_id}/login")
async def login_account(account_id: str, req: LoginRequest):
    """
    Login with phone and password.

    Flow:
    1. Android collects phone/password
    2. Android calls this endpoint
    3. Server starts browser and enters credentials
    4. Returns "sms_required" if SMS needed
    """
    if not manager:
        raise HTTPException(500, "Not initialized")

    session = await manager.get_session(account_id)

    # Start browser if needed
    await manager.start_browser(session)

    # Create channel handler
    channel = AvitoChannel(
        page=session.page,
        account_id=account_id,
    )
    channels[account_id] = channel

    # Login
    result = await channel.login_with_credentials(req.phone, req.password)

    if result["status"] == "success":
        session.state.logged_in = True
        session.state.phone = req.phone

        # Get profile
        try:
            profile = await channel.get_profile()
            session.state.hash_id = profile.get("public_id")
            session.state.user_id = str(profile.get("id"))
            session.state.user_name = profile.get("name")
        except:
            pass

    return {
        "account_id": account_id,
        **result,
    }


@app.post("/account/{account_id}/sms")
async def submit_sms(account_id: str, req: SMSRequest, background_tasks: BackgroundTasks):
    """Submit SMS verification code."""
    if account_id not in channels:
        raise HTTPException(400, "Login not started. Call /login first")

    channel = channels[account_id]
    session = manager._sessions[account_id]

    result = await channel.submit_sms_code(req.code)

    if result["status"] == "success":
        session.state.logged_in = True

        # Clear pending auth
        if account_id in pending_auth:
            del pending_auth[account_id]

        # Get profile
        try:
            profile = await channel.get_profile()
            session.state.hash_id = profile.get("public_id")
            session.state.user_id = str(profile.get("id"))
            session.state.user_name = profile.get("name")
        except:
            pass

        # Start session keeper (auto health checks)
        background_tasks.add_task(
            session_keeper.start_monitoring,
            account_id,
            channel
        )

        # Auto-start WebSocket listener
        def on_message(msg):
            session_keeper.record_ws_message(account_id)
            logger.info(f"[{account_id}] Message: {msg.get('data', {}).get('value', {}).get('body', {}).get('text', '')[:50]}")

        channel.on_message = on_message
        session.ws_task = asyncio.create_task(channel.start_listening())
        logger.info(f"[{account_id}] WebSocket auto-started after login")

    return {
        "account_id": account_id,
        **result,
    }


@app.post("/account/{account_id}/request-sms")
async def request_sms(account_id: str):
    """Request SMS code instead of push notification."""
    if account_id not in channels:
        raise HTTPException(400, "Login not started. Call /login first")

    channel = channels[account_id]
    result = await channel.request_sms_code()

    return {
        "account_id": account_id,
        **result,
    }


@app.get("/account/{account_id}/page")
async def get_page(account_id: str):
    """Get current page content for debugging."""
    if account_id not in channels:
        raise HTTPException(400, "Session not active")

    channel = channels[account_id]
    return await channel.get_page_content()


@app.post("/account/{account_id}/messenger")
async def go_to_messenger(account_id: str):
    """Navigate to messenger and get chats from page."""
    if account_id not in channels:
        raise HTTPException(400, "Session not active")

    channel = channels[account_id]
    return await channel.navigate_to_messenger()


@app.post("/account/{account_id}/extract-hash-id")
async def extract_hash_id(account_id: str):
    """Extract hash_id from page (tries multiple sources)."""
    if account_id not in channels:
        raise HTTPException(400, "Session not active")

    channel = channels[account_id]
    hash_id = await channel._extract_hash_id()

    if hash_id:
        # Update session state
        session = manager._sessions.get(account_id)
        if session:
            session.state.hash_id = hash_id

        return {"hash_id": hash_id, "status": "found"}
    else:
        return {"hash_id": None, "status": "not_found"}


@app.get("/account/{account_id}/debug-scripts")
async def debug_scripts(account_id: str):
    """Debug: show script contents that might contain user ID."""
    if account_id not in channels:
        raise HTTPException(400, "Session not active")

    channel = channels[account_id]

    # Get script contents that might have user info
    result = await channel.page.evaluate("""
        () => {
            const scripts = document.querySelectorAll('script');
            const relevant = [];
            const patterns = ['userId', 'user_id', 'publicId', 'public_id', 'hash_id', 'my_hash_id', '"id":', 'user'];

            for (let script of scripts) {
                const text = script.textContent || '';
                if (text.length > 50 && text.length < 50000) {
                    for (let pattern of patterns) {
                        if (text.toLowerCase().includes(pattern.toLowerCase())) {
                            // Extract relevant portion
                            const idx = text.toLowerCase().indexOf(pattern.toLowerCase());
                            const snippet = text.substring(Math.max(0, idx - 50), Math.min(text.length, idx + 150));
                            relevant.push({
                                pattern: pattern,
                                snippet: snippet,
                                scriptLength: text.length
                            });
                            break;
                        }
                    }
                }
            }
            return relevant;
        }
    """)

    return {"scripts": result, "count": len(result)}


@app.get("/account/{account_id}/debug-links")
async def debug_links(account_id: str):
    """Debug: show links that might contain user ID."""
    if account_id not in channels:
        raise HTTPException(400, "Session not active")

    channel = channels[account_id]

    result = await channel.page.evaluate("""
        () => {
            const links = [];
            const allLinks = document.querySelectorAll('a[href]');
            for (let link of allLinks) {
                const href = link.getAttribute('href');
                if (href && (href.includes('user') || href.includes('profile') || href.includes('id=') || href.includes('messenger'))) {
                    links.push({
                        href: href.substring(0, 200),
                        text: (link.textContent || '').substring(0, 50)
                    });
                }
            }
            return links.slice(0, 30);
        }
    """)

    return {"links": result, "count": len(result)}


@app.post("/account/{account_id}/set-hash-id")
async def set_hash_id(account_id: str, hash_id: str):
    """Manually set hash_id for the account."""
    if account_id not in channels:
        raise HTTPException(400, "Session not active")

    channel = channels[account_id]
    channel._hash_id = hash_id

    # Update session state
    session = manager._sessions.get(account_id)
    if session:
        session.state.hash_id = hash_id

    return {"account_id": account_id, "hash_id": hash_id, "status": "set"}


@app.get("/account/{account_id}/debug-ws")
async def debug_ws(account_id: str):
    """Debug: check for existing WebSocket connections on page."""
    if account_id not in channels:
        raise HTTPException(400, "Session not active")

    channel = channels[account_id]

    result = await channel.page.evaluate("""
        () => {
            const info = {};

            // Check for window WebSocket references
            for (let key of Object.keys(window)) {
                if (window[key] && window[key] instanceof WebSocket) {
                    info[key] = {
                        url: window[key].url,
                        readyState: window[key].readyState
                    };
                }
                // Check for nested WS
                if (window[key] && typeof window[key] === 'object' && window[key].ws instanceof WebSocket) {
                    info[key + '.ws'] = {
                        url: window[key].ws.url,
                        readyState: window[key].ws.readyState
                    };
                }
            }

            // Check performance entries for WebSocket
            const wsEntries = performance.getEntriesByType('resource')
                .filter(e => e.name.includes('socket') || e.name.includes('wss://'))
                .map(e => e.name);

            return {
                windowSockets: info,
                resourceEntries: wsEntries.slice(0, 10)
            };
        }
    """)

    return result


@app.post("/account/{account_id}/goto-profile")
async def goto_profile(account_id: str):
    """Navigate to profile page and extract public_id from URL."""
    if account_id not in channels:
        raise HTTPException(400, "Session not active")

    channel = channels[account_id]

    # Go to profile/basic which shows user's public page link
    await channel.page.goto("https://www.avito.ru/profile/basic", wait_until="domcontentloaded")
    await asyncio.sleep(3)

    # Try to find public profile link
    result = await channel.page.evaluate("""
        () => {
            // Look for link to public profile
            const links = document.querySelectorAll('a[href*="/user/"]');
            for (let link of links) {
                const href = link.getAttribute('href');
                const match = href.match(/\\/user\\/([a-zA-Z0-9_-]+)/);
                if (match && match[1]) return { public_id: match[1], href: href };
            }

            // Look in page text
            const text = document.body.innerText;
            const match = text.match(/avito\\.ru\\/user\\/([a-zA-Z0-9_-]+)/);
            if (match) return { public_id: match[1], from: 'text' };

            // Check for profile ID in visible elements
            const profileElements = document.querySelectorAll('[class*="profile"]');
            for (let el of profileElements) {
                const id = el.getAttribute('data-profile-id') || el.getAttribute('data-user-id');
                if (id) return { public_id: id, from: 'data-attr' };
            }

            return { public_id: null };
        }
    """)

    if result.get("public_id"):
        channel._hash_id = result["public_id"]
        session = manager._sessions.get(account_id)
        if session:
            session.state.hash_id = result["public_id"]

    return {
        "url": channel.page.url,
        **result
    }


# === Avito Operations ===

@app.get("/account/{account_id}/profile")
async def get_profile(account_id: str):
    """Get Avito profile."""
    if account_id not in channels:
        raise HTTPException(400, "Session not active")

    channel = channels[account_id]
    return await channel.get_profile()


@app.get("/account/{account_id}/chats")
async def get_chats(account_id: str, limit: int = 50):
    """Get list of chats."""
    if account_id not in channels:
        raise HTTPException(400, "Session not active")

    channel = channels[account_id]
    chats = await channel.get_chats(limit)
    return {"chats": chats, "count": len(chats)}


@app.get("/account/{account_id}/messages/{chat_id}")
async def get_messages(account_id: str, chat_id: str, limit: int = 50):
    """Get messages from chat."""
    if account_id not in channels:
        raise HTTPException(400, "Session not active")

    channel = channels[account_id]
    messages = await channel.get_messages(chat_id, limit)
    return {"messages": messages, "count": len(messages)}


@app.post("/account/{account_id}/send")
async def send_message(account_id: str, req: SendMessageRequest):
    """Send message."""
    if account_id not in channels:
        raise HTTPException(400, "Session not active")

    channel = channels[account_id]
    result = await channel.send_message(req.chat_id, req.text)
    return {"success": True, "result": result}


# === WebSocket ===

@app.post("/account/{account_id}/listen/start")
async def start_listening(account_id: str, background_tasks: BackgroundTasks):
    """Start WebSocket listener for real-time messages."""
    if account_id not in channels:
        raise HTTPException(400, "Session not active")

    channel = channels[account_id]
    session = manager._sessions[account_id]

    # Start in background
    def on_message(msg):
        logger.info(f"[{account_id}] New message: {msg.get('data', {}).get('value', {}).get('body', {}).get('text', '')[:50]}")

    channel.on_message = on_message
    session.ws_task = asyncio.create_task(channel.start_listening())

    return {"account_id": account_id, "status": "listening_started"}


@app.post("/account/{account_id}/listen/stop")
async def stop_listening(account_id: str):
    """Stop WebSocket listener."""
    if account_id not in channels:
        raise HTTPException(400, "Session not active")

    channel = channels[account_id]
    await channel.stop_listening()

    return {"account_id": account_id, "status": "listening_stopped"}


@app.get("/account/{account_id}/ws/status")
async def ws_status(account_id: str):
    """Get WebSocket status."""
    if account_id not in channels:
        return {"connected": False, "reason": "Session not active"}

    channel = channels[account_id]
    return await channel.get_ws_status()


# === Health & Monitoring ===

@app.get("/account/{account_id}/health")
async def account_health(account_id: str):
    """Get session health status."""
    health = session_keeper.get_health(account_id)
    if not health:
        return {"account_id": account_id, "status": "not_monitored"}
    return health


@app.get("/health/all")
async def all_health():
    """Get health status for all sessions."""
    return {
        "sessions": session_keeper.get_all_health(),
        "pending_auth": pending_auth,
    }


@app.get("/account/{account_id}/pending-auth")
async def check_pending_auth(account_id: str):
    """
    Check if re-authentication is required.
    Android should poll this endpoint to know when to show login form.
    """
    if account_id in pending_auth:
        return {
            "auth_required": True,
            "reason": pending_auth[account_id],
        }
    return {"auth_required": False}


@app.get("/pending-auth")
async def all_pending_auth():
    """Get all accounts that need re-authentication."""
    return {
        "accounts": [
            {"account_id": acc_id, "reason": reason}
            for acc_id, reason in pending_auth.items()
        ],
        "count": len(pending_auth),
    }


# === Cookie Management ===

@app.get("/account/{account_id}/cookies")
async def get_cookies(account_id: str):
    """Get account cookies (for debugging)."""
    if account_id not in channels:
        raise HTTPException(400, "Session not active")

    channel = channels[account_id]
    try:
        cookies = await channel.page.context.cookies()
        # Filter sensitive cookies
        safe_cookies = [
            {
                "name": c["name"],
                "domain": c["domain"],
                "expires": c.get("expires"),
                "has_value": bool(c.get("value")),
            }
            for c in cookies
        ]
        return {"cookies": safe_cookies}
    except Exception as e:
        raise HTTPException(500, f"Failed to get cookies: {e}")


@app.post("/account/{account_id}/refresh")
async def refresh_session(account_id: str):
    """Try to silently refresh session (without re-login)."""
    if account_id not in channels:
        raise HTTPException(400, "Session not active")

    channel = channels[account_id]

    # Check if needs refresh
    needs = await CookieRefresher.needs_refresh(channel.page)
    if not needs:
        return {"status": "not_needed", "message": "Cookies still valid"}

    # Try silent refresh
    success = await CookieRefresher.try_silent_refresh(channel.page)

    if success:
        session_keeper.record_api_success(account_id)
        return {"status": "refreshed", "message": "Session refreshed successfully"}
    else:
        return {"status": "failed", "message": "Silent refresh failed. Re-login required."}


# === Main ===

if __name__ == "__main__":
    import uvicorn

    uvicorn.run(
        "server:app",
        host="0.0.0.0",
        port=PORT,
        reload=True,
    )
