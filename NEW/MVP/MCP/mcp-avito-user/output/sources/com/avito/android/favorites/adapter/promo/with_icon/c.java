package com.avito.android.favorites.adapter.promo.with_icon;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PromoItemWithIconBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f156686a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.favorites.adapter.promo.x> f156687b;

    public c(u uVar, Provider provider) {
        this.f156686a = uVar;
        this.f156687b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f156686a.get(), this.f156687b.get());
    }
}
