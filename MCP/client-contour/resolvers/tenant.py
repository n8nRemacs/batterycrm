from typing import Optional, Tuple


class TenantResolutionResult:
    def __init__(self, tenant_id: str, domain_id: int, channel_id: int):
        self.tenant_id = tenant_id
        self.domain_id = domain_id
        self.channel_id = channel_id


async def resolve_tenant_mock(channel: str, credential: Optional[str]) -> TenantResolutionResult:
    # Mocked tenant resolution
    return TenantResolutionResult(
        tenant_id="test-tenant-uuid",
        domain_id=1,
        channel_id=1,
    )

