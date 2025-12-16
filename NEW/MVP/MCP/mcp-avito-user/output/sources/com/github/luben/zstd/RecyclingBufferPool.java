package com.github.luben.zstd;

import androidx.appcompat.app.r;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes4.dex */
public class RecyclingBufferPool implements BufferPool {
    public static final BufferPool INSTANCE = new RecyclingBufferPool();
    private static final int buffSize = Math.max(Math.max((int) ZstdOutputStreamNoFinalizer.recommendedCOutSize(), (int) ZstdInputStreamNoFinalizer.recommendedDInSize()), (int) ZstdInputStreamNoFinalizer.recommendedDOutSize());
    private final ConcurrentLinkedQueue<SoftReference<ByteBuffer>> pool = new ConcurrentLinkedQueue<>();

    private RecyclingBufferPool() {
    }

    @Override // com.github.luben.zstd.BufferPool
    public ByteBuffer get(int i12) {
        ByteBuffer byteBuffer;
        int i13 = buffSize;
        if (i12 > i13) {
            throw new RuntimeException(r.l(i12, i13, "Unsupported buffer size: ", ". Supported buffer sizes: ", " or smaller."));
        }
        do {
            SoftReference<ByteBuffer> softReferencePoll = this.pool.poll();
            if (softReferencePoll == null) {
                return ByteBuffer.allocate(buffSize);
            }
            byteBuffer = softReferencePoll.get();
        } while (byteBuffer == null);
        return byteBuffer;
    }

    @Override // com.github.luben.zstd.BufferPool
    public void release(ByteBuffer byteBuffer) {
        if (byteBuffer.capacity() >= buffSize) {
            byteBuffer.clear();
            this.pool.add(new SoftReference<>(byteBuffer));
        }
    }
}
