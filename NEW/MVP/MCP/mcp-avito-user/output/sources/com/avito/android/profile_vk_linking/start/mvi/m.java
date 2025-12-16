package com.avito.android.profile_vk_linking.start.mvi;

import bd0.C25633b;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VkLinkingStartFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final j f231476a;

    /* renamed from: b, reason: collision with root package name */
    public final e f231477b;

    /* renamed from: c, reason: collision with root package name */
    public final o f231478c;

    /* renamed from: d, reason: collision with root package name */
    public final q f231479d;

    public m(j jVar, e eVar, o oVar, q qVar) {
        this.f231476a = jVar;
        this.f231477b = eVar;
        this.f231478c = oVar;
        this.f231479d = qVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = (i) this.f231476a.get();
        c cVar = (c) this.f231477b.get();
        this.f231478c.getClass();
        n nVar = new n();
        p pVar = (p) this.f231479d.get();
        C25633b.f57292e.getClass();
        return new l("VkLinkingStart", C25633b.f57293f, new k(iVar, cVar, pVar, nVar));
    }
}
