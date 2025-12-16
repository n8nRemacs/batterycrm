package com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi;

import BI0.d;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: SearchFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class x implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final u f312949a;

    /* renamed from: b, reason: collision with root package name */
    public final B f312950b;

    /* renamed from: c, reason: collision with root package name */
    public final z f312951c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f312952d;

    public x(u uVar, B b12, z zVar, Provider provider) {
        this.f312949a = uVar;
        this.f312950b = b12;
        this.f312951c = zVar;
        this.f312952d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C35571a c35571a = (C35571a) this.f312949a.get();
        this.f312950b.getClass();
        A a12 = new A();
        this.f312951c.getClass();
        return new w("UserAdvertsSearchFeature", d.c.f1323a, new v(c35571a, a12, new y(), this.f312952d.get()));
    }
}
