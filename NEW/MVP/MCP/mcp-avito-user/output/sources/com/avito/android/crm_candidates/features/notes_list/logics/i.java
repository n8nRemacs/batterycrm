package com.avito.android.crm_candidates.features.notes_list.logics;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.crm_candidates.features.notes_list.entity.JobCrmNotesListState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlin.collections.C42784z0;

/* compiled from: JobCrmNotesListFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f129720a;

    /* renamed from: b, reason: collision with root package name */
    public final d f129721b;

    /* renamed from: c, reason: collision with root package name */
    public final k f129722c;

    /* renamed from: d, reason: collision with root package name */
    public final m f129723d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f129724e;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider) {
        this.f129720a = fVar;
        this.f129721b = dVar;
        this.f129722c = kVar;
        this.f129723d = mVar;
        this.f129724e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f129720a.get();
        this.f129721b.getClass();
        b bVar = new b();
        j jVar = (j) this.f129722c.get();
        this.f129723d.getClass();
        l lVar = new l();
        return new h("JobCrmNotesList", new JobCrmNotesListState(C42784z0.f406748b, false), new g(eVar, bVar, this.f129724e.get(), lVar, jVar));
    }
}
