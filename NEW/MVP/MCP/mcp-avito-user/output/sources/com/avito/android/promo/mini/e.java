package com.avito.android.promo.mini;

import Y61.k;
import Y61.l;
import com.avito.android.promo.PromoAction;
import com.avito.android.promo.PromoAnalyticParams;
import com.avito.android.promo.PromoWidgetItem;
import java.util.List;
import js0.d;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import rn0.InterfaceC47690b;
import rn0.InterfaceC47691c;

/* compiled from: PromoWidgetItemMiniPresenterImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/promo/mini/e;", "Lcom/avito/android/promo/mini/d;", "_avito_bx-content_widget_promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC47690b> f231654b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.serp.analytics.widgets_tracker.g f231655c;

    public e(@k com.avito.android.serp.analytics.widgets_tracker.g gVar, @k h31.e eVar) {
        this.f231654b = eVar;
        this.f231655c = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        PromoWidgetItem promoWidgetItem = (PromoWidgetItem) aVar;
        fVar.WU(promoWidgetItem.getStyle(), promoWidgetItem.I4());
        fVar.Gg(promoWidgetItem.getTitle(), promoWidgetItem.I4());
        String text = promoWidgetItem.getText();
        if (text == null) {
            text = "";
        }
        fVar.r6(text);
        fVar.PN(promoWidgetItem.p4());
        fVar.FF();
        List<PromoAction> actions = promoWidgetItem.getActions();
        if (actions == null) {
            actions = C42784z0.f406748b;
        }
        fVar.SG(actions, promoWidgetItem, i12);
    }

    @Override // XQ.a
    @l
    public final XQ.b d0() {
        return null;
    }

    @Override // ld0.InterfaceC43733d
    public final void k(@k PromoAction promoAction, @k PromoWidgetItem promoWidgetItem, int i12) {
        Integer numValueOf = Integer.valueOf(i12);
        String strJ4 = promoWidgetItem.J4(promoAction);
        String promoId = promoWidgetItem.getPromoId();
        PromoAnalyticParams analyticParams = promoWidgetItem.getAnalyticParams();
        d.a.a(this.f231655c, numValueOf, "vertical_promo", strJ4, promoId, null, analyticParams != null ? analyticParams.getMcid() : null, null, promoWidgetItem.getAnalytics(), 80);
        InterfaceC47691c.a.b(this.f231654b.get(), promoAction.getUri(), 6);
    }
}
