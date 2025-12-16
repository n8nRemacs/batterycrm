package com.avito.android.tariff_lf_publication.save.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffLfPublicationSaveDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<OD0.a> f301150a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f301151b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f301152c;

    /* renamed from: d, reason: collision with root package name */
    public final f f301153d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f301154e;

    public d(f fVar, dv.b bVar, dv.b bVar2, Provider provider, Provider provider2) {
        this.f301150a = provider;
        this.f301151b = bVar;
        this.f301152c = bVar2;
        this.f301153d = fVar;
        this.f301154e = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f301150a.get(), (a.i) this.f301151b.get(), (a.g) this.f301152c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f301153d.get(), this.f301154e.get());
    }
}
