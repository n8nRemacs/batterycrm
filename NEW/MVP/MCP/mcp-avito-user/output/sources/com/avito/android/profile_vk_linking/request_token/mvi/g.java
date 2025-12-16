package com.avito.android.profile_vk_linking.request_token.mvi;

import Zc0.C19541d;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VkRequestTokenFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f231383a;

    /* renamed from: b, reason: collision with root package name */
    public final b f231384b;

    /* renamed from: c, reason: collision with root package name */
    public final i f231385c;

    /* renamed from: d, reason: collision with root package name */
    public final k f231386d;

    public g(d dVar, b bVar, i iVar, k kVar) {
        this.f231383a = dVar;
        this.f231384b = bVar;
        this.f231385c = iVar;
        this.f231386d = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f231383a.get();
        a aVar = (a) this.f231384b.get();
        this.f231385c.getClass();
        h hVar = new h();
        j jVar = (j) this.f231386d.get();
        C19541d.f20306c.getClass();
        return new f("VkRequestToken", C19541d.f20307d, new e(cVar, aVar, jVar, hVar));
    }
}
