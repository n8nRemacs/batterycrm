package com.avito.android.advert.item.services_price;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServicesPriceBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f79962a;

    public b(u uVar) {
        this.f79962a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f79962a.get());
    }
}
