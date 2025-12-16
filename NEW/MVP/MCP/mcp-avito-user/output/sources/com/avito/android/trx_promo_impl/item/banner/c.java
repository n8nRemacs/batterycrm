package com.avito.android.trx_promo_impl.item.banner;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TrxPromoBannerItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f304207a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f304208b;

    public c(u uVar, Provider provider) {
        this.f304207a = uVar;
        this.f304208b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f304207a.get(), this.f304208b.get());
    }
}
