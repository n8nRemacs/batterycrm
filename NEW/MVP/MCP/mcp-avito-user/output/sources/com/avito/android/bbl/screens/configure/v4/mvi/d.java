package com.avito.android.bbl.screens.configure.v4.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import lh.InterfaceC43770a;

/* compiled from: BblConfigureV4Actor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.bbl.screens.configure.v4.mvi.domain.b f99480a;

    /* renamed from: b, reason: collision with root package name */
    public final u f99481b;

    public d(com.avito.android.bbl.screens.configure.v4.mvi.domain.b bVar, u uVar) {
        this.f99480a = bVar;
        this.f99481b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.bbl.screens.configure.v4.mvi.domain.a) this.f99480a.get(), (InterfaceC43770a) this.f99481b.get());
    }
}
