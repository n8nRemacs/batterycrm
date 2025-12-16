package com.avito.android.home.tags_item;

import Oi0.C14701e;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SectionTagsItemBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f162496a;

    /* renamed from: b, reason: collision with root package name */
    public final u f162497b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<d> f162498c;

    public c(u uVar, Provider provider, Provider provider2) {
        this.f162496a = provider;
        this.f162497b = uVar;
        this.f162498c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f162496a, (C14701e) this.f162497b.get(), this.f162498c.get());
    }
}
