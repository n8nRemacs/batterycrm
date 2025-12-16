package com.avito.android.mortgage.landing.mvi.domain;

import com.avito.android.account.G;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LandingInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<IZ.a> f200142a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.mortgage.deeplink.domain.h f200143b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<G> f200144c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.mortgage.util.e f200145d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f200146e;

    public c(Provider provider, com.avito.android.mortgage.deeplink.domain.h hVar, Provider provider2, com.avito.android.mortgage.util.e eVar, Provider provider3) {
        this.f200142a = provider;
        this.f200143b = hVar;
        this.f200144c = provider2;
        this.f200145d = eVar;
        this.f200146e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarA = g.a(w.a(this.f200142a));
        com.avito.android.mortgage.deeplink.domain.g gVar = (com.avito.android.mortgage.deeplink.domain.g) this.f200143b.get();
        G g12 = this.f200144c.get();
        this.f200145d.getClass();
        return new b(eVarA, gVar, g12, new com.avito.android.mortgage.util.d(), this.f200146e.get());
    }
}
