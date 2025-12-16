package com.avito.android.orders.navigation.deep_link;

import com.avito.android.orders.OrdersLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: OrdersDeeplinkHandlerModule_ProvideOrdersLinkDeeplinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f210176a;

    /* renamed from: b, reason: collision with root package name */
    public final f f210177b;

    public b(d dVar, f fVar) {
        this.f210176a = dVar;
        this.f210177b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f210177b.getClass();
        e eVar = new e();
        a.f210175a.getClass();
        return new C43834a(OrdersLink.class, eVar, new C43834a.b.C11809b(this.f210176a));
    }
}
