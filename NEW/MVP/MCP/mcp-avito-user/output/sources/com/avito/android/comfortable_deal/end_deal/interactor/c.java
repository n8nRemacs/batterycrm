package com.avito.android.comfortable_deal.end_deal.interactor;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.comfortable_deal.end_deal.model.EndDealArguments;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EndDealAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f122196a;

    /* renamed from: b, reason: collision with root package name */
    public final l f122197b;

    public c(l lVar, Provider provider) {
        this.f122196a = provider;
        this.f122197b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f122196a.get(), (EndDealArguments) this.f122197b.f393949a);
    }
}
