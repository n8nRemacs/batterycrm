package com.avito.android.tariff.cpr.configure.advance.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CprConfigureAdvanceBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.tariff.cpr.configure.advance.mvi.domain.a> f295474a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f295475b;

    public g(dagger.internal.l lVar, Provider provider) {
        this.f295474a = provider;
        this.f295475b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f295474a.get(), (String) this.f295475b.f393949a);
    }
}
