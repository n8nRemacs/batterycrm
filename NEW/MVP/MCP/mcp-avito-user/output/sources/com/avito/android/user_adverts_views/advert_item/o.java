package com.avito.android.user_adverts_views.advert_item;

import android.view.View;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.user_adverts_views_pub.UserAdvertItem;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f316520b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f316521c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f316522d;

    public /* synthetic */ o(int i12, Object obj, Object obj2) {
        this.f316520b = i12;
        this.f316521c = obj;
        this.f316522d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f316522d;
        Object obj2 = this.f316521c;
        switch (this.f316520b) {
            case 0:
                int i12 = p.f316523F0;
                com.avito.android.lib.design.tooltip.k kVar = new com.avito.android.lib.design.tooltip.k(((DockingBadge) obj2).getContext(), 0, 0, 6, null);
                kVar.f181224j = new r.a(new i.a(new b.a()));
                com.avito.android.lib.design.tooltip.p.a(kVar, new r((UserAdvertItem.k.b) obj));
                kVar.f(view);
                break;
            case 1:
                int i13 = p.f316523F0;
                ((Y41.l) obj2).invoke((UserAdvertItem.RightAction.a) obj);
                break;
            default:
                int i14 = p.f316523F0;
                ((Y41.l) obj2).invoke((UserAdvertItem.RightAction.b) obj);
                break;
        }
    }
}
