package com.avito.android.seller_coach.all_advices.provider;

import androidx.recyclerview.widget.C;
import javax.inject.Provider;

/* compiled from: AllAdvicesModule_ProvideDataAwareAdapterPresenterImpl$_avito_seller_coach_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class o implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f267360a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f267361b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f267362c;

    public o(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f267360a = provider;
        this.f267361b = provider2;
        this.f267362c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f267360a);
        com.avito.konveyor.adapter.h hVar = this.f267361b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f267362c.get();
        m.f267358a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, hVar, eVar);
    }
}
