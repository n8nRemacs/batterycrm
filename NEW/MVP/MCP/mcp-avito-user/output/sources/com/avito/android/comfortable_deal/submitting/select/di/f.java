package com.avito.android.comfortable_deal.submitting.select.di;

import com.avito.konveyor.adapter.j;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectRecyclerModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f123331a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f123332b;

    public f(u uVar, Provider provider) {
        this.f123331a = uVar;
        this.f123332b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f123331a.get();
        com.avito.konveyor.a aVar2 = this.f123332b.get();
        b.f123326a.getClass();
        return new j(aVar, aVar2);
    }
}
