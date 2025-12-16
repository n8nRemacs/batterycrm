package com.avito.android.tariff_cpt.levels.ui.items.business_tools_header;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffCptLevelsBusinessToolHeaderItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f298698a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f298699b;

    public c(u uVar, Provider provider) {
        this.f298698a = uVar;
        this.f298699b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f298698a.get(), this.f298699b.get());
    }
}
