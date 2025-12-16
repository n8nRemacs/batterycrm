package com.avito.android.profile_phones.phones_list.di;

import androidx.recyclerview.widget.RecyclerView;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PhonesListModule_ProvidePhonesAdapter$_avito_profile_phones_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class q implements dagger.internal.h<RecyclerView.Adapter<?>> {

    /* renamed from: a, reason: collision with root package name */
    public final l f227724a;

    /* renamed from: b, reason: collision with root package name */
    public final u f227725b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f227726c;

    public q(l lVar, u uVar, Provider provider) {
        this.f227724a = lVar;
        this.f227725b = uVar;
        this.f227726c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f227725b.get();
        com.avito.konveyor.a aVar2 = this.f227726c.get();
        this.f227724a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
