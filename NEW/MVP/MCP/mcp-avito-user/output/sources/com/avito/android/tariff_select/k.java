package com.avito.android.tariff_select;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: TariffSelectViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff_select.mvi.i f301225a;

    public k(com.avito.android.tariff_select.mvi.i iVar) {
        this.f301225a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.tariff_select.mvi.h hVar = (com.avito.android.tariff_select.mvi.h) this.f301225a.get();
        i2.f411430a.getClass();
        return new j(hVar, i2.a.f411433c);
    }
}
