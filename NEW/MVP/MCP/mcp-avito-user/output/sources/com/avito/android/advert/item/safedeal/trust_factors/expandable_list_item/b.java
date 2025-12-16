package com.avito.android.advert.item.safedeal.trust_factors.expandable_list_item;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TrustFactorsExpandableListItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f79137a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f79138b;

    public b(d dVar, Provider provider) {
        this.f79137a = dVar;
        this.f79138b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f79137a.get(), this.f79138b.get());
    }
}
