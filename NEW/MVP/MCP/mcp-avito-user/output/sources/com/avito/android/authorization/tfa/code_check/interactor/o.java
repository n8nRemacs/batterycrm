package com.avito.android.authorization.tfa.code_check.interactor;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TfaCodeCheckPreRequestInteractorBuilderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.remote.r> f94686a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f94687b;

    public o(dagger.internal.f fVar, Provider provider) {
        this.f94686a = provider;
        this.f94687b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f94686a.get(), (InterfaceC28373a) this.f94687b.get());
    }
}
