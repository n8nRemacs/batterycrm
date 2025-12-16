package com.avito.android.profile_vk_linking.linked_group;

import Mc0.InterfaceC14468a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VkLinkedGroupInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14468a> f231287a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.profile_vk_linking.linked_group.mvi.m f231288b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f231289c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f231290d;

    public e(Provider provider, com.avito.android.profile_vk_linking.linked_group.mvi.m mVar, Provider provider2, Provider provider3) {
        this.f231287a = provider;
        this.f231288b = mVar;
        this.f231289c = provider2;
        this.f231290d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC14468a interfaceC14468a = this.f231287a.get();
        this.f231288b.getClass();
        return new d(interfaceC14468a, new com.avito.android.profile_vk_linking.linked_group.mvi.l(), this.f231289c.get(), this.f231290d.get());
    }
}
