package com.avito.android.serp.adapter.rich_snippets.service;

import javax.inject.Provider;

/* compiled from: AdvertMiniRichServiceItemBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.serp.adapter.rich_snippets.service.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34804b implements dagger.internal.h<C34803a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34807e> f271306a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.video_snippets.g> f271307b;

    public C34804b(Provider<InterfaceC34807e> provider, Provider<com.avito.android.video_snippets.g> provider2) {
        this.f271306a = provider;
        this.f271307b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C34803a(this.f271306a.get(), this.f271307b.get());
    }
}
