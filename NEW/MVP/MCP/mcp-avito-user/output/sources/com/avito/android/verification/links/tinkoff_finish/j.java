package com.avito.android.verification.links.tinkoff_finish;

import com.avito.android.account.G;
import com.avito.android.remote.A1;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationTinkoffFinishLinkInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f324592a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<A1> f324593b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.verification.storage.c f324594c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<G> f324595d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.verification.links.tinkoff_documents.f> f324596e;

    public j(Provider provider, Provider provider2, com.avito.android.verification.storage.c cVar, Provider provider3, Provider provider4) {
        this.f324592a = provider;
        this.f324593b = provider2;
        this.f324594c = cVar;
        this.f324595d = provider3;
        this.f324596e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f324592a.get(), this.f324593b.get(), (com.avito.android.verification.storage.a) this.f324594c.get(), this.f324595d.get(), this.f324596e.get());
    }
}
