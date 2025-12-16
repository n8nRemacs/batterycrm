package com.avito.android.advert_details_items.sellerprofile;

import android.os.Bundle;
import com.avito.android.advert.item.W0;
import com.avito.android.advert_core.advert.b;
import com.avito.android.analytics_ratings_reviews.ReviewsOpenPageFrom;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: AdvertSellerPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert_details_items.sellerprofile.v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28291v<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W0 f85646b;

    public C28291v(W0 w02) {
        this.f85646b = w02;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        ReviewsOpenPageFrom.a aVar = ReviewsOpenPageFrom.f91254c;
        ReviewsOpenPageFrom.Item item = ReviewsOpenPageFrom.Item.f91256d;
        aVar.getClass();
        Bundle bundleB = ReviewsOpenPageFrom.a.b(item);
        b.a.a(this.f85646b, (DeepLink) obj, bundleB, 2);
    }
}
