package com.avito.android.advert.item.safedeal.trust_factors;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79186b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.tooltip.k f79187c;

    public /* synthetic */ k(com.avito.android.lib.design.tooltip.k kVar, int i12) {
        this.f79186b = i12;
        this.f79187c = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.avito.android.lib.design.tooltip.k kVar = this.f79187c;
        switch (this.f79186b) {
            case 0:
                kVar.dismiss();
                break;
            case 1:
                kVar.dismiss();
                break;
            case 2:
                kVar.dismiss();
                break;
            case 3:
                kVar.dismiss();
                break;
            case 4:
                kVar.dismiss();
                break;
            case 5:
                kVar.dismiss();
                break;
            case 6:
                int i12 = com.avito.android.lib.design.tooltip.k.f181215q;
                kVar.dismiss();
                View view2 = kVar.f181218d;
                if (view2 != null) {
                    view2.removeCallbacks(kVar.f181221g);
                }
                kVar.f181221g = null;
                break;
            default:
                kVar.dismiss();
                break;
        }
    }
}
