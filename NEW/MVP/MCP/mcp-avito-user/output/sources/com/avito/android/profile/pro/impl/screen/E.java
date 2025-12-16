package com.avito.android.profile.pro.impl.screen;

import com.avito.android.profile.pro.impl.screen.D;

/* compiled from: ProfileProViewModel_Factory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class E implements dagger.internal.h<D.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.profile.pro.impl.screen.mvi.k f222852a;

    public E(com.avito.android.profile.pro.impl.screen.mvi.k kVar) {
        this.f222852a = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new D.a((com.avito.android.profile.pro.impl.screen.mvi.j) this.f222852a.get());
    }
}
