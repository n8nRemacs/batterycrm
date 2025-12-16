package com.avito.android.authorization.auto_recovery;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import ie.InterfaceC41389a;
import javax.inject.Provider;

/* compiled from: AutoRecoveryAvailabilityInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC41389a> f93074a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f93075b;

    public e(Provider<InterfaceC41389a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f93074a = provider;
        this.f93075b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f93075b.get(), dagger.internal.g.b(this.f93074a));
    }
}
