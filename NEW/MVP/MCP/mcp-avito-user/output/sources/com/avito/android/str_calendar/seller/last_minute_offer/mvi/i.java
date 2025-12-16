package com.avito.android.str_calendar.seller.last_minute_offer.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.LastMinuteOfferState;
import com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LastMinuteOfferFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f287968a;

    /* renamed from: b, reason: collision with root package name */
    public final d f287969b;

    /* renamed from: c, reason: collision with root package name */
    public final k f287970c;

    /* renamed from: d, reason: collision with root package name */
    public final m f287971d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f287972e;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider) {
        this.f287968a = fVar;
        this.f287969b = dVar;
        this.f287970c = kVar;
        this.f287971d = mVar;
        this.f287972e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f287968a.get();
        c cVar = (c) this.f287969b.get();
        this.f287970c.getClass();
        j jVar = new j();
        l lVar = (l) this.f287971d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f287972e.get();
        LastMinuteOfferState.f287938i.getClass();
        return new h("StrCalendarLastMinuteOffer", new LastMinuteOfferState(LastMinuteOfferState.LoadingState.f287946b, null, null, false, false, "", a.c.f287961a), new g(eVar, cVar, screenPerformanceTracker, lVar, jVar));
    }
}
