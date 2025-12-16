package com.avito.android.tariff_cpt.configure.migration.di;

import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;
import kotlin.collections.C42756l;

/* compiled from: CptMigrationModule_ProvideItemPresenters$_avito_tariff_cpt_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<Set<TV0.d<?, ?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.tariff_cpt.common.item.screen_title.d> f298027a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.tariff_cpt.configure.migration.item.terms.d> f298028b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.tariff_cpt.common.item.button.d> f298029c;

    public e(Provider<com.avito.android.tariff_cpt.common.item.screen_title.d> provider, Provider<com.avito.android.tariff_cpt.configure.migration.item.terms.d> provider2, Provider<com.avito.android.tariff_cpt.common.item.button.d> provider3) {
        this.f298027a = provider;
        this.f298028b = provider2;
        this.f298029c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.tariff_cpt.common.item.screen_title.d dVar = this.f298027a.get();
        com.avito.android.tariff_cpt.configure.migration.item.terms.d dVar2 = this.f298028b.get();
        com.avito.android.tariff_cpt.common.item.button.d dVar3 = this.f298029c.get();
        b.f298022a.getClass();
        Set setL0 = C42756l.l0(new TV0.d[]{dVar, dVar2, dVar3});
        t.d(setL0);
        return setL0;
    }
}
