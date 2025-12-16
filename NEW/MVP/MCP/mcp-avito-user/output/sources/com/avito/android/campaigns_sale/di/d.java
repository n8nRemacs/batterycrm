package com.avito.android.campaigns_sale.di;

import com.avito.android.analytics.screens.CampaignsSaleScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.campaigns_sale.di.o;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.ownership.Owners;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import gj.d;
import java.util.Collections;
import java.util.Set;
import javax.inject.Provider;
import kj.C42699b;
import pj.C47101d;

/* compiled from: CampaignsSaleBeduinModule_ProvideBeduinContextFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<InterfaceC40691b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<gj.d> f113903a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f113904b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a.b> f113905c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f113906d;

    /* renamed from: e, reason: collision with root package name */
    public final u f113907e;

    public d(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f113903a = provider;
        this.f113904b = provider2;
        this.f113905c = provider3;
        this.f113906d = provider4;
        this.f113907e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        gj.d dVarEl = ((o.b.C3336b) this.f113903a).f113949a.El();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((o.b.g) this.f113904b).get();
        a.b bVar = (a.b) ((o.b.h) this.f113905c).get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f113906d.get();
        Set set = (Set) this.f113907e.get();
        b.f113899a.getClass();
        return d.a.a(dVarEl, aVar, bVar, new C47101d(screenPerformanceTracker), set, null, null, new C42699b(CampaignsSaleScreen.f90310d.f90471b, Collections.singletonList(Owners.f210392B0), "CampaignsSale", false, 8, null), 48);
    }
}
