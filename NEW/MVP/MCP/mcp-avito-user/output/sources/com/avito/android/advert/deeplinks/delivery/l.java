package com.avito.android.advert.deeplinks.delivery;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.C29640d;
import com.avito.android.C30563f;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RequestDeliveryDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class l implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f68941a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E> f68942b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f68943c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f68944d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f68945e;

    /* renamed from: f, reason: collision with root package name */
    public final dv.b f68946f;

    /* renamed from: g, reason: collision with root package name */
    public final s f68947g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f68948h;

    /* renamed from: i, reason: collision with root package name */
    public final com.avito.android.remote.error.i f68949i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f68950j;

    /* renamed from: k, reason: collision with root package name */
    public final C25721c f68951k;

    /* renamed from: l, reason: collision with root package name */
    public final Z3.d f68952l;

    /* renamed from: m, reason: collision with root package name */
    public final C30563f f68953m;

    public l(dagger.internal.f fVar, Provider provider, dagger.internal.f fVar2, dv.b bVar, dv.b bVar2, dv.b bVar3, s sVar, Provider provider2, com.avito.android.remote.error.i iVar, Provider provider3, C25721c c25721c, Z3.d dVar, C30563f c30563f) {
        this.f68941a = fVar;
        this.f68942b = provider;
        this.f68943c = fVar2;
        this.f68944d = bVar;
        this.f68945e = bVar2;
        this.f68946f = bVar3;
        this.f68947g = sVar;
        this.f68948h = provider2;
        this.f68949i = iVar;
        this.f68950j = provider3;
        this.f68951k = c25721c;
        this.f68952l = dVar;
        this.f68953m = c30563f;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((InterfaceC28373a) this.f68941a.get(), this.f68942b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f68943c.get(), (a.d) this.f68944d.get(), (a.i) this.f68945e.get(), (a.g) this.f68946f.get(), (o) this.f68947g.get(), this.f68948h.get(), (com.avito.android.remote.error.f) this.f68949i.get(), this.f68950j.get(), (C25719a) this.f68951k.get(), (Z3.a) this.f68952l.get(), (C29640d) this.f68953m.get());
    }
}
