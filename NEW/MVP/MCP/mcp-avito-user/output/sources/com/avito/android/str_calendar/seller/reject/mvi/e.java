package com.avito.android.str_calendar.seller.reject.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.model.StrSellerCalendarRejectInfo;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrCalendarRejectFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final b f288051a;

    /* renamed from: b, reason: collision with root package name */
    public final g f288052b;

    /* renamed from: c, reason: collision with root package name */
    public final i f288053c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f288054d;

    /* renamed from: e, reason: collision with root package name */
    public final l f288055e;

    public e(b bVar, g gVar, i iVar, Provider provider, l lVar) {
        this.f288051a = bVar;
        this.f288052b = gVar;
        this.f288053c = iVar;
        this.f288054d = provider;
        this.f288055e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        this.f288051a.getClass();
        a aVar = new a();
        this.f288052b.getClass();
        f fVar = new f();
        this.f288053c.getClass();
        h hVar = new h();
        ScreenPerformanceTracker screenPerformanceTracker = this.f288054d.get();
        StrSellerCalendarRejectInfo strSellerCalendarRejectInfo = (StrSellerCalendarRejectInfo) this.f288055e.f393949a;
        Ly0.c.f10310d.getClass();
        return new d("StrCalendarReject", new Ly0.c(strSellerCalendarRejectInfo, new Ly0.d(strSellerCalendarRejectInfo.getScreenTitle(), strSellerCalendarRejectInfo.getTitle(), strSellerCalendarRejectInfo.getSubtitle(), strSellerCalendarRejectInfo.getButtonText(), strSellerCalendarRejectInfo.getDeeplink())), new c(aVar, screenPerformanceTracker, hVar, fVar));
    }
}
