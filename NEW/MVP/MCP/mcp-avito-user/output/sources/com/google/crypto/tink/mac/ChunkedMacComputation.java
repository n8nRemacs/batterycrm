package com.google.crypto.tink.mac;

import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public interface ChunkedMacComputation {
    byte[] computeMac();

    void update(ByteBuffer byteBuffer);
}
