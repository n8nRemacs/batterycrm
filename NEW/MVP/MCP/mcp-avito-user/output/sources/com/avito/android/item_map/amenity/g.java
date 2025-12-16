package com.avito.android.item_map.amenity;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import vO.InterfaceC49241a;

/* compiled from: AmenityButtonsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC49241a> f173293a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.remote.error.i f173294b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f173295c;

    public g(com.avito.android.remote.error.i iVar, Provider provider, Provider provider2) {
        this.f173293a = provider;
        this.f173294b = iVar;
        this.f173295c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f173293a.get(), (com.avito.android.remote.error.f) this.f173294b.get(), this.f173295c.get());
    }
}
