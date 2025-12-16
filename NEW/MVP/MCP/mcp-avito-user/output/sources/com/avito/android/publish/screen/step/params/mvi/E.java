package com.avito.android.publish.screen.step.params.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import javax.inject.Provider;

/* compiled from: PublishDetailsFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class E implements dagger.internal.h<D> {

    /* renamed from: a, reason: collision with root package name */
    public final B f241338a;

    /* renamed from: b, reason: collision with root package name */
    public final z f241339b;

    /* renamed from: c, reason: collision with root package name */
    public final G f241340c;

    /* renamed from: d, reason: collision with root package name */
    public final I f241341d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f241342e;

    public E(B b12, z zVar, G g12, I i12, Provider provider) {
        this.f241338a = b12;
        this.f241339b = zVar;
        this.f241340c = g12;
        this.f241341d = i12;
        this.f241342e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        A a12 = (A) this.f241338a.get();
        y yVar = (y) this.f241339b.get();
        this.f241340c.getClass();
        F f12 = new F();
        H h12 = (H) this.f241341d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f241342e.get();
        Ie0.f.f8428j.getClass();
        return new D("PublishDetails", Ie0.f.f8429k, new C(a12, yVar, screenPerformanceTracker, h12, f12));
    }
}
