"""
Pydantic models for Tunnel Server
"""

from datetime import datetime
from typing import Optional, Dict, Any, List
from enum import Enum
from pydantic import BaseModel, Field


# === Enums ===

class ChannelType(str, Enum):
    WHATSAPP = "whatsapp"
    TELEGRAM = "telegram"
    AVITO = "avito"
    MAX = "max"
    VK = "vk"
    HTTP_PROXY = "http_proxy"


class MessageDirection(str, Enum):
    INCOMING = "incoming"  # From client
    OUTGOING = "outgoing"  # To client


class MessageStatus(str, Enum):
    RECEIVED = "received"  # Incoming message received
    PENDING_APPROVAL = "pending_approval"  # Operator audio waiting for approval
    APPROVED = "approved"  # Operator approved transcription
    SENT = "sent"  # Sent to client
    DELIVERED = "delivered"  # Delivered to client
    READ = "read"  # Read by client
    FAILED = "failed"  # Failed to send


class SenderType(str, Enum):
    CLIENT = "client"
    OPERATOR = "operator"
    AI = "ai"
    SYSTEM = "system"


# === Tunnel Protocol ===

class TunnelCommand(BaseModel):
    """Command from server to phone"""
    id: str
    action: str  # http_request, ping, status
    service: Optional[str] = None
    method: Optional[str] = None
    path: Optional[str] = None
    headers: Optional[Dict[str, str]] = None
    body: Optional[Dict[str, Any]] = None


class TunnelResponse(BaseModel):
    """Response from phone to server"""
    id: str
    status: Optional[int] = None
    headers: Optional[Dict[str, str]] = None
    body: Optional[Any] = None
    error: Optional[str] = None


class TunnelIncoming(BaseModel):
    """Incoming message from phone (client message)"""
    action: str = "incoming"
    service: str
    data: Dict[str, Any]
    timestamp: Optional[str] = None


# === Messages ===

class NormalizedMessage(BaseModel):
    """
    Unified message format for all channels.
    This is what flows through the pipeline.
    """
    # Identifiers
    id: str
    external_id: Optional[str] = None  # Original ID from channel

    # Routing
    tenant_id: str
    channel: ChannelType
    channel_account_id: Optional[str] = None  # Which account sent/received

    # Dialog
    dialog_id: Optional[str] = None
    chat_id: str  # External chat ID from channel

    # Message content
    direction: MessageDirection
    status: Optional[str] = None  # MessageStatus value
    sender_type: SenderType
    sender_id: Optional[str] = None
    sender_name: Optional[str] = None

    text: str = ""
    media_type: Optional[str] = None  # photo, video, document, voice, audio
    media_url: Optional[str] = None
    media_id: Optional[str] = None

    # Audio processing
    is_audio: bool = False
    audio_duration: Optional[int] = None  # seconds
    transcription: Optional[str] = None  # Transcribed text
    normalized_text: Optional[str] = None  # Beautified text (for operator audio)

    # Metadata
    timestamp: datetime = Field(default_factory=datetime.utcnow)
    raw_data: Optional[Dict[str, Any]] = None  # Original message from channel


class MessageContext(BaseModel):
    """
    Context loaded for message processing.
    Passed to AI Core.
    """
    # Tenant
    tenant_id: str
    tenant_name: Optional[str] = None
    tenant_settings: Optional[Dict[str, Any]] = None

    # Client
    client_id: Optional[str] = None
    client_name: Optional[str] = None
    client_phone: Optional[str] = None
    client_history: Optional[List[Dict]] = None  # Previous interactions

    # Dialog
    dialog_id: Optional[str] = None
    dialog_status: Optional[str] = None
    dialog_stage: Optional[str] = None

    # Recent messages
    messages: List[NormalizedMessage] = []

    # Graph data (from Neo4j)
    devices: Optional[List[Dict]] = None
    issues: Optional[List[Dict]] = None

    # AI settings
    ai_freedom_level: int = 50  # 0-100
    operation_mode: str = "assist"  # auto, assist


# === Pipeline Results ===

class PreAIResult(BaseModel):
    """Result of Pre-AI pipeline"""
    message: NormalizedMessage
    context: MessageContext

    # Decision
    needs_ai: bool = True
    skip_reason: Optional[str] = None  # Why AI was skipped

    # Routing
    assigned_operator_id: Optional[str] = None


class AudioProcessingResult(BaseModel):
    """Result of audio processing (transcription + normalization)"""
    transcription: Optional[str] = None  # Raw transcription
    normalized_text: Optional[str] = None  # Beautified text (operator audio only)
    processing_time_ms: Optional[int] = None
    model: Optional[str] = None


