package com.avito.android.cv_actualization.view.phone_select.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import vt.C49380c;

/* compiled from: JsxCvActualizationPhoneSelectFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f131366a;

    /* renamed from: b, reason: collision with root package name */
    public final k f131367b;

    /* renamed from: c, reason: collision with root package name */
    public final b f131368c;

    /* renamed from: d, reason: collision with root package name */
    public final i f131369d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f131370e;

    public g(d dVar, k kVar, b bVar, i iVar, Provider provider) {
        this.f131366a = dVar;
        this.f131367b = kVar;
        this.f131368c = bVar;
        this.f131369d = iVar;
        this.f131370e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f131366a.get();
        this.f131367b.getClass();
        j jVar = new j();
        a aVar = (a) this.f131368c.get();
        this.f131369d.getClass();
        h hVar = new h();
        return new f("JsxCvActualizationPhoneSelect", new C49380c(false, false, null, 7, null), new e(cVar, aVar, this.f131370e.get(), jVar, hVar));
    }
}
