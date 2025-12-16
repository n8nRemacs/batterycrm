package com.avito.android.advert.item.travel.trust;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.InterfaceC28153o;
import com.avito.android.analytics.provider.clickstream.ParcelableClickStreamEvent;
import java.util.LinkedHashSet;
import javax.inject.Inject;
import kotlin.Metadata;
import o7.C44595a;

/* compiled from: AdvertDetailsTravelTrustItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/travel/trust/d;", "LTV0/d;", "Lcom/avito/android/advert/item/travel/trust/f;", "Lcom/avito/android/advert/item/travel/trust/AdvertDetailsTravelTrustItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements TV0.d<f, AdvertDetailsTravelTrustItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28153o f80610b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C44595a f80611c;

    @Inject
    public d(@k InterfaceC28153o interfaceC28153o, @k C44595a c44595a) {
        this.f80610b = interfaceC28153o;
        this.f80611c = c44595a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        AdvertDetailsTravelTrustItem advertDetailsTravelTrustItem = (AdvertDetailsTravelTrustItem) aVar;
        fVar.e(advertDetailsTravelTrustItem.f80601g);
        if (advertDetailsTravelTrustItem.f80603i != null) {
            fVar.a(new c(this, advertDetailsTravelTrustItem));
        }
        ParcelableClickStreamEvent parcelableClickStreamEvent = advertDetailsTravelTrustItem.f80602h;
        if (parcelableClickStreamEvent != null) {
            C44595a c44595a = this.f80611c;
            LinkedHashSet linkedHashSet = c44595a.f419395b;
            long j12 = advertDetailsTravelTrustItem.f80596b;
            if (linkedHashSet.contains(Long.valueOf(j12))) {
                return;
            }
            c44595a.f419394a.c(parcelableClickStreamEvent);
            linkedHashSet.add(Long.valueOf(j12));
        }
    }
}