class AIResponse(BaseModel):
    """Response from AI Core (audio processing only, no auto-replies)"""
    # Audio processing results
    audio_processed: bool = False
    audio_result: Optional[AudioProcessingResult] = None

    # Extracted data (device info, problem, etc.)
    extracted_data: Optional[Dict[str, Any]] = None

    # Metadata
    processing_time_ms: Optional[int] = None


class PostAIResult(BaseModel):
    """Result of Post-AI pipeline"""
    # Original
    message: NormalizedMessage
    context: MessageContext

    # AI response (if any)
    ai_response: Optional[AIResponse] = None

    # Final response to send
    response_text: Optional[str] = None
    response_media: Optional[Dict] = None

    # Actions taken
    actions_executed: List[str] = []

    # Notifications
    notify_operators: bool = False
    operator_ids: List[str] = []


# === API Models ===

class SendMessageRequest(BaseModel):
    """Request to send message through tunnel"""
    tenant_id: str
    channel: ChannelType
    chat_id: str
    text: str
    media_type: Optional[str] = None
    media_url: Optional[str] = None
    operator_id: Optional[str] = None


class SendMediaRequest(BaseModel):
    """Request to send media through tunnel"""
    tenant_id: str
    channel: ChannelType
    chat_id: str
    media_type: str  # photo, video, voice, document
    media_url: Optional[str] = None
    media_base64: Optional[str] = None  # Alternative: base64 encoded
    filename: Optional[str] = None
    caption: Optional[str] = None
    operator_id: Optional[str] = None


class TunnelStatus(BaseModel):
    """Status of a connected tunnel"""
    server_id: str
    connected: bool
    connected_at: Optional[datetime] = None
    services: List[str] = []
    stats: Dict[str, Any] = {}


# === Client Proxy Models ===

class ProxyNodeType(str, Enum):
    """Type of proxy node"""
    OPERATOR = "operator"  # Employee phone (high priority)
    CLIENT = "client"  # Customer phone (requires consent)


class ProxyNodeStatus(str, Enum):
    """Status of proxy node"""
    ONLINE = "online"
    BUSY = "busy"
    OFFLINE = "offline"
    DISABLED = "disabled"


class ProxyNode(BaseModel):
    """Proxy node (phone that can execute fetch requests)"""
    node_id: str
    node_type: ProxyNodeType
    tenant_id: str

    # Connection
    server_id: str  # Tunnel connection ID
    connected: bool = False
    connected_at: Optional[datetime] = None

    # Consent & Settings
    consent_given: bool = False
    consent_date: Optional[datetime] = None
    wifi_only: bool = True
    max_requests_per_hour: int = 5

    # Stats
    requests_completed: int = 0
    requests_failed: int = 0
    last_request_at: Optional[datetime] = None
    total_bonus_earned: float = 0.0

    # Current status
    status: ProxyNodeStatus = ProxyNodeStatus.OFFLINE
    current_request_id: Optional[str] = None


class ProxyRequest(BaseModel):
    """Request to be executed via client proxy"""
    id: str
    tenant_id: str

    # Request details
    url: str
    method: str = "GET"
    headers: Optional[Dict[str, str]] = None
    body: Optional[str] = None
    timeout: int = 30
    follow_redirects: bool = True

    # Routing
    priority: int = 0  # Higher = more urgent
    assigned_node_id: Optional[str] = None

    # Status
    status: str = "pending"  # pending, assigned, executing, completed, failed
    created_at: datetime = Field(default_factory=datetime.utcnow)
    completed_at: Optional[datetime] = None

    # Result
    response_status: Optional[int] = None
    response_headers: Optional[Dict[str, str]] = None
    response_body: Optional[str] = None
    error: Optional[str] = None


class ProxyConsentRequest(BaseModel):
    """Request to register proxy consent"""
    tenant_id: str
    client_id: str
    device_id: str
    wifi_only: bool = True
    max_requests_per_hour: int = 5


class ProxyFetchRequest(BaseModel):
    """Request to fetch URL via client proxies"""
    tenant_id: str
    url: str
    method: str = "GET"
    headers: Optional[Dict[str, str]] = None
    body: Optional[str] = None
    timeout: int = 30
    priority: int = 0


class ProxyFetchResponse(BaseModel):
    """Response from proxy fetch"""
    request_id: str
    success: bool
    status: Optional[int] = None
    headers: Optional[Dict[str, str]] = None
    body: Optional[str] = None
    url: Optional[str] = None  # Final URL after redirects
    node_id: Optional[str] = None
    error: Optional[str] = None
    processing_time_ms: Optional[int] = None


class ProxyStats(BaseModel):
    """Statistics for proxy usage"""
    total_nodes: int = 0
    online_nodes: int = 0
    client_nodes: int = 0
    operator_nodes: int = 0
    requests_today: int = 0
    requests_success_rate: float = 0.0
