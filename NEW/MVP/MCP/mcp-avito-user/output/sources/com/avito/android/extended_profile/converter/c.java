package com.avito.android.extended_profile.converter;

import com.avito.android.serp.adapter.InterfaceC34904z0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExtendedProfileAdvertConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.favorite.x> f149414a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert.viewed.persistance.j> f149415b;

    /* renamed from: c, reason: collision with root package name */
    public final u f149416c;

    public c(u uVar, Provider provider, Provider provider2) {
        this.f149414a = provider;
        this.f149415b = provider2;
        this.f149416c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f149414a.get(), this.f149415b.get(), (InterfaceC34904z0) this.f149416c.get());
    }
}
