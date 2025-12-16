package com.avito.android.return_checkout.deeplink_handler;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.return_checkout.k;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DeliveryReturnCheckoutDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f255251a;

    /* renamed from: b, reason: collision with root package name */
    public final k f255252b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f255253c;

    /* renamed from: d, reason: collision with root package name */
    public final C25721c f255254d;

    public c(dv.b bVar, k kVar, dv.b bVar2, C25721c c25721c) {
        this.f255251a = bVar;
        this.f255252b = kVar;
        this.f255253c = bVar2;
        this.f255254d = c25721c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a.b) this.f255251a.get(), (com.avito.android.return_checkout.h) this.f255252b.get(), (a.InterfaceC4053a) this.f255253c.get(), (C25719a) this.f255254d.get());
    }
}
