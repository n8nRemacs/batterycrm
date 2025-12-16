package com.avito.android.saved_searches.presentation.settings.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SavedSearchSettingsReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final l f258786a;

    public j(l lVar) {
        this.f258786a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((k) this.f258786a.get());
    }
}
