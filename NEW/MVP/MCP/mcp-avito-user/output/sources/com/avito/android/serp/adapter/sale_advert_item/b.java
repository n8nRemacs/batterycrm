package com.avito.android.serp.adapter.sale_advert_item;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: AdvertGridSaleItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f271532a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f271533b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Locale> f271534c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.connection_quality.connectivity.a> f271535d;

    public b(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f271532a = uVar;
        this.f271533b = provider;
        this.f271534c = provider2;
        this.f271535d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f271532a.get(), this.f271533b.get(), this.f271534c.get(), this.f271535d.get());
    }
}
