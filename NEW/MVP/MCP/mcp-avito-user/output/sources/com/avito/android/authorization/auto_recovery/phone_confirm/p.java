package com.avito.android.authorization.auto_recovery.phone_confirm;

import dagger.internal.x;
import dagger.internal.y;
import ie.InterfaceC41389a;
import javax.inject.Provider;

/* compiled from: AutoRecoveryPhoneReRequestInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC41389a> f93264a;

    /* renamed from: b, reason: collision with root package name */
    public final n f93265b;

    public p(Provider provider, n nVar) {
        this.f93264a = provider;
        this.f93265b = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o(this.f93264a.get(), (i) this.f93265b.get());
    }
}
