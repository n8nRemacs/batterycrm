package com.avito.android.cpx_promo.delayedstart.mvi;

import com.avito.android.cpx_promo.delayedstart.CpxPromoDelayedStartContent;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxPromoDelayedStartBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f126860a;

    public e(dagger.internal.l lVar) {
        this.f126860a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((CpxPromoDelayedStartContent) this.f126860a.f393949a);
    }
}
