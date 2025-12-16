package com.avito.android.mortgage.sending_confirm.mvi.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LegalRequirementsUseCaseImpl_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<IZ.a> f203564a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f203565b;

    public c(Provider<IZ.a> provider, Provider<R0> provider2) {
        this.f203564a = provider;
        this.f203565b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f203565b.get(), g.a(w.a(this.f203564a)));
    }
}
