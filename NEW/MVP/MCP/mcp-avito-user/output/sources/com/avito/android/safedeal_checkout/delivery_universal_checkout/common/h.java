package com.avito.android.safedeal_checkout.delivery_universal_checkout.common;

import android.content.res.Resources;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DeliverySavedAddressCheckDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final k f256917a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E> f256918b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f256919c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f256920d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f256921e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.f f256922f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f256923g;

    /* renamed from: h, reason: collision with root package name */
    public final Xu.c f256924h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f256925i;

    public h(k kVar, Provider provider, dv.b bVar, dagger.internal.f fVar, dv.b bVar2, dagger.internal.f fVar2, Provider provider2, Xu.c cVar, Provider provider3) {
        this.f256917a = kVar;
        this.f256918b = provider;
        this.f256919c = bVar;
        this.f256920d = fVar;
        this.f256921e = bVar2;
        this.f256922f = fVar2;
        this.f256923g = provider2;
        this.f256924h = cVar;
        this.f256925i = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((i) this.f256917a.get(), this.f256918b.get(), (a.g) this.f256919c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f256920d.get(), (a.d) this.f256921e.get(), (InterfaceC28373a) this.f256922f.get(), this.f256923g.get(), (Resources) this.f256924h.get(), this.f256925i.get());
    }
}
