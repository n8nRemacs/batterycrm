package com.avito.android.iac_dialer.impl_module.telecom;

import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import com.avito.android.di.module.C30102l3;
import com.avito.android.iac_dialer.impl_module.telecom.impl.j;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacTelecomManagerSplitterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<j> f166421a;

    /* renamed from: b, reason: collision with root package name */
    public final u f166422b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<FK.a> f166423c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.iac_dialer.impl_module.splitter.features.c f166424d;

    /* renamed from: e, reason: collision with root package name */
    public final C30102l3 f166425e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.f f166426f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<F> f166427g;

    public g(Provider provider, u uVar, Provider provider2, com.avito.android.iac_dialer.impl_module.splitter.features.c cVar, C30102l3 c30102l3, dagger.internal.f fVar, Provider provider3) {
        this.f166421a = provider;
        this.f166422b = uVar;
        this.f166423c = provider2;
        this.f166424d = cVar;
        this.f166425e = c30102l3;
        this.f166426f = fVar;
        this.f166427g = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(dagger.internal.g.b(this.f166421a), dagger.internal.g.a(w.a(this.f166422b)), this.f166423c.get(), (com.avito.android.iac_dialer.impl_module.splitter.features.a) this.f166424d.get(), (Context) this.f166425e.get(), (InterfaceC28373a) this.f166426f.get(), this.f166427g.get());
    }
}
