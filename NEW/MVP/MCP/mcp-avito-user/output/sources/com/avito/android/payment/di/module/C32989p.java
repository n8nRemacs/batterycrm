package com.avito.android.payment.di.module;

/* compiled from: PaymentGenericFormModule_ProvideListUpdateListenerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.payment.di.module.p, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32989p implements dagger.internal.h<androidx.recyclerview.widget.C> {

    /* renamed from: a, reason: collision with root package name */
    public final C32977d f214288a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f214289b;

    public C32989p(C32977d c32977d, dagger.internal.u uVar) {
        this.f214288a = c32977d;
        this.f214289b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.j jVar = (com.avito.konveyor.adapter.j) this.f214289b.get();
        this.f214288a.getClass();
        return jVar;
    }
}
