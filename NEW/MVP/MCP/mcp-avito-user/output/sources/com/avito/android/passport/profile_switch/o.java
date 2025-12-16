package com.avito.android.passport.profile_switch;

import com.avito.android.account.G;
import com.avito.android.account.O;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import l60.InterfaceC43550a;

/* compiled from: PassportSwitchProfileInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC43550a> f213713a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<G> f213714b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<O> f213715c;

    public o(Provider<InterfaceC43550a> provider, Provider<G> provider2, Provider<O> provider3) {
        this.f213713a = provider;
        this.f213714b = provider2;
        this.f213715c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n(dagger.internal.g.b(this.f213713a), this.f213714b.get(), this.f213715c.get());
    }
}
