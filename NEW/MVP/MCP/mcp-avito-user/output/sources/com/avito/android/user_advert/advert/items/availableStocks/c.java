package com.avito.android.user_advert.advert.items.availableStocks;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AvailableStocksItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f309266a;

    public c(u uVar) {
        this.f309266a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f309266a.get());
    }
}
