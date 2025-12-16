package com.avito.android.mortgage.root.mvi.domain;

import com.avito.android.util.R0;
import i00.InterfaceC41203a;
import javax.inject.Provider;

/* compiled from: SelectBanksTabUseCaseImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class J implements dagger.internal.h<I> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC41203a> f203001a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f203002b;

    public J(Provider<InterfaceC41203a> provider, Provider<R0> provider2) {
        this.f203001a = provider;
        this.f203002b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new I(this.f203002b.get(), dagger.internal.g.b(this.f203001a));
    }
}
