package com.avito.android.mortgage.root.mvi.domain;

import com.avito.android.util.R0;
import i00.InterfaceC41203a;
import javax.inject.Provider;

/* compiled from: UpdateBankSelectionUseCaseImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class M implements dagger.internal.h<L> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<z> f203019a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC41203a> f203020b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f203021c;

    public M(Provider<z> provider, Provider<InterfaceC41203a> provider2, Provider<R0> provider3) {
        this.f203019a = provider;
        this.f203020b = provider2;
        this.f203021c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new L(this.f203019a.get(), this.f203021c.get(), dagger.internal.g.b(this.f203020b));
    }
}
