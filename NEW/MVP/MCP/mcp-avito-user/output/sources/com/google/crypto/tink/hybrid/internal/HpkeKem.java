package com.google.crypto.tink.hybrid.internal;

import aZ0.j;

@j
/* loaded from: classes6.dex */
interface HpkeKem {
    byte[] decapsulate(byte[] bArr, HpkeKemPrivateKey hpkeKemPrivateKey);

    HpkeKemEncapOutput encapsulate(byte[] bArr);

    byte[] getKemId();
}
