package com.avito.android.active_orders_common.items.order;

import android.content.res.Resources;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OrderItemResourceProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f68386a;

    public l(dagger.internal.l lVar) {
        this.f68386a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k((Resources) this.f68386a.f393949a);
    }
}
