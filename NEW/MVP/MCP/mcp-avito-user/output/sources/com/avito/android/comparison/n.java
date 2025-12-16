package com.avito.android.comparison;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ComparisonViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.comparison.mvi.w f124182a;

    public n(com.avito.android.comparison.mvi.w wVar) {
        this.f124182a = wVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m((com.avito.android.comparison.mvi.v) this.f124182a.get(), null, 2, null);
    }
}
