package com.avito.android.publish.slots.group_inlined_block;

import androidx.recyclerview.widget.RecyclerView;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GroupInlinedBlockModule_ProvideGroupInlinedBlockAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<RecyclerView.Adapter<?>> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f244014a;

    public e(dagger.internal.f fVar) {
        this.f244014a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.j jVar = (com.avito.konveyor.adapter.j) this.f244014a.get();
        c.f244011a.getClass();
        jVar.setHasStableIds(true);
        return jVar;
    }
}
