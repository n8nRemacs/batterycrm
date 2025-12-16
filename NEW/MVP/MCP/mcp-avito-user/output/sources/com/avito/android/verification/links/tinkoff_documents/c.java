package com.avito.android.verification.links.tinkoff_documents;

import android.content.Context;
import com.avito.android.account.W;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import yM0.C50135d;

/* compiled from: VerificationTinkoffDocumentsAsyncHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f324542a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f324543b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f324544c;

    /* renamed from: d, reason: collision with root package name */
    public final C50135d f324545d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.verification.storage.c f324546e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<f> f324547f;

    /* renamed from: g, reason: collision with root package name */
    public final vM0.g f324548g;

    /* renamed from: h, reason: collision with root package name */
    public final dv.b f324549h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.f f324550i;

    public c(C30102l3 c30102l3, dagger.internal.f fVar, dv.b bVar, C50135d c50135d, com.avito.android.verification.storage.c cVar, Provider provider, vM0.g gVar, dv.b bVar2, dagger.internal.f fVar2) {
        this.f324542a = c30102l3;
        this.f324543b = fVar;
        this.f324544c = bVar;
        this.f324545d = c50135d;
        this.f324546e = cVar;
        this.f324547f = provider;
        this.f324548g = gVar;
        this.f324549h = bVar2;
        this.f324550i = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((Context) this.f324542a.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f324543b.get(), (a.InterfaceC4053a) this.f324544c.get(), (W) this.f324545d.get(), (com.avito.android.verification.storage.a) this.f324546e.get(), this.f324547f.get(), (vM0.f) this.f324548g.get(), (a.i) this.f324549h.get(), (InterfaceC28373a) this.f324550i.get());
    }
}
