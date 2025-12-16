package com.avito.android.advert.item.sellersubscription;

import l41.InterfaceC43543a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class q implements InterfaceC43543a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79767b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SellerSubscriptionPresenterImpl f79768c;

    public /* synthetic */ q(SellerSubscriptionPresenterImpl sellerSubscriptionPresenterImpl, int i12) {
        this.f79767b = i12;
        this.f79768c = sellerSubscriptionPresenterImpl;
    }

    @Override // l41.InterfaceC43543a
    public final void run() {
        switch (this.f79767b) {
            case 0:
                this.f79768c.f79697p = null;
                break;
            case 1:
                com.avito.android.subscriptions_settings.d dVar = this.f79768c.f79694m;
                if (dVar != null) {
                    dVar.e(false);
                    break;
                }
                break;
            case 2:
                com.avito.android.subscriptions_settings.d dVar2 = this.f79768c.f79694m;
                if (dVar2 != null) {
                    dVar2.f(false);
                    break;
                }
                break;
            default:
                com.avito.android.subscriptions_settings.d dVar3 = this.f79768c.f79694m;
                if (dVar3 != null) {
                    dVar3.e(false);
                    break;
                }
                break;
        }
    }
}
