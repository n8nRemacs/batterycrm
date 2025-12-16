package com.github.luben.zstd;

import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public interface BufferPool {
    ByteBuffer get(int i12);

    void release(ByteBuffer byteBuffer);
}
