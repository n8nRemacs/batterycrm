package com.avito.android.tariff.cpr.configure.advance.di;

import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;
import kotlin.collections.C42756l;

/* compiled from: CprConfigureListModule_ProvideItemPresenters$_avito_tariff_cpr_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<Set<TV0.d<?, ?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.tariff.cpr.configure.advance.items.header.d> f295213a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.tariff.cpr.configure.advance.items.hints.d> f295214b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.tariff.cpr.configure.advance.items.reviews.d> f295215c;

    public i(Provider<com.avito.android.tariff.cpr.configure.advance.items.header.d> provider, Provider<com.avito.android.tariff.cpr.configure.advance.items.hints.d> provider2, Provider<com.avito.android.tariff.cpr.configure.advance.items.reviews.d> provider3) {
        this.f295213a = provider;
        this.f295214b = provider2;
        this.f295215c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.tariff.cpr.configure.advance.items.header.d dVar = this.f295213a.get();
        com.avito.android.tariff.cpr.configure.advance.items.hints.d dVar2 = this.f295214b.get();
        com.avito.android.tariff.cpr.configure.advance.items.reviews.d dVar3 = this.f295215c.get();
        e.f295207a.getClass();
        Set setL0 = C42756l.l0(new TV0.d[]{dVar, dVar2, dVar3});
        dagger.internal.t.d(setL0);
        return setL0;
    }
}
