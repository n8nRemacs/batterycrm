package com.avito.android.advert_details_items.sellerprofile;

import Ca.AbstractC13232a;
import com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionState;
import kotlin.Metadata;

/* compiled from: AdvertSellerPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert_details_items.sellerprofile.m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28283m<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f85627b;

    public C28283m(D d12) {
        this.f85627b = d12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        D d12 = this.f85627b;
        AdvertDetailsSellerProfileItem advertDetailsSellerProfileItem = d12.f85557o;
        if (advertDetailsSellerProfileItem == null) {
            return;
        }
        SellerSubscriptionState sellerSubscriptionState = SellerSubscriptionState.f85639b;
        SellerSubscriptionState sellerSubscriptionState2 = advertDetailsSellerProfileItem.f85536f;
        l41.g<AbstractC13232a> gVar = d12.f85547e;
        if (sellerSubscriptionState2 == sellerSubscriptionState) {
            gVar.accept(new AbstractC13232a.C0114a(advertDetailsSellerProfileItem));
        } else {
            gVar.accept(new AbstractC13232a.b(advertDetailsSellerProfileItem));
        }
    }
}
