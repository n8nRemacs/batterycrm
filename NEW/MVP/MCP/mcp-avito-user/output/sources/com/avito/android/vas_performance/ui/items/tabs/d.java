package com.avito.android.vas_performance.ui.items.tabs;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TabsItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f321773a;

    public d(u uVar) {
        this.f321773a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((e) this.f321773a.get());
    }
}
