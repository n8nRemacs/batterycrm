package com.avito.android.advert.item.ownership_cost;

import Pk0.InterfaceC14796a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OwnershipCostInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14796a> f77940a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f77941b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f77942c;

    public e(Provider<InterfaceC14796a> provider, Provider<InterfaceC35745a5> provider2, Provider<com.avito.android.remote.error.f> provider3) {
        this.f77940a = provider;
        this.f77941b = provider2;
        this.f77942c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarA = dagger.internal.g.a(w.a(this.f77940a));
        return new d(this.f77942c.get(), this.f77941b.get(), eVarA);
    }
}
