package com.avito.android.crm_candidates.features.add_note.logics;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.crm_candidates.features.add_note.entity.JobCrmAddNoteState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JobCrmAddNoteFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f129470a;

    /* renamed from: b, reason: collision with root package name */
    public final d f129471b;

    /* renamed from: c, reason: collision with root package name */
    public final k f129472c;

    /* renamed from: d, reason: collision with root package name */
    public final m f129473d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f129474e;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider) {
        this.f129470a = fVar;
        this.f129471b = dVar;
        this.f129472c = kVar;
        this.f129473d = mVar;
        this.f129474e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f129470a.get();
        c cVar = (c) this.f129471b.get();
        this.f129472c.getClass();
        j jVar = new j();
        l lVar = (l) this.f129473d.get();
        return new h("JobCrmAddNote", new JobCrmAddNoteState(false, false), new g(eVar, cVar, this.f129474e.get(), lVar, jVar));
    }
}
