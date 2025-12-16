package com.avito.android.mandatory_verification.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MandatoryVerificationDeeplinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f184480a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.mandatory_verification.d f184481b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f184482c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f184483d;

    public b(Provider provider, com.avito.android.mandatory_verification.d dVar, dv.b bVar, dv.b bVar2) {
        this.f184480a = provider;
        this.f184481b = dVar;
        this.f184482c = bVar;
        this.f184483d = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f184480a.get(), (com.avito.android.mandatory_verification.b) this.f184481b.get(), (a.b) this.f184482c.get(), (a.InterfaceC4053a) this.f184483d.get());
    }
}
