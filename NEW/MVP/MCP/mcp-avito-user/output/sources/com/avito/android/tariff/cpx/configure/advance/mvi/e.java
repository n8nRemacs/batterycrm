package com.avito.android.tariff.cpx.configure.advance.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpxConfigureAdvanceActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.tariff.cpx.configure.advance.domain.d> f295745a;

    /* renamed from: b, reason: collision with root package name */
    public final u f295746b;

    public e(u uVar, Provider provider) {
        this.f295745a = provider;
        this.f295746b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f295745a.get(), (v50.g) this.f295746b.get());
    }
}
