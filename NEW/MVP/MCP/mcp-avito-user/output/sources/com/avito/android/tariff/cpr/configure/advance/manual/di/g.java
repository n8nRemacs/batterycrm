package com.avito.android.tariff.cpr.configure.advance.manual.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.tariff.cpr.configure.advance.manual.di.d;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffCprPerformanceAnalyticsModule_ProvideScreenPerformanceTracker$_avito_tariff_cpr_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f295389a;

    /* renamed from: b, reason: collision with root package name */
    public final l f295390b;

    /* renamed from: c, reason: collision with root package name */
    public final l f295391c;

    /* renamed from: d, reason: collision with root package name */
    public final l f295392d;

    public g(l lVar, l lVar2, l lVar3, Provider provider) {
        this.f295389a = provider;
        this.f295390b = lVar;
        this.f295391c = lVar2;
        this.f295392d = lVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((d.b.C8983d) this.f295389a).get();
        Screen screen = (Screen) this.f295390b.f393949a;
        r rVar = (r) this.f295391c.f393949a;
        String str = (String) this.f295392d.f393949a;
        f.f295388a.getClass();
        return interfaceC28481c.a(new C28478k(screen, rVar, str));
    }
}
