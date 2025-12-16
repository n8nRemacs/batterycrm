package com.avito.android.advert_core.comfortable_deal_promo;

import com.avito.android.advert_core.comfortable_deal_promo.AdvertDetailsComfortableDealPromoItem;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsComfortableDealPromoPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advert_core/comfortable_deal_promo/AdvertDetailsComfortableDealPromoItem$Button;", "button", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/advert_core/comfortable_deal_promo/AdvertDetailsComfortableDealPromoItem$Button;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class f extends N implements Y41.l<AdvertDetailsComfortableDealPromoItem.Button, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f83083l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar) {
        super(1);
        this.f83083l = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(AdvertDetailsComfortableDealPromoItem.Button button) {
        AdvertDetailsComfortableDealPromoItem.Button button2 = button;
        AdvertDetailsComfortableDealPromoItem.AnalyticsEvent analyticsEvent = button2.f83067d;
        g gVar = this.f83083l;
        if (analyticsEvent != null) {
            gVar.f83085c.c(new e(button2));
        }
        b.a.a(gVar.f83084b, button2.f83066c, null, null, 6);
        return G0.f406611a;
    }
}
