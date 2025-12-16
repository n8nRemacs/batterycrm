package com.avito.android.crm_candidates.features.list_filter.logics;

import com.avito.android.crm_candidates.features.list_filter.entity.JobCrmListFilterState;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JobCrmListFilterFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final c f129696a;

    /* renamed from: b, reason: collision with root package name */
    public final i f129697b;

    /* renamed from: c, reason: collision with root package name */
    public final k f129698c;

    public g(c cVar, i iVar, k kVar) {
        this.f129696a = cVar;
        this.f129697b = iVar;
        this.f129698c = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = (b) this.f129696a.get();
        this.f129697b.getClass();
        h hVar = new h();
        this.f129698c.getClass();
        return new f("JobCrmListFilter", new JobCrmListFilterState(null, null, null, false, null, 31, null), new e(bVar, new j(), hVar));
    }
}
