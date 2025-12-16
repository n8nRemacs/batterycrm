package com.avito.android.work_profile.profile.cvs.mvi;

import dagger.internal.x;
import dagger.internal.y;
import fQ0.InterfaceC40329a;
import javax.inject.Provider;

/* compiled from: CvsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.work_profile.domain.j> f331046a;

    /* renamed from: b, reason: collision with root package name */
    public final i f331047b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC40329a> f331048c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f331049d;

    public e(Provider provider, i iVar, Provider provider2, Provider provider3) {
        this.f331046a = provider;
        this.f331047b = iVar;
        this.f331048c = provider2;
        this.f331049d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f331046a.get(), (h) this.f331047b.get(), this.f331048c.get(), this.f331049d.get());
    }
}
