package com.avito.android.bbl.screens.configure.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lh.InterfaceC43770a;

/* compiled from: BblConfigureActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.bbl.screens.configure.mvi.domain.a> f99192a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f99193b;

    /* renamed from: c, reason: collision with root package name */
    public final u f99194c;

    public d(dagger.internal.l lVar, u uVar, Provider provider) {
        this.f99192a = provider;
        this.f99193b = lVar;
        this.f99194c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f99192a.get(), (String) this.f99193b.f393949a, (InterfaceC43770a) this.f99194c.get());
    }
}
