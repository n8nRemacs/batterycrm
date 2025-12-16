package com.avito.android.saved_searches.presentation.main;

import com.avito.android.saved_searches.presentation.main.mvi.n;
import com.avito.android.saved_searches.presentation.main.mvi.o;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SavedSearchMainViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final o f258617a;

    public k(o oVar) {
        this.f258617a = oVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((n) this.f258617a.get(), null, 2, null);
    }
}
