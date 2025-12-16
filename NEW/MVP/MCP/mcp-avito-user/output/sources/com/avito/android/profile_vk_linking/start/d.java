package com.avito.android.profile_vk_linking.start;

import Mc0.InterfaceC14468a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VkLinkingStartInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14468a> f231420a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.profile_vk_linking.start.mvi.b f231421b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f231422c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f231423d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f231424e;

    public d(Provider provider, com.avito.android.profile_vk_linking.start.mvi.b bVar, Provider provider2, Provider provider3, Provider provider4) {
        this.f231420a = provider;
        this.f231421b = bVar;
        this.f231422c = provider2;
        this.f231423d = provider3;
        this.f231424e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC14468a interfaceC14468a = this.f231420a.get();
        this.f231421b.getClass();
        return new c(interfaceC14468a, new com.avito.android.profile_vk_linking.start.mvi.a(), this.f231422c.get(), this.f231423d.get(), this.f231424e.get());
    }
}
