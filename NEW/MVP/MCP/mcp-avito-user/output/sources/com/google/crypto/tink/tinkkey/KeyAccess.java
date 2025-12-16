package com.google.crypto.tink.tinkkey;

import aZ0.j;

@j
@Deprecated
/* loaded from: classes6.dex */
public final class KeyAccess {
    private final boolean canAccessSecret;

    private KeyAccess(boolean z12) {
        this.canAccessSecret = z12;
    }

    public static KeyAccess publicAccess() {
        return new KeyAccess(false);
    }

    public static KeyAccess secretAccess() {
        return new KeyAccess(true);
    }

    public boolean canAccessSecret() {
        return this.canAccessSecret;
    }
}
