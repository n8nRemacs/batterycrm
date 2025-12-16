package com.avito.android.autoteka.presentation.waitingForPayment;

import com.avito.android.autoteka.presentation.waitingForPayment.mvi.g;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaWaitingForPaymentViewModel_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.autoteka.presentation.waitingForPayment.mvi.h f97861a;

    public d(com.avito.android.autoteka.presentation.waitingForPayment.mvi.h hVar) {
        this.f97861a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((g) this.f97861a.get(), null, 2, null);
    }
}
