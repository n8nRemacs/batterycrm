package com.avito.android.search.filter.adapter.entry_point;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EntryPointItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f262300a;

    public b(g gVar) {
        this.f262300a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((f) this.f262300a.get());
    }
}
