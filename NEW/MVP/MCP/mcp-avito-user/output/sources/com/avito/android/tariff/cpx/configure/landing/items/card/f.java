package com.avito.android.tariff.cpx.configure.landing.items.card;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpxConfigureLandingCardItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f295977a;

    /* renamed from: b, reason: collision with root package name */
    public final l f295978b;

    public f(l lVar, Provider provider) {
        this.f295977a = provider;
        this.f295978b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f295977a.get(), (Y41.l) this.f295978b.f393949a);
    }
}
