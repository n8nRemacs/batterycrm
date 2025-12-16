package com.avito.android.comparison.domain;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ComparisonInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.comparison.data.a> f123901a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f123902b;

    public d(Provider<com.avito.android.comparison.data.a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f123901a = provider;
        this.f123902b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f123901a.get(), this.f123902b.get());
    }
}
