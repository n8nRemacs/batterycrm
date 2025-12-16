package com.avito.android.review.report.mvi;

import androidx.compose.runtime.internal.P;
import cn0.AbstractC27229b;
import com.avito.android.arch.mvi.t;
import com.avito.android.review.report.mvi.entity.ComfortableDealReviewsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ComfortableDealReviewsOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/review/report/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/review/report/mvi/entity/ComfortableDealReviewsInternalAction;", "Lcn0/b;", "<init>", "()V", "_avito_comfortable-deal-reviews_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i implements t<ComfortableDealReviewsInternalAction, AbstractC27229b> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final AbstractC27229b b(ComfortableDealReviewsInternalAction comfortableDealReviewsInternalAction) {
        ComfortableDealReviewsInternalAction comfortableDealReviewsInternalAction2 = comfortableDealReviewsInternalAction;
        if (comfortableDealReviewsInternalAction2.equals(ComfortableDealReviewsInternalAction.BackPressed.f255413b)) {
            return AbstractC27229b.a.f58137a;
        }
        if (comfortableDealReviewsInternalAction2 instanceof ComfortableDealReviewsInternalAction.ReviewsLoaded) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
