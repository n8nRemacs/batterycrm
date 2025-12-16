package com.avito.android.rating_form.pseudo_done.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingFormPseudoDoneFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final c f248859a;

    /* renamed from: b, reason: collision with root package name */
    public final f f248860b;

    /* renamed from: c, reason: collision with root package name */
    public final k f248861c;

    public i(c cVar, f fVar, k kVar) {
        this.f248859a = cVar;
        this.f248860b = fVar;
        this.f248861c = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = (b) this.f248859a.get();
        e eVar = (e) this.f248860b.get();
        this.f248861c.getClass();
        return new h("RatingFormPseudoDone", new Object(), new g(eVar, bVar, new j()));
    }
}
