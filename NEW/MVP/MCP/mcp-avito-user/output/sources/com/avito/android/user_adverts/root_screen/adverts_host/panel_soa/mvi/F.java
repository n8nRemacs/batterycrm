package com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: PanelSoaFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class F implements dagger.internal.h<E> {

    /* renamed from: a, reason: collision with root package name */
    public final C f313507a;

    /* renamed from: b, reason: collision with root package name */
    public final J f313508b;

    /* renamed from: c, reason: collision with root package name */
    public final H f313509c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f313510d;

    public F(C c12, J j12, H h12, Provider provider) {
        this.f313507a = c12;
        this.f313508b = j12;
        this.f313509c = h12;
        this.f313510d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C35597a c35597a = (C35597a) this.f313507a.get();
        I i12 = (I) this.f313508b.get();
        this.f313509c.getClass();
        return new E("UserAdvertsPanelSoaFeature", new MI0.d(null, null, null, 7, null), new D(c35597a, i12, new G(), this.f313510d.get()));
    }
}
