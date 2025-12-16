package com.avito.android.advert.item.safedeal.real_one_click_payment_block;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsSafeDealPaymentBlockBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f78917a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f78918b;

    public b(u uVar, Provider provider) {
        this.f78917a = uVar;
        this.f78918b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f78917a.get(), this.f78918b.get());
    }
}
