package com.avito.android.serp.adapter.advert_free_form_item;

import bj.InterfaceC25659b;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertFreeFormItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f268714a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC25659b> f268715b;

    public b(u uVar, Provider provider) {
        this.f268714a = uVar;
        this.f268715b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f268714a.get(), this.f268715b.get());
    }
}
