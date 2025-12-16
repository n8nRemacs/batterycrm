package com.avito.android.advert.item.icebreakers;

import Eo0.InterfaceC13515a;
import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class n implements View.OnFocusChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f76492b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l f76493c;

    public /* synthetic */ n(int i12, Y41.l lVar) {
        this.f76492b = i12;
        this.f76493c = lVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z12) {
        Y41.l lVar = this.f76493c;
        switch (this.f76492b) {
            case 0:
                int i12 = o.f76494g;
                lVar.invoke(Boolean.valueOf(z12));
                break;
            case 1:
                int i13 = com.avito.android.advert.item.icebreakers_redesign.m.f76557g;
                lVar.invoke(Boolean.valueOf(z12));
                break;
            case 2:
                int i14 = com.avito.android.saved_searches.presentation.items.name.f.f258516f;
                if (z12) {
                    lVar.invoke(InterfaceC13515a.g.f4247a);
                    break;
                }
                break;
            case 3:
                int i15 = com.avito.android.search.filter.adapter.input.i.f262424d;
                lVar.invoke(Boolean.valueOf(z12));
                break;
            case 4:
                int i16 = com.avito.android.search.filter.adapter.keywords.c.f262434i;
                lVar.invoke(Boolean.valueOf(z12));
                break;
            case 5:
                int i17 = com.avito.android.search.filter.adapter.keywords.h.f262455i;
                lVar.invoke(Boolean.valueOf(z12));
                break;
            case 6:
                int i18 = com.avito.android.short_term_rent.bookingform.items.input.n.f281572f;
                lVar.invoke(Boolean.valueOf(z12));
                break;
            default:
                int i19 = com.avito.android.str_calendar.seller.calandar_parameters.items.input.j.f287212g;
                lVar.invoke(Boolean.valueOf(z12));
                break;
        }
    }
}
