package com.avito.android.publish.cpa_tariff.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpaTariffActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f232456a;

    public c(u uVar) {
        this.f232456a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.publish.cpa_tariff.mvi.domain.e) this.f232456a.get());
    }
}
