package com.avito.android.advert.item.domoteka.conveyor;

import com.avito.android.account.E;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsDomotekaTeaserPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f75267a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.analytics.a> f75268b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<E> f75269c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f75270d;

    public k(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f75267a = uVar;
        this.f75268b = provider;
        this.f75269c = provider2;
        this.f75270d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((com.avito.android.advert.item.domoteka.a) this.f75267a.get(), this.f75268b.get(), this.f75269c.get(), this.f75270d.get());
    }
}
