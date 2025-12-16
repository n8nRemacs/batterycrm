package com.avito.android.advert.deeplinks.delivery_order;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DeliveryOrderCreateDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final n f68995a;

    /* renamed from: b, reason: collision with root package name */
    public final C25721c f68996b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f68997c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f68998d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f68999e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.f f69000f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<R0> f69001g;

    public f(n nVar, C25721c c25721c, dv.b bVar, dv.b bVar2, Provider provider, dagger.internal.f fVar, Provider provider2) {
        this.f68995a = nVar;
        this.f68996b = c25721c;
        this.f68997c = bVar;
        this.f68998d = bVar2;
        this.f68999e = provider;
        this.f69000f = fVar;
        this.f69001g = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((l) this.f68995a.get(), (C25719a) this.f68996b.get(), (a.g) this.f68997c.get(), (a.i) this.f68998d.get(), this.f68999e.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f69000f.get(), this.f69001g.get());
    }
}
