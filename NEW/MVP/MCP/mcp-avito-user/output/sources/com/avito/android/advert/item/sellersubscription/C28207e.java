package com.avito.android.advert.item.sellersubscription;

import Ca.AbstractC13232a;
import com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionState;
import kotlin.Metadata;

/* compiled from: AdvertDetailsSellerSubscriptionPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert.item.sellersubscription.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28207e<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsSellerSubscriptionItem f79739b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C28208f f79740c;

    public C28207e(AdvertDetailsSellerSubscriptionItem advertDetailsSellerSubscriptionItem, C28208f c28208f) {
        this.f79739b = advertDetailsSellerSubscriptionItem;
        this.f79740c = c28208f;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        AdvertDetailsSellerSubscriptionItem advertDetailsSellerSubscriptionItem = this.f79739b;
        SellerSubscriptionState sellerSubscriptionState = advertDetailsSellerSubscriptionItem.f79665d;
        SellerSubscriptionState sellerSubscriptionState2 = SellerSubscriptionState.f85639b;
        C28208f c28208f = this.f79740c;
        if (sellerSubscriptionState == sellerSubscriptionState2) {
            c28208f.f79741b.accept(new AbstractC13232a.C0114a(advertDetailsSellerSubscriptionItem));
        } else {
            c28208f.f79741b.accept(new AbstractC13232a.b(advertDetailsSellerSubscriptionItem));
        }
    }
}
