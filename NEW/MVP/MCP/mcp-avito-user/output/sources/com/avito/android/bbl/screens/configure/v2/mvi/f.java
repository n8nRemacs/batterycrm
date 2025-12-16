package com.avito.android.bbl.screens.configure.v2.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BblConfigureV2Bootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f99373a;

    public f(u uVar) {
        this.f99373a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.bbl.screens.configure.v2.mvi.domain.a) this.f99373a.get());
    }
}
