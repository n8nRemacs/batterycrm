package com.avito.android.profile.remove.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileRemoveModule_ProvideScreenProviderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<com.avito.android.profile.remove.screen.e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f223917a;

    public h(u uVar) {
        this.f223917a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.profile.remove.i iVar = (com.avito.android.profile.remove.i) this.f223917a.get();
        d.f223913a.getClass();
        return iVar;
    }
}
