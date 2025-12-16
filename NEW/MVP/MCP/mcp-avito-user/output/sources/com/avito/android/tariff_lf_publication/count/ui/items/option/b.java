package com.avito.android.tariff_lf_publication.count.ui.items.option;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffLfPublicationCountOptionBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f300855a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f300856b;

    public b(u uVar, Provider provider) {
        this.f300855a = uVar;
        this.f300856b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f300855a.get(), this.f300856b.get());
    }
}
