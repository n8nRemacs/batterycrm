package com.avito.android.list.grid_snippet;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GridSnippetsBlockBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f181566a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.list.grid_snippet.item.b f181567b;

    public c(Provider provider, com.avito.android.list.grid_snippet.item.b bVar) {
        this.f181566a = provider;
        this.f181567b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f181566a.get(), (com.avito.android.list.grid_snippet.item.a) this.f181567b.get());
    }
}
