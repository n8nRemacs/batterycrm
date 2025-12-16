package com.avito.android.serp.adapter.sale;

import com.avito.android.serp.adapter.carousel_widget.InterfaceC34693c;
import com.avito.android.visual_rubricator.N;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SaleHeaderItemConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f271493a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC34693c> f271494b;

    /* renamed from: c, reason: collision with root package name */
    public final u f271495c;

    public f(u uVar, u uVar2, Provider provider) {
        this.f271493a = uVar;
        this.f271494b = provider;
        this.f271495c = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((N) this.f271493a.get(), this.f271494b.get(), (com.avito.android.serp.adapter.slider.c) this.f271495c.get());
    }
}
