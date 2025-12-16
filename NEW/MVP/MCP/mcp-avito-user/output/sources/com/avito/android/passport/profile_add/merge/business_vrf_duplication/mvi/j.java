package com.avito.android.passport.profile_add.merge.business_vrf_duplication.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BusinessVrfDuplicationFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f212565a;

    /* renamed from: b, reason: collision with root package name */
    public final c f212566b;

    /* renamed from: c, reason: collision with root package name */
    public final l f212567c;

    /* renamed from: d, reason: collision with root package name */
    public final n f212568d;

    /* renamed from: e, reason: collision with root package name */
    public final u f212569e;

    public j(g gVar, c cVar, l lVar, n nVar, u uVar) {
        this.f212565a = gVar;
        this.f212566b = cVar;
        this.f212567c = lVar;
        this.f212568d = nVar;
        this.f212569e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f212565a.get();
        a aVar = (a) this.f212566b.get();
        k kVar = (k) this.f212567c.get();
        m mVar = (m) this.f212568d.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f212569e.get();
        Z50.c.f19880e.getClass();
        return new i("BusinessVrfDuplication", Z50.c.f19881f, new h(fVar, aVar, screenPerformanceTracker, mVar, kVar));
    }
}
