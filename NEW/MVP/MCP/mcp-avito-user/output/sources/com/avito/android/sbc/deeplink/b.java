package com.avito.android.sbc.deeplink;

import android.content.Context;
import com.avito.android.deep_linking.links.DiscountDispatchDeeplink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DiscountDispatchDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b<DeeplinkT extends DiscountDispatchDeeplink> implements dagger.internal.h<a<DeeplinkT>> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f259956a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f259957b;

    /* renamed from: c, reason: collision with root package name */
    public final C30102l3 f259958c;

    public b(C30102l3 c30102l3, dv.b bVar, dv.b bVar2) {
        this.f259956a = bVar;
        this.f259957b = bVar2;
        this.f259958c = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((Context) this.f259958c.get(), (a.InterfaceC4053a) this.f259956a.get(), (a.b) this.f259957b.get());
    }
}
