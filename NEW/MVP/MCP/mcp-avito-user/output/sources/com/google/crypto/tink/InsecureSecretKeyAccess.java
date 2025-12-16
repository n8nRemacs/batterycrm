package com.google.crypto.tink;

import aZ0.InterfaceC19846b;
import aZ0.j;
import com.google.crypto.tink.annotations.Alpha;

@Alpha
@InterfaceC19846b
@j
/* loaded from: classes6.dex */
public final class InsecureSecretKeyAccess {
    private InsecureSecretKeyAccess() {
    }

    public static SecretKeyAccess get() {
        return SecretKeyAccess.instance();
    }
}
