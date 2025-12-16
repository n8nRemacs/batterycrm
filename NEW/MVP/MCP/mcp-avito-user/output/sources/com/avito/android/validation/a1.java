package com.avito.android.validation;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: ParametersListPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class a1 implements dagger.internal.h<Y0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC36026p> f319340a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f319341b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f319342c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f319343d;

    public a1(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f319340a = provider;
        this.f319341b = provider2;
        this.f319342c = provider3;
        this.f319343d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new Y0(this.f319340a.get(), this.f319341b.get(), this.f319342c.get(), (com.avito.android.analytics.i0) this.f319343d.get());
    }
}
