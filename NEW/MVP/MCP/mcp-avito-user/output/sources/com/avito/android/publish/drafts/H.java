package com.avito.android.publish.drafts;

import javax.inject.Provider;

/* compiled from: PublishDraftWiperImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class H implements dagger.internal.h<G> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f235319a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<PublishDraftRepository> f235320b;

    public H(dagger.internal.u uVar, Provider provider) {
        this.f235319a = uVar;
        this.f235320b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new G((InterfaceC33835a) this.f235319a.get(), dagger.internal.g.b(this.f235320b));
    }
}
