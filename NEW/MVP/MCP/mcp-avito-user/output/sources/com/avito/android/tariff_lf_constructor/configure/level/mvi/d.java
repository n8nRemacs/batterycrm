package com.avito.android.tariff_lf_constructor.configure.level.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConstructorConfigureLevelActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f299831a;

    public d(u uVar) {
        this.f299831a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.tariff_lf_constructor.configure.level.domain.a) this.f299831a.get());
    }
}
