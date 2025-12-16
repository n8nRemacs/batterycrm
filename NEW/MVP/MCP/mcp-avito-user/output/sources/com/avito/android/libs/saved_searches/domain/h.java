package com.avito.android.libs.saved_searches.domain;

import Go0.InterfaceC13902a;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SearchSubscriptionInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC13902a> f181467a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.db.n> f181468b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<TV.c> f181469c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f181470d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f181471e;

    public h(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f181467a = provider;
        this.f181468b = provider2;
        this.f181469c = provider3;
        this.f181470d = provider4;
        this.f181471e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(dagger.internal.g.b(this.f181467a), this.f181468b.get(), this.f181469c.get(), this.f181470d.get(), (SearchParamsConverter) this.f181471e.get());
    }
}
