package com.avito.android.user_address.list.di;

import com.avito.konveyor.adapter.j;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserAddressListModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f307344a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f307345b;

    public e(u uVar, Provider provider) {
        this.f307344a = uVar;
        this.f307345b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f307344a.get();
        com.avito.konveyor.a aVar2 = this.f307345b.get();
        d.f307343a.getClass();
        return new j(aVar, aVar2);
    }
}
