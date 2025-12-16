package com.avito.android.short_term_rent.bookingform.promocode.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import ew0.C40171e;
import javax.inject.Provider;

/* compiled from: PromoCodeFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final j f282175a;

    /* renamed from: b, reason: collision with root package name */
    public final h f282176b;

    /* renamed from: c, reason: collision with root package name */
    public final o f282177c;

    /* renamed from: d, reason: collision with root package name */
    public final s f282178d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f282179e;

    public m(j jVar, h hVar, o oVar, s sVar, Provider provider) {
        this.f282175a = jVar;
        this.f282176b = hVar;
        this.f282177c = oVar;
        this.f282178d = sVar;
        this.f282179e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = (i) this.f282175a.get();
        g gVar = (g) this.f282176b.get();
        this.f282177c.getClass();
        n nVar = new n();
        r rVar = (r) this.f282178d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f282179e.get();
        C40171e.f395466g.getClass();
        return new l("BookingFormPromoCodeDialog", C40171e.f395467h, new k(iVar, gVar, screenPerformanceTracker, rVar, nVar));
    }
}
