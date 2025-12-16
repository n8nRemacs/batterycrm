package com.avito.android.publish.slots.group_inlined_block;

import Oi0.C14699c;
import Oi0.InterfaceC14698b;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GroupInlinedBlockModule_ProvideGroupInlinedBlockDestroyableViewHolderBuilder$_avito_publish_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<InterfaceC14698b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f244019a;

    public h(Provider<com.avito.konveyor.a> provider) {
        this.f244019a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = this.f244019a.get();
        c.f244011a.getClass();
        return new C14699c(aVar);
    }
}
