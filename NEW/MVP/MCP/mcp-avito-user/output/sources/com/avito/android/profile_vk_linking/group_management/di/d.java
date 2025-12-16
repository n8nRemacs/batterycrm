package com.avito.android.profile_vk_linking.group_management.di;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VkLinkingGroupManagementModule_ProvideAdapterFactory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class d implements h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f231183a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f231184b;

    public d(u uVar, Provider provider) {
        this.f231183a = uVar;
        this.f231184b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f231183a.get();
        com.avito.konveyor.a aVar2 = this.f231184b.get();
        c.f231182a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
