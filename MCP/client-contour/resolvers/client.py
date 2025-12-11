from typing import Optional


class ClientResolutionResult:
    def __init__(self, client_id: str, is_new: bool = False):
        self.client_id = client_id
        self.is_new = is_new


async def resolve_client_mock(
    tenant_id: str,
    channel_id: int,
    external_chat_id: str,
    phone: Optional[str] = None,
    name: Optional[str] = None,
) -> ClientResolutionResult:
    # Mocked client resolution (no DB yet)
    return ClientResolutionResult(client_id="test-client-uuid", is_new=False)

