package com.avito.android.beduin.data;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import oi.InterfaceC44779a;

/* compiled from: BeduinScreenRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC44779a> f103899a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f103900b;

    public e(Provider<InterfaceC44779a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f103899a = provider;
        this.f103900b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f103900b.get(), g.a(w.a(this.f103899a)));
    }
}
