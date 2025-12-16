package com.avito.android.publish.di;

import com.avito.android.publish.analytics.InterfaceC33527m;
import com.avito.android.publish.di.C33810a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: PublishModule_ProvideInteractorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.di.v, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33830v implements dagger.internal.h<com.avito.android.publish.P> {

    /* renamed from: a, reason: collision with root package name */
    public final C33824o f235288a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.remote.X> f235289b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f235290c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f235291d;

    public C33830v(C33824o c33824o, Provider provider, dagger.internal.u uVar, Provider provider2) {
        this.f235288a = c33824o;
        this.f235289b = provider;
        this.f235290c = uVar;
        this.f235291d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.remote.X x12 = (com.avito.android.remote.X) ((C33810a.c.i) this.f235289b).get();
        InterfaceC33527m interfaceC33527m = (InterfaceC33527m) this.f235290c.get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((C33810a.c.u) this.f235291d).get();
        this.f235288a.getClass();
        return new com.avito.android.publish.Q(x12, interfaceC33527m, interfaceC35745a5);
    }
}
