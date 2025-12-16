package com.avito.android.profile_vk_linking.start.mvi;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VkLinkingStartBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final u f231468a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f231469b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f231470c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<E> f231471d;

    public j(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f231468a = uVar;
        this.f231469b = provider;
        this.f231470c = provider2;
        this.f231471d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.profile_vk_linking.start.b) this.f231468a.get(), this.f231469b.get(), this.f231470c.get(), this.f231471d.get());
    }
}
