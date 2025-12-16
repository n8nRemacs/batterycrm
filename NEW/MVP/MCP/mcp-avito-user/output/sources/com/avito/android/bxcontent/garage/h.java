package com.avito.android.bxcontent.garage;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import vx0.InterfaceC49391a;

/* compiled from: AddCarToGarageInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC49391a> f111112a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f111113b;

    public h(Provider<InterfaceC49391a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f111112a = provider;
        this.f111113b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f111113b.get(), dagger.internal.g.b(this.f111112a));
    }
}
