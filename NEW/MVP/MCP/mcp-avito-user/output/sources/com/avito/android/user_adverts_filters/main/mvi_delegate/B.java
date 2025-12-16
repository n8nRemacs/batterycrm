package com.avito.android.user_adverts_filters.main.mvi_delegate;

import com.avito.android.util.R0;
import javax.inject.Provider;
import qJ0.InterfaceC47308d;

/* compiled from: FiltersDelegateFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class B implements dagger.internal.h<A> {

    /* renamed from: a, reason: collision with root package name */
    public final w f316079a;

    /* renamed from: b, reason: collision with root package name */
    public final D f316080b;

    /* renamed from: c, reason: collision with root package name */
    public final y f316081c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f316082d;

    public B(w wVar, D d12, y yVar, Provider provider) {
        this.f316079a = wVar;
        this.f316080b = d12;
        this.f316081c = yVar;
        this.f316082d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C35708a c35708a = (C35708a) this.f316079a.get();
        this.f316080b.getClass();
        C c12 = new C();
        this.f316081c.getClass();
        return new A("UserAdvertsFiltersDelegateFeature", InterfaceC47308d.b.f429187a, new z(c35708a, c12, new x(), this.f316082d.get()));
    }
}
