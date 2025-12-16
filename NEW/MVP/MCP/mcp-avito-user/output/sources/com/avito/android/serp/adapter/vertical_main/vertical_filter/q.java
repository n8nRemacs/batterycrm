package com.avito.android.serp.adapter.vertical_main.vertical_filter;

import com.avito.android.remote.V0;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: VerticalFilterInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<V0> f273570a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f273571b;

    public q(Provider<V0> provider, Provider<InterfaceC35745a5> provider2) {
        this.f273570a = provider;
        this.f273571b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p(this.f273571b.get(), dagger.internal.g.b(this.f273570a));
    }
}
