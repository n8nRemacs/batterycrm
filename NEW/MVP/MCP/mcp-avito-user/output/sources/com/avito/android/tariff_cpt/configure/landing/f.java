package com.avito.android.tariff_cpt.configure.landing;

import com.avito.android.tariff_cpt.configure.landing.mvi.i;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: TariffCptConfigureLandingViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final i f297768a;

    public f(i iVar) {
        this.f297768a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.tariff_cpt.configure.landing.mvi.h hVar = (com.avito.android.tariff_cpt.configure.landing.mvi.h) this.f297768a.get();
        i2.f411430a.getClass();
        return new e(hVar, i2.a.f411433c);
    }
}
