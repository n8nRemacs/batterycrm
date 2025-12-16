package com.avito.android.orders_aggregation.di.module;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OrdersAggregationModule_ProvideFragmentManagerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<FragmentManager> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f210252a;

    public i(dagger.internal.l lVar) {
        this.f210252a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f210252a.f393949a;
        g.f210251a.getClass();
        return fragment.getChildFragmentManager();
    }
}
