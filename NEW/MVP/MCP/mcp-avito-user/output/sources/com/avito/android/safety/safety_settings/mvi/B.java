package com.avito.android.safety.safety_settings.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.safety.safety_settings.mvi.entity.b;
import javax.inject.Provider;

/* compiled from: SafetySettingsFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class B implements dagger.internal.h<A> {

    /* renamed from: a, reason: collision with root package name */
    public final w f257645a;

    /* renamed from: b, reason: collision with root package name */
    public final p f257646b;

    /* renamed from: c, reason: collision with root package name */
    public final D f257647c;

    /* renamed from: d, reason: collision with root package name */
    public final H f257648d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f257649e;

    public B(w wVar, p pVar, D d12, H h12, Provider provider) {
        this.f257645a = wVar;
        this.f257646b = pVar;
        this.f257647c = d12;
        this.f257648d = h12;
        this.f257649e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        v vVar = (v) this.f257645a.get();
        n nVar = (n) this.f257646b.get();
        this.f257647c.getClass();
        C c12 = new C();
        G g12 = (G) this.f257648d.get();
        return new A("SafetySettings", b.C7737b.f257741b, new z(vVar, nVar, this.f257649e.get(), g12, c12));
    }
}
