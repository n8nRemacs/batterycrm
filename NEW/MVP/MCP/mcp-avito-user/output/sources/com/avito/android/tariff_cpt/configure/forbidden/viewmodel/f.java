package com.avito.android.tariff_cpt.configure.forbidden.viewmodel;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CptForbiddenRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<JC0.a> f297632a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f297633b;

    public f(Provider<JC0.a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f297632a = provider;
        this.f297633b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f297632a.get(), this.f297633b.get());
    }
}
