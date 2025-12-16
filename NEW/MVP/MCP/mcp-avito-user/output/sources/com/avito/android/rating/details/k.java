package com.avito.android.rating.details;

import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RatingDetailsFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/rating_ui/reviews/review/BaseRatingReviewItem$ReviewAction;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/rating_ui/reviews/review/BaseRatingReviewItem$ReviewAction;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class k extends N implements Y41.l<BaseRatingReviewItem.ReviewAction, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.rating_ui.reviews_options.c f247175l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ RatingDetailsFragment f247176m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ BaseRatingReviewItem f247177n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ BaseRatingReviewItem.ReviewAction f247178o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.avito.android.rating_ui.reviews_options.c cVar, RatingDetailsFragment ratingDetailsFragment, BaseRatingReviewItem baseRatingReviewItem, BaseRatingReviewItem.ReviewAction reviewAction) {
        super(1);
        this.f247175l = cVar;
        this.f247176m = ratingDetailsFragment;
        this.f247177n = baseRatingReviewItem;
        this.f247178o = reviewAction;
    }

    @Override // Y41.l
    public final G0 invoke(BaseRatingReviewItem.ReviewAction reviewAction) {
        RatingDetailsFragment ratingDetailsFragment = this.f247176m;
        com.avito.android.leasing_calculator.view.k kVar = new com.avito.android.leasing_calculator.view.k(ratingDetailsFragment, this.f247177n, this.f247178o, 2);
        com.avito.android.rating_ui.reviews_options.c cVar = this.f247175l;
        cVar.setOnDismissListener(kVar);
        cVar.r();
        ratingDetailsFragment.f246438P0 = null;
        return G0.f406611a;
    }
}
