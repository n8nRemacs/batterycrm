package com.avito.android.advert.deeplinks.want_to_buy;

import android.content.Context;
import com.avito.android.C29640d;
import com.avito.android.C30563f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertWantToBuyRequestLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f69062a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f69063b;

    /* renamed from: c, reason: collision with root package name */
    public final e f69064c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f69065d;

    /* renamed from: e, reason: collision with root package name */
    public final C30102l3 f69066e;

    /* renamed from: f, reason: collision with root package name */
    public final C30563f f69067f;

    public i(Provider provider, dv.b bVar, e eVar, dv.b bVar2, C30102l3 c30102l3, C30563f c30563f) {
        this.f69062a = provider;
        this.f69063b = bVar;
        this.f69064c = eVar;
        this.f69065d = bVar2;
        this.f69066e = c30102l3;
        this.f69067f = c30563f;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f69062a.get(), (a.g) this.f69063b.get(), (a) this.f69064c.get(), (a.i) this.f69065d.get(), (Context) this.f69066e.get(), (C29640d) this.f69067f.get());
    }
}
