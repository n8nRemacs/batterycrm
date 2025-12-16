package com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffCptConfigureLevelsCardsBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f297947a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f297948b;

    public b(u uVar, Provider provider) {
        this.f297947a = uVar;
        this.f297948b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((f) this.f297947a.get(), this.f297948b.get());
    }
}
