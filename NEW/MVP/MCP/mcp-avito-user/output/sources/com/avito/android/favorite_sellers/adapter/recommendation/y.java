package com.avito.android.favorite_sellers.adapter.recommendation;

import com.avito.android.InterfaceC34162r0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.favorite.SubscriptionSource;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.Kundle;
import com.avito.android.util.R0;
import javax.inject.Provider;
import kotlinx.coroutines.flow.Y1;

/* compiled from: RecommendationItemPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class y implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC30576b> f155708a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f155709b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Y1<vC.b>> f155710c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f155711d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f155712e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f155713f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f155714g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.component.toast.util.c> f155715h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.u f155716i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.u f155717j;

    /* renamed from: k, reason: collision with root package name */
    public final dagger.internal.l f155718k;

    public y(Provider provider, dagger.internal.u uVar, Provider provider2, dagger.internal.u uVar2, dagger.internal.u uVar3, dagger.internal.u uVar4, dagger.internal.l lVar, Provider provider3, dagger.internal.u uVar5, dagger.internal.u uVar6, dagger.internal.l lVar2) {
        this.f155708a = provider;
        this.f155709b = uVar;
        this.f155710c = provider2;
        this.f155711d = uVar2;
        this.f155712e = uVar3;
        this.f155713f = uVar4;
        this.f155714g = lVar;
        this.f155715h = provider3;
        this.f155716i = uVar5;
        this.f155717j = uVar6;
        this.f155718k = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f155708a.get(), (InterfaceC34162r0) this.f155709b.get(), this.f155710c.get(), (I30.d) this.f155711d.get(), (InterfaceC35741a1) this.f155712e.get(), (InterfaceC28373a) this.f155713f.get(), (SubscriptionSource) this.f155714g.f393949a, this.f155715h.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f155716i.get(), (R0) this.f155717j.get(), (Kundle) this.f155718k.f393949a);
    }
}
