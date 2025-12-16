package com.avito.android.verification.links.sber_finish;

import com.avito.android.account.G;
import com.avito.android.remote.A1;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationSberFinishLinkInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f324473a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<A1> f324474b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.verification.storage.c f324475c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<G> f324476d;

    public i(Provider provider, Provider provider2, com.avito.android.verification.storage.c cVar, Provider provider3) {
        this.f324473a = provider;
        this.f324474b = provider2;
        this.f324475c = cVar;
        this.f324476d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f324473a.get(), this.f324474b.get(), (com.avito.android.verification.storage.a) this.f324475c.get(), this.f324476d.get());
    }
}
