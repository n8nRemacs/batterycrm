package com.avito.android.tariff_cpt.level_feature;

import com.avito.android.tariff_cpt.level_feature.mvi.i;
import com.avito.android.tariff_cpt.level_feature.mvi.j;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: TariffCptLevelFeatureViewModel_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final j f298449a;

    public c(j jVar) {
        this.f298449a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = (i) this.f298449a.get();
        i2.f411430a.getClass();
        return new b(iVar, i2.a.f411433c);
    }
}
