package com.avito.android.user_address.list.domain;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserAddressListInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.geo_common.interactor.g> f307364a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.user_address.a> f307365b;

    public i(Provider<com.avito.android.geo_common.interactor.g> provider, Provider<com.avito.android.user_address.a> provider2) {
        this.f307364a = provider;
        this.f307365b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f307364a.get(), this.f307365b.get());
    }
}
