package com.avito.android.review.report.mvi;

import androidx.compose.runtime.internal.P;
import cn0.C27230c;
import com.avito.android.arch.mvi.u;
import com.avito.android.review.report.mvi.entity.ComfortableDealReviewsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ComfortableDealReviewsReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/review/report/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/review/report/mvi/entity/ComfortableDealReviewsInternalAction;", "Lcn0/c;", "<init>", "()V", "_avito_comfortable-deal-reviews_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k implements u<ComfortableDealReviewsInternalAction, C27230c> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C27230c a(ComfortableDealReviewsInternalAction comfortableDealReviewsInternalAction, C27230c c27230c) {
        ComfortableDealReviewsInternalAction comfortableDealReviewsInternalAction2 = comfortableDealReviewsInternalAction;
        C27230c c27230c2 = c27230c;
        if (comfortableDealReviewsInternalAction2.equals(ComfortableDealReviewsInternalAction.BackPressed.f255413b)) {
            return c27230c2;
        }
        if (comfortableDealReviewsInternalAction2 instanceof ComfortableDealReviewsInternalAction.ReviewsLoaded) {
            return new C27230c(c27230c2.f58139b, ((ComfortableDealReviewsInternalAction.ReviewsLoaded) comfortableDealReviewsInternalAction2).f255414b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
