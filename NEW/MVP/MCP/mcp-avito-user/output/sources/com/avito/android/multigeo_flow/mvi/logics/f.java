package com.avito.android.multigeo_flow.mvi.logics;

import com.avito.android.multigeo_flow.mvi.entity.JobMultiGeoState;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JobMultiGeoFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final c f207024a;

    /* renamed from: b, reason: collision with root package name */
    public final h f207025b;

    /* renamed from: c, reason: collision with root package name */
    public final j f207026c;

    /* renamed from: d, reason: collision with root package name */
    public final l f207027d;

    public f(c cVar, h hVar, j jVar, l lVar) {
        this.f207024a = cVar;
        this.f207025b = hVar;
        this.f207026c = jVar;
        this.f207027d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = (b) this.f207024a.get();
        this.f207025b.getClass();
        g gVar = new g();
        this.f207026c.getClass();
        return new e("JobMultiGeo", (JobMultiGeoState) this.f207027d.f393949a, new d(bVar, new i(), gVar));
    }
}
