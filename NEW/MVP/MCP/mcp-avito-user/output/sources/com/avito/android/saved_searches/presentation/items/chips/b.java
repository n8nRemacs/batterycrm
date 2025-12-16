package com.avito.android.saved_searches.presentation.items.chips;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SavedSearchChipsBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f258456a;

    /* renamed from: b, reason: collision with root package name */
    public final i f258457b;

    public b(Provider provider, i iVar) {
        this.f258456a = provider;
        this.f258457b = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f258456a.get(), (h) this.f258457b.get());
    }
}
