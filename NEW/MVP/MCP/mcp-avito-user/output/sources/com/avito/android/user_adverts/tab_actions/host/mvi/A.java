package com.avito.android.user_adverts.tab_actions.host.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;

/* compiled from: UserAdvertsActionsActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class A implements dagger.internal.h<C35641a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f314377a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.user_adverts.tab_actions.host.domain.d f314378b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f314379c;

    public A(Provider provider, com.avito.android.user_adverts.tab_actions.host.domain.d dVar, Provider provider2) {
        this.f314377a = provider;
        this.f314378b = dVar;
        this.f314379c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C35641a(this.f314377a.get(), (com.avito.android.user_adverts.tab_actions.host.domain.a) this.f314378b.get(), this.f314379c.get());
    }
}
