package com.avito.android.advert.item;

import android.os.Bundle;
import com.avito.android.advert_core.advert.b;
import com.avito.android.analytics_ratings_reviews.ReviewsOpenPageFrom;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ModelCardLink;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.item_reviews.ItemReviews;
import kotlin.Metadata;

/* compiled from: AdvertDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/rating_ui/badge_score/b;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/rating_ui/badge_score/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert.item.n0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28151n0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28136i0 f77738b;

    public C28151n0(C28136i0 c28136i0) {
        this.f77738b = c28136i0;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        ItemReviews itemReviews;
        ItemReviews itemReviews2;
        com.avito.android.rating_ui.badge_score.b bVar = (com.avito.android.rating_ui.badge_score.b) obj;
        C28136i0 c28136i0 = this.f77738b;
        AdvertDetails advertDetailsN2 = c28136i0.n2();
        ItemReviews.Type type = null;
        ItemReviews.Type type2 = (advertDetailsN2 == null || (itemReviews2 = advertDetailsN2.getItemReviews()) == null) ? null : itemReviews2.getType();
        ItemReviews.Type type3 = ItemReviews.Type.HOTEL;
        DeepLink deepLink = bVar.f249952a;
        if (type2 == type3) {
            Z0 z02 = c28136i0.f76327Z0;
            if (z02 != null) {
                z02.g(null, deepLink, null);
                return;
            }
            return;
        }
        if (!c28136i0.f76366n.b()) {
            AdvertDetails advertDetailsN22 = c28136i0.n2();
            if (advertDetailsN22 != null && (itemReviews = advertDetailsN22.getItemReviews()) != null) {
                type = itemReviews.getType();
            }
            if (type != ItemReviews.Type.MODEL) {
                Z0 z03 = c28136i0.f76327Z0;
                if (z03 != null) {
                    AuthSource authSource = AuthSource.f92694c;
                    z03.m(deepLink, "reviews_score_clicked");
                    return;
                }
                return;
            }
        }
        ReviewsOpenPageFrom.ItemRating itemRating = ReviewsOpenPageFrom.ItemRating.f91258d;
        ReviewsOpenPageFrom.f91254c.getClass();
        Bundle bundleB = ReviewsOpenPageFrom.a.b(itemRating);
        if (c28136i0.t2()) {
            bundleB.putParcelable("from_tab", ModelCardLink.FromTab.ReviewTab.f133445b);
        }
        Z0 z04 = c28136i0.f76327Z0;
        if (z04 != null) {
            b.a.a(z04, deepLink, bundleB, 2);
        }
    }
}
