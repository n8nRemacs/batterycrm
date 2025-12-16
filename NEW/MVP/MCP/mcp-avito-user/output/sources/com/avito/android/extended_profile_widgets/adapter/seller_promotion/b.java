package com.avito.android.extended_profile_widgets.adapter.seller_promotion;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SellerPromotionBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f154926a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f154927b;

    public b(d dVar, Provider provider) {
        this.f154926a = dVar;
        this.f154927b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f154926a.get(), this.f154927b.get());
    }
}
