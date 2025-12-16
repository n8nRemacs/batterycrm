package Kq0;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.ownership.Owners;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import gj.d;
import java.util.Collections;
import javax.inject.Provider;
import kj.C42699b;
import pj.C47101d;

/* compiled from: SellerPromotionsBeduinModule_ProvideBeduinContextFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<InterfaceC40691b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<gj.d> f9659a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f9660b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a.b> f9661c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f9662d;

    /* renamed from: e, reason: collision with root package name */
    public final l f9663e;

    public b(l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f9659a = provider;
        this.f9660b = provider2;
        this.f9661c = provider3;
        this.f9662d = provider4;
        this.f9663e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        gj.d dVar = this.f9659a.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f9660b.get();
        a.b bVar = this.f9661c.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f9662d.get();
        C28478k c28478k = (C28478k) this.f9663e.f393949a;
        C14342a.f9658a.getClass();
        return d.a.a(dVar, aVar, bVar, new C47101d(screenPerformanceTracker), null, null, null, new C42699b(c28478k.f90636a.f90471b, Collections.singletonList(Owners.f210404F0), "SellerPromotions", false, 8, null), 56);
    }
}
