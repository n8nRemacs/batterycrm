package com.avito.android.serp.adapter.vertical_main;

import com.avito.android.serp.adapter.vertical_main.vertical_filter.InterfaceC34866b;
import com.avito.android.serp.adapter.vertical_main.vertical_filter.M;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerticalFilterItemGridConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<M> f273078a;

    /* renamed from: b, reason: collision with root package name */
    public final h f273079b;

    /* renamed from: c, reason: collision with root package name */
    public final u f273080c;

    public o(Provider provider, h hVar, u uVar) {
        this.f273078a = provider;
        this.f273079b = hVar;
        this.f273080c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f273078a.get(), (g) this.f273079b.get(), (InterfaceC34866b) this.f273080c.get());
    }
}
