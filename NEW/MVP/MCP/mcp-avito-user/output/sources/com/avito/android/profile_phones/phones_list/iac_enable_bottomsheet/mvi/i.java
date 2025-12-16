package com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.mvi.entity.IacEnableBottomSheetState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacEnableBottomSheetFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f227851a;

    /* renamed from: b, reason: collision with root package name */
    public final d f227852b;

    /* renamed from: c, reason: collision with root package name */
    public final k f227853c;

    /* renamed from: d, reason: collision with root package name */
    public final m f227854d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f227855e;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider) {
        this.f227851a = fVar;
        this.f227852b = dVar;
        this.f227853c = kVar;
        this.f227854d = mVar;
        this.f227855e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f227851a.getClass();
        e eVar = new e();
        c cVar = (c) this.f227852b.get();
        j jVar = (j) this.f227853c.get();
        l lVar = (l) this.f227854d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f227855e.get();
        IacEnableBottomSheetState.f227840e.getClass();
        return new h("IacEnableBottomSheet", IacEnableBottomSheetState.f227841f, new g(eVar, cVar, screenPerformanceTracker, lVar, jVar));
    }
}
