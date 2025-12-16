package com.avito.android.rating_ui.reviews.model_review;

import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RatingModelReviewItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BaseRatingReviewItem.ReviewAnswer f250178l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BaseRatingReviewItem.ReviewAnswer reviewAnswer) {
        super(0);
        this.f250178l = reviewAnswer;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f250178l.f250316o = true;
        return G0.f406611a;
    }
}
