package com.avito.android.profile.pro.impl.interactor;

import dagger.internal.x;
import dagger.internal.y;
import hz.InterfaceC41196a;
import javax.inject.Provider;

/* compiled from: ProfileProEmployeeInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC41196a> f222688a;

    public d(Provider<InterfaceC41196a> provider) {
        this.f222688a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f222688a.get());
    }
}
