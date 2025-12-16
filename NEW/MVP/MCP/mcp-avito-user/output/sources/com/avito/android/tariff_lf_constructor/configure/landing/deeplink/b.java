package com.avito.android.tariff_lf_constructor.configure.landing.deeplink;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffConstructorLandingLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f299652a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f299653b;

    public b(dv.b bVar, dv.b bVar2) {
        this.f299652a = bVar;
        this.f299653b = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.d) this.f299652a.get(), (a.f) this.f299653b.get());
    }
}
