package com.avito.android.cpx_promo.delayedstart.mvi;

import com.avito.android.cpx_promo.delayedstart.CpxPromoDelayedStartContent;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxPromoDelayedStartActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f126855a;

    public c(dagger.internal.l lVar) {
        this.f126855a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((CpxPromoDelayedStartContent) this.f126855a.f393949a);
    }
}
