package com.avito.android.advert.item.travel.trust;

import com.avito.android.advert.item.InterfaceC28153o;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import o7.C44595a;
import o7.C44596b;

/* compiled from: AdvertDetailsTravelTrustItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f80612a;

    /* renamed from: b, reason: collision with root package name */
    public final C44596b f80613b;

    public e(dagger.internal.f fVar, C44596b c44596b) {
        this.f80612a = fVar;
        this.f80613b = c44596b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((InterfaceC28153o) this.f80612a.get(), (C44595a) this.f80613b.get());
    }
}
