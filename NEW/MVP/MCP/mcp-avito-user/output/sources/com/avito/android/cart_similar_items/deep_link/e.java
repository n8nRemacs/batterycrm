package com.avito.android.cart_similar_items.deep_link;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.C28727b1;
import com.avito.android.Z0;
import com.avito.android.cart_similar_items.k;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CartSimilarItemsLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final k f115730a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f115731b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f115732c;

    /* renamed from: d, reason: collision with root package name */
    public final C25721c f115733d;

    /* renamed from: e, reason: collision with root package name */
    public final C28727b1 f115734e;

    public e(k kVar, dv.b bVar, dv.b bVar2, C25721c c25721c, C28727b1 c28727b1) {
        this.f115730a = kVar;
        this.f115731b = bVar;
        this.f115732c = bVar2;
        this.f115733d = c25721c;
        this.f115734e = c28727b1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.cart_similar_items.h) this.f115730a.get(), (a.InterfaceC4053a) this.f115731b.get(), (a.b) this.f115732c.get(), (C25719a) this.f115733d.get(), (Z0) this.f115734e.get());
    }
}
