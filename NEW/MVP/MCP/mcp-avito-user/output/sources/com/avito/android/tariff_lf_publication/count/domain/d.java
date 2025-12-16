package com.avito.android.tariff_lf_publication.count.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GetTariffLfPublicationCountUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f300809a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<OD0.a> f300810b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f300811c;

    public d(l lVar, Provider provider, Provider provider2) {
        this.f300809a = lVar;
        this.f300810b = provider;
        this.f300811c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((String) this.f300809a.f393949a, this.f300810b.get(), this.f300811c.get());
    }
}
