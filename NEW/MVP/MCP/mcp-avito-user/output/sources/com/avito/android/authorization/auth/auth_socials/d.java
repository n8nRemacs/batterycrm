package com.avito.android.authorization.auth.auth_socials;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AuthSocialsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f92889a;

    public d(dagger.internal.u uVar) {
        this.f92889a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((k) this.f92889a.get());
    }
}
