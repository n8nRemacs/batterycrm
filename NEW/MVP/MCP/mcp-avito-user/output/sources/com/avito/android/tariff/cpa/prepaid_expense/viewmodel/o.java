package com.avito.android.tariff.cpa.prepaid_expense.viewmodel;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: PublicationAdvanceRepositoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<WB0.a> f295097a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f295098b;

    public o(Provider<WB0.a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f295097a = provider;
        this.f295098b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f295097a.get(), this.f295098b.get());
    }
}
