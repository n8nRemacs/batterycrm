package com.avito.android.orders_aggregation.di.module;

import androidx.fragment.app.FragmentManager;
import com.avito.android.lib.deprecated_design.tab.TabPagerAdapter;
import dagger.internal.A;
import dagger.internal.x;
import dagger.internal.y;
import i50.AbstractC41226a;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: OrdersAggregationModule_ProvideTabPagerAdapter$_avito_orders_aggregation_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<TabPagerAdapter> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<FragmentManager> f210253a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.lib.deprecated_design.tab.adapter.j<AbstractC41226a>> f210254b;

    /* renamed from: c, reason: collision with root package name */
    public final A f210255c;

    public j(Provider provider, Provider provider2, A a12) {
        this.f210253a = provider;
        this.f210254b = provider2;
        this.f210255c = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        FragmentManager fragmentManager = this.f210253a.get();
        com.avito.android.lib.deprecated_design.tab.adapter.j<AbstractC41226a> jVar = this.f210254b.get();
        Set set = (Set) this.f210255c.get();
        g.f210251a.getClass();
        return new TabPagerAdapter(fragmentManager, jVar, set, TabPagerAdapter.Behaviour.f178131d);
    }
}
