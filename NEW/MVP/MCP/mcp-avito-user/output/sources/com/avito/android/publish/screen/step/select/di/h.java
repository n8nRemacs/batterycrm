package com.avito.android.publish.screen.step.select.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectModule_ProvideCheckableItemPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<com.avito.android.blueprints.publish.checkable.d> {

    /* renamed from: a, reason: collision with root package name */
    public final d f242154a;

    public h(d dVar) {
        this.f242154a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f242154a.getClass();
        return new com.avito.android.blueprints.publish.checkable.f();
    }
}
