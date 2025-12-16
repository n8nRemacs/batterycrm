package com.avito.android.favorite;

import com.avito.android.di.module.U4;
import com.avito.android.util.R0;
import javax.inject.Provider;
import qu.InterfaceC47447c;

/* compiled from: FavoritesStorageWithCache_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class C implements dagger.internal.h<z> {

    /* renamed from: a, reason: collision with root package name */
    public final U4 f155158a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f155159b;

    public C(U4 u42, Provider provider) {
        this.f155158a = u42;
        this.f155159b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new z((InterfaceC47447c) this.f155158a.get(), this.f155159b.get());
    }
}
