package com.avito.android.tariff_select.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffSelectReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff_select.data.c f301250a;

    public m(com.avito.android.tariff_select.data.c cVar) {
        this.f301250a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f301250a.getClass();
        return new l(new com.avito.android.tariff_select.data.b());
    }
}
