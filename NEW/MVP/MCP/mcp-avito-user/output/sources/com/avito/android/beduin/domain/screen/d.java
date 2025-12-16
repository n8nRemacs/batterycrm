package com.avito.android.beduin.domain.screen;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BeduinScreenInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f104008a;

    public d(u uVar) {
        this.f104008a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((e) this.f104008a.get());
    }
}
