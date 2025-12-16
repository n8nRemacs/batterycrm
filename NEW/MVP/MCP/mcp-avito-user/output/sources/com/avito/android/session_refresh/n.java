package com.avito.android.session_refresh;

import com.avito.android.C29270c0;
import com.avito.android.C30276e0;
import com.avito.android.H0;
import com.avito.android.account.G;
import com.avito.android.account.O;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.session_refresh.l;
import com.google.gson.Gson;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SessionRefresher_Impl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<l.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<G> f280722a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<O> f280723b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Gson> f280724c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f280725d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<H0> f280726e;

    /* renamed from: f, reason: collision with root package name */
    public final C30276e0 f280727f;

    public n(Provider provider, Provider provider2, Provider provider3, dagger.internal.f fVar, Provider provider4, C30276e0 c30276e0) {
        this.f280722a = provider;
        this.f280723b = provider2;
        this.f280724c = provider3;
        this.f280725d = fVar;
        this.f280726e = provider4;
        this.f280727f = c30276e0;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l.a(this.f280722a.get(), this.f280723b.get(), this.f280724c.get(), (InterfaceC28373a) this.f280725d.get(), this.f280726e.get(), (C29270c0) this.f280727f.get());
    }
}
