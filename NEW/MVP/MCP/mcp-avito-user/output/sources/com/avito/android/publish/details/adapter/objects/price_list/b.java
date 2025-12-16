package com.avito.android.publish.details.adapter.objects.price_list;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PriceListModule_ProvidePriceListPreviewBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<f> f233354a;

    /* renamed from: b, reason: collision with root package name */
    public final u f233355b;

    /* renamed from: c, reason: collision with root package name */
    public final u f233356c;

    public b(u uVar, u uVar2, Provider provider) {
        this.f233354a = provider;
        this.f233355b = uVar;
        this.f233356c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = this.f233354a.get();
        com.avito.android.util.text.a aVar = (com.avito.android.util.text.a) this.f233355b.get();
        u3.l lVar = (u3.l) this.f233356c.get();
        a.f233353a.getClass();
        return new e(fVar, aVar, lVar);
    }
}
