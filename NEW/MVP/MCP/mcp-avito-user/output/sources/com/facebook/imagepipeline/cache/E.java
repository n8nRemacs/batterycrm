package com.facebook.imagepipeline.cache;

import com.facebook.imagepipeline.cache.s;

/* compiled from: LruCountingMemoryCache.java */
/* loaded from: classes12.dex */
class E implements N<s.a<Object, Object>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f340197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f340198b;

    public E(G g12, N n12) {
        this.f340198b = g12;
        this.f340197a = n12;
    }

    @Override // com.facebook.imagepipeline.cache.N
    public final int a(s.a<Object, Object> aVar) {
        this.f340198b.getClass();
        return this.f340197a.a(aVar.f340250b.i());
    }
}
