package com.avito.android.order.deeplink;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: OrderDeeplinkHandlerModule_ProvideOrderLinkDeeplinkHandlerMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f209458a;

    /* renamed from: b, reason: collision with root package name */
    public final g f209459b;

    public b(e eVar, g gVar) {
        this.f209458a = eVar;
        this.f209459b = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f209459b.getClass();
        f fVar = new f();
        e eVar = this.f209458a;
        a.f209457a.getClass();
        return new C43834a(OrderLink.class, fVar, new C43834a.b.C11809b(eVar));
    }
}
