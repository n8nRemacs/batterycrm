package com.avito.android.review.deeplink;

import an0.InterfaceC19915a;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ComfortableDealReviewsDeepLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final an0.d f255366a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f255367b;

    public b(an0.d dVar, dv.b bVar) {
        this.f255366a = dVar;
        this.f255367b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((InterfaceC19915a) this.f255366a.get(), (a.InterfaceC4053a) this.f255367b.get());
    }
}
