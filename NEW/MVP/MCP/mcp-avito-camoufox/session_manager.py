"""
Session Manager - Isolated Camoufox sessions with unique fingerprints.

Architecture:
- Each account = isolated Camoufox instance
- Each instance = unique fingerprint (saved on disk)
- Persistent sessions (cookies, storage)
- Support for 20+ accounts (2 IP × 10)

Directory structure:
/data/sessions/
├── account_1/
│   ├── fingerprint.json    <- Saved fingerprint
│   ├── profile/            <- Firefox profile (cookies, storage)
│   └── state.json          <- Session state (logged_in, hash_id, seq)
├── account_2/
│   └── ...
"""

import asyncio
import json
import logging
from pathlib import Path
from typing import Dict, Optional, Any
from dataclasses import dataclass, field
from datetime import datetime

from browserforge.fingerprints import FingerprintGenerator, Fingerprint

logger = logging.getLogger(__name__)


@dataclass
class SessionState:
    """State of a single Avito session."""
    account_id: str
    logged_in: bool = False
    phone: Optional[str] = None
    hash_id: Optional[str] = None
    user_id: Optional[str] = None
    user_name: Optional[str] = None
    seq: int = 0
    last_activity: Optional[str] = None
    created_at: Optional[str] = None

    def to_dict(self) -> Dict[str, Any]:
        return {
            "account_id": self.account_id,
            "logged_in": self.logged_in,
            "phone": self.phone,
            "hash_id": self.hash_id,
            "user_id": self.user_id,
            "user_name": self.user_name,
            "seq": self.seq,
            "last_activity": self.last_activity,
            "created_at": self.created_at,
        }

    @classmethod
    def from_dict(cls, data: Dict[str, Any]) -> "SessionState":
        return cls(**data)


@dataclass
class Session:
    """A single Camoufox session."""
    account_id: str
    state: SessionState
    fingerprint: Optional[Fingerprint] = None
    browser: Any = None  # Camoufox instance
    page: Any = None     # Browser page
    ws_task: Optional[asyncio.Task] = None
    data_dir: Path = None

    @property
    def profile_dir(self) -> Path:
        return self.data_dir / "profile"

    @property
    def fingerprint_path(self) -> Path:
        return self.data_dir / "fingerprint.json"

    @property
    def state_path(self) -> Path:
        return self.data_dir / "state.json"


