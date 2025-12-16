package com.avito.android.di.module;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: FavoritePluginModule_ProvideAuthorizationPluginFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class X4 implements dagger.internal.h<A3.b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.favorites.Y f144187a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<ZC.c> f144188b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f144189c;

    public X4(com.avito.android.favorites.Y y12, Provider provider, Provider provider2) {
        this.f144187a = y12;
        this.f144188b = provider;
        this.f144189c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.favorites.W w12 = (com.avito.android.favorites.W) this.f144187a.get();
        h31.e eVarB = dagger.internal.g.b(this.f144188b);
        InterfaceC35745a5 interfaceC35745a5 = this.f144189c.get();
        W4.f144175a.getClass();
        return new V4(w12, interfaceC35745a5, eVarB);
    }
}
