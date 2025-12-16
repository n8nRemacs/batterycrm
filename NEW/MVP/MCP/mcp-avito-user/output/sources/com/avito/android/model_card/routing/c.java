package com.avito.android.model_card.routing;

import android.content.Context;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import com.google.gson.Gson;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kx.C43507a;
import kx.C43509c;

/* compiled from: ModelCardDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f198044a;

    /* renamed from: b, reason: collision with root package name */
    public final j f198045b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f198046c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f198047d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.f f198048e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<u3.f<SimpleTestGroupWithNone>> f198049f;

    /* renamed from: g, reason: collision with root package name */
    public final C43509c f198050g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<Gson> f198051h;

    public c(C30102l3 c30102l3, j jVar, dv.b bVar, dv.b bVar2, dagger.internal.f fVar, Provider provider, C43509c c43509c, Provider provider2) {
        this.f198044a = c30102l3;
        this.f198045b = jVar;
        this.f198046c = bVar;
        this.f198047d = bVar2;
        this.f198048e = fVar;
        this.f198049f = provider;
        this.f198050g = c43509c;
        this.f198051h = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f198044a.get();
        this.f198045b.getClass();
        return new b(context, new i(), (a.InterfaceC4053a) this.f198046c.get(), (a.b) this.f198047d.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f198048e.get(), this.f198049f.get(), (C43507a) this.f198050g.get(), dagger.internal.g.b(this.f198051h));
    }
}
