package com.avito.android.publish.details.adapter.objects.price_list;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PriceListModule_ProvidePriceListPreviewRe23BlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<com.avito.android.publish.details.adapter.objects.re23.price_list.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.details.adapter.objects.re23.price_list.c> f233357a;

    /* renamed from: b, reason: collision with root package name */
    public final u f233358b;

    /* renamed from: c, reason: collision with root package name */
    public final u f233359c;

    public c(u uVar, u uVar2, Provider provider) {
        this.f233357a = provider;
        this.f233358b = uVar;
        this.f233359c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.details.adapter.objects.re23.price_list.c cVar = this.f233357a.get();
        com.avito.android.util.text.a aVar = (com.avito.android.util.text.a) this.f233358b.get();
        u3.l lVar = (u3.l) this.f233359c.get();
        a.f233353a.getClass();
        return new com.avito.android.publish.details.adapter.objects.re23.price_list.a(cVar, aVar, lVar);
    }
}
