package com.avito.android.tariff_lf_publication.region.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GetTariffLfPublicationRegionUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f301089a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<OD0.a> f301090b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f301091c;

    public b(l lVar, Provider provider, Provider provider2) {
        this.f301089a = lVar;
        this.f301090b = provider;
        this.f301091c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((String) this.f301089a.f393949a, this.f301090b.get(), this.f301091c.get());
    }
}
