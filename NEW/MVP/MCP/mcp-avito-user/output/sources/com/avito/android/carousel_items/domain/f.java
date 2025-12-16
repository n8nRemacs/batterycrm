package com.avito.android.carousel_items.domain;

import com.avito.android.remote.V0;
import com.avito.android.serp.adapter.InterfaceC34904z0;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CarouselItemsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<V0> f115281a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f115282b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f115283c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC34904z0> f115284d;

    public f(Provider<V0> provider, Provider<InterfaceC35745a5> provider2, Provider<com.avito.android.remote.error.f> provider3, Provider<InterfaceC34904z0> provider4) {
        this.f115281a = provider;
        this.f115282b = provider2;
        this.f115283c = provider3;
        this.f115284d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(dagger.internal.g.b(this.f115281a), this.f115282b.get(), this.f115283c.get(), this.f115284d.get());
    }
}
