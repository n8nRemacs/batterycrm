package com.avito.android.order.feature.domain;

import RK0.c;
import com.avito.android.order.OrderScreenSegment;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GetOrderDetailsUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.order.feature.data.e f209584a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.order.feature.a> f209585b;

    /* renamed from: c, reason: collision with root package name */
    public final c f209586c;

    /* renamed from: d, reason: collision with root package name */
    public final l f209587d;

    /* renamed from: e, reason: collision with root package name */
    public final l f209588e;

    public b(com.avito.android.order.feature.data.e eVar, Provider provider, c cVar, l lVar, l lVar2) {
        this.f209584a = eVar;
        this.f209585b = provider;
        this.f209586c = cVar;
        this.f209587d = lVar;
        this.f209588e = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.order.feature.data.a aVar = (com.avito.android.order.feature.data.a) this.f209584a.get();
        com.avito.android.order.feature.a aVar2 = this.f209585b.get();
        this.f209586c.getClass();
        return new a(aVar, aVar2, new RK0.b(), (String) this.f209587d.f393949a, (OrderScreenSegment) this.f209588e.f393949a);
    }
}
