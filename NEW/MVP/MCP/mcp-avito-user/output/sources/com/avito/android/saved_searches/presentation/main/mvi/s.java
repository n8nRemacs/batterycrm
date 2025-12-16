package com.avito.android.saved_searches.presentation.main.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SavedSearchMainReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final v f258721a;

    public s(v vVar) {
        this.f258721a = vVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new r((t) this.f258721a.get());
    }
}
