package com.avito.android.blueprint.switcher;

import Y41.l;
import com.avito.android.lib.design.list_item.ListItemCompoundButton;
import com.avito.android.str_calendar.seller.calandar_parameters.items.switcher.j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class h implements ListItemCompoundButton.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f105775a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f105776b;

    public /* synthetic */ h(int i12, l lVar) {
        this.f105775a = i12;
        this.f105776b = lVar;
    }

    @Override // com.avito.android.lib.design.list_item.ListItemCompoundButton.a
    public final void a(ListItemCompoundButton listItemCompoundButton, boolean z12) {
        l lVar = this.f105776b;
        switch (this.f105775a) {
            case 0:
                int i12 = i.f105777q;
                lVar.invoke(Boolean.valueOf(z12));
                break;
            case 1:
                int i13 = com.avito.android.blueprints.checkbox_with_text.h.f105835d;
                if (lVar != null) {
                    lVar.invoke(Boolean.valueOf(z12));
                    break;
                }
                break;
            case 2:
                int i14 = com.avito.android.comparison.items.diff_switch_item.h.f123938c;
                lVar.invoke(Boolean.valueOf(z12));
                break;
            case 3:
                int i15 = com.avito.android.inline_filters.dialog.location_group.adapter.checkbox.g.f171722d;
                lVar.invoke(Boolean.valueOf(z12));
                break;
            case 4:
                int i16 = com.avito.android.search.filter.adapter.switcher.i.f262613c;
                lVar.invoke(Boolean.valueOf(z12));
                break;
            default:
                int i17 = j.f287282c;
                lVar.invoke(Boolean.valueOf(z12));
                break;
        }
    }
}
