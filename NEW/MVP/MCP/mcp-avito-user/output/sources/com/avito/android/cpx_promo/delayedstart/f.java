package com.avito.android.cpx_promo.delayedstart;

import com.avito.android.cpx_promo.delayedstart.mvi.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxPromoDelayedStartViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cpx_promo.delayedstart.mvi.h f126850a;

    public f(com.avito.android.cpx_promo.delayedstart.mvi.h hVar) {
        this.f126850a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((g) this.f126850a.get(), null, 2, null);
    }
}
