package com.avito.android.user_address.suggest.di;

import com.avito.konveyor.adapter.j;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SuggestListModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f308048a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f308049b;

    public d(u uVar, Provider provider) {
        this.f308048a = uVar;
        this.f308049b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f308048a.get();
        com.avito.konveyor.a aVar2 = this.f308049b.get();
        c.f308047a.getClass();
        return new j(aVar, aVar2);
    }
}
