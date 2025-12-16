package com.avito.android.advert.item.safedeal.trust_factors.expandable_list_item;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TrustFactorsExpandableListItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.safedeal.trust_factors.d> f79140a;

    public d(Provider<com.avito.android.advert.item.safedeal.trust_factors.d> provider) {
        this.f79140a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f79140a.get());
    }
}
