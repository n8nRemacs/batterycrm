package com.avito.android.shift_list.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ShiftListModule_ProvideContentRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f281030a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f281031b;

    public g(u uVar, Provider provider) {
        this.f281030a = uVar;
        this.f281031b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f281030a.get();
        com.avito.konveyor.a aVar2 = this.f281031b.get();
        d.f281027a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
