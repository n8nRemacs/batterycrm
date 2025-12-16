package com.google.crypto.tink.subtle;

import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public interface StreamSegmentDecrypter {
    void decryptSegment(ByteBuffer byteBuffer, int i12, boolean z12, ByteBuffer byteBuffer2);

    void init(ByteBuffer byteBuffer, byte[] bArr);
}
