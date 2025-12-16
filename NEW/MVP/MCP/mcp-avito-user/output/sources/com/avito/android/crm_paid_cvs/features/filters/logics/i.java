package com.avito.android.crm_paid_cvs.features.filters.logics;

import com.avito.android.crm_paid_cvs.features.filters.entity.FiltersState;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.collections.C42784z0;

/* compiled from: FiltersBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f130644a;

    /* renamed from: b, reason: collision with root package name */
    public final d f130645b;

    /* renamed from: c, reason: collision with root package name */
    public final k f130646c;

    /* renamed from: d, reason: collision with root package name */
    public final s f130647d;

    public i(f fVar, d dVar, k kVar, s sVar) {
        this.f130644a = fVar;
        this.f130645b = dVar;
        this.f130646c = kVar;
        this.f130647d = sVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f130644a.get();
        this.f130645b.getClass();
        b bVar = new b();
        this.f130646c.getClass();
        j jVar = new j();
        this.f130647d.getClass();
        return new h("CrmPaidCvsFilters", new FiltersState(C42784z0.f406748b), new g(eVar, bVar, new l(), jVar));
    }
}
