package com.avito.android.intermediary_verification.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IntermediaryVerificationDeeplinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f173124a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.intermediary_verification.d f173125b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f173126c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f173127d;

    public b(Provider provider, com.avito.android.intermediary_verification.d dVar, dv.b bVar, dv.b bVar2) {
        this.f173124a = provider;
        this.f173125b = dVar;
        this.f173126c = bVar;
        this.f173127d = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f173124a.get(), (com.avito.android.intermediary_verification.b) this.f173125b.get(), (a.b) this.f173126c.get(), (a.InterfaceC4053a) this.f173127d.get());
    }
}
