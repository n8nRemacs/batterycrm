package com.avito.android.location_list.di;

import com.avito.android.location_list.C31521o;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LocationListModule_ProvideLocationItemSingleLinePresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<C31521o> {

    /* renamed from: a, reason: collision with root package name */
    public final d f182028a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f182029b;

    public j(d dVar, dagger.internal.f fVar) {
        this.f182028a = dVar;
        this.f182029b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f182029b);
        this.f182028a.getClass();
        return new C31521o(eVarB);
    }
}
