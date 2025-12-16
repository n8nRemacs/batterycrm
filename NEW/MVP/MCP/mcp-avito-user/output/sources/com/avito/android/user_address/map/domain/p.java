package com.avito.android.user_address.map.domain;

import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserAddressAddNewAddressInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class p implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<TG0.a> f307621a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<VG0.a> f307622b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.user_address.a> f307623c;

    public p(Provider<TG0.a> provider, Provider<VG0.a> provider2, Provider<com.avito.android.user_address.a> provider3) {
        this.f307621a = provider;
        this.f307622b = provider2;
        this.f307623c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(dagger.internal.g.a(w.a(this.f307621a)), dagger.internal.g.a(w.a(this.f307622b)), this.f307623c.get());
    }
}
