package com.avito.android.tariff.cpx.configure.levels.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffCpxConfigureLevelsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.tariff.cpx.configure.levels.mvi.domain.a> f296206a;

    /* renamed from: b, reason: collision with root package name */
    public final u f296207b;

    public e(u uVar, Provider provider) {
        this.f296206a = provider;
        this.f296207b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f296206a.get(), (v50.g) this.f296207b.get());
    }
}
