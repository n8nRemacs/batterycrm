package com.avito.android.advert.item.beduin;

import com.avito.android.advertising.loaders.beduin.H;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsBeduinViewModelProviderFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<a> f73252a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f73253b;

    /* renamed from: c, reason: collision with root package name */
    public final B4.d f73254c;

    /* renamed from: d, reason: collision with root package name */
    public final u f73255d;

    public n(Provider provider, Provider provider2, B4.d dVar, u uVar) {
        this.f73252a = provider;
        this.f73253b = provider2;
        this.f73254c = dVar;
        this.f73255d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f73252a.get(), this.f73253b.get(), this.f73254c, (H) this.f73255d.get());
    }
}
