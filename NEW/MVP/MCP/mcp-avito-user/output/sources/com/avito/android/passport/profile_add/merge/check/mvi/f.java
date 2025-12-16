package com.avito.android.passport.profile_add.merge.check.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CheckMergePossibilityBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.merge.domain.i f212666a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f212667b;

    public f(com.avito.android.passport.profile_add.merge.domain.i iVar, Provider provider) {
        this.f212666a = iVar;
        this.f212667b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.passport.profile_add.merge.domain.a) this.f212666a.get(), this.f212667b.get());
    }
}
