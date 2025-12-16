package com.avito.android.referral_contacts.domain;

import Si0.InterfaceC15188a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReferralContactsInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC15188a> f252485a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.referral_contacts.h> f252486b;

    /* renamed from: c, reason: collision with root package name */
    public final d f252487c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f252488d;

    /* renamed from: e, reason: collision with root package name */
    public final u f252489e;

    public i(Provider provider, Provider provider2, d dVar, Provider provider3, u uVar) {
        this.f252485a = provider;
        this.f252486b = provider2;
        this.f252487c = dVar;
        this.f252488d = provider3;
        this.f252489e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f252485a.get(), this.f252486b.get(), (c) this.f252487c.get(), this.f252488d.get(), (com.avito.android.referral_contacts.storage.a) this.f252489e.get());
    }
}
