package com.avito.android.das_date_picker.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.das_date_picker.mvi.entity.DasCalendarState;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DasCalendarFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final f f132425a;

    /* renamed from: b, reason: collision with root package name */
    public final d f132426b;

    /* renamed from: c, reason: collision with root package name */
    public final r f132427c;

    /* renamed from: d, reason: collision with root package name */
    public final u f132428d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f132429e;

    public m(f fVar, d dVar, r rVar, u uVar, Provider provider) {
        this.f132425a = fVar;
        this.f132426b = dVar;
        this.f132427c = rVar;
        this.f132428d = uVar;
        this.f132429e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f132425a.get();
        this.f132426b.getClass();
        c cVar = new c();
        this.f132427c.getClass();
        q qVar = new q();
        t tVar = (t) this.f132428d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f132429e.get();
        DasCalendarState.f132382j.getClass();
        return new l("DasCalendar", DasCalendarState.f132383k, new k(eVar, cVar, screenPerformanceTracker, tVar, qVar));
    }
}
