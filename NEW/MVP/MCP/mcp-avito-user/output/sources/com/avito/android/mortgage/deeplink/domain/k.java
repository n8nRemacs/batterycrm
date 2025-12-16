package com.avito.android.mortgage.deeplink.domain;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MortgageApplicationsRepository_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class k implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<IZ.a> f198837a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f198838b;

    public k(Provider<IZ.a> provider, Provider<R0> provider2) {
        this.f198837a = provider;
        this.f198838b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f198838b.get(), dagger.internal.g.b(this.f198837a));
    }
}
