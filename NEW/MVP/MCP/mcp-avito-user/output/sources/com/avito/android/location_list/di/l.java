package com.avito.android.location_list.di;

import com.avito.android.location_list.C31526u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LocationListModule_ProvideLocationItemTwoLinesPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class l implements dagger.internal.h<C31526u> {

    /* renamed from: a, reason: collision with root package name */
    public final d f182032a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f182033b;

    public l(d dVar, dagger.internal.f fVar) {
        this.f182032a = dVar;
        this.f182033b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarA = dagger.internal.g.a(w.a(this.f182033b));
        this.f182032a.getClass();
        return new C31526u(eVarA);
    }
}
