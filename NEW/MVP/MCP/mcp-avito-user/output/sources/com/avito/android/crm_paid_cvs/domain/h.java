package com.avito.android.crm_paid_cvs.domain;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import sP.InterfaceC48087a;

/* compiled from: SearchesInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48087a> f130321a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f130322b;

    public h(Provider<InterfaceC48087a> provider, Provider<com.avito.android.deep_linking.x> provider2) {
        this.f130321a = provider;
        this.f130322b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f130321a.get(), this.f130322b.get());
    }
}
