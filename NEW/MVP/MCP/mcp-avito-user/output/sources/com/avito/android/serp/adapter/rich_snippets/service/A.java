package com.avito.android.serp.adapter.rich_snippets.service;

import javax.inject.Provider;

/* compiled from: AdvertXlRichServiceItemBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class A implements dagger.internal.h<z> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f271245a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.video_snippets.g> f271246b;

    public A(dagger.internal.u uVar, Provider provider) {
        this.f271245a = uVar;
        this.f271246b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new z((B) this.f271245a.get(), this.f271246b.get());
    }
}
