package com.avito.android.crm_paid_cvs.features.cv_list.logics;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.crm_paid_cvs.features.cv_list.entity.CvListState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlin.collections.C42784z0;

/* compiled from: CvListBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f130570a;

    /* renamed from: b, reason: collision with root package name */
    public final c f130571b;

    /* renamed from: c, reason: collision with root package name */
    public final n f130572c;

    /* renamed from: d, reason: collision with root package name */
    public final q f130573d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f130574e;

    public h(e eVar, c cVar, n nVar, q qVar, Provider provider) {
        this.f130570a = eVar;
        this.f130571b = cVar;
        this.f130572c = nVar;
        this.f130573d = qVar;
        this.f130574e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f130570a.get();
        b bVar = (b) this.f130571b.get();
        this.f130572c.getClass();
        m mVar = new m();
        this.f130573d.getClass();
        o oVar = new o();
        ScreenPerformanceTracker screenPerformanceTracker = this.f130574e.get();
        CvListState.Tab tab = CvListState.Tab.f130509c;
        CvListState.ListState listState = CvListState.ListState.f130504c;
        C42784z0 c42784z0 = C42784z0.f406748b;
        return new g("CrmPaidCvsList", new CvListState(tab, listState, c42784z0, c42784z0, c42784z0, c42784z0, null, null, null), new f(dVar, bVar, screenPerformanceTracker, oVar, mVar));
    }
}
