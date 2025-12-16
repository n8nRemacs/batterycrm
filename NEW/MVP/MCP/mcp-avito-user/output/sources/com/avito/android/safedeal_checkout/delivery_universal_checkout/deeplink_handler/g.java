package com.avito.android.safedeal_checkout.delivery_universal_checkout.deeplink_handler;

import android.content.Context;
import com.avito.android.C36167y1;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import com.google.gson.Gson;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DeliveryUniversalPayDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f256993a;

    /* renamed from: b, reason: collision with root package name */
    public final C36167y1 f256994b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f256995c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f256996d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f256997e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<E> f256998f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.f f256999g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<Gson> f257000h;

    /* renamed from: i, reason: collision with root package name */
    public final C30102l3 f257001i;

    public g(dv.b bVar, C36167y1 c36167y1, dv.b bVar2, dagger.internal.f fVar, dv.b bVar3, Provider provider, dagger.internal.f fVar2, Provider provider2, C30102l3 c30102l3) {
        this.f256993a = bVar;
        this.f256994b = c36167y1;
        this.f256995c = bVar2;
        this.f256996d = fVar;
        this.f256997e = bVar3;
        this.f256998f = provider;
        this.f256999g = fVar2;
        this.f257000h = provider2;
        this.f257001i = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((a.InterfaceC4053a) this.f256993a.get(), (InterfaceC36134w1) this.f256994b.get(), (a.b) this.f256995c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f256996d.get(), (a.i) this.f256997e.get(), this.f256998f.get(), (InterfaceC28373a) this.f256999g.get(), dagger.internal.g.b(this.f257000h), (Context) this.f257001i.get());
    }
}
