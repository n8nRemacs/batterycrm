package com.avito.android.publish.slots.market_price_v2.item;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.imv_cars.EntryPointType;
import com.avito.android.analytics.event.imv_cars.IconType;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;
import lc.C43724a;
import lc.C43726c;

/* compiled from: MarketPriceItemEventTracker.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/market_price_v2/item/b;", "Lcom/avito/android/publish/slots/market_price_v2/item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f244567a;

    @Inject
    public b(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f244567a = interfaceC28373a;
    }

    @Override // com.avito.android.publish.slots.market_price_v2.item.a
    public final void a(@Y61.l String str) {
        this.f244567a.c(new C43724a(str, (str == null || C43066x.K(str)) ? EntryPointType.f90087d : EntryPointType.f90088e));
    }

    @Override // com.avito.android.publish.slots.market_price_v2.item.a
    public final void b(@Y61.l String str) {
        this.f244567a.c(new C43726c(str, (str == null || C43066x.K(str)) ? IconType.f90093d : IconType.f90094e));
    }
}
