package com.avito.android.tariff.cpx.info.sf.menu;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: TariffCpxInfoSfMenuViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.info.sf.menu.mvi.g f296813a;

    public n(com.avito.android.tariff.cpx.info.sf.menu.mvi.g gVar) {
        this.f296813a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.tariff.cpx.info.sf.menu.mvi.f fVar = (com.avito.android.tariff.cpx.info.sf.menu.mvi.f) this.f296813a.get();
        i2.f411430a.getClass();
        return new m(fVar, i2.a.f411433c);
    }
}
