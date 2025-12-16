package com.avito.android.autoteka.items.preview;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PreviewBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f96903a;

    public b(g gVar) {
        this.f96903a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((f) this.f96903a.get());
    }
}
