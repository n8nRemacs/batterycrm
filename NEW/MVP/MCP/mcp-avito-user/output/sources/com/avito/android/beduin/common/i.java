package com.avito.android.beduin.common;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import oi.InterfaceC44779a;

/* compiled from: BeduinInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC44779a> f103421a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f103422b;

    public i(Provider<InterfaceC44779a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f103421a = provider;
        this.f103422b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f103422b.get(), dagger.internal.g.b(this.f103421a));
    }
}
