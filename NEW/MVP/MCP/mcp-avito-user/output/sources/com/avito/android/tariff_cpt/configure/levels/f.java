package com.avito.android.tariff_cpt.configure.levels;

import com.avito.android.tariff_cpt.configure.levels.mvi.l;
import com.avito.android.tariff_cpt.configure.levels.mvi.m;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: TariffCptConfigureLevelsViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final m f297870a;

    public f(m mVar) {
        this.f297870a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        l lVar = (l) this.f297870a.get();
        i2.f411430a.getClass();
        return new e(lVar, i2.a.f411433c);
    }
}
