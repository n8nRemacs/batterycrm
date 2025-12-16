package com.avito.android.advert.item.ownership_discrepancy.mvi;

import com.avito.android.advert.item.ownership_discrepancy.OwnershipDiscrepancyOpenParams;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OwnershipDiscrepancyFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final c f78120a;

    /* renamed from: b, reason: collision with root package name */
    public final h f78121b;

    /* renamed from: c, reason: collision with root package name */
    public final j f78122c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f78123d;

    /* renamed from: e, reason: collision with root package name */
    public final l f78124e;

    public f(c cVar, h hVar, j jVar, Provider provider, l lVar) {
        this.f78120a = cVar;
        this.f78121b = hVar;
        this.f78122c = jVar;
        this.f78123d = provider;
        this.f78124e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = (b) this.f78120a.get();
        this.f78121b.getClass();
        g gVar = new g();
        this.f78122c.getClass();
        i iVar = new i();
        ScreenPerformanceTracker screenPerformanceTracker = this.f78123d.get();
        OwnershipDiscrepancyOpenParams ownershipDiscrepancyOpenParams = (OwnershipDiscrepancyOpenParams) this.f78124e.f393949a;
        return new e("OwnershipDiscrepancy", new l6.c(ownershipDiscrepancyOpenParams.f78093c, ownershipDiscrepancyOpenParams.f78092b, ownershipDiscrepancyOpenParams.f78094d, ownershipDiscrepancyOpenParams.f78095e), new d(bVar, screenPerformanceTracker, iVar, gVar));
    }
}
