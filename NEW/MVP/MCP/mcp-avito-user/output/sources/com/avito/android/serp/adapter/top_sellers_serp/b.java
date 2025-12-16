package com.avito.android.serp.adapter.top_sellers_serp;

import Oi0.InterfaceC14698b;
import com.avito.android.util.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TopSellersSerpWidgetBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f272464a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f272465b;

    /* renamed from: c, reason: collision with root package name */
    public final u f272466c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C> f272467d;

    public b(f fVar, Provider provider, u uVar, Provider provider2) {
        this.f272464a = fVar;
        this.f272465b = provider;
        this.f272466c = uVar;
        this.f272467d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f272464a.get(), this.f272465b.get(), (InterfaceC14698b) this.f272466c.get(), this.f272467d.get());
    }
}
