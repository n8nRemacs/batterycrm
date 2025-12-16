package com.avito.android.payment.di.module;

/* compiled from: PaymentGenericFormModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.payment.di.module.x, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32996x implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final C32977d f214310a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f214311b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f214312c;

    public C32996x(C32977d c32977d, dagger.internal.f fVar, dagger.internal.u uVar) {
        this.f214310a = c32977d;
        this.f214311b = fVar;
        this.f214312c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.recycler.data_aware.c cVar = (com.avito.android.recycler.data_aware.c) this.f214311b.get();
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f214312c.get();
        this.f214310a.getClass();
        return new com.avito.konveyor.adapter.j(cVar, aVar);
    }
}
