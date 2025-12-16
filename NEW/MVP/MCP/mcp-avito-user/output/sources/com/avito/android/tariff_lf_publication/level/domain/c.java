package com.avito.android.tariff_lf_publication.level.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffLfPublicationLevelUseCaseImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f300914a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<OD0.a> f300915b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f300916c;

    public c(l lVar, Provider provider, Provider provider2) {
        this.f300914a = lVar;
        this.f300915b = provider;
        this.f300916c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((String) this.f300914a.f393949a, this.f300915b.get(), this.f300916c.get());
    }
}
