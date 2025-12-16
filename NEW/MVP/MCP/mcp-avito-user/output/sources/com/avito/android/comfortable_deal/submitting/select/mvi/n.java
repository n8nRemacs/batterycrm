package com.avito.android.comfortable_deal.submitting.select.mvi;

import dagger.internal.x;
import dagger.internal.y;
import kotlin.collections.C42784z0;
import pq.C47129c;

/* compiled from: SubmittingSelectFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final h f123360a;

    /* renamed from: b, reason: collision with root package name */
    public final b f123361b;

    /* renamed from: c, reason: collision with root package name */
    public final p f123362c;

    /* renamed from: d, reason: collision with root package name */
    public final k f123363d;

    public n(h hVar, b bVar, p pVar, k kVar) {
        this.f123360a = hVar;
        this.f123361b = bVar;
        this.f123362c = pVar;
        this.f123363d = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f123360a.getClass();
        g gVar = new g();
        this.f123361b.getClass();
        a aVar = new a();
        this.f123362c.getClass();
        o oVar = new o();
        j jVar = (j) this.f123363d.get();
        C47129c.f428790h.getClass();
        C42784z0 c42784z0 = C42784z0.f406748b;
        return new m("ComfortableDealSelect", new C47129c("", c42784z0, c42784z0, false, "", null), new l(gVar, oVar, aVar, jVar));
    }
}
