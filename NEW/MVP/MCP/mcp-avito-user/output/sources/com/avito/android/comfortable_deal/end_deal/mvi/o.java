package com.avito.android.comfortable_deal.end_deal.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EndDealReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.end_deal.mvi.builder.g f122354a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.comfortable_deal.end_deal.mvi.builder.a> f122355b;

    public o(com.avito.android.comfortable_deal.end_deal.mvi.builder.g gVar, Provider provider) {
        this.f122354a = gVar;
        this.f122355b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n((com.avito.android.comfortable_deal.end_deal.mvi.builder.e) this.f122354a.get(), this.f122355b.get());
    }
}
