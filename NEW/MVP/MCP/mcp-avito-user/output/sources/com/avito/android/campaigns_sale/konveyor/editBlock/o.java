package com.avito.android.campaigns_sale.konveyor.editBlock;

import android.widget.PopupWindow;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class o implements PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f113998b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a f113999c;

    public /* synthetic */ o(int i12, Y41.a aVar) {
        this.f113998b = i12;
        this.f113999c = aVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        Y41.a aVar = this.f113999c;
        switch (this.f113998b) {
            case 0:
                int i12 = p.f114000u;
                aVar.invoke();
                break;
            case 1:
                int i13 = com.avito.android.profile.user_profile.cards.avito_pro.i.f224818e;
                aVar.invoke();
                break;
            case 2:
                int i14 = com.avito.android.str_seller_orders_calendar.strorderscalendar.items.flat_info.l.f290952j;
                aVar.invoke();
                break;
            default:
                int i15 = com.avito.android.user_advert.advert.items.actions_item.m.f309046f;
                aVar.invoke();
                break;
        }
    }
}
