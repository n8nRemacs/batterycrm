package com.avito.android.passport.profile_add.create_flow.select_vertical;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectVerticalInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.passport.profile_add.data.mapper.d> f211925a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.passport.profile_add.domain.interactor.a> f211926b;

    /* renamed from: c, reason: collision with root package name */
    public final u f211927c;

    public m(u uVar, Provider provider, Provider provider2) {
        this.f211925a = provider;
        this.f211926b = provider2;
        this.f211927c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f211925a.get(), this.f211926b.get(), (com.avito.android.passport.profile_add.domain.interactor.m) this.f211927c.get());
    }
}
