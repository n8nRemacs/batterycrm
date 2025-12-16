package com.avito.android.travel_payment_selector.view;

import com.avito.android.travel_payment_selector.mvi.i;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PaymentSelectorViewModel_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final i f302732a;

    public d(i iVar) {
        this.f302732a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.travel_payment_selector.mvi.h) this.f302732a.get(), null, 2, null);
    }
}
