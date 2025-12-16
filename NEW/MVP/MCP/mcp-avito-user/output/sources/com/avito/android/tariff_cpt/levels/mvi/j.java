package com.avito.android.tariff_cpt.levels.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCptLevelsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final u f298655a;

    public j(u uVar) {
        this.f298655a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.tariff_cpt.levels.domain.a) this.f298655a.get());
    }
}
