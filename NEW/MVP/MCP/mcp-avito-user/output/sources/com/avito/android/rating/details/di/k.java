package com.avito.android.rating.details.di;

import androidx.recyclerview.widget.C;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingDetailsModule_ProvideListUpdateCallbackFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f246996a;

    public k(dagger.internal.f fVar) {
        this.f246996a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.j jVar = (com.avito.konveyor.adapter.j) this.f246996a.get();
        e.f246981a.getClass();
        return jVar;
    }
}
