package com.avito.android.advert.deeplinks;

import Sj.C15192b;
import com.avito.android.L;
import com.avito.android.O;
import com.avito.android.advert.C27796h;
import com.avito.android.advert.InterfaceC27793e;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertDetailsDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class k implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f69031a;

    /* renamed from: b, reason: collision with root package name */
    public final C27796h f69032b;

    /* renamed from: c, reason: collision with root package name */
    public final O f69033c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f69034d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.navigation.c f69035e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.f f69036f;

    /* renamed from: g, reason: collision with root package name */
    public final C15192b f69037g;

    public k(dv.b bVar, C27796h c27796h, O o12, dv.b bVar2, com.avito.android.navigation.c cVar, dagger.internal.f fVar, C15192b c15192b) {
        this.f69031a = bVar;
        this.f69032b = c27796h;
        this.f69033c = o12;
        this.f69034d = bVar2;
        this.f69035e = cVar;
        this.f69036f = fVar;
        this.f69037g = c15192b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f69031a.get();
        InterfaceC27793e interfaceC27793e = (InterfaceC27793e) this.f69032b.get();
        L l12 = (L) this.f69033c.get();
        a.b bVar = (a.b) this.f69034d.get();
        com.avito.android.navigation.a aVar = (com.avito.android.navigation.a) this.f69035e.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f69036f.get();
        this.f69037g.get();
        return new i(interfaceC4053a, interfaceC27793e, l12, bVar, aVar, interfaceC28373a);
    }
}
