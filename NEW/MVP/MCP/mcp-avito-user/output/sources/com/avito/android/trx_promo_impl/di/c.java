package com.avito.android.trx_promo_impl.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TrxPromoAnalyticsModule_ProvideScreenPerformanceTracker$_avito_trx_promo_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final u f304144a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f304145b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f304146c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f304147d;

    public c(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, u uVar) {
        this.f304144a = uVar;
        this.f304145b = lVar;
        this.f304146c = lVar2;
        this.f304147d = lVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) this.f304144a.get();
        Screen screen = (Screen) this.f304145b.f393949a;
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f304146c.f393949a;
        String str = (String) this.f304147d.f393949a;
        b.f304143a.getClass();
        return interfaceC28481c.a(new C28478k(screen, rVar, str));
    }
}
