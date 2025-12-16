package com.avito.android.tariff.cpx.info.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCpxInfoBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final u f296727a;

    public j(u uVar) {
        this.f296727a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.tariff.cpx.info.mvi.domain.a) this.f296727a.get());
    }
}
