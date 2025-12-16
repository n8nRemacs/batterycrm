package com.avito.android.bbl.screens.configure.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import lh.InterfaceC43770a;

/* compiled from: BblConfigureReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class n implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final u f99238a;

    public n(u uVar) {
        this.f99238a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((InterfaceC43770a) this.f99238a.get());
    }
}
