package com.avito.android.auction.details.mvi;

import Md.d;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AuctionDetailsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f92370a;

    /* renamed from: b, reason: collision with root package name */
    public final d f92371b;

    /* renamed from: c, reason: collision with root package name */
    public final k f92372c;

    /* renamed from: d, reason: collision with root package name */
    public final m f92373d;

    public i(f fVar, d dVar, k kVar, m mVar) {
        this.f92370a = fVar;
        this.f92371b = dVar;
        this.f92372c = kVar;
        this.f92373d = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f92370a.get();
        this.f92371b.getClass();
        a aVar = new a();
        this.f92372c.getClass();
        j jVar = new j();
        this.f92373d.getClass();
        return new h("AuctionDetails", d.a.f10924a, new g(eVar, aVar, new l(), jVar));
    }
}
