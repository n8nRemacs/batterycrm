package com.avito.android.user_viewed.screen.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserViewedActor_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f318426a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.favorite.h> f318427b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.provider.e> f318428c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f318429d;

    public f(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f318426a = uVar;
        this.f318427b = provider;
        this.f318428c = provider2;
        this.f318429d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.user_viewed.domain.business.a) this.f318426a.get(), this.f318427b.get(), this.f318428c.get(), this.f318429d.get());
    }
}
