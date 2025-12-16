package com.avito.android.profile.host.mvi;

import dagger.internal.x;
import dagger.internal.y;
import hz.InterfaceC41196a;
import javax.inject.Provider;

/* compiled from: UserProfileHostActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.profile.host.mvi.domain.f f222405a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.account.plugin.rx.a> f222406b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC41196a> f222407c;

    public f(com.avito.android.profile.host.mvi.domain.f fVar, Provider provider, Provider provider2) {
        this.f222405a = fVar;
        this.f222406b = provider;
        this.f222407c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.profile.host.mvi.domain.e) this.f222405a.get(), this.f222406b.get(), this.f222407c.get());
    }
}
