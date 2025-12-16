package com.avito.android.publish.slots.item_info.item;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ItemInfoItemStorage_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class p implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final u f244400a;

    public p(u uVar) {
        this.f244400a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n((AK0.l) this.f244400a.get());
    }
}
