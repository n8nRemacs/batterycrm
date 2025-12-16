package com.avito.android.travel_payment_selector.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PaymentSelectorBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f302665a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.travel_payment_selector.mvi.interactor.e f302666b;

    public f(dagger.internal.l lVar, com.avito.android.travel_payment_selector.mvi.interactor.e eVar) {
        this.f302665a = lVar;
        this.f302666b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((String) this.f302665a.f393949a, (com.avito.android.travel_payment_selector.mvi.interactor.d) this.f302666b.get());
    }
}
