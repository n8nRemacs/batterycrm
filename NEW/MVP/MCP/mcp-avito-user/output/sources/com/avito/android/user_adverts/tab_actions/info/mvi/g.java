package com.avito.android.user_adverts.tab_actions.info.mvi;

import bJ0.C25520c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.user_adverts.tab_actions.info.UserAdvertsActionResultInfo;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserAdvertsActionResultFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final l f314683a;

    /* renamed from: b, reason: collision with root package name */
    public final d f314684b;

    /* renamed from: c, reason: collision with root package name */
    public final i f314685c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f314686d;

    public g(l lVar, d dVar, i iVar, Provider provider) {
        this.f314683a = lVar;
        this.f314684b = dVar;
        this.f314685c = iVar;
        this.f314686d = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        UserAdvertsActionResultInfo userAdvertsActionResultInfo = (UserAdvertsActionResultInfo) this.f314683a.f393949a;
        this.f314684b.getClass();
        c cVar = new c();
        h hVar = (h) this.f314685c.get();
        return new f("UserAdvertsActionResultFeature", new C25520c(userAdvertsActionResultInfo, null, 2, 0 == true ? 1 : 0), new e(cVar, this.f314686d.get(), hVar));
    }
}
