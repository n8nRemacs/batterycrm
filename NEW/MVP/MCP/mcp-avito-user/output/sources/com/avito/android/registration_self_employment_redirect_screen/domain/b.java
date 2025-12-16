package com.avito.android.registration_self_employment_redirect_screen.domain;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import jG.InterfaceC42250a;
import javax.inject.Provider;

/* compiled from: SelfEmploymentRedirectInteractor_Factory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f252732a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC42250a> f252733b;

    public b(Provider<com.avito.android.deep_linking.x> provider, Provider<InterfaceC42250a> provider2) {
        this.f252732a = provider;
        this.f252733b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f252732a.get(), this.f252733b.get());
    }
}
