package com.avito.android.advert_details_items.flats.global;

import com.avito.android.advert_core.advert.k;
import com.avito.android.advert_details_items.flats.c;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lD.C43617a;

/* compiled from: AdvertDetailsFlatsGlobalBrandBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f84738a;

    /* renamed from: b, reason: collision with root package name */
    public final f f84739b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C43617a> f84740c;

    public b(f fVar, Provider provider, Provider provider2) {
        this.f84738a = provider;
        this.f84739b = fVar;
        this.f84740c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f84738a.get(), (k) this.f84739b.get(), this.f84740c.get());
    }
}
