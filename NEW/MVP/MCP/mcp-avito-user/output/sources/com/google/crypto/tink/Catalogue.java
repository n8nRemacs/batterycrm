package com.google.crypto.tink;

@Deprecated
/* loaded from: classes6.dex */
public interface Catalogue<P> {
    KeyManager<P> getKeyManager(String str, String str2, int i12);

    PrimitiveWrapper<?, P> getPrimitiveWrapper();
}
