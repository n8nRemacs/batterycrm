package com.avito.android.autoteka.presentation.directPurchase;

import com.avito.android.autoteka.presentation.directPurchase.mvi.f;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaDirectPurchaseViewModel_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final f f97293a;

    public d(f fVar) {
        this.f97293a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.autoteka.presentation.directPurchase.mvi.e) this.f97293a.get(), null, 2, null);
    }
}
