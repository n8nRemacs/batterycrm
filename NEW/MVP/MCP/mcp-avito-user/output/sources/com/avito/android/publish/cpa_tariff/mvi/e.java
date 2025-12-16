package com.avito.android.publish.cpa_tariff.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpaTariffBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f232479a;

    public e(u uVar) {
        this.f232479a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.publish.cpa_tariff.mvi.domain.a) this.f232479a.get());
    }
}
