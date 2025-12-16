package com.avito.android.advert_core.offers.offer_bottomsheet.mvi;

import com.avito.android.advert_core.offers.offer_bottomsheet.mvi.entity.OfferBottomSheetState;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OfferBottomSheetFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f83907a;

    /* renamed from: b, reason: collision with root package name */
    public final b f83908b;

    /* renamed from: c, reason: collision with root package name */
    public final i f83909c;

    /* renamed from: d, reason: collision with root package name */
    public final k f83910d;

    public g(d dVar, b bVar, i iVar, k kVar) {
        this.f83907a = dVar;
        this.f83908b = bVar;
        this.f83909c = iVar;
        this.f83910d = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f83907a.get();
        a aVar = (a) this.f83908b.get();
        this.f83909c.getClass();
        h hVar = new h();
        this.f83910d.getClass();
        j jVar = new j();
        OfferBottomSheetState.f83902e.getClass();
        return new f("OfferBottomSheet", OfferBottomSheetState.f83903f, new e(cVar, aVar, jVar, hVar));
    }
}
