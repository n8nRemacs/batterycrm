package com.avito.android.tariff.cpa.configure_advance.viewmodel;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: ConfigureAdvanceRepositoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<WB0.a> f294401a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f294402b;

    public o(Provider<WB0.a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f294401a = provider;
        this.f294402b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f294401a.get(), this.f294402b.get());
    }
}
