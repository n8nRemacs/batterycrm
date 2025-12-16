package com.avito.android.work_profile.profile.applies.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AppliesToVacancyModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final c f330837a;

    /* renamed from: b, reason: collision with root package name */
    public final u f330838b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f330839c;

    public g(c cVar, u uVar, Provider provider) {
        this.f330837a = cVar;
        this.f330838b = uVar;
        this.f330839c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f330838b.get();
        com.avito.konveyor.a aVar2 = this.f330839c.get();
        this.f330837a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
