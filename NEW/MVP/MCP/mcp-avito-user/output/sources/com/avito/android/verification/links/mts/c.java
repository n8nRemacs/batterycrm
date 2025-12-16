package com.avito.android.verification.links.mts;

import com.avito.android.remote.A1;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationMTSInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f324293a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<A1> f324294b;

    public c(Provider<InterfaceC35745a5> provider, Provider<A1> provider2) {
        this.f324293a = provider;
        this.f324294b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f324294b.get(), this.f324293a.get());
    }
}
