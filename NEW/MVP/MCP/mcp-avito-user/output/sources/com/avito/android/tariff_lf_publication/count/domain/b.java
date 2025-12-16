package com.avito.android.tariff_lf_publication.count.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GetTariffLfPublicationCountPriceUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f300800a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<OD0.a> f300801b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f300802c;

    public b(l lVar, Provider provider, Provider provider2) {
        this.f300800a = lVar;
        this.f300801b = provider;
        this.f300802c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((String) this.f300800a.f393949a, this.f300801b.get(), this.f300802c.get());
    }
}
