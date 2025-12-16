package com.google.crypto.tink.tinkkey;

import aZ0.j;

@j
@Deprecated
/* loaded from: classes6.dex */
public final class SecretKeyAccess {
    private SecretKeyAccess() {
    }

    public static KeyAccess insecureSecretAccess() {
        return KeyAccess.secretAccess();
    }
}
