package com.avito.android.serp.adapter.rich_snippets.service;

import javax.inject.Provider;

/* compiled from: AdvertVipRichServiceItemBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class y implements dagger.internal.h<x> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f271397a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.video_snippets.g> f271398b;

    public y(dagger.internal.u uVar, Provider provider) {
        this.f271397a = uVar;
        this.f271398b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new x((InterfaceC34807e) this.f271397a.get(), this.f271398b.get());
    }
}
