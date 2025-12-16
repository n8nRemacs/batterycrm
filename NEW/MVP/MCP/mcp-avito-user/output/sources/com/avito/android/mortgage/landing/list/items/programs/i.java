package com.avito.android.mortgage.landing.list.items.programs;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import u00.InterfaceC48753a;

/* compiled from: ProgramsPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f199904a;

    /* renamed from: b, reason: collision with root package name */
    public final u f199905b;

    public i(dagger.internal.l lVar, u uVar) {
        this.f199904a = lVar;
        this.f199905b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((Y41.l) this.f199904a.f393949a, (InterfaceC48753a) this.f199905b.get());
    }
}
