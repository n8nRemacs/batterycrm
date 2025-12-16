package com.avito.android.advert.item.sellersubscription;

import Ca.AbstractC13232a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: SellerSubscriptionPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class B implements dagger.internal.h<SellerSubscriptionPresenterImpl> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<j> f79670a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f79671b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<I30.d> f79672c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<D> f79673d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f79674e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<io.reactivex.rxjava3.core.z<AbstractC13232a>> f79675f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f79676g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f79677h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f79678i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<R0> f79679j;

    public B(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        this.f79670a = provider;
        this.f79671b = provider2;
        this.f79672c = provider3;
        this.f79673d = provider4;
        this.f79674e = provider5;
        this.f79675f = provider6;
        this.f79676g = uVar;
        this.f79677h = provider7;
        this.f79678i = provider8;
        this.f79679j = provider9;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new SellerSubscriptionPresenterImpl(this.f79670a.get(), this.f79671b.get(), this.f79672c.get(), this.f79673d.get(), this.f79674e.get(), this.f79675f.get(), (com.avito.android.component.toast.util.c) this.f79676g.get(), this.f79677h.get(), this.f79678i.get(), this.f79679j.get());
    }
}
