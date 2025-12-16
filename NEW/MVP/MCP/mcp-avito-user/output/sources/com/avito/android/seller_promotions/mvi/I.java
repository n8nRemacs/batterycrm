package com.avito.android.seller_promotions.mvi;

import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: SellerPromotionsReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class I implements dagger.internal.h<H> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f267925a;

    public I(Provider<InterfaceC40691b> provider) {
        this.f267925a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new H(this.f267925a.get());
    }
}
