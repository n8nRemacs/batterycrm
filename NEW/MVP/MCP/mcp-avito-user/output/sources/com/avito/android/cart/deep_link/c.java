package com.avito.android.cart.deep_link;

import Hm.f;
import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CartLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f115301a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f115302b;

    /* renamed from: c, reason: collision with root package name */
    public final C25721c f115303c;

    /* renamed from: d, reason: collision with root package name */
    public final f f115304d;

    public c(dv.b bVar, dv.b bVar2, C25721c c25721c, f fVar) {
        this.f115301a = bVar;
        this.f115302b = bVar2;
        this.f115303c = c25721c;
        this.f115304d = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.b) this.f115301a.get(), (a.InterfaceC4053a) this.f115302b.get(), (C25719a) this.f115303c.get(), (Hm.c) this.f115304d.get());
    }
}
