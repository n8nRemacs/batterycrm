package com.avito.android.safety.password_setting.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.safety.password_setting.mvi.entity.PasswordSettingState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PasswordSettingFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f257514a;

    /* renamed from: b, reason: collision with root package name */
    public final d f257515b;

    /* renamed from: c, reason: collision with root package name */
    public final k f257516c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f257517d;

    /* renamed from: e, reason: collision with root package name */
    public final m f257518e;

    public i(f fVar, d dVar, k kVar, Provider provider, m mVar) {
        this.f257514a = fVar;
        this.f257515b = dVar;
        this.f257516c = kVar;
        this.f257517d = provider;
        this.f257518e = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f257514a.get();
        c cVar = (c) this.f257515b.get();
        this.f257516c.getClass();
        j jVar = new j();
        ScreenPerformanceTracker screenPerformanceTracker = this.f257517d.get();
        this.f257518e.getClass();
        l lVar = new l();
        PasswordSettingState.f257501e.getClass();
        return new h("PasswordSetting", PasswordSettingState.f257502f, new g(eVar, cVar, screenPerformanceTracker, lVar, jVar));
    }
}
