package com.avito.android.autoteka.data;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import xj0.InterfaceC49957a;
import yj0.InterfaceC50257a;

/* compiled from: AutotekaRepository_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final u f96125a;

    /* renamed from: b, reason: collision with root package name */
    public final u f96126b;

    public j(u uVar, u uVar2) {
        this.f96125a = uVar;
        this.f96126b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((InterfaceC49957a) this.f96125a.get(), (InterfaceC50257a) this.f96126b.get());
    }
}
