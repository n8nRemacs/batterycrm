package com.avito.android.universal_map.map;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import tG0.InterfaceC48553b;

/* compiled from: UniversalMapInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class P implements dagger.internal.h<O> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48553b> f304807a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f304808b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f304809c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35318f> f304810d;

    public P(Provider<InterfaceC48553b> provider, Provider<com.avito.android.remote.error.f> provider2, Provider<InterfaceC35745a5> provider3, Provider<InterfaceC35318f> provider4) {
        this.f304807a = provider;
        this.f304808b = provider2;
        this.f304809c = provider3;
        this.f304810d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new O(dagger.internal.g.a(dagger.internal.w.a(this.f304807a)), this.f304808b.get(), this.f304809c.get(), this.f304810d.get());
    }
}
