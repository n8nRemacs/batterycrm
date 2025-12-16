package com.avito.android.favorite;

import com.avito.android.di.module.C30214v6;

/* compiled from: MutableShowOnlyActiveFavoritesSwitchValueStorageImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class F implements dagger.internal.h<E> {

    /* renamed from: a, reason: collision with root package name */
    public final C30214v6 f155161a;

    public F(C30214v6 c30214v6) {
        this.f155161a = c30214v6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new E((AK0.l) this.f155161a.get());
    }
}
