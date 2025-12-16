package com.avito.android.comfortable_deal.submitting.success.mvi;

import dagger.internal.x;
import dagger.internal.y;
import rq.C47710c;

/* compiled from: SubmittingSuccessFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final e f123429a;

    /* renamed from: b, reason: collision with root package name */
    public final l f123430b;

    /* renamed from: c, reason: collision with root package name */
    public final g f123431c;

    /* renamed from: d, reason: collision with root package name */
    public final n f123432d;

    public j(e eVar, l lVar, g gVar, n nVar) {
        this.f123429a = eVar;
        this.f123430b = lVar;
        this.f123431c = gVar;
        this.f123432d = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f123429a.get();
        this.f123430b.getClass();
        k kVar = new k();
        f fVar = (f) this.f123431c.get();
        this.f123432d.getClass();
        return new i("CDSuccess", new C47710c(null, null, null, null, null, null, 63, null), new h(dVar, fVar, new m(), kVar));
    }
}
