package com.avito.android.cv_actualization.view.code_input.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JsxCvActualizationCodeInputFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final k f131218a;

    /* renamed from: b, reason: collision with root package name */
    public final b f131219b;

    /* renamed from: c, reason: collision with root package name */
    public final i f131220c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f131221d;

    /* renamed from: e, reason: collision with root package name */
    public final d f131222e;

    /* renamed from: f, reason: collision with root package name */
    public final l f131223f;

    public g(k kVar, b bVar, i iVar, Provider provider, d dVar, l lVar) {
        this.f131218a = kVar;
        this.f131219b = bVar;
        this.f131220c = iVar;
        this.f131221d = provider;
        this.f131222e = dVar;
        this.f131223f = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        this.f131218a.getClass();
        j jVar = new j();
        a aVar = (a) this.f131219b.get();
        this.f131220c.getClass();
        h hVar = new h();
        return new f("JsxCvActualizationCodeInput", new qt.c((String) this.f131223f.f393949a, null, null, false, 14, null), new e(aVar, this.f131221d.get(), jVar, hVar, (c) this.f131222e.get()));
    }
}
