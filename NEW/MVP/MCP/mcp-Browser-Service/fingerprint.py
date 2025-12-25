"""
Browser Fingerprint Generator.

Creates unique, consistent fingerprints for each tenant.
Same tenant_id always gets same fingerprint (deterministic).
"""

import hashlib
import random
from typing import Dict, Any


# User-Agent templates (Chrome on Windows)
USER_AGENTS = [
    "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/{version}.0.0.0 Safari/537.36",
    "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/{version}.0.{build}.{patch} Safari/537.36",
]

CHROME_VERSIONS = ["120", "121", "122", "123", "124", "125"]

# Screen resolutions (common desktop)
VIEWPORTS = [
    {"width": 1920, "height": 1080},
    {"width": 1366, "height": 768},
    {"width": 1536, "height": 864},
    {"width": 1440, "height": 900},
    {"width": 1680, "height": 1050},
    {"width": 2560, "height": 1440},
]

# Timezones (Russia)
TIMEZONES = [
    "Europe/Moscow",
    "Europe/Samara",
    "Asia/Yekaterinburg",
    "Europe/Kaliningrad",
]

# Locales
LOCALES = ["ru-RU", "ru"]


def _hash_to_int(tenant_id: str, salt: str = "") -> int:
    """Convert tenant_id to deterministic integer."""
    h = hashlib.md5(f"{tenant_id}{salt}".encode()).hexdigest()
    return int(h, 16)


def generate_fingerprint(tenant_id: str) -> Dict[str, Any]:
    """
    Generate unique browser fingerprint for tenant.

    Same tenant_id always produces same fingerprint.
    Different tenants get different fingerprints.

    Args:
        tenant_id: Unique tenant identifier

    Returns:
        Dict with browser context options for Playwright
    """
    # Seed random with tenant_id for consistency
    seed = _hash_to_int(tenant_id)
    rng = random.Random(seed)

    # Select Chrome version
    version = rng.choice(CHROME_VERSIONS)
    build = rng.randint(5000, 6500)
    patch = rng.randint(100, 300)

    # Generate User-Agent
    ua_template = rng.choice(USER_AGENTS)
    user_agent = ua_template.format(version=version, build=build, patch=patch)

    # Select viewport
    viewport = rng.choice(VIEWPORTS)

    # Select timezone
    timezone = rng.choice(TIMEZONES)

    # Select locale
    locale = rng.choice(LOCALES)

    # Device scale factor (1 or 1.25 or 1.5)
    device_scale = rng.choice([1, 1.25, 1.5])

    return {
        "user_agent": user_agent,
        "viewport": viewport,
        "device_scale_factor": device_scale,
        "locale": locale,
        "timezone_id": timezone,
        "color_scheme": "light",
        "has_touch": False,
        "is_mobile": False,
        "java_script_enabled": True,
        # Extra metadata (not Playwright options)
        "_meta": {
            "tenant_id": tenant_id,
            "chrome_version": version,
            "fingerprint_hash": hashlib.md5(tenant_id.encode()).hexdigest()[:8],
        }
    }


def get_playwright_context_options(tenant_id: str, storage_path: str = None) -> Dict[str, Any]:
    """
    Get Playwright browser context options for tenant.

    Args:
        tenant_id: Unique tenant identifier
        storage_path: Path to save/load session state

    Returns:
        Dict ready for browser.new_context(**options)
    """
    fp = generate_fingerprint(tenant_id)

    # Remove meta, keep only Playwright options
    meta = fp.pop("_meta", {})

    options = {
        **fp,
        "accept_downloads": True,
        "ignore_https_errors": True,
    }

    # Add storage state if provided
    if storage_path:
        options["storage_state"] = storage_path

    return options


# Test
if __name__ == "__main__":
    # Same tenant = same fingerprint
    fp1 = generate_fingerprint("remaks")
    fp2 = generate_fingerprint("remaks")
    assert fp1 == fp2, "Same tenant should have same fingerprint"

    # Different tenants = different fingerprints
    fp3 = generate_fingerprint("autoservice")
    assert fp1 != fp3, "Different tenants should have different fingerprints"

    print("Tenant 'remaks':")
    print(f"  UA: {fp1['user_agent'][:60]}...")
    print(f"  Viewport: {fp1['viewport']}")
    print(f"  Timezone: {fp1['timezone_id']}")

    print("\nTenant 'autoservice':")
    print(f"  UA: {fp3['user_agent'][:60]}...")
    print(f"  Viewport: {fp3['viewport']}")
    print(f"  Timezone: {fp3['timezone_id']}")

    print("\n✅ Fingerprint generator works!")
