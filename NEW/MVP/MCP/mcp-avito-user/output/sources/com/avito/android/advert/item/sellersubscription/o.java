package com.avito.android.advert.item.sellersubscription;

import com.avito.android.InterfaceC34162r0;
import com.avito.android.favorite_sellers.adapter.recommendation.InterfaceC30576b;
import com.avito.android.remote.Q;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: SellerSubscriptionInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Q> f79762a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<I30.d> f79763b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f79764c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC34162r0> f79765d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f79766e;

    public o(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f79762a = provider;
        this.f79763b = provider2;
        this.f79764c = provider3;
        this.f79765d = provider4;
        this.f79766e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n(dagger.internal.g.b(this.f79762a), this.f79763b.get(), this.f79764c.get(), this.f79765d.get(), (InterfaceC30576b) this.f79766e.get());
    }
}
