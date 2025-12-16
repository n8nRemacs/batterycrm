package com.avito.android.advert.item.commercials;

import com.avito.android.advert.InterfaceC27797i;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CommercialsPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC27797i> f74341a;

    /* renamed from: b, reason: collision with root package name */
    public final u f74342b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f74343c;

    public h(u uVar, Provider provider, Provider provider2) {
        this.f74341a = provider;
        this.f74342b = uVar;
        this.f74343c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f74341a.get(), (b) this.f74342b.get(), this.f74343c.get());
    }
}
