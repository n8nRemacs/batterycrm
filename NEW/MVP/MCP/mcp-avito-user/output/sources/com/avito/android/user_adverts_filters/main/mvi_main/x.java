package com.avito.android.user_adverts_filters.main.mvi_main;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.user_adverts_filters.UserAdvertsFiltersData;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: MainFiltersFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class x implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f316321a;

    /* renamed from: b, reason: collision with root package name */
    public final s f316322b;

    /* renamed from: c, reason: collision with root package name */
    public final z f316323c;

    /* renamed from: d, reason: collision with root package name */
    public final u f316324d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f316325e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f316326f;

    public x(dagger.internal.l lVar, s sVar, z zVar, u uVar, Provider provider, Provider provider2) {
        this.f316321a = lVar;
        this.f316322b = sVar;
        this.f316323c = zVar;
        this.f316324d = uVar;
        this.f316325e = provider;
        this.f316326f = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        UserAdvertsFiltersData userAdvertsFiltersData = (UserAdvertsFiltersData) this.f316321a.f393949a;
        r rVar = (r) this.f316322b.get();
        this.f316323c.getClass();
        y yVar = new y();
        this.f316324d.getClass();
        t tVar = new t();
        R0 r02 = this.f316325e.get();
        return new w("UserAdvertsFiltersMainFeature", new rJ0.c(userAdvertsFiltersData, null, null, null, null, 30, null), new v(rVar, this.f316326f.get(), yVar, tVar, r02));
    }
}
