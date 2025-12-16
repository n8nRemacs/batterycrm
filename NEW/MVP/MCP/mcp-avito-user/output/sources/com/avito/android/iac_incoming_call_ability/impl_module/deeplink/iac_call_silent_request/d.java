package com.avito.android.iac_incoming_call_ability.impl_module.deeplink.iac_call_silent_request;

import android.content.res.Resources;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacCallSilentRequestDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f168236a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f168237b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<F> f168238c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f168239d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<NL.e> f168240e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<EL.a> f168241f;

    /* renamed from: g, reason: collision with root package name */
    public final Xu.c f168242g;

    public d(dagger.internal.f fVar, dv.b bVar, Provider provider, dagger.internal.f fVar2, Provider provider2, Provider provider3, Xu.c cVar) {
        this.f168236a = fVar;
        this.f168237b = bVar;
        this.f168238c = provider;
        this.f168239d = fVar2;
        this.f168240e = provider2;
        this.f168241f = provider3;
        this.f168242g = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.deeplink_handler.handler.composite.a) this.f168236a.get(), (a.i) this.f168237b.get(), this.f168238c.get(), (InterfaceC28373a) this.f168239d.get(), this.f168240e.get(), this.f168241f.get(), (Resources) this.f168242g.get());
    }
}
