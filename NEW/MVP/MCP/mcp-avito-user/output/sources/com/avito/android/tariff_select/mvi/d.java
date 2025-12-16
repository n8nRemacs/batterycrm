package com.avito.android.tariff_select.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffSelectActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f301230a;

    public d(u uVar) {
        this.f301230a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.tariff_select.domain.a) this.f301230a.get());
    }
}
