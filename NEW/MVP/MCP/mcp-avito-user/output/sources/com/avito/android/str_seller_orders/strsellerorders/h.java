package com.avito.android.str_seller_orders.strsellerorders;

import android.app.Application;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrSellerOrdersIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f289814a;

    public h(dagger.internal.l lVar) {
        this.f289814a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((Application) this.f289814a.f393949a);
    }
}
