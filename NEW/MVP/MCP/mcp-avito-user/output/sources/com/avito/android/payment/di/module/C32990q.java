package com.avito.android.payment.di.module;

import com.avito.android.validation.C36022n;
import com.avito.android.validation.InterfaceC36020m;
import com.avito.android.validation.d1;

/* compiled from: PaymentGenericFormModule_ProvideLocalPretendInteractorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.payment.di.module.q, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32990q implements dagger.internal.h<InterfaceC36020m> {

    /* renamed from: a, reason: collision with root package name */
    public final C32977d f214290a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f214291b;

    public C32990q(C32977d c32977d, dagger.internal.u uVar) {
        this.f214290a = c32977d;
        this.f214291b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d1 d1Var = (d1) this.f214291b.get();
        this.f214290a.getClass();
        return new C36022n(d1Var);
    }
}
