package com.avito.android.advert.item.ownership_cost.items;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OwnershipCostItemViewFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f78028a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f78029b;

    public k(u uVar, Provider provider) {
        this.f78028a = uVar;
        this.f78029b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((com.avito.android.advert.item.ownership_cost.items.results.b) this.f78028a.get(), this.f78029b.get());
    }
}
