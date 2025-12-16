package com.avito.android.verification.verification_confirm_requisites;

import com.avito.android.remote.A1;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationConfirmRequisitesInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<A1> f324935a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f324936b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f324937c;

    public c(Provider<A1> provider, Provider<R0> provider2, Provider<com.avito.android.remote.error.f> provider3) {
        this.f324935a = provider;
        this.f324936b = provider2;
        this.f324937c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f324935a.get(), this.f324936b.get(), this.f324937c.get());
    }
}
