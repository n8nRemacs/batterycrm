package com.facebook.imagepipeline.cache;

import com.facebook.common.memory.PooledByteBuffer;

/* compiled from: EncodedCountingMemoryCacheFactory.java */
/* loaded from: classes12.dex */
final class x implements N<PooledByteBuffer> {
    @Override // com.facebook.imagepipeline.cache.N
    public final int a(PooledByteBuffer pooledByteBuffer) {
        return pooledByteBuffer.size();
    }
}
