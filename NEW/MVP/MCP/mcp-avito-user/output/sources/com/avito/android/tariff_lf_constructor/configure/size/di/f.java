package com.avito.android.tariff_lf_constructor.configure.size.di;

import com.avito.konveyor.adapter.j;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ConstructorConfigureSizeModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f300272a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f300273b;

    public f(u uVar, Provider provider) {
        this.f300272a = uVar;
        this.f300273b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f300272a.get();
        com.avito.konveyor.a aVar2 = this.f300273b.get();
        b bVar = b.f300268a;
        return new j(aVar, aVar2);
    }
}
