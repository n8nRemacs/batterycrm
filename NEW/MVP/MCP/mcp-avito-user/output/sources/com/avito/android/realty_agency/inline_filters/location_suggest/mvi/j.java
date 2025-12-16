package com.avito.android.realty_agency.inline_filters.location_suggest.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LocationSuggestFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f251713a;

    /* renamed from: b, reason: collision with root package name */
    public final e f251714b;

    /* renamed from: c, reason: collision with root package name */
    public final o f251715c;

    /* renamed from: d, reason: collision with root package name */
    public final q f251716d;

    public j(g gVar, e eVar, o oVar, q qVar) {
        this.f251713a = gVar;
        this.f251714b = eVar;
        this.f251715c = oVar;
        this.f251716d = qVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f251713a.get();
        a aVar = (a) this.f251714b.get();
        this.f251715c.getClass();
        n nVar = new n();
        this.f251716d.getClass();
        p pVar = new p();
        ji0.c.f405768f.getClass();
        return new i("LocationSuggest", ji0.c.f405769g, new h(fVar, aVar, pVar, nVar));
    }
}
