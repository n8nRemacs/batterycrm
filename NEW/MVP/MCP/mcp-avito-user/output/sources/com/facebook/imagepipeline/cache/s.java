package com.facebook.imagepipeline.cache;

import com.facebook.infer.annotation.Nullsafe;
import j.k0;

/* compiled from: CountingMemoryCache.java */
@Nullsafe
/* loaded from: classes12.dex */
public interface s<K, V> extends H<K, V>, wW0.b {

    /* compiled from: CountingMemoryCache.java */
    @k0
    public static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final K f340249a;

        /* renamed from: b, reason: collision with root package name */
        public final com.facebook.common.references.a<V> f340250b;

        /* renamed from: c, reason: collision with root package name */
        public int f340251c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f340252d;

        /* renamed from: e, reason: collision with root package name */
        @I41.h
        public final b<K> f340253e;

        public a(K k12, com.facebook.common.references.a<V> aVar, @I41.h b<K> bVar, int i12) {
            k12.getClass();
            this.f340249a = k12;
            com.facebook.common.references.a<V> aVarB = com.facebook.common.references.a.b(aVar);
            aVarB.getClass();
            this.f340250b = aVarB;
            this.f340251c = 0;
            this.f340252d = false;
            this.f340253e = bVar;
        }
    }

    /* compiled from: CountingMemoryCache.java */
    public interface b<K> {
        void a();
    }
}
