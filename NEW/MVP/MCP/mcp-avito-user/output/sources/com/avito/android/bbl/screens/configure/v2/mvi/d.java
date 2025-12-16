package com.avito.android.bbl.screens.configure.v2.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lh.InterfaceC43770a;

/* compiled from: BblConfigureV2Actor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f99334a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC43770a> f99335b;

    public d(u uVar, Provider provider) {
        this.f99334a = uVar;
        this.f99335b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.bbl.screens.configure.v2.mvi.domain.a) this.f99334a.get(), this.f99335b.get());
    }
}
