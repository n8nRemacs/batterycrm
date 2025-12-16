package com.avito.android.rubricator.items.service;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SerpRubricatorServiceItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f255814a;

    public b(u uVar) {
        this.f255814a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f255814a.get());
    }
}
