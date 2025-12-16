package com.facebook.imagepipeline.cache;

import com.facebook.common.memory.MemoryTrimType;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: InstrumentedMemoryCache.java */
@Nullsafe
/* loaded from: classes12.dex */
public class B<K, V> implements H<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final H<K, V> f340194a;

    /* renamed from: b, reason: collision with root package name */
    public final J f340195b;

    public B(H<K, V> h12, J j12) {
        this.f340194a = h12;
        this.f340195b = j12;
    }

    @Override // com.facebook.imagepipeline.cache.H
    @I41.h
    public final com.facebook.common.references.a<V> b(K k12, com.facebook.common.references.a<V> aVar) {
        this.f340195b.c(k12);
        return this.f340194a.b(k12, aVar);
    }

    @Override // wW0.b
    public final void c(MemoryTrimType memoryTrimType) {
        this.f340194a.c(memoryTrimType);
    }

    @Override // com.facebook.imagepipeline.cache.H
    @I41.h
    public final com.facebook.common.references.a<V> get(K k12) {
        com.facebook.common.references.a<V> aVar = this.f340194a.get(k12);
        J j12 = this.f340195b;
        if (aVar == null) {
            j12.b(k12);
        } else {
            j12.a(k12);
        }
        return aVar;
    }
}
