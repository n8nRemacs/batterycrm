package com.avito.android.imv_cars_details.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ImvCarsDetailsItemModule_Companion_ProvideImvCarsChartItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<com.avito.android.imv_chart.f> {

    /* renamed from: a, reason: collision with root package name */
    public final u f169943a;

    public j(u uVar) {
        this.f169943a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.imv_chart.g gVar = (com.avito.android.imv_chart.g) this.f169943a.get();
        h.f169940a.getClass();
        return new com.avito.android.imv_chart.f(gVar);
    }
}
