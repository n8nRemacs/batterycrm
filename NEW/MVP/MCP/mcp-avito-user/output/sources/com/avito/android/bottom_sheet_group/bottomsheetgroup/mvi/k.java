package com.avito.android.bottom_sheet_group.bottomsheetgroup.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bottom_sheet_group.bottomsheetgroup.mvi.entity.BottomSheetGroupState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BottomSheetGroupFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f107275a;

    /* renamed from: b, reason: collision with root package name */
    public final f f107276b;

    /* renamed from: c, reason: collision with root package name */
    public final m f107277c;

    /* renamed from: d, reason: collision with root package name */
    public final o f107278d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f107279e;

    public k(h hVar, f fVar, m mVar, o oVar, Provider provider) {
        this.f107275a = hVar;
        this.f107276b = fVar;
        this.f107277c = mVar;
        this.f107278d = oVar;
        this.f107279e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f107275a.getClass();
        g gVar = new g();
        this.f107276b.getClass();
        e eVar = new e();
        this.f107277c.getClass();
        l lVar = new l();
        n nVar = (n) this.f107278d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f107279e.get();
        BottomSheetGroupState.f107257i.getClass();
        return new j("BottomSheetGroup", BottomSheetGroupState.f107258j, new i(gVar, eVar, screenPerformanceTracker, nVar, lVar));
    }
}
