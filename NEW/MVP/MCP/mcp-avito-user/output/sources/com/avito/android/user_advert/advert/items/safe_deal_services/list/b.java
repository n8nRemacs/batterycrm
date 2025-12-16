package com.avito.android.user_advert.advert.items.safe_deal_services.list;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SafeDealServiceListItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f310055a;

    public b(Provider<c> provider) {
        this.f310055a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f310055a.get());
    }
}
