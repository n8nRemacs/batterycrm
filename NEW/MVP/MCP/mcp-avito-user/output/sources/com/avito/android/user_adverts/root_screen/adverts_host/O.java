package com.avito.android.user_adverts.root_screen.adverts_host;

import java.util.Set;

/* compiled from: UserAdvertsHostListActionListener_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class O implements dagger.internal.h<N> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.A f312262a;

    public O(dagger.internal.A a12) {
        this.f312262a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new N((Set) this.f312262a.get());
    }
}
