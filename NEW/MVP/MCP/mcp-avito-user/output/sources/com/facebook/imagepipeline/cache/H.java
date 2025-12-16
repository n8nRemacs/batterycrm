package com.facebook.imagepipeline.cache;

import com.facebook.common.memory.MemoryTrimType;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: MemoryCache.java */
@Nullsafe
/* loaded from: classes12.dex */
public interface H<K, V> extends wW0.b, com.facebook.cache.common.f {

    /* compiled from: MemoryCache.java */
    public interface a {
        double a(MemoryTrimType memoryTrimType);
    }

    @I41.h
    com.facebook.common.references.a<V> b(K k12, com.facebook.common.references.a<V> aVar);

    @I41.h
    com.facebook.common.references.a<V> get(K k12);
}
