package com.avito.android.promo.movable;

import Y61.k;
import Y61.l;
import com.avito.android.promo.PromoAction;
import com.avito.android.promo.PromoAnalyticParams;
import com.avito.android.promo.PromoWidgetItem;
import com.avito.android.serp.analytics.widgets_tracker.g;
import java.util.List;
import js0.d;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import rn0.InterfaceC47690b;
import rn0.InterfaceC47691c;

/* compiled from: PromoWidgetItemMovablePresenterImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/promo/movable/d;", "Lcom/avito/android/promo/movable/c;", "_avito_bx-content_widget_promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC47690b> f231671b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g f231672c;

    public d(@k g gVar, @k h31.e eVar) {
        this.f231671b = eVar;
        this.f231672c = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        PromoWidgetItem promoWidgetItem = (PromoWidgetItem) aVar;
        eVar2.WU(promoWidgetItem.getStyle(), promoWidgetItem.I4());
        eVar2.Gg(promoWidgetItem.getTitle(), promoWidgetItem.I4());
        String text = promoWidgetItem.getText();
        if (text == null) {
            text = "";
        }
        eVar2.r6(text);
        List<PromoAction> actions = promoWidgetItem.getActions();
        if (actions == null) {
            actions = C42784z0.f406748b;
        }
        eVar2.SG(actions, promoWidgetItem, i12);
        eVar2.h20(promoWidgetItem.p4(), promoWidgetItem.I4());
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
        d.a.a(this.f231672c, numValueOf, "vertical_promo", strJ4, promoId, null, analyticParams != null ? analyticParams.getMcid() : null, null, promoWidgetItem.getAnalytics(), 80);
        InterfaceC47691c.a.b(this.f231671b.get(), promoAction.getUri(), 6);
    }
}
