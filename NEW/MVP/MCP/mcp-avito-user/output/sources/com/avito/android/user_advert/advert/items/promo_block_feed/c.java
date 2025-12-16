package com.avito.android.user_advert.advert.items.promo_block_feed;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PromoBlockItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f309859a;

    /* renamed from: b, reason: collision with root package name */
    public final u f309860b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.vertical_main.c> f309861c;

    public c(u uVar, u uVar2, Provider provider) {
        this.f309859a = uVar;
        this.f309860b = uVar2;
        this.f309861c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f309859a.get(), (com.avito.android.util.text.a) this.f309860b.get(), this.f309861c.get());
    }
}
