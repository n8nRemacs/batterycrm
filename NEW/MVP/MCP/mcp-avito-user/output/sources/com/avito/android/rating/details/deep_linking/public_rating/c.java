package com.avito.android.rating.details.deep_linking.public_rating;

import com.avito.android.deeplink_handler.view.a;
import com.google.gson.Gson;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PublicRatingDetailsLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f246969a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.rating.h f246970b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f246971c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Gson> f246972d;

    /* renamed from: e, reason: collision with root package name */
    public final f f246973e;

    public c(dv.b bVar, com.avito.android.rating.h hVar, dv.b bVar2, Provider provider, f fVar) {
        this.f246969a = bVar;
        this.f246970b = hVar;
        this.f246971c = bVar2;
        this.f246972d = provider;
        this.f246973e = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a.b) this.f246969a.get(), (com.avito.android.rating.f) this.f246970b.get(), (a.InterfaceC4053a) this.f246971c.get(), this.f246972d.get(), (com.avito.android.deep_linking.x) this.f246973e.get());
    }
}
