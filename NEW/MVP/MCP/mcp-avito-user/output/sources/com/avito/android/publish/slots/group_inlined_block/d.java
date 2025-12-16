package com.avito.android.publish.slots.group_inlined_block;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GroupInlinedBlockModule_ProvideDiffCalculatorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<com.avito.android.recycler.data_aware.e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.recycler.data_aware.b> f244012a;

    /* renamed from: b, reason: collision with root package name */
    public final u f244013b;

    public d(u uVar, Provider provider) {
        this.f244012a = provider;
        this.f244013b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.recycler.data_aware.b bVar = this.f244012a.get();
        com.avito.android.recycler.data_aware.a aVar = (com.avito.android.recycler.data_aware.a) this.f244013b.get();
        c.f244011a.getClass();
        return new com.avito.android.recycler.data_aware.i(bVar, null, true, aVar, 2, null);
    }
}
