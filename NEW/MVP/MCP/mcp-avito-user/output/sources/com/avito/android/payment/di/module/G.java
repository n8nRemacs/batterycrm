package com.avito.android.payment.di.module;

/* compiled from: PaymentStatusFormModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class G implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final F f214204a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f214205b;

    public G(F f12, dagger.internal.u uVar) {
        this.f214204a = f12;
        this.f214205b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f214205b.get();
        this.f214204a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
