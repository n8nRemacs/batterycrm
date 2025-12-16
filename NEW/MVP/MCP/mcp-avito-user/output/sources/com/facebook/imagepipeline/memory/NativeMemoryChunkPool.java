package com.facebook.imagepipeline.memory;

import com.facebook.infer.annotation.Nullsafe;

@J41.d
@com.facebook.common.internal.g
@Nullsafe
/* loaded from: classes13.dex */
public class NativeMemoryChunkPool extends x {
    @com.facebook.common.internal.g
    public NativeMemoryChunkPool(wW0.c cVar, G g12, H h12) {
        super(cVar, g12, h12);
    }

    @Override // com.facebook.imagepipeline.memory.x, com.facebook.imagepipeline.memory.BasePool
    public final w d(int i12) {
        return new NativeMemoryChunk(i12);
    }

    @Override // com.facebook.imagepipeline.memory.x
    /* renamed from: r */
    public final w d(int i12) {
        return new NativeMemoryChunk(i12);
    }
}
