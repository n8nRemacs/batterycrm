package com.facebook.imagepipeline.cache;

import com.facebook.infer.annotation.Nullsafe;
import java.util.LinkedHashMap;

/* compiled from: CountingLruMap.java */
@J41.d
@Nullsafe
/* loaded from: classes12.dex */
public class r<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final N<V> f340246a;

    /* renamed from: b, reason: collision with root package name */
    @J41.a
    public final LinkedHashMap<K, V> f340247b = new LinkedHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    @J41.a
    public int f340248c = 0;

    public r(N<V> n12) {
        this.f340246a = n12;
    }

    public final synchronized int a() {
        return this.f340247b.size();
    }

    public final synchronized int b() {
        return this.f340248c;
    }

    @I41.h
    public final synchronized void c(Object obj, Object obj2) {
        V vRemove = this.f340247b.remove(obj);
        this.f340248c -= vRemove == null ? 0 : ((E) this.f340246a).a(vRemove);
        this.f340247b.put(obj, obj2);
        this.f340248c += ((E) this.f340246a).a(obj2);
    }

    @I41.h
    public final synchronized V d(K k12) {
        V vRemove;
        vRemove = this.f340247b.remove(k12);
        this.f340248c -= vRemove == null ? 0 : ((E) this.f340246a).a(vRemove);
        return vRemove;
    }
}
