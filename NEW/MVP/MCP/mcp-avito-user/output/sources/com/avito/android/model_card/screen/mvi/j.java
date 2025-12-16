package com.avito.android.model_card.screen.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ModelCardFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f198109a;

    /* renamed from: b, reason: collision with root package name */
    public final b f198110b;

    /* renamed from: c, reason: collision with root package name */
    public final l f198111c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f198112d;

    public j(g gVar, b bVar, l lVar, Provider provider) {
        this.f198109a = gVar;
        this.f198110b = bVar;
        this.f198111c = lVar;
        this.f198112d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f198109a.get();
        a aVar = (a) this.f198110b.get();
        this.f198111c.getClass();
        k kVar = new k();
        ScreenPerformanceTracker screenPerformanceTracker = this.f198112d.get();
        FZ.c.f4779k.getClass();
        return new i("ModelCardMvi", FZ.c.f4780l, new h(fVar, aVar, screenPerformanceTracker, kVar));
    }
}
