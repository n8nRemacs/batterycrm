package com.avito.android.advert_stats.detail.tab.items.cost;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CostByPeriodBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f86398a;

    public b(u uVar) {
        this.f86398a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f86398a.get());
    }
}
