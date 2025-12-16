package com.avito.android.publish.select.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectModule_ProvideCheckableItemPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<com.avito.android.blueprints.publish.checkable.d> {

    /* renamed from: a, reason: collision with root package name */
    public final c f242683a;

    public g(c cVar) {
        this.f242683a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f242683a.getClass();
        return new com.avito.android.blueprints.publish.checkable.f();
    }
}
