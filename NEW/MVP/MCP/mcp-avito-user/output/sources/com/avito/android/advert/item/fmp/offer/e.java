package com.avito.android.advert.item.fmp.offer;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.fmp.AnalyticsEvent;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsFmpOfferPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/fmp/offer/e;", "Lcom/avito/android/advert/item/fmp/offer/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f75546b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28373a f75547c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f75548d;

    @Inject
    public e(@k InterfaceC28373a interfaceC28373a, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f75546b = aVar;
        this.f75547c = interfaceC28373a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        AdvertDetailsFmpOfferItem advertDetailsFmpOfferItem = (AdvertDetailsFmpOfferItem) aVar;
        hVar.e(advertDetailsFmpOfferItem.f75530b);
        hVar.ni(advertDetailsFmpOfferItem.f75531c);
        hVar.KJ(advertDetailsFmpOfferItem.f75532d);
        hVar.x4(advertDetailsFmpOfferItem.f75534f);
        hVar.Y(new d(advertDetailsFmpOfferItem, this));
        if (this.f75548d) {
            return;
        }
        List<AnalyticsEvent> list = advertDetailsFmpOfferItem.f75533e;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                this.f75547c.c(g.a((AnalyticsEvent) it.next()));
            }
        }
        this.f75548d = true;
    }
}
