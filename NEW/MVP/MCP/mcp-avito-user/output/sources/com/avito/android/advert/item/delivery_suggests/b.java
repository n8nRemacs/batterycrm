package com.avito.android.advert.item.delivery_suggests;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsDeliverySuggestsBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f75103a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f75104b;

    public b(u uVar, Provider provider) {
        this.f75103a = uVar;
        this.f75104b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f75103a.get(), this.f75104b.get());
    }
}
