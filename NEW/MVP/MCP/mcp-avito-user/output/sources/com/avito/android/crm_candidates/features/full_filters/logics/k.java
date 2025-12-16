package com.avito.android.crm_candidates.features.full_filters.logics;

import com.avito.android.crm_candidates.features.full_filters.entity.FiltersState;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.collections.C42784z0;

/* compiled from: FiltersBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f129616a;

    /* renamed from: b, reason: collision with root package name */
    public final f f129617b;

    /* renamed from: c, reason: collision with root package name */
    public final m f129618c;

    /* renamed from: d, reason: collision with root package name */
    public final t f129619d;

    public k(h hVar, f fVar, m mVar, t tVar) {
        this.f129616a = hVar;
        this.f129617b = fVar;
        this.f129618c = mVar;
        this.f129619d = tVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f129616a.get();
        d dVar = (d) this.f129617b.get();
        this.f129618c.getClass();
        l lVar = new l();
        this.f129619d.getClass();
        return new j("CrmPaidCvsFilters", new FiltersState(C42784z0.f406748b), new i(gVar, dVar, new n(), lVar));
    }
}
