package com.avito.android.master_plan;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MasterPlanViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.master_plan.mvi.h f186094a;

    public p(com.avito.android.master_plan.mvi.h hVar) {
        this.f186094a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o((com.avito.android.master_plan.mvi.g) this.f186094a.get(), null, 2, null);
    }
}
