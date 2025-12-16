package com.avito.android.advert.item.fmp.offer;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.fmp.AnalyticsEvent;
import com.avito.android.remote.fmp.FmpOfferButton;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsFmpOfferPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsFmpOfferItem f75544l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f75545m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AdvertDetailsFmpOfferItem advertDetailsFmpOfferItem, e eVar) {
        super(0);
        this.f75544l = advertDetailsFmpOfferItem;
        this.f75545m = eVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deeplink;
        List<AnalyticsEvent> listC;
        AdvertDetailsFmpOfferItem advertDetailsFmpOfferItem = this.f75544l;
        FmpOfferButton fmpOfferButton = advertDetailsFmpOfferItem.f75532d;
        e eVar = this.f75545m;
        if (fmpOfferButton != null && (listC = fmpOfferButton.c()) != null) {
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                eVar.f75547c.c(g.a((AnalyticsEvent) it.next()));
            }
        }
        FmpOfferButton fmpOfferButton2 = advertDetailsFmpOfferItem.f75532d;
        if (fmpOfferButton2 != null && (deeplink = fmpOfferButton2.getDeeplink()) != null) {
            b.a.a(eVar.f75546b, deeplink, null, null, 6);
        }
        return G0.f406611a;
    }
}
