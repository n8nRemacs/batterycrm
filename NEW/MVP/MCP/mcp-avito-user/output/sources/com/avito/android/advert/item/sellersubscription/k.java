package com.avito.android.advert.item.sellersubscription;

import com.avito.android.analytics.event.favorite.SubscriptionSource;
import com.avito.android.remote.Q;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class k implements l41.s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79746b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f79747c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SubscriptionSource f79748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f79749e;

    public /* synthetic */ k(n nVar, SubscriptionSource subscriptionSource, String str, int i12) {
        this.f79746b = i12;
        this.f79747c = nVar;
        this.f79748d = subscriptionSource;
        this.f79749e = str;
    }

    @Override // l41.s
    public final Object get() {
        switch (this.f79746b) {
            case 0:
                n nVar = this.f79747c;
                Q q12 = nVar.f79756a.get();
                SubscriptionSource subscriptionSource = this.f79748d;
                return q12.f(subscriptionSource != null ? subscriptionSource.f90042b : nVar.f79761f, this.f79749e, nVar.f79757b.b(), false, null);
            default:
                n nVar2 = this.f79747c;
                Q q13 = nVar2.f79756a.get();
                SubscriptionSource subscriptionSource2 = this.f79748d;
                return q13.k(subscriptionSource2 != null ? subscriptionSource2.f90042b : nVar2.f79761f, this.f79749e, false);
        }
    }
}
