package com.google.crypto.tink.subtle;

import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public interface StreamSegmentEncrypter {
    void encryptSegment(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z12, ByteBuffer byteBuffer3);

    void encryptSegment(ByteBuffer byteBuffer, boolean z12, ByteBuffer byteBuffer2);

    ByteBuffer getHeader();
}
