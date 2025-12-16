package com.avito.android.list.grid_snippet.item;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GridSnippetBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f181576a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f181577b;

    public b(u uVar, Provider provider) {
        this.f181576a = uVar;
        this.f181577b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f181576a.get(), this.f181577b.get());
    }
}
