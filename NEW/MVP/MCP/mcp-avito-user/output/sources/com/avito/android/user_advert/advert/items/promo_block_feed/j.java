package com.avito.android.user_advert.advert.items.promo_block_feed;

import android.view.View;
import com.avito.android.remote.model.SimpleAction;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f309873b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l f309874c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SimpleAction f309875d;

    public /* synthetic */ j(Y41.l lVar, SimpleAction simpleAction, int i12) {
        this.f309873b = i12;
        this.f309874c = lVar;
        this.f309875d = simpleAction;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Y41.l lVar = this.f309874c;
        SimpleAction simpleAction = this.f309875d;
        switch (this.f309873b) {
            case 0:
                int i12 = k.f309876h;
                lVar.invoke(simpleAction.getUri());
                break;
            case 1:
                int i13 = com.avito.android.user_advert.advert.items.realty.reliable_owner.i.f309943g;
                lVar.invoke(simpleAction.getUri());
                break;
            default:
                int i14 = com.avito.android.user_advert.advert.items.realty.reliable_owner.i.f309943g;
                lVar.invoke(simpleAction.getUri());
                break;
        }
    }
}
