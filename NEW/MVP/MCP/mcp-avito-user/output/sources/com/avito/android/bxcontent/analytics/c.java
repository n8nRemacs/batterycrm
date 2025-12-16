package com.avito.android.bxcontent.analytics;

import Nr0.InterfaceC14605a;
import ac.C19864a;
import com.avito.android.C29640d;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.H;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BxContentAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f109478a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.provider.e> f109479b;

    /* renamed from: c, reason: collision with root package name */
    public final u f109480c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<E> f109481d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<C19864a> f109482e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<C29640d> f109483f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<H> f109484g;

    public c(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f109478a = provider;
        this.f109479b = provider2;
        this.f109480c = uVar;
        this.f109481d = provider3;
        this.f109482e = provider4;
        this.f109483f = provider5;
        this.f109484g = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f109478a.get(), this.f109479b.get(), (InterfaceC14605a) this.f109480c.get(), this.f109481d.get(), this.f109482e.get(), this.f109483f.get(), this.f109484g.get());
    }
}
