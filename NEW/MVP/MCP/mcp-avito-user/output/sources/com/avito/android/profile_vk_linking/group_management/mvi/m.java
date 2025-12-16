package com.avito.android.profile_vk_linking.group_management.mvi;

import Wc0.C15743a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VkLinkingGroupManagementFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final j f231222a;

    /* renamed from: b, reason: collision with root package name */
    public final f f231223b;

    /* renamed from: c, reason: collision with root package name */
    public final o f231224c;

    /* renamed from: d, reason: collision with root package name */
    public final q f231225d;

    public m(j jVar, f fVar, o oVar, q qVar) {
        this.f231222a = jVar;
        this.f231223b = fVar;
        this.f231224c = oVar;
        this.f231225d = qVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = (i) this.f231222a.get();
        e eVar = (e) this.f231223b.get();
        this.f231224c.getClass();
        n nVar = new n();
        p pVar = (p) this.f231225d.get();
        C15743a.f17979e.getClass();
        return new l("VkLinkingGroupManagement", C15743a.f17980f, new k(iVar, eVar, pVar, nVar));
    }
}
