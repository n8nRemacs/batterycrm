package com.facebook.imagepipeline.memory;

import defpackage.fz4;
import defpackage.mf9;
import defpackage.rf9;
import defpackage.w5c;
import defpackage.x5c;

@fz4
/* loaded from: classes.dex */
public class NativeMemoryChunkPool extends mf9 {
    @fz4
    public NativeMemoryChunkPool(rf9 rf9Var, w5c w5cVar, x5c x5cVar) {
        super(rf9Var, w5cVar, x5cVar);
    }

    @Override // defpackage.kk0
    public final Object e(int i) {
        return new NativeMemoryChunk(i);
    }
}
