package com.avito.android.bbl.screens.configure.v4.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import lh.InterfaceC43770a;

/* compiled from: BblConfigureV4Reducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class n implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final u f99513a;

    public n(u uVar) {
        this.f99513a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((InterfaceC43770a) this.f99513a.get());
    }
}
