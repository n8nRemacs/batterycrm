package com.avito.android.tariff_select.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffSelectBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f301237a;

    public f(u uVar) {
        this.f301237a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.tariff_select.domain.a) this.f301237a.get());
    }
}
