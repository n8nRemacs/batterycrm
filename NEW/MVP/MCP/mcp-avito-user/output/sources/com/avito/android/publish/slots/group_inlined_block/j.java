package com.avito.android.publish.slots.group_inlined_block;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GroupInlinedBlockModule_ProvideGroupInlinedBlockItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<com.avito.android.publish.slots.group_inlined_block.item.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.slots.group_inlined_block.item.d> f244039a;

    public j(Provider<com.avito.android.publish.slots.group_inlined_block.item.d> provider) {
        this.f244039a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.slots.group_inlined_block.item.d dVar = this.f244039a.get();
        c.f244011a.getClass();
        return new com.avito.android.publish.slots.group_inlined_block.item.b(dVar);
    }
}
