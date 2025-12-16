package com.avito.android.user_adverts.root_screen.adverts_host.panel_config.mvi;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: PanelConfigFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class z implements dagger.internal.h<y> {

    /* renamed from: a, reason: collision with root package name */
    public final w f313452a;

    /* renamed from: b, reason: collision with root package name */
    public final D f313453b;

    /* renamed from: c, reason: collision with root package name */
    public final B f313454c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f313455d;

    public z(w wVar, D d12, B b12, Provider provider) {
        this.f313452a = wVar;
        this.f313453b = d12;
        this.f313454c = b12;
        this.f313455d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C35593a c35593a = (C35593a) this.f313452a.get();
        this.f313453b.getClass();
        C c12 = new C();
        this.f313454c.getClass();
        return new y("UserAdvertsPanelConfigFeature", new II0.d(null, null, 3, null), new x(c35593a, c12, new A(), this.f313455d.get()));
    }
}
