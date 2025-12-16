package com.avito.android.tariff.cpr.configure.data.repository;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import hB0.InterfaceC40801a;
import javax.inject.Provider;

/* compiled from: CprConfigureRepositoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40801a> f295494a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f295495b;

    public c(Provider<InterfaceC40801a> provider, Provider<R0> provider2) {
        this.f295494a = provider;
        this.f295495b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f295494a.get(), this.f295495b.get());
    }
}