class SessionManager:
    """
    Manages multiple isolated Camoufox sessions.

    Features:
    - Unique fingerprint per session (generated once, saved)
    - Persistent browser profiles (cookies survive restart)
    - Lazy loading (browser starts only when needed)
    - Graceful shutdown with state save
    """

    def __init__(self, data_dir: Path, max_sessions: int = 20):
        self.data_dir = Path(data_dir)
        self.data_dir.mkdir(parents=True, exist_ok=True)
        self.max_sessions = max_sessions

        self._sessions: Dict[str, Session] = {}
        self._lock = asyncio.Lock()
        self._fingerprint_generator = FingerprintGenerator(
            browser='firefox',
            os='linux'
        )

        logger.info(f"SessionManager initialized: data_dir={data_dir}, max={max_sessions}")

    def _get_session_dir(self, account_id: str) -> Path:
        """Get data directory for account."""
        session_dir = self.data_dir / account_id
        session_dir.mkdir(parents=True, exist_ok=True)
        return session_dir

    def _load_fingerprint(self, session_dir: Path) -> Optional[dict]:
        """Load fingerprint from disk."""
        fp_path = session_dir / "fingerprint.json"
        if fp_path.exists():
            try:
                data = json.loads(fp_path.read_text(encoding="utf-8"))
                logger.info(f"Loaded fingerprint from {fp_path}")
                return data
            except Exception as e:
                logger.warning(f"Failed to load fingerprint: {e}")
        return None

    def _save_fingerprint(self, session_dir: Path, fingerprint: Fingerprint):
        """Save fingerprint to disk."""
        fp_path = session_dir / "fingerprint.json"
        try:
            # Convert fingerprint to serializable dict
            fp_dict = {
                "navigator": {
                    "userAgent": fingerprint.navigator.userAgent if fingerprint.navigator else None,
                    "platform": fingerprint.navigator.platform if fingerprint.navigator else None,
                    "language": fingerprint.navigator.language if fingerprint.navigator else None,
                },
                "screen": {
                    "width": fingerprint.screen.width if fingerprint.screen else None,
                    "height": fingerprint.screen.height if fingerprint.screen else None,
                },
                "generated_at": datetime.now().isoformat(),
            }
            fp_path.write_text(json.dumps(fp_dict, indent=2, ensure_ascii=False), encoding="utf-8")
            logger.info(f"Saved fingerprint to {fp_path}")
        except Exception as e:
            logger.warning(f"Failed to save fingerprint: {e}")

    def _load_state(self, session_dir: Path, account_id: str) -> SessionState:
        """Load session state from disk."""
        state_path = session_dir / "state.json"
        if state_path.exists():
            try:
                data = json.loads(state_path.read_text(encoding="utf-8"))
                logger.info(f"Loaded state for {account_id}")
                return SessionState.from_dict(data)
            except Exception as e:
                logger.warning(f"Failed to load state: {e}")

        return SessionState(
            account_id=account_id,
            created_at=datetime.now().isoformat()
        )

    def _save_state(self, session: Session):
        """Save session state to disk."""
        try:
            session.state.last_activity = datetime.now().isoformat()
            session.state_path.write_text(
                json.dumps(session.state.to_dict(), indent=2, ensure_ascii=False),
                encoding="utf-8"
            )
        except Exception as e:
            logger.warning(f"Failed to save state: {e}")

    async def get_session(self, account_id: str) -> Session:
        """Get or create session for account."""
        async with self._lock:
            if account_id in self._sessions:
                return self._sessions[account_id]

            if len(self._sessions) >= self.max_sessions:
                raise RuntimeError(f"Max sessions reached: {self.max_sessions}")

            session_dir = self._get_session_dir(account_id)

            # Load or generate fingerprint
            saved_fp = self._load_fingerprint(session_dir)
            if saved_fp:
                fingerprint = None  # Will use saved config
            else:
                fingerprint = self._fingerprint_generator.generate()
                self._save_fingerprint(session_dir, fingerprint)

            # Load state
            state = self._load_state(session_dir, account_id)

            # Create session object (browser not started yet)
            session = Session(
                account_id=account_id,
                state=state,
                fingerprint=fingerprint,
                data_dir=session_dir,
            )

            self._sessions[account_id] = session
            logger.info(f"Session created for {account_id}")

            return session

    async def start_browser(self, session: Session) -> Any:
        """Start Camoufox browser for session."""
        if session.browser:
            return session.browser

        try:
            from camoufox.async_api import AsyncCamoufox

            # Build options
            options = {
                "headless": True,
                "persistent_context": True,
                "user_data_dir": str(session.profile_dir),
            }

            # Add fingerprint if we have one
            if session.fingerprint:
                options["fingerprint"] = session.fingerprint

            # Start browser
            browser = await AsyncCamoufox(**options).__aenter__()
            session.browser = browser

            # Get first page or create one
            pages = browser.pages if hasattr(browser, 'pages') else []
            if pages:
                session.page = pages[0]
            else:
                session.page = await browser.new_page()

            logger.info(f"Browser started for {session.account_id}")
            return browser

        except ImportError:
            logger.error("Camoufox not installed. Run: pip install camoufox && camoufox fetch")
            raise
        except Exception as e:
            logger.error(f"Failed to start browser for {session.account_id}: {e}")
            raise

    async def stop_browser(self, session: Session):
        """Stop browser and save state."""
        if session.browser:
            try:
                self._save_state(session)
                await session.browser.__aexit__(None, None, None)
                session.browser = None
                session.page = None
                logger.info(f"Browser stopped for {session.account_id}")
            except Exception as e:
                logger.error(f"Error stopping browser: {e}")

    async def close_session(self, account_id: str):
        """Close session and cleanup."""
        async with self._lock:
            if account_id in self._sessions:
                session = self._sessions[account_id]

                # Stop WebSocket
                if session.ws_task:
                    session.ws_task.cancel()
                    try:
                        await session.ws_task
                    except asyncio.CancelledError:
                        pass

                # Stop browser
                await self.stop_browser(session)

                del self._sessions[account_id]
                logger.info(f"Session closed: {account_id}")

    async def close_all(self):
        """Close all sessions."""
        account_ids = list(self._sessions.keys())
        for account_id in account_ids:
            await self.close_session(account_id)
        logger.info("All sessions closed")

    def get_all_accounts(self) -> list:
        """Get list of all account directories (including inactive)."""
        accounts = []
        for path in self.data_dir.iterdir():
            if path.is_dir() and (path / "state.json").exists():
                state = self._load_state(path, path.name)
                accounts.append(state.to_dict())
        return accounts

    def get_active_sessions(self) -> Dict[str, dict]:
        """Get all active sessions."""
        return {
            account_id: session.state.to_dict()
            for account_id, session in self._sessions.items()
        }

    async def get_stats(self) -> Dict[str, Any]:
        """Get manager statistics."""
        return {
            "active_sessions": len(self._sessions),
            "max_sessions": self.max_sessions,
            "data_dir": str(self.data_dir),
            "accounts": list(self._sessions.keys()),
        }
