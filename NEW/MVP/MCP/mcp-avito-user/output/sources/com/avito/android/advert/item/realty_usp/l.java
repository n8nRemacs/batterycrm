package com.avito.android.advert.item.realty_usp;

import com.avito.android.account.E;
import com.avito.android.util.Kundle;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import y6.InterfaceC50067a;

/* compiled from: RealtyUspPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class l implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f78420a;

    /* renamed from: b, reason: collision with root package name */
    public final u f78421b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<c> f78422c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<E> f78423d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f78424e;

    public l(dagger.internal.l lVar, u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f78420a = lVar;
        this.f78421b = uVar;
        this.f78422c = provider;
        this.f78423d = provider2;
        this.f78424e = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h((Kundle) this.f78420a.f393949a, (InterfaceC50067a) this.f78421b.get(), this.f78422c.get(), this.f78423d.get(), this.f78424e.get());
    }
}
