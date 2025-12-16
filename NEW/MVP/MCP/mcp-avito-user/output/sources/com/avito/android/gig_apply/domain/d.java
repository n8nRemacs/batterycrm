package com.avito.android.gig_apply.domain;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import yF.InterfaceC50106a;

/* compiled from: GigApplyInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC50106a> f159668a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f159669b;

    public d(Provider<InterfaceC50106a> provider, Provider<com.avito.android.deep_linking.x> provider2) {
        this.f159668a = provider;
        this.f159669b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f159668a.get(), this.f159669b.get());
    }
}
