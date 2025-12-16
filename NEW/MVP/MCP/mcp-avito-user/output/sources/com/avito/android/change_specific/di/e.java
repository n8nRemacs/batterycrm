package com.avito.android.change_specific.di;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExtendedProfileChangeSpecificModule_ProvideDataAwareAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f117966a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f117967b;

    /* renamed from: c, reason: collision with root package name */
    public final u f117968c;

    public e(u uVar, Provider provider, Provider provider2) {
        this.f117966a = provider;
        this.f117967b = provider2;
        this.f117968c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f117966a);
        com.avito.konveyor.a aVar = this.f117967b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f117968c.get();
        d.f117965a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null), eVar);
    }
}
