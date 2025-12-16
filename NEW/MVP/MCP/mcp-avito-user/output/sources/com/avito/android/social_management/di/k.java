package com.avito.android.social_management.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SocialManagementModule_ProvideDiffCalculatorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<com.avito.android.recycler.data_aware.e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.recycler.data_aware.b> f284657a;

    /* renamed from: b, reason: collision with root package name */
    public final u f284658b;

    public k(u uVar, Provider provider) {
        this.f284657a = provider;
        this.f284658b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.recycler.data_aware.b bVar = this.f284657a.get();
        com.avito.android.recycler.data_aware.f fVar = (com.avito.android.recycler.data_aware.f) this.f284658b.get();
        g.f284647a.getClass();
        return new com.avito.android.recycler.data_aware.i(bVar, fVar, true, null, 8, null);
    }
}
