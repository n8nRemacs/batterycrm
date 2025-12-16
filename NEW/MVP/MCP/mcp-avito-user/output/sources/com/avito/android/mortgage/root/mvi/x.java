package com.avito.android.mortgage.root.mvi;

import com.avito.android.mortgage.root.model.MortgageRootArguments;
import com.avito.android.mortgage.root.mvi.domain.InterfaceC32687a;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: MortgageRootBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class x implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f203366a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.mortgage.root.mvi.domain.t> f203367b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f203368c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f203369d;

    public x(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f203366a = lVar;
        this.f203367b = provider;
        this.f203368c = uVar;
        this.f203369d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new w((MortgageRootArguments) this.f203366a.f393949a, this.f203367b.get(), (InterfaceC32687a) this.f203368c.get(), this.f203369d.get());
    }
}
