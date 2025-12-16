package com.avito.android.cv_actualization.view.phone_input.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JsxCvActualizationPhoneInputFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final i f131289a;

    /* renamed from: b, reason: collision with root package name */
    public final b f131290b;

    /* renamed from: c, reason: collision with root package name */
    public final g f131291c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f131292d;

    public e(i iVar, b bVar, g gVar, Provider provider) {
        this.f131289a = iVar;
        this.f131290b = bVar;
        this.f131291c = gVar;
        this.f131292d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f131289a.getClass();
        h hVar = new h();
        a aVar = (a) this.f131290b.get();
        f fVar = (f) this.f131291c.get();
        return new d("JsxCvActualizationPhoneInput", new tt.c(null, null, false, 7, null), new c(aVar, this.f131292d.get(), hVar, fVar));
    }
}
