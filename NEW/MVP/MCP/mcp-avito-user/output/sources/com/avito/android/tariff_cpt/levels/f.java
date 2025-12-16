package com.avito.android.tariff_cpt.levels;

import com.avito.android.tariff_cpt.levels.mvi.l;
import com.avito.android.tariff_cpt.levels.mvi.m;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: TariffCptLevelsViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final m f298615a;

    public f(m mVar) {
        this.f298615a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        l lVar = (l) this.f298615a.get();
        i2.f411430a.getClass();
        return new e(lVar, i2.a.f411433c);
    }
}
