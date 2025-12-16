package com.avito.android.promo.icon;

import Y61.k;
import Y61.l;
import com.avito.android.promo.PromoAction;
import com.avito.android.promo.PromoAnalyticParams;
import com.avito.android.promo.PromoWidgetItem;
import com.avito.android.serp.analytics.widgets_tracker.g;
import com.avito.android.util.O2;
import java.util.List;
import js0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import rn0.InterfaceC47690b;
import rn0.InterfaceC47691c;

/* compiled from: PromoWidgetItemIconPresenterImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/promo/icon/d;", "Lcom/avito/android/promo/icon/c;", "_avito_bx-content_widget_promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.lib.util.groupable_item.b f231643b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC47690b> f231644c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g f231645d;

    public d(@k com.avito.android.lib.util.groupable_item.b bVar, @k h31.e<InterfaceC47690b> eVar, @k g gVar) {
        this.f231643b = bVar;
        this.f231644c = eVar;
        this.f231645d = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        PromoWidgetItem promoWidgetItem = (PromoWidgetItem) aVar;
        this.f231643b.a(eVar2, promoWidgetItem);
        eVar2.WU(promoWidgetItem.getStyle(), promoWidgetItem.I4());
        String title = promoWidgetItem.getTitle();
        if (!promoWidgetItem.I4()) {
            title = null;
        }
        eVar2.Gg(title, promoWidgetItem.I4());
        String text = promoWidgetItem.getText();
        if (text == null || text.length() == 0) {
            eVar2.v8();
        } else {
            String text2 = promoWidgetItem.getText();
            if (text2 != null) {
                eVar2.r6(text2);
            }
        }
        eVar2.A2(promoWidgetItem.getImage());
        if (!O2.a(promoWidgetItem.getActions())) {
            eVar2.W2();
            return;
        }
        List<PromoAction> actions = promoWidgetItem.getActions();
        if (actions != null) {
            eVar2.SG(actions, promoWidgetItem, i12);
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
        d.a.a(this.f231645d, numValueOf, "vertical_promo", strJ4, promoId, null, analyticParams != null ? analyticParams.getMcid() : null, null, promoWidgetItem.getAnalytics(), 80);
        InterfaceC47691c.a.b(this.f231644c.get(), promoAction.getUri(), 6);
    }
}
