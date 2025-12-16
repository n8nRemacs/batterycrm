package com.avito.android.auction;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: AuctionAddDeepLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f92403a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f92404b;

    /* renamed from: c, reason: collision with root package name */
    public final C f92405c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f92406d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f92407e;

    public g(C30102l3 c30102l3, dv.b bVar, C c12, dagger.internal.f fVar, Provider provider) {
        this.f92403a = c30102l3;
        this.f92404b = bVar;
        this.f92405c = c12;
        this.f92406d = fVar;
        this.f92407e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((Context) this.f92403a.get(), (a.g) this.f92404b.get(), (z) this.f92405c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f92406d.get(), this.f92407e.get());
    }
}
