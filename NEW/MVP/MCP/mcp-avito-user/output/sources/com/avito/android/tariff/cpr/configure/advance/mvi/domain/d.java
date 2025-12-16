package com.avito.android.tariff.cpr.configure.advance.mvi.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import hB0.InterfaceC40801a;
import javax.inject.Provider;

/* compiled from: GetCprConfigureAdvanceUseCaseImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40801a> f295459a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f295460b;

    public d(Provider<InterfaceC40801a> provider, Provider<R0> provider2) {
        this.f295459a = provider;
        this.f295460b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f295459a.get(), this.f295460b.get());
    }
}
