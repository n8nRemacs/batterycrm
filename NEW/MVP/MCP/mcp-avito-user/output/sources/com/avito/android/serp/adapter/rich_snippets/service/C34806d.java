package com.avito.android.serp.adapter.rich_snippets.service;

import javax.inject.Provider;

/* compiled from: AdvertRichServiceItemBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.serp.adapter.rich_snippets.service.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34806d implements dagger.internal.h<C34805c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f271312a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.video_snippets.g> f271313b;

    public C34806d(dagger.internal.u uVar, Provider provider) {
        this.f271312a = uVar;
        this.f271313b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C34805c((InterfaceC34807e) this.f271312a.get(), this.f271313b.get());
    }
}
