package com.avito.android.mandatory_verification.data;

import com.avito.android.remote.H0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MandatoryVerificationRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<QX.a> f184425a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<H0> f184426b;

    /* renamed from: c, reason: collision with root package name */
    public final u f184427c;

    public h(u uVar, Provider provider, Provider provider2) {
        this.f184425a = provider;
        this.f184426b = provider2;
        this.f184427c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f184425a.get(), this.f184426b.get(), (a) this.f184427c.get());
    }
}
