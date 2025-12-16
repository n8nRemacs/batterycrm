package com.avito.android.tariff.cpx.level.feature;

import com.avito.android.tariff.cpx.level.feature.mvi.i;
import com.avito.android.tariff.cpx.level.feature.mvi.j;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCpxLevelFeatureViewModel_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final j f296951a;

    public d(j jVar) {
        this.f296951a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((i) this.f296951a.get(), null, 2, null);
    }
}
