package com.avito.android.publish.slots.group_inlined_block;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GroupInlinedBlockModule_ProvideGroupInlinedBlockAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f244015a;

    public f(u uVar) {
        this.f244015a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f244015a.get();
        c.f244011a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
