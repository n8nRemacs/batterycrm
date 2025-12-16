package com.avito.android.auction.offer.domain;

import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import fc.C40396a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AuctionAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auction/offer/domain/b;", "Lcom/avito/android/auction/offer/domain/a;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f92499a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f92500b;

    @Inject
    public b(@Y61.k InterfaceC28373a interfaceC28373a, boolean z12) {
        this.f92499a = interfaceC28373a;
        this.f92500b = z12;
    }

    @Override // com.avito.android.auction.offer.domain.a
    public final void a(@Y61.k String str, @l String str2, @l String str3) {
        if (this.f92500b) {
            this.f92499a.c(new C40396a(str, str3, str2, null, 8, null));
        }
    }
}
