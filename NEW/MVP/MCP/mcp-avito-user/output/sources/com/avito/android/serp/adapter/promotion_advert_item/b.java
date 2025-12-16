package com.avito.android.serp.adapter.promotion_advert_item;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: AdvertGridPromotionItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f270515a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f270516b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Locale> f270517c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.connection_quality.connectivity.a> f270518d;

    public b(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f270515a = uVar;
        this.f270516b = provider;
        this.f270517c = provider2;
        this.f270518d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.serp.adapter.sale_advert_item.c) this.f270515a.get(), this.f270516b.get(), this.f270517c.get(), this.f270518d.get());
    }
}
