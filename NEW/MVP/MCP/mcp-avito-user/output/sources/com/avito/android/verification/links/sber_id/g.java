package com.avito.android.verification.links.sber_id;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import l90.n;

/* compiled from: VerificationSberIdSyncHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.verification.storage.c f324496a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<n> f324497b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f324498c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<a> f324499d;

    public g(com.avito.android.verification.storage.c cVar, Provider provider, dv.b bVar, Provider provider2) {
        this.f324496a = cVar;
        this.f324497b = provider;
        this.f324498c = bVar;
        this.f324499d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.verification.storage.a) this.f324496a.get(), this.f324497b.get(), (a.InterfaceC4053a) this.f324498c.get(), this.f324499d.get());
    }
}
