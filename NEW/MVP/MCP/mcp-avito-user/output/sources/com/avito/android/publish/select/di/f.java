package com.avito.android.publish.select.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectModule_ProvideCheckableItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<com.avito.android.blueprints.publish.checkable.a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f242681a;

    /* renamed from: b, reason: collision with root package name */
    public final u f242682b;

    public f(c cVar, u uVar) {
        this.f242681a = cVar;
        this.f242682b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.blueprints.publish.checkable.d dVar = (com.avito.android.blueprints.publish.checkable.d) this.f242682b.get();
        this.f242681a.getClass();
        return new com.avito.android.blueprints.publish.checkable.b(dVar);
    }
}
