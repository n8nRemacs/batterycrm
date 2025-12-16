package com.avito.android.promo.vertical;

import Y61.k;
import Y61.l;
import com.avito.android.R;
import com.avito.android.promo.PromoAction;
import com.avito.android.promo.PromoAnalyticParams;
import com.avito.android.promo.PromoWidgetItem;
import com.avito.android.serp.analytics.widgets_tracker.g;
import com.avito.android.util.O2;
import java.util.List;
import js0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import ld0.InterfaceC43734e;
import rn0.InterfaceC47690b;
import rn0.InterfaceC47691c;

/* compiled from: PromoWidgetItemVerticalPresenterImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/promo/vertical/e;", "Lcom/avito/android/promo/vertical/d;", "_avito_bx-content_widget_promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.lib.util.groupable_item.b f231686b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC47690b> f231687c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g f231688d;

    public e(@k com.avito.android.lib.util.groupable_item.b bVar, @k h31.e<InterfaceC47690b> eVar, @k g gVar) {
        this.f231686b = bVar;
        this.f231687c = eVar;
        this.f231688d = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String text;
        InterfaceC43734e interfaceC43734e = (InterfaceC43734e) eVar;
        PromoWidgetItem promoWidgetItem = (PromoWidgetItem) aVar;
        List<PromoAction> actions = promoWidgetItem.getActions();
        if ((actions == null || actions.isEmpty()) && ((text = promoWidgetItem.getText()) == null || C43066x.K(text))) {
            return;
        }
        this.f231686b.a(interfaceC43734e, promoWidgetItem);
        interfaceC43734e.WU(promoWidgetItem.getStyle(), promoWidgetItem.I4());
        interfaceC43734e.BM(R.style.Re23_Text_H20);
        interfaceC43734e.Gg(promoWidgetItem.getTitle(), promoWidgetItem.I4());
        String text2 = promoWidgetItem.getText();
        if (text2 == null || text2.length() == 0) {
            interfaceC43734e.v8();
        } else {
            String text3 = promoWidgetItem.getText();
            if (text3 != null) {
                interfaceC43734e.r6(text3);
            }
        }
        if (!O2.a(promoWidgetItem.getActions())) {
            interfaceC43734e.W2();
            return;
        }
        List<PromoAction> actions2 = promoWidgetItem.getActions();
        if (actions2 != null) {
            interfaceC43734e.SG(actions2, promoWidgetItem, i12);
        }
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
        d.a.a(this.f231688d, numValueOf, "vertical_promo", strJ4, promoId, null, analyticParams != null ? analyticParams.getMcid() : null, null, promoWidgetItem.getAnalytics(), 80);
        InterfaceC47691c.a.b(this.f231687c.get(), promoAction.getUri(), 6);
    }
}
