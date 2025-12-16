package com.avito.android.checkout.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CheckoutListModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class l implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.checkout.ui.items.header.c f118247a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.checkout.ui.items.service.d f118248b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.checkout.ui.items.promocode.b f118249c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.checkout.ui.items.price.c f118250d;

    public l(com.avito.android.checkout.ui.items.header.c cVar, com.avito.android.checkout.ui.items.service.d dVar, com.avito.android.checkout.ui.items.promocode.b bVar, com.avito.android.checkout.ui.items.price.c cVar2) {
        this.f118247a = cVar;
        this.f118248b = dVar;
        this.f118249c = bVar;
        this.f118250d = cVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.checkout.ui.items.header.b bVar = (com.avito.android.checkout.ui.items.header.b) this.f118247a.get();
        com.avito.android.checkout.ui.items.service.c cVar = (com.avito.android.checkout.ui.items.service.c) this.f118248b.get();
        com.avito.android.checkout.ui.items.promocode.a aVar = (com.avito.android.checkout.ui.items.promocode.a) this.f118249c.get();
        com.avito.android.checkout.ui.items.price.b bVar2 = (com.avito.android.checkout.ui.items.price.b) this.f118250d.get();
        j.f118245a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(cVar);
        c10493a.b(aVar);
        c10493a.b(bVar2);
        return c10493a.a();
    }
}
