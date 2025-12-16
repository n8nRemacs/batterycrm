package com.avito.android.passport.profile_add.domain.interactor;

import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import sA.InterfaceC48019a;

/* compiled from: ProfileConstructorDataInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48019a> f212347a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.create_flow.select_vertical.di.f f212348b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<r60.d> f212349c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.q f212350d;

    public o(Provider provider, com.avito.android.passport.profile_add.create_flow.select_vertical.di.f fVar, Provider provider2, com.avito.android.passport.profile_add.q qVar) {
        this.f212347a = provider;
        this.f212348b = fVar;
        this.f212349c = provider2;
        this.f212350d = qVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC48019a interfaceC48019a = this.f212347a.get();
        ProfileCreateExtendedFlow profileCreateExtendedFlow = (ProfileCreateExtendedFlow) this.f212348b.get();
        r60.d dVar = this.f212349c.get();
        this.f212350d.getClass();
        return new n(interfaceC48019a, profileCreateExtendedFlow, dVar, new com.avito.android.passport.profile_add.p());
    }
}
