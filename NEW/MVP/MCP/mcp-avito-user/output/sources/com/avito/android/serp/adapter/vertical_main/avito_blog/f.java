package com.avito.android.serp.adapter.vertical_main.avito_blog;

import Oi0.InterfaceC14698b;
import com.avito.android.util.C;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AvitoBlogItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final j f272632a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f272633b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC14698b> f272634c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C> f272635d;

    public f(j jVar, Provider provider, Provider provider2, Provider provider3) {
        this.f272632a = jVar;
        this.f272633b = provider;
        this.f272634c = provider2;
        this.f272635d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((i) this.f272632a.get(), this.f272633b.get(), this.f272634c.get(), this.f272635d.get());
    }
}
