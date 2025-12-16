package com.avito.android.tariff.cpr.configure.advance.manual.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CprConfigureAdvanceManualActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.tariff.cpr.configure.advance.manual.mvi.domain.a> f295407a;

    /* renamed from: b, reason: collision with root package name */
    public final u f295408b;

    public d(u uVar, Provider provider) {
        this.f295407a = provider;
        this.f295408b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f295407a.get(), (v50.g) this.f295408b.get());
    }
}
