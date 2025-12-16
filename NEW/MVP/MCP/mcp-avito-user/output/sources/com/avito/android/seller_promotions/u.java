package com.avito.android.seller_promotions;

import com.avito.android.seller_promotions.mvi.A;
import com.avito.android.seller_promotions.mvi.z;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: SellerPromotionsViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class u implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f268104a;

    /* renamed from: b, reason: collision with root package name */
    public final A f268105b;

    public u(Provider provider, A a12) {
        this.f268104a = provider;
        this.f268105b = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new t(this.f268104a.get(), (z) this.f268105b.get());
    }
}
