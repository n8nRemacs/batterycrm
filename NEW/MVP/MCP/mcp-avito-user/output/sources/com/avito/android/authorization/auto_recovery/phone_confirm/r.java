package com.avito.android.authorization.auto_recovery.phone_confirm;

import dagger.internal.x;
import dagger.internal.y;
import ie.InterfaceC41389a;
import javax.inject.Provider;

/* compiled from: AutoRecoveryPhoneRequestInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC41389a> f93267a;

    /* renamed from: b, reason: collision with root package name */
    public final n f93268b;

    public r(Provider provider, n nVar) {
        this.f93267a = provider;
        this.f93268b = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q(this.f93267a.get(), (i) this.f93268b.get());
    }
}
