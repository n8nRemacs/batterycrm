package com.avito.android.verification.links.remove;

import com.avito.android.remote.A1;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationRemoveLinkInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<A1> f324384a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f324385b;

    public h(Provider<A1> provider, Provider<InterfaceC35745a5> provider2) {
        this.f324384a = provider;
        this.f324385b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f324384a.get(), this.f324385b.get());
    }
}
