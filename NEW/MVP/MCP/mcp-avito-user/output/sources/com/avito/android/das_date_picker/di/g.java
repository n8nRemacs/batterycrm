package com.avito.android.das_date_picker.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DasCalendarItemsModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final d f132295a;

    /* renamed from: b, reason: collision with root package name */
    public final u f132296b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f132297c;

    public g(d dVar, u uVar, Provider provider) {
        this.f132295a = dVar;
        this.f132296b = uVar;
        this.f132297c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f132296b.get();
        com.avito.konveyor.a aVar2 = this.f132297c.get();
        this.f132295a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
