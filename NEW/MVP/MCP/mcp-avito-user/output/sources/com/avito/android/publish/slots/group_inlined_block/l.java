package com.avito.android.publish.slots.group_inlined_block;

import Oi0.InterfaceC14698b;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GroupInlinedBlockModule_ProvideGroupInlinedBlockRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class l implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.recycler.data_aware.c> f244041a;

    /* renamed from: b, reason: collision with root package name */
    public final u f244042b;

    public l(u uVar, Provider provider) {
        this.f244041a = provider;
        this.f244042b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.recycler.data_aware.c cVar = this.f244041a.get();
        InterfaceC14698b interfaceC14698b = (InterfaceC14698b) this.f244042b.get();
        c.f244011a.getClass();
        return new com.avito.konveyor.adapter.j(cVar, interfaceC14698b);
    }
}
