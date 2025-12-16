package com.avito.android.saved_searches.presentation.main.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SavedSearchMainViewStateBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class v implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.saved_searches.presentation.core.g f258723a;

    public v(com.avito.android.saved_searches.presentation.core.g gVar) {
        this.f258723a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new t((com.avito.android.saved_searches.presentation.core.f) this.f258723a.get());
    }
}
