from typing import Optional


class DialogResolutionResult:
    def __init__(self, dialog_id: str, is_new: bool = False):
        self.dialog_id = dialog_id
        self.is_new = is_new


async def resolve_dialog_mock(
    tenant_id: str,
    client_id: str,
    channel_id: int,
) -> DialogResolutionResult:
    # Mocked dialog resolution (no DB yet)
    return DialogResolutionResult(dialog_id="test-dialog-uuid", is_new=False)

