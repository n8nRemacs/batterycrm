package com.avito.android.user_advert.advert.items.availableStocks;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AvailableStocksItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f309268a;

    public f(u uVar) {
        this.f309268a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.deeplink_handler.handler.composite.a) this.f309268a.get());
    }
}
