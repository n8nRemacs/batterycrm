package com.google.crypto.tink;

/* loaded from: classes6.dex */
public interface KeyWrap {
    byte[] unwrap(byte[] bArr);

    byte[] wrap(byte[] bArr);
}
