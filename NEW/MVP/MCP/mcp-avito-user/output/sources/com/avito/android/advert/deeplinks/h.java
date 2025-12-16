package com.avito.android.advert.deeplinks;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.advert.item.safedeal.S;
import com.avito.android.advert.item.safedeal.T;
import com.avito.android.advert.item.safedeal.Y;
import com.avito.android.advert.item.safedeal.Z;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AddItemToCartDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class h implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f69011a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f69012b;

    /* renamed from: c, reason: collision with root package name */
    public final T f69013c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f69014d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f69015e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f69016f;

    /* renamed from: g, reason: collision with root package name */
    public final C25721c f69017g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.lib.beduin_v2.repository.domain.cart_items.h> f69018h;

    /* renamed from: i, reason: collision with root package name */
    public final Z f69019i;

    /* renamed from: j, reason: collision with root package name */
    public final dv.b f69020j;

    public h(dv.b bVar, dv.b bVar2, T t12, dagger.internal.f fVar, Provider provider, Provider provider2, C25721c c25721c, Provider provider3, Z z12, dv.b bVar3) {
        this.f69011a = bVar;
        this.f69012b = bVar2;
        this.f69013c = t12;
        this.f69014d = fVar;
        this.f69015e = provider;
        this.f69016f = provider2;
        this.f69017g = c25721c;
        this.f69018h = provider3;
        this.f69019i = z12;
        this.f69020j = bVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.g) this.f69011a.get(), (a.i) this.f69012b.get(), (S) this.f69013c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f69014d.get(), this.f69015e.get(), this.f69016f.get(), (C25719a) this.f69017g.get(), this.f69018h.get(), (Y) this.f69019i.get(), (a.InterfaceC4053a) this.f69020j.get());
    }
}
