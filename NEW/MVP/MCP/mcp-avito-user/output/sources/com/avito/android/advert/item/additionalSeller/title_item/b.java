package com.avito.android.advert.item.additionalSeller.title_item;

import com.avito.android.advert_core.advert.k;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdditionalSellerTitleBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f72625a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f72626b;

    public b(dagger.internal.f fVar, u uVar) {
        this.f72625a = uVar;
        this.f72626b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f72625a.get(), (k) this.f72626b.get());
    }
}
