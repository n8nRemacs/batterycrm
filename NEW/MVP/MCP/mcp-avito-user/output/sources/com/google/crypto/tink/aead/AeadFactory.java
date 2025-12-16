package com.google.crypto.tink.aead;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.KeysetHandle;

@Deprecated
/* loaded from: classes6.dex */
public final class AeadFactory {
    private AeadFactory() {
    }

    @Deprecated
    public static Aead getPrimitive(KeysetHandle keysetHandle) {
        AeadWrapper.register();
        return (Aead) keysetHandle.getPrimitive(Aead.class);
    }
}
