package com.avito.android.brandspace.brandspace.mvi;

import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: BrandspaceActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.brandspace.interactor.f f107646a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f107647b;

    public d(com.avito.android.brandspace.interactor.f fVar, Provider provider) {
        this.f107646a = fVar;
        this.f107647b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.brandspace.interactor.d) this.f107646a.get(), this.f107647b.get());
    }
}
