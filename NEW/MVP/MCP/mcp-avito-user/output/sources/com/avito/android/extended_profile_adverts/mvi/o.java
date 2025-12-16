package com.avito.android.extended_profile_adverts.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import qA.InterfaceC47264a;

/* compiled from: ProfileAdvertsReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f150952a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Integer> f150953b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC47264a> f150954c;

    public o(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f150952a = lVar;
        this.f150953b = provider;
        this.f150954c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new n((String) this.f150952a.f393949a, this.f150953b.get().intValue(), this.f150954c.get());
    }
}
