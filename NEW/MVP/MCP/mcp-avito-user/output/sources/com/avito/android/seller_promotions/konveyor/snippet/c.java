package com.avito.android.seller_promotions.konveyor.snippet;

import bj.InterfaceC25659b;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SnippetBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final i f267832a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC25659b> f267833b;

    public c(i iVar, Provider provider) {
        this.f267832a = iVar;
        this.f267833b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((h) this.f267832a.get(), this.f267833b.get());
    }
}
