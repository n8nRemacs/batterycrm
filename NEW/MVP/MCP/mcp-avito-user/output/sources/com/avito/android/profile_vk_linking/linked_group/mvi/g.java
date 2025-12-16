package com.avito.android.profile_vk_linking.linked_group.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VkLinkedGroupFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f231307a;

    /* renamed from: b, reason: collision with root package name */
    public final b f231308b;

    /* renamed from: c, reason: collision with root package name */
    public final i f231309c;

    /* renamed from: d, reason: collision with root package name */
    public final k f231310d;

    public g(d dVar, b bVar, i iVar, k kVar) {
        this.f231307a = dVar;
        this.f231308b = bVar;
        this.f231309c = iVar;
        this.f231310d = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f231307a.get();
        a aVar = (a) this.f231308b.get();
        this.f231309c.getClass();
        h hVar = new h();
        j jVar = (j) this.f231310d.get();
        Yc0.b.f19592g.getClass();
        return new f("VkLinkedGroup", Yc0.b.f19593h, new e(cVar, aVar, jVar, hVar));
    }
}
