package com.avito.android.user_adverts.tab_screens.advert_list.shortcut_title;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f314792b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f314793c;

    public /* synthetic */ n(q qVar, int i12) {
        this.f314792b = i12;
        this.f314793c = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f314792b) {
            case 0:
                this.f314793c.f314803e.performClick();
                break;
            default:
                com.avito.android.lib.design.tooltip.k kVar = this.f314793c.f314809k;
                if (kVar != null) {
                    kVar.dismiss();
                    break;
                }
                break;
        }
    }
}
