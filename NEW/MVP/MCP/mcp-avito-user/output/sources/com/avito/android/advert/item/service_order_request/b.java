package com.avito.android.advert.item.service_order_request;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceOrderRequestBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f79886a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f79887b;

    public b(u uVar, Provider provider) {
        this.f79886a = uVar;
        this.f79887b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f79886a.get(), this.f79887b.get());
    }
}
