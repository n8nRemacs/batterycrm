package com.avito.android.profile_vk_linking.group_management;

import Mc0.InterfaceC14468a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VkLinkingGroupManagementInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14468a> f231155a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.profile_vk_linking.group_management.mvi.d f231156b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.profile_vk_linking.group_management.mvi.b f231157c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f231158d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f231159e;

    public d(Provider provider, com.avito.android.profile_vk_linking.group_management.mvi.d dVar, com.avito.android.profile_vk_linking.group_management.mvi.b bVar, Provider provider2, Provider provider3) {
        this.f231155a = provider;
        this.f231156b = dVar;
        this.f231157c = bVar;
        this.f231158d = provider2;
        this.f231159e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC14468a interfaceC14468a = this.f231155a.get();
        this.f231156b.getClass();
        com.avito.android.profile_vk_linking.group_management.mvi.c cVar = new com.avito.android.profile_vk_linking.group_management.mvi.c();
        this.f231157c.getClass();
        return new c(interfaceC14468a, cVar, new com.avito.android.profile_vk_linking.group_management.mvi.a(), this.f231158d.get(), this.f231159e.get());
    }
}
