package com.avito.android.advert.item.safedeal.trust_factors;

import android.widget.PopupWindow;
import com.avito.android.remote.safedeal.SafeDeal;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.core.view2.divs.C37931a;
import com.yandex.div2.AbstractC38330g;
import com.yandex.div2.DivTooltip;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class j implements PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79181b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f79182c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f79183d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f79184e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f79185f;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, int i12) {
        this.f79181b = i12;
        this.f79182c = obj;
        this.f79183d = obj2;
        this.f79184e = obj3;
        this.f79185f = obj4;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        Object obj = this.f79185f;
        Object obj2 = this.f79184e;
        Object obj3 = this.f79183d;
        Object obj4 = this.f79182c;
        switch (this.f79181b) {
            case 0:
                if (!((i) obj4).f79171b.d0()) {
                    SafeDeal.TooltipData tooltipData = (SafeDeal.TooltipData) obj;
                    ((d) obj3).i((String) obj2, tooltipData.getLabel(), tooltipData.getShowEvent());
                    break;
                }
                break;
            case 1:
                int i12 = com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.g.f313707p;
                if (((com.avito.android.lib.design.tooltip.k) obj4).isShowing()) {
                    ((com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.g) obj3).f313708b.b((PanelCardItem) obj2, (PanelCardItem.b) obj);
                    break;
                }
                break;
            default:
                com.yandex.div.core.tooltip.g gVar = (com.yandex.div.core.tooltip.g) obj4;
                DivTooltip divTooltip = (DivTooltip) obj3;
                gVar.f367768f.remove(divTooltip.f372140e);
                AbstractC38330g abstractC38330g = divTooltip.f372138c;
                gVar.f367765c.d((C38029k) obj2, null, abstractC38330g, C37931a.u(abstractC38330g.a()));
                gVar.f367764b.getClass();
                break;
        }
    }
}
