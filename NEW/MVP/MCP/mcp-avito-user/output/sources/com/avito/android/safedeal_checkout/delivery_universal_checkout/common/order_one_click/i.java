package com.avito.android.safedeal_checkout.delivery_universal_checkout.common.order_one_click;

import Hr.InterfaceC14024a;
import android.content.res.Resources;
import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DeliveryOrderRealOneClickDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final o f256951a;

    /* renamed from: b, reason: collision with root package name */
    public final C25721c f256952b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f256953c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f256954d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC14024a> f256955e;

    /* renamed from: f, reason: collision with root package name */
    public final dv.b f256956f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f256957g;

    /* renamed from: h, reason: collision with root package name */
    public final Xu.c f256958h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f256959i;

    public i(o oVar, C25721c c25721c, dv.b bVar, dagger.internal.f fVar, Provider provider, dv.b bVar2, Provider provider2, Xu.c cVar, Provider provider3) {
        this.f256951a = oVar;
        this.f256952b = c25721c;
        this.f256953c = bVar;
        this.f256954d = fVar;
        this.f256955e = provider;
        this.f256956f = bVar2;
        this.f256957g = provider2;
        this.f256958h = cVar;
        this.f256959i = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((m) this.f256951a.get(), (C25719a) this.f256952b.get(), (a.g) this.f256953c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f256954d.get(), this.f256955e.get(), (a.d) this.f256956f.get(), this.f256957g.get(), (Resources) this.f256958h.get(), this.f256959i.get());
    }
}
