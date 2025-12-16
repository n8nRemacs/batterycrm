package com.avito.android.cart_similar_items.konveyor.snippet;

import bj.InterfaceC25659b;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SnippetBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final h f115871a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC25659b> f115872b;

    public b(h hVar, Provider provider) {
        this.f115871a = hVar;
        this.f115872b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((g) this.f115871a.get(), this.f115872b.get());
    }
}
