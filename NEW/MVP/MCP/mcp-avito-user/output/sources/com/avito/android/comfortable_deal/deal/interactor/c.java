package com.avito.android.comfortable_deal.deal.interactor;

import Ip.C14141a;
import com.avito.android.comfortable_deal.deal.model.DealArguments;
import com.avito.android.comfortable_deal.repository.l;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DealInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f121136a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.comfortable_deal.deal.item.completion.analytics.a> f121137b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C14141a> f121138c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f121139d;

    public c(l lVar, Provider provider, Provider provider2, dagger.internal.l lVar2) {
        this.f121136a = lVar;
        this.f121137b = provider;
        this.f121138c = provider2;
        this.f121139d = lVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.comfortable_deal.repository.a) this.f121136a.get(), this.f121137b.get(), this.f121138c.get(), (DealArguments) this.f121139d.f393949a);
    }
}
