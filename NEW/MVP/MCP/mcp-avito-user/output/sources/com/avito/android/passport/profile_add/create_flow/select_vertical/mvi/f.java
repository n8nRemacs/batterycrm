package com.avito.android.passport.profile_add.create_flow.select_vertical.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectVerticalBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.passport.profile_add.create_flow.select_vertical.i> f211968a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f211969b;

    public f(dagger.internal.l lVar, Provider provider) {
        this.f211968a = provider;
        this.f211969b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f211968a.get(), ((Boolean) this.f211969b.f393949a).booleanValue());
    }
}
