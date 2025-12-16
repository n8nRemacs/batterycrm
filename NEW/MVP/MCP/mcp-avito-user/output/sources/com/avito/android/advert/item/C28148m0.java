package com.avito.android.advert.item;

import android.os.Bundle;
import com.avito.android.advert_core.advert.b;
import com.avito.android.analytics_ratings_reviews.ReviewsOpenPageFrom;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ModelCardLink;
import kotlin.Metadata;

/* compiled from: AdvertDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/rating_ui/button/a;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/rating_ui/button/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert.item.m0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28148m0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28136i0 f77457b;

    public C28148m0(C28136i0 c28136i0) {
        this.f77457b = c28136i0;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        DeepLink deepLink = ((com.avito.android.rating_ui.button.a) obj).f249986a.getDeepLink();
        if (deepLink != null) {
            C28136i0 c28136i0 = this.f77457b;
            c28136i0.getClass();
            ReviewsOpenPageFrom.ItemAllReviews itemAllReviews = ReviewsOpenPageFrom.ItemAllReviews.f91257d;
            ReviewsOpenPageFrom.f91254c.getClass();
            Bundle bundleB = ReviewsOpenPageFrom.a.b(itemAllReviews);
            if (c28136i0.t2()) {
                bundleB.putParcelable("from_tab", ModelCardLink.FromTab.ReviewTab.f133445b);
            }
            Z0 z02 = c28136i0.f76327Z0;
            if (z02 != null) {
                b.a.a(z02, deepLink, bundleB, 2);
            }
        }
    }
}
