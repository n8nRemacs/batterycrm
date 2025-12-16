package com.google.crypto.tink;

import I41.h;
import aZ0.InterfaceC19845a;
import aZ0.InterfaceC19846b;
import aZ0.j;
import com.google.crypto.tink.annotations.Alpha;
import java.security.GeneralSecurityException;

@Alpha
@InterfaceC19846b
@j
/* loaded from: classes6.dex */
public final class SecretKeyAccess {
    private static final SecretKeyAccess INSTANCE = new SecretKeyAccess();

    private SecretKeyAccess() {
    }

    public static SecretKeyAccess instance() {
        return INSTANCE;
    }

    @InterfaceC19845a
    public static SecretKeyAccess requireAccess(@h SecretKeyAccess secretKeyAccess) throws GeneralSecurityException {
        if (secretKeyAccess != null) {
            return secretKeyAccess;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
