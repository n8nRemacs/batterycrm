package com.avito.android.tariff_lf_publication.common.ui.items.header;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffLfPublicationHeaderBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f300711a;

    /* renamed from: b, reason: collision with root package name */
    public final u f300712b;

    public b(u uVar, u uVar2) {
        this.f300711a = uVar;
        this.f300712b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f300711a.get(), (com.avito.android.util.text.a) this.f300712b.get());
    }
}
