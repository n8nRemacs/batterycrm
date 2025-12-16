package com.avito.android.profile.remove.di;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileRemoveModule_ProvideRouterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<com.avito.android.profile.remove.screen.f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.profile.remove.i> f223916a;

    public g(Provider<com.avito.android.profile.remove.i> provider) {
        this.f223916a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.profile.remove.i iVar = this.f223916a.get();
        d.f223913a.getClass();
        return iVar;
    }
}
