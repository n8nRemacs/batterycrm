package com.avito.android.bbl.screens.configure.v4.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BblConfigureV4Bootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.bbl.screens.configure.v4.mvi.domain.b f99500a;

    public f(com.avito.android.bbl.screens.configure.v4.mvi.domain.b bVar) {
        this.f99500a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.bbl.screens.configure.v4.mvi.domain.a) this.f99500a.get());
    }
}
