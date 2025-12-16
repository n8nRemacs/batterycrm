package com.avito.android.advert_details_items.price;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OldPriceHintDialogFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final u f85212a;

    public l(u uVar) {
        this.f85212a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((com.avito.android.deeplink_handler.handler.composite.a) this.f85212a.get());
    }
}
