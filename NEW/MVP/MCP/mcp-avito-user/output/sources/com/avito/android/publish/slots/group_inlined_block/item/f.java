package com.avito.android.publish.slots.group_inlined_block.item;

import androidx.recyclerview.widget.RecyclerView;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GroupInlinedBlockItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f244034a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.recycler.data_aware.c> f244035b;

    public f(u uVar, Provider provider) {
        this.f244034a = uVar;
        this.f244035b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((RecyclerView.Adapter) this.f244034a.get(), this.f244035b.get());
    }
}
