package com.avito.android.serp.adapter.vertical_main.vertical_filter;

import com.avito.android.remote.V0;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: VerticalFilterFiltersInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.serp.adapter.vertical_main.vertical_filter.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34875k implements dagger.internal.h<C34873i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<V0> f273563a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f273564b;

    public C34875k(Provider<V0> provider, Provider<InterfaceC35745a5> provider2) {
        this.f273563a = provider;
        this.f273564b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C34873i(this.f273564b.get(), dagger.internal.g.b(this.f273563a));
    }
}
