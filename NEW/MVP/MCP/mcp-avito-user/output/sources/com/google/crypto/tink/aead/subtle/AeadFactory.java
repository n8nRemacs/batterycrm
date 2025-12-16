package com.google.crypto.tink.aead.subtle;

import aZ0.j;
import com.google.crypto.tink.Aead;

@j
/* loaded from: classes6.dex */
public interface AeadFactory {
    Aead createAead(byte[] bArr);

    int getKeySizeInBytes();
}
