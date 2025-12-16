package com.avito.android.orderBeduinV2.mvi.domain;

import RK0.c;
import com.avito.android.order.OrderScreenSegment;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GetOrderDetailsUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.order.feature.data.e f209863a;

    /* renamed from: b, reason: collision with root package name */
    public final c f209864b;

    /* renamed from: c, reason: collision with root package name */
    public final l f209865c;

    /* renamed from: d, reason: collision with root package name */
    public final l f209866d;

    public b(com.avito.android.order.feature.data.e eVar, c cVar, l lVar, l lVar2) {
        this.f209863a = eVar;
        this.f209864b = cVar;
        this.f209865c = lVar;
        this.f209866d = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.order.feature.data.a aVar = (com.avito.android.order.feature.data.a) this.f209863a.get();
        this.f209864b.getClass();
        return new a(aVar, new RK0.b(), (String) this.f209865c.f393949a, (OrderScreenSegment) this.f209866d.f393949a);
    }
}
