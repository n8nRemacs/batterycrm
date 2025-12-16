package com.google.crypto.tink.mac;

import aZ0.j;

@j
/* loaded from: classes6.dex */
public interface ChunkedMac {
    ChunkedMacComputation createComputation();

    ChunkedMacVerification createVerification(byte[] bArr);
}
