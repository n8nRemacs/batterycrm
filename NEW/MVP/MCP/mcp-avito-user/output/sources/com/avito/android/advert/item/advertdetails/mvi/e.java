package com.avito.android.advert.item.advertdetails.mvi;

import dagger.internal.x;
import dagger.internal.y;
import k4.C42501e;

/* compiled from: AdvertDetailsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final b f72708a;

    /* renamed from: b, reason: collision with root package name */
    public final h f72709b;

    public e(b bVar, h hVar) {
        this.f72708a = bVar;
        this.f72709b = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f72708a.get();
        f fVar = (f) this.f72709b.get();
        C42501e.f406078d.getClass();
        return new d("AdvertDetails", C42501e.f406079e, new c(aVar, fVar));
    }
}
