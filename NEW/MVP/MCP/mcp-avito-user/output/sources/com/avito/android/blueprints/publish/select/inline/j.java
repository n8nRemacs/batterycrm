package com.avito.android.blueprints.publish.select.inline;

import Y41.l;
import android.widget.CompoundButton;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class j implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f106484b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f106485c;

    public /* synthetic */ j(int i12, l lVar) {
        this.f106484b = i12;
        this.f106485c = lVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
        l lVar = this.f106485c;
        switch (this.f106484b) {
            case 0:
                int i12 = k.f106486i;
                lVar.invoke(Boolean.valueOf(z12));
                break;
            case 1:
                int i13 = com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block.l.f138284d;
                lVar.invoke(Boolean.valueOf(z12));
                break;
            case 2:
                int i14 = com.avito.android.guests_selector.items.swither.g.f161516d;
                lVar.invoke(Boolean.valueOf(z12));
                break;
            case 3:
                int i15 = com.avito.android.search.filter.adapter.switcher_with_hint.j.f262628g;
                lVar.invoke(Boolean.valueOf(z12));
                break;
            case 4:
                int i16 = com.avito.android.service_booking_settings.work_hours.item.schedule.l.f278005n;
                lVar.invoke(Boolean.valueOf(z12));
                break;
            case 5:
                int i17 = com.avito.android.str_calendar.seller.calandar_parameters.items.switcher.c.f287269f;
                lVar.invoke(Boolean.valueOf(z12));
                break;
            case 6:
                int i18 = com.avito.android.user_advert.advert.items.multi_urgency.j.f309652i;
                if (lVar != null) {
                    lVar.invoke(Boolean.valueOf(z12));
                    break;
                }
                break;
            default:
                int i19 = com.avito.android.user_advert.advert.items.portfolio_filled_widget.j.f309818f;
                lVar.invoke(Boolean.valueOf(z12));
                break;
        }
    }
}
