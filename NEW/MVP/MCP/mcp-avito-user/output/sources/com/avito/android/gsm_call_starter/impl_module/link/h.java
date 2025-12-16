package com.avito.android.gsm_call_starter.impl_module.link;

import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import com.avito.android.permissions.u;
import com.avito.android.permissions.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zL.InterfaceC50481a;

/* compiled from: GsmCallStartLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f161238a;

    /* renamed from: b, reason: collision with root package name */
    public final w f161239b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f161240c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f161241d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<UH.a> f161242e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.gsm_call_starter.impl_module.intent_factory.a> f161243f;

    /* renamed from: g, reason: collision with root package name */
    public final dv.b f161244g;

    /* renamed from: h, reason: collision with root package name */
    public final dv.b f161245h;

    /* renamed from: i, reason: collision with root package name */
    public final dv.b f161246i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<InterfaceC50481a> f161247j;

    public h(C30102l3 c30102l3, w wVar, dagger.internal.f fVar, dagger.internal.f fVar2, Provider provider, Provider provider2, dv.b bVar, dv.b bVar2, dv.b bVar3, Provider provider3) {
        this.f161238a = c30102l3;
        this.f161239b = wVar;
        this.f161240c = fVar;
        this.f161241d = fVar2;
        this.f161242e = provider;
        this.f161243f = provider2;
        this.f161244g = bVar;
        this.f161245h = bVar2;
        this.f161246i = bVar3;
        this.f161247j = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((Context) this.f161238a.get(), (u) this.f161239b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f161240c.get(), (InterfaceC28373a) this.f161241d.get(), this.f161242e.get(), this.f161243f.get(), (a.InterfaceC4053a) this.f161244g.get(), (a.h) this.f161245h.get(), (a.i) this.f161246i.get(), this.f161247j.get());
    }
}
