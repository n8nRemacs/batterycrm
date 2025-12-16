package com.avito.android.publish.slots.group_inlined_block;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GroupInlinedBlockModule_ProvideGroupInlinedBlockDataAwareAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<com.avito.android.recycler.data_aware.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f244016a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f244017b;

    /* renamed from: c, reason: collision with root package name */
    public final u f244018c;

    public g(u uVar, Provider provider, Provider provider2) {
        this.f244016a = provider;
        this.f244017b = provider2;
        this.f244018c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f244016a);
        com.avito.konveyor.adapter.a aVar = this.f244017b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f244018c.get();
        c.f244011a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, aVar, eVar);
    }
}
