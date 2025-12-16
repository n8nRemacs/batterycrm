package com.avito.android.search_suggest;

import dagger.internal.y;

/* compiled from: SearchSuggestViewModel_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class x implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.search_suggest.mvi.k f264385a;

    public x(com.avito.android.search_suggest.mvi.k kVar) {
        this.f264385a = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new w((com.avito.android.search_suggest.mvi.i) this.f264385a.get(), null, 2, null);
    }
}
