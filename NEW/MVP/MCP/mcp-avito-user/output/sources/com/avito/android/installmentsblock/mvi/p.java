package com.avito.android.installmentsblock.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InstallmentsBlockViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final j f173008a;

    public p(j jVar) {
        this.f173008a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o((i) this.f173008a.get(), null, 2, null);
    }
}
