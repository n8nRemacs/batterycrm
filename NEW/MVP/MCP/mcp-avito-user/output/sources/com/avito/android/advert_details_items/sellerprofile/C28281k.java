package com.avito.android.advert_details_items.sellerprofile;

import com.avito.android.advert.item.W0;
import com.avito.android.advert_core.advert.b;
import com.avito.android.advert_core.sellerprofile.ShowSellersProfileSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertSeller;
import kotlin.Metadata;

/* compiled from: AdvertSellerPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert_details_items.sellerprofile.k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28281k<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f85624b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S9.a f85625c;

    public C28281k(D d12, S9.a aVar) {
        this.f85624b = d12;
        this.f85625c = aVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        AdvertSeller seller;
        DeepLink link;
        ShowSellersProfileSource f85561b = this.f85625c.getF83219y();
        D d12 = this.f85624b;
        AdvertDetails advertDetails = d12.f85554l;
        if (advertDetails == null || (seller = advertDetails.getSeller()) == null || (link = seller.getLink()) == null) {
            return;
        }
        AdvertDetails advertDetails2 = d12.f85554l;
        if (advertDetails2 != null) {
            d12.f85546d.W6(advertDetails2, f85561b);
        }
        W0 w02 = d12.f85555m;
        if (w02 != null) {
            b.a.a(w02, link, null, 6);
        }
    }
}
