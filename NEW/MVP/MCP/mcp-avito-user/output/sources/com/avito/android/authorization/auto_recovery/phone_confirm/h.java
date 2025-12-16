package com.avito.android.authorization.auto_recovery.phone_confirm;

import dagger.internal.x;
import dagger.internal.y;
import ie.InterfaceC41389a;
import javax.inject.Provider;

/* compiled from: AutoRecoveryCodeConfirmInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC41389a> f93228a;

    public h(Provider<InterfaceC41389a> provider) {
        this.f93228a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f93228a.get());
    }
}
