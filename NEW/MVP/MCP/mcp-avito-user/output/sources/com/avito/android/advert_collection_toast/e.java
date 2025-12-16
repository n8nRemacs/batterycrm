package com.avito.android.advert_collection_toast;

import com.avito.android.account.E;
import com.avito.android.advert_collection_toast.analytics.FromPageSource;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertCollectionToastServiceImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<E> f82400a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f82401b;

    /* renamed from: c, reason: collision with root package name */
    public final X7.c f82402c;

    /* renamed from: d, reason: collision with root package name */
    public final u f82403d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f82404e;

    public e(Provider provider, Provider provider2, X7.c cVar, u uVar, Provider provider3) {
        this.f82400a = provider;
        this.f82401b = provider2;
        this.f82402c = cVar;
        this.f82403d = uVar;
        this.f82404e = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f82400a.get(), this.f82401b.get(), (X7.a) this.f82402c.get(), (FromPageSource) this.f82403d.get(), this.f82404e.get());
    }
}
