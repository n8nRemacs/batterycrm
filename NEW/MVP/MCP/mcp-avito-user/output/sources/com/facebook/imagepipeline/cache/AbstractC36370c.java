package com.facebook.imagepipeline.cache;

import com.facebook.common.memory.MemoryTrimType;
import com.facebook.infer.annotation.Nullsafe;
import j.k0;

/* compiled from: AbstractAdaptiveCountingMemoryCache.java */
@J41.d
@Nullsafe
/* renamed from: com.facebook.imagepipeline.cache.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC36370c<K, V> implements s<K, V> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AbstractAdaptiveCountingMemoryCache.java */
    /* renamed from: com.facebook.imagepipeline.cache.c$a */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ a[] f340217b = {new a("LFU", 0), new a("MFU", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        a EF5;

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f340217b.clone();
        }
    }

    /* compiled from: AbstractAdaptiveCountingMemoryCache.java */
    @k0
    /* renamed from: com.facebook.imagepipeline.cache.c$b */
    public class b<E> {
    }

    @Override // com.facebook.imagepipeline.cache.H
    @I41.h
    public final com.facebook.common.references.a<V> b(K k12, com.facebook.common.references.a<V> aVar) {
        k12.getClass();
        aVar.getClass();
        synchronized (this) {
            throw null;
        }
    }

    @Override // wW0.b
    public final void c(MemoryTrimType memoryTrimType) {
        throw null;
    }

    @Override // com.facebook.imagepipeline.cache.H
    @I41.h
    public final com.facebook.common.references.a<V> get(K k12) {
        k12.getClass();
        synchronized (this) {
            throw null;
        }
    }
}
