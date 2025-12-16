package com.avito.android.user_viewed.screen.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserViewedBootstrap_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f318440a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.favorite.h> f318441b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f318442c;

    public j(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f318440a = uVar;
        this.f318441b = provider;
        this.f318442c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.user_viewed.domain.business.a) this.f318440a.get(), this.f318441b.get(), this.f318442c.get());
    }
}
