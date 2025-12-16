package com.avito.android.advert_details_items.flats.restyle;

import com.avito.android.advert_core.advert.k;
import com.avito.android.advert_details_items.flats.c;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lD.C43617a;

/* compiled from: AdvertDetailsFlatsBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f84754a;

    /* renamed from: b, reason: collision with root package name */
    public final f f84755b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C43617a> f84756c;

    public b(f fVar, Provider provider, Provider provider2) {
        this.f84754a = provider;
        this.f84755b = fVar;
        this.f84756c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f84754a.get(), (k) this.f84755b.get(), this.f84756c.get());
    }
}
