package com.avito.android.publish.screen.step.select.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectModule_ProvideCheckableItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<com.avito.android.blueprints.publish.checkable.a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f242152a;

    /* renamed from: b, reason: collision with root package name */
    public final u f242153b;

    public g(d dVar, u uVar) {
        this.f242152a = dVar;
        this.f242153b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.blueprints.publish.checkable.d dVar = (com.avito.android.blueprints.publish.checkable.d) this.f242153b.get();
        this.f242152a.getClass();
        return new com.avito.android.blueprints.publish.checkable.b(dVar);
    }
}
