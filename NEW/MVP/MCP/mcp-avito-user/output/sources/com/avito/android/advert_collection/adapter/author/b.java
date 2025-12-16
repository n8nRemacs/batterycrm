package com.avito.android.advert_collection.adapter.author;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AuthorItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f81261a;

    public b(u uVar) {
        this.f81261a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f81261a.get());
    }
}
