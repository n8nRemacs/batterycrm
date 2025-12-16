package com.avito.android.tariff.cpx.configure.levels.di;

import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;
import kotlin.collections.C42756l;

/* compiled from: TariffCpxConfigureLevelsListModule_ProvideItemPresenters$_avito_tariff_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<Set<TV0.d<?, ?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.tariff.cpx.configure.levels.items.header.d> f296119a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.tariff.cpx.configure.levels.items.level_cards.f> f296120b;

    public j(Provider<com.avito.android.tariff.cpx.configure.levels.items.header.d> provider, Provider<com.avito.android.tariff.cpx.configure.levels.items.level_cards.f> provider2) {
        this.f296119a = provider;
        this.f296120b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.tariff.cpx.configure.levels.items.header.d dVar = this.f296119a.get();
        com.avito.android.tariff.cpx.configure.levels.items.level_cards.f fVar = this.f296120b.get();
        g.f296115a.getClass();
        Set setL0 = C42756l.l0(new TV0.d[]{dVar, fVar});
        t.d(setL0);
        return setL0;
    }
}
