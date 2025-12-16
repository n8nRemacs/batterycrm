package com.avito.android.advert_core.development_offers.redesign;

import com.avito.android.advert_core.development_offers.f;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DevelopmentOffersItemBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f83347a;

    public b(u uVar) {
        this.f83347a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((f) this.f83347a.get());
    }
}
