package com.avito.android.verification.links.tinkoff_finish_web;

import com.avito.android.account.G;
import com.avito.android.remote.A1;
import com.avito.android.remote.p1;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationTinkoffFinishWebLinkInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f324632a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<A1> f324633b;

    /* renamed from: c, reason: collision with root package name */
    public final u f324634c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.verification.storage.c f324635d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<G> f324636e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.verification.links.tinkoff_documents.f> f324637f;

    public h(Provider provider, Provider provider2, u uVar, com.avito.android.verification.storage.c cVar, Provider provider3, Provider provider4) {
        this.f324632a = provider;
        this.f324633b = provider2;
        this.f324634c = uVar;
        this.f324635d = cVar;
        this.f324636e = provider3;
        this.f324637f = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f324632a.get(), this.f324633b.get(), (p1) this.f324634c.get(), (com.avito.android.verification.storage.a) this.f324635d.get(), this.f324636e.get(), this.f324637f.get());
    }
}
