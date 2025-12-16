package com.avito.android.brandspace.brandspace.mvi;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;
import pk.InterfaceC47104b;

/* compiled from: BrandspaceReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f107677a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f107678b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC47104b> f107679c;

    public m(Provider<InterfaceC35745a5> provider, Provider<InterfaceC40691b> provider2, Provider<InterfaceC47104b> provider3) {
        this.f107677a = provider;
        this.f107678b = provider2;
        this.f107679c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f107677a.get(), this.f107678b.get(), this.f107679c.get());
    }
}
