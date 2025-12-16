package com.avito.android.passport.profiles_list;

import dagger.internal.x;
import dagger.internal.y;
import hz.InterfaceC41196a;
import javax.inject.Provider;
import l60.InterfaceC43550a;

/* compiled from: ProfilesListInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class u implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC43550a> f213880a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC41196a> f213881b;

    public u(Provider<InterfaceC43550a> provider, Provider<InterfaceC41196a> provider2) {
        this.f213880a = provider;
        this.f213881b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new t(this.f213880a.get(), this.f213881b.get());
    }
}
