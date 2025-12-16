package com.avito.android.messenger.channels.mvi.di;

import java.util.Map;

/* compiled from: ViewModelFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class P implements dagger.internal.h<N> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.q f187427a;

    public P(dagger.internal.q qVar) {
        this.f187427a = qVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new N((Map) this.f187427a.get());
    }
}
