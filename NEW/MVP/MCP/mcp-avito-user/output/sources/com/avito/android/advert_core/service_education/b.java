package com.avito.android.advert_core.service_education;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertServiceEducationBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<j> f84309a;

    /* renamed from: b, reason: collision with root package name */
    public final T9.c f84310b;

    /* renamed from: c, reason: collision with root package name */
    public final T9.d f84311c;

    public b(Provider provider, T9.c cVar, T9.d dVar) {
        this.f84309a = provider;
        this.f84310b = cVar;
        this.f84311c = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f84309a.get(), (com.avito.android.recycler.data_aware.e) this.f84310b.get(), (com.avito.konveyor.a) this.f84311c.get());
    }
}
