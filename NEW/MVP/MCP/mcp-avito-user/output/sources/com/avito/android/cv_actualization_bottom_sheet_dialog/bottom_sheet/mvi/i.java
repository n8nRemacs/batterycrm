package com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import yt.C50299c;

/* compiled from: JsxActualizationBottomSheetFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final m f131523a;

    /* renamed from: b, reason: collision with root package name */
    public final f f131524b;

    /* renamed from: c, reason: collision with root package name */
    public final k f131525c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f131526d;

    public i(m mVar, f fVar, k kVar, Provider provider) {
        this.f131523a = mVar;
        this.f131524b = fVar;
        this.f131525c = kVar;
        this.f131526d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f131523a.getClass();
        l lVar = new l();
        e eVar = (e) this.f131524b.get();
        this.f131525c.getClass();
        j jVar = new j();
        return new h("JsxActualizationBottomSheet", new C50299c(false, null, 3, null), new g(eVar, this.f131526d.get(), lVar, jVar));
    }
}
