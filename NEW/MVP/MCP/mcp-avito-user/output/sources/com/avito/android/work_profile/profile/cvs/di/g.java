package com.avito.android.work_profile.profile.cvs.di;

import com.avito.konveyor.adapter.j;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CvsModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f331006a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f331007b;

    public g(u uVar, Provider provider) {
        this.f331006a = uVar;
        this.f331007b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f331006a.get();
        com.avito.konveyor.a aVar2 = this.f331007b.get();
        c.f331002a.getClass();
        return new j(aVar, aVar2);
    }
}
