package com.avito.android.advert.item.sellersubscription;

import com.avito.android.advert_details_items.sellerprofile.subscription.SellerNotificationsState;
import com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionItem;
import com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionState;
import l41.InterfaceC43543a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class r implements InterfaceC43543a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79769b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SellerSubscriptionPresenterImpl f79770c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SellerSubscriptionItem f79771d;

    public /* synthetic */ r(SellerSubscriptionPresenterImpl sellerSubscriptionPresenterImpl, SellerSubscriptionItem sellerSubscriptionItem, int i12) {
        this.f79769b = i12;
        switch (i12) {
            case 2:
                SellerNotificationsState sellerNotificationsState = SellerNotificationsState.f85635b;
                this.f79770c = sellerSubscriptionPresenterImpl;
                this.f79771d = sellerSubscriptionItem;
                break;
            case 3:
            case 5:
            default:
                SellerSubscriptionState sellerSubscriptionState = SellerSubscriptionState.f85639b;
                this.f79770c = sellerSubscriptionPresenterImpl;
                this.f79771d = sellerSubscriptionItem;
                break;
            case 4:
                SellerSubscriptionState sellerSubscriptionState2 = SellerSubscriptionState.f85639b;
                this.f79770c = sellerSubscriptionPresenterImpl;
                this.f79771d = sellerSubscriptionItem;
                break;
            case 6:
                SellerNotificationsState sellerNotificationsState2 = SellerNotificationsState.f85635b;
                this.f79770c = sellerSubscriptionPresenterImpl;
                this.f79771d = sellerSubscriptionItem;
                break;
        }
    }

    @Override // l41.InterfaceC43543a
    public final void run() {
        switch (this.f79769b) {
            case 0:
                SellerSubscriptionPresenterImpl sellerSubscriptionPresenterImpl = this.f79770c;
                com.avito.android.subscriptions_settings.d dVar = sellerSubscriptionPresenterImpl.f79694m;
                if (dVar != null) {
                    dVar.d(true);
                }
                SellerNotificationsState sellerNotificationsState = SellerNotificationsState.f85635b;
                SellerSubscriptionItem sellerSubscriptionItem = this.f79771d;
                sellerSubscriptionPresenterImpl.j(sellerSubscriptionItem.s3(sellerSubscriptionItem.getF85536f(), sellerNotificationsState));
                break;
            case 1:
                SellerSubscriptionState sellerSubscriptionState = SellerSubscriptionState.f85640c;
                SellerSubscriptionItem sellerSubscriptionItem2 = this.f79771d;
                this.f79770c.p(sellerSubscriptionItem2.s3(sellerSubscriptionState, sellerSubscriptionItem2.getF85537g()));
                break;
            case 2:
                SellerNotificationsState sellerNotificationsState2 = SellerNotificationsState.f85635b;
                SellerSubscriptionItem sellerSubscriptionItem3 = this.f79771d;
                this.f79770c.p(sellerSubscriptionItem3.s3(sellerSubscriptionItem3.getF85536f(), sellerNotificationsState2));
                break;
            case 3:
                SellerSubscriptionPresenterImpl sellerSubscriptionPresenterImpl2 = this.f79770c;
                com.avito.android.subscriptions_settings.d dVar2 = sellerSubscriptionPresenterImpl2.f79694m;
                if (dVar2 != null) {
                    dVar2.d(false);
                }
                SellerNotificationsState sellerNotificationsState3 = SellerNotificationsState.f85636c;
                SellerSubscriptionItem sellerSubscriptionItem4 = this.f79771d;
                sellerSubscriptionPresenterImpl2.j(sellerSubscriptionItem4.s3(sellerSubscriptionItem4.getF85536f(), sellerNotificationsState3));
                break;
            case 4:
                SellerSubscriptionState sellerSubscriptionState2 = SellerSubscriptionState.f85639b;
                SellerSubscriptionItem sellerSubscriptionItem5 = this.f79771d;
                this.f79770c.p(sellerSubscriptionItem5.s3(sellerSubscriptionState2, sellerSubscriptionItem5.getF85537g()));
                break;
            case 5:
                SellerSubscriptionItem sellerSubscriptionItemS3 = this.f79771d.s3(SellerSubscriptionState.f85640c, null);
                SellerSubscriptionPresenterImpl sellerSubscriptionPresenterImpl3 = this.f79770c;
                sellerSubscriptionPresenterImpl3.j(sellerSubscriptionItemS3);
                com.avito.android.subscriptions_settings.d dVar3 = sellerSubscriptionPresenterImpl3.f79694m;
                if (dVar3 != null) {
                    dVar3.b();
                    break;
                }
                break;
            default:
                SellerNotificationsState sellerNotificationsState4 = SellerNotificationsState.f85636c;
                SellerSubscriptionItem sellerSubscriptionItem6 = this.f79771d;
                this.f79770c.p(sellerSubscriptionItem6.s3(sellerSubscriptionItem6.getF85536f(), sellerNotificationsState4));
                break;
        }
    }

    public /* synthetic */ r(SellerSubscriptionPresenterImpl sellerSubscriptionPresenterImpl, SellerSubscriptionItem sellerSubscriptionItem, int i12, boolean z12) {
        this.f79769b = i12;
        this.f79770c = sellerSubscriptionPresenterImpl;
        this.f79771d = sellerSubscriptionItem;
    }
}
