package com.google.crypto.tink.hybrid.internal;

import aZ0.j;

@j
/* loaded from: classes6.dex */
interface HpkeAead {
    byte[] getAeadId();

    int getKeyLength();

    int getNonceLength();

    byte[] open(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    byte[] seal(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);
}
