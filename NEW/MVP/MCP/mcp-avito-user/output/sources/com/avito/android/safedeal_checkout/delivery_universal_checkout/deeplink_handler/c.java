package com.avito.android.safedeal_checkout.delivery_universal_checkout.deeplink_handler;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.i;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.l;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DeliveryUniversalCheckoutDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f256977a;

    /* renamed from: b, reason: collision with root package name */
    public final l f256978b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f256979c;

    /* renamed from: d, reason: collision with root package name */
    public final C25721c f256980d;

    public c(dv.b bVar, l lVar, dv.b bVar2, C25721c c25721c) {
        this.f256977a = bVar;
        this.f256978b = lVar;
        this.f256979c = bVar2;
        this.f256980d = c25721c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a.b) this.f256977a.get(), (i) this.f256978b.get(), (a.InterfaceC4053a) this.f256979c.get(), (C25719a) this.f256980d.get());
    }
}
