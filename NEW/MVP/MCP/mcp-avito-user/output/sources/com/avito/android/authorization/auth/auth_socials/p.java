package com.avito.android.authorization.auth.auth_socials;

import com.avito.android.remote.InterfaceC34258d;
import dagger.internal.x;
import dagger.internal.y;
import hD.C40806a;
import javax.inject.Provider;

/* compiled from: AuthSocialsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34258d> f92915a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C40806a> f92916b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f92917c;

    public p(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f92915a = provider;
        this.f92916b = provider2;
        this.f92917c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o(this.f92915a.get(), this.f92916b.get(), (h) this.f92917c.get());
    }
}
