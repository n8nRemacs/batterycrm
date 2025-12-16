package com.avito.android.iac_dialer.impl_module.analytics.tech_info;

import PL.i;
import com.avito.android.permissions.u;
import com.avito.android.permissions.w;
import com.avito.android.util.C;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacTechInfoDefaultParamsProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f165720a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.iac_dialer.impl_module.splitter.features.c f165721b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.iac_dialer.impl_module.telecom.e> f165722c;

    /* renamed from: d, reason: collision with root package name */
    public final w f165723d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<i> f165724e;

    public c(Provider provider, com.avito.android.iac_dialer.impl_module.splitter.features.c cVar, Provider provider2, w wVar, Provider provider3) {
        this.f165720a = provider;
        this.f165721b = cVar;
        this.f165722c = provider2;
        this.f165723d = wVar;
        this.f165724e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C c12 = this.f165720a.get();
        this.f165721b.get();
        return new b(c12, this.f165722c.get(), (u) this.f165723d.get(), this.f165724e.get());
    }
}
