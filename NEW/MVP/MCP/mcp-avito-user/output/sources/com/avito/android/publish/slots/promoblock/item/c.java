package com.avito.android.publish.slots.promoblock.item;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PromoblockSlotItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f244726a;

    public c(u uVar) {
        this.f244726a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f244726a.get());
    }
}
