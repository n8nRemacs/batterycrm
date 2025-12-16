package com.avito.android.passport.profiles_list.recycler;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileListButtonModule_ProvideProfileListButtonItemPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final g f213871a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f213872b;

    public h(g gVar, dagger.internal.l lVar) {
        this.f213871a = gVar;
        this.f213872b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y41.l lVar = (Y41.l) this.f213872b.f393949a;
        this.f213871a.getClass();
        return new e(lVar);
    }
}
