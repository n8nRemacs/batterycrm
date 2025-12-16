package com.avito.android.service_orders.di;

import java.util.Set;
import javax.inject.Provider;
import kotlin.collections.C42756l;

/* compiled from: ServiceOrdersListModule_ProvideItemPresentersFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class p implements dagger.internal.h<Set<TV0.d<?, ?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.service_orders.list.blueprints.snippet_item.c> f279154a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.service_orders.list.blueprints.calendar_button_item.c> f279155b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.service_orders.list.blueprints.banner_item.c> f279156c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f279157d;

    public p(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f279154a = provider;
        this.f279155b = provider2;
        this.f279156c = provider3;
        this.f279157d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.service_orders.list.blueprints.snippet_item.c cVar = this.f279154a.get();
        com.avito.android.service_orders.list.blueprints.calendar_button_item.c cVar2 = this.f279155b.get();
        com.avito.android.service_orders.list.blueprints.banner_item.c cVar3 = this.f279156c.get();
        com.avito.android.service_orders.list.blueprints.management_panels.c cVar4 = (com.avito.android.service_orders.list.blueprints.management_panels.c) this.f279157d.get();
        j.f279138a.getClass();
        Set setL0 = C42756l.l0(new TV0.d[]{cVar, cVar2, cVar3, cVar4});
        dagger.internal.t.d(setL0);
        return setL0;
    }
}
