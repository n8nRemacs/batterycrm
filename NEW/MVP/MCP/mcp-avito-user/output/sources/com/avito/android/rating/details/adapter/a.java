package com.avito.android.rating.details.adapter;

import Y61.l;
import com.avito.android.rating.details.adapter.action.ActionItem;
import com.avito.android.rating.details.adapter.button.ButtonItem;
import com.avito.android.rating.details.adapter.seller.RatingDetailsReviewItem;
import com.avito.android.rating.details.adapter.summary.SummaryItem;
import com.avito.android.rating.details.adapter.text.TextItem;
import com.avito.android.rating_ui.info_with_hint.RatingInfoWithHintItem;
import com.avito.android.rating_ui.lmm_summary.RatingLLMSummaryItem;
import com.avito.android.rating_ui.reviews.model_review.RatingModelReviewItem;
import com.avito.android.rating_ui.score_with_statistic.RatingScoreWithStatisticItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingDetailsContentComparator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/adapter/a;", "Lcom/avito/android/recycler/data_aware/b;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.android.recycler.data_aware.b {
    @Inject
    public a() {
    }

    @Override // com.avito.android.recycler.data_aware.b
    public final boolean a(@l TV0.a aVar, @l TV0.a aVar2) {
        if ((aVar instanceof com.avito.android.rating_ui.badge_score.c) && (aVar2 instanceof com.avito.android.rating_ui.badge_score.c)) {
            com.avito.android.rating_ui.badge_score.c cVar = (com.avito.android.rating_ui.badge_score.c) aVar;
            com.avito.android.rating_ui.badge_score.c cVar2 = (com.avito.android.rating_ui.badge_score.c) aVar2;
            if (L.e(cVar.f249954c, cVar2.f249954c) && L.f(cVar.f249955d, cVar2.f249955d) && L.f(cVar.f249956e, cVar2.f249956e) && L.f(cVar.f249957f, cVar2.f249957f) && L.f(cVar.f249958g, cVar2.f249958g)) {
                return true;
            }
        } else if ((aVar instanceof RatingScoreWithStatisticItem) && (aVar2 instanceof RatingScoreWithStatisticItem)) {
            RatingScoreWithStatisticItem ratingScoreWithStatisticItem = (RatingScoreWithStatisticItem) aVar;
            RatingScoreWithStatisticItem ratingScoreWithStatisticItem2 = (RatingScoreWithStatisticItem) aVar2;
            if (L.e(ratingScoreWithStatisticItem.f250407c, ratingScoreWithStatisticItem2.f250407c) && L.e(ratingScoreWithStatisticItem.f250408d, ratingScoreWithStatisticItem2.f250408d) && L.f(ratingScoreWithStatisticItem.f250409e, ratingScoreWithStatisticItem2.f250409e) && L.f(ratingScoreWithStatisticItem.f250410f, ratingScoreWithStatisticItem2.f250410f) && L.f(ratingScoreWithStatisticItem.f250411g, ratingScoreWithStatisticItem2.f250411g) && L.f(ratingScoreWithStatisticItem.f250412h, ratingScoreWithStatisticItem2.f250412h)) {
                return true;
            }
        } else if ((aVar instanceof com.avito.android.rating_ui.statistic.b) && (aVar2 instanceof com.avito.android.rating_ui.statistic.b)) {
            com.avito.android.rating_ui.statistic.b bVar = (com.avito.android.rating_ui.statistic.b) aVar;
            com.avito.android.rating_ui.statistic.b bVar2 = (com.avito.android.rating_ui.statistic.b) aVar2;
            if (bVar.f250471c == bVar2.f250471c && L.f(bVar.f250472d, bVar2.f250472d) && L.f(bVar.f250473e, bVar2.f250473e)) {
                return true;
            }
        } else if ((aVar instanceof com.avito.android.rating_ui.aspects.a) && (aVar2 instanceof com.avito.android.rating_ui.aspects.a)) {
            com.avito.android.rating_ui.aspects.a aVar3 = (com.avito.android.rating_ui.aspects.a) aVar;
            com.avito.android.rating_ui.aspects.a aVar4 = (com.avito.android.rating_ui.aspects.a) aVar2;
            if (L.f(aVar3.f249856c, aVar4.f249856c) && L.f(aVar3.f249857d, aVar4.f249857d) && L.f(aVar3.f249858e, aVar4.f249858e) && aVar3.f249859f == aVar4.f249859f && aVar3.f249860g == aVar4.f249860g) {
                return true;
            }
        } else if ((aVar instanceof com.avito.android.rating_ui.sort.a) && (aVar2 instanceof com.avito.android.rating_ui.sort.a)) {
            com.avito.android.rating_ui.sort.a aVar5 = (com.avito.android.rating_ui.sort.a) aVar;
            com.avito.android.rating_ui.sort.a aVar6 = (com.avito.android.rating_ui.sort.a) aVar2;
            if (L.f(aVar5.f250430c, aVar6.f250430c) && aVar5.f250431d == aVar6.f250431d) {
                return true;
            }
        } else if ((aVar instanceof RatingInfoWithHintItem) && (aVar2 instanceof RatingInfoWithHintItem)) {
            RatingInfoWithHintItem ratingInfoWithHintItem = (RatingInfoWithHintItem) aVar;
            RatingInfoWithHintItem ratingInfoWithHintItem2 = (RatingInfoWithHintItem) aVar2;
            if (L.f(ratingInfoWithHintItem.f250020c, ratingInfoWithHintItem2.f250020c) && ratingInfoWithHintItem.f250021d == ratingInfoWithHintItem2.f250021d && L.f(ratingInfoWithHintItem.f250023f, ratingInfoWithHintItem2.f250023f) && L.f(ratingInfoWithHintItem.f250025h, ratingInfoWithHintItem2.f250025h) && ratingInfoWithHintItem.f250026i == ratingInfoWithHintItem2.f250026i && L.f(ratingInfoWithHintItem.f250027j, ratingInfoWithHintItem2.f250027j)) {
                return true;
            }
        } else if ((aVar instanceof ActionItem) && (aVar2 instanceof ActionItem)) {
            ActionItem actionItem = (ActionItem) aVar;
            ActionItem actionItem2 = (ActionItem) aVar2;
            if (L.f(actionItem.f246479c, actionItem2.f246479c) && L.f(actionItem.f246480d, actionItem2.f246480d)) {
                return true;
            }
        } else if ((aVar instanceof ButtonItem) && (aVar2 instanceof ButtonItem)) {
            ButtonItem buttonItem = (ButtonItem) aVar;
            ButtonItem buttonItem2 = (ButtonItem) aVar2;
            if (L.f(buttonItem.f246494c, buttonItem2.f246494c) && L.f(buttonItem.f246495d, buttonItem2.f246495d)) {
                return true;
            }
        } else {
            if ((aVar instanceof TextItem) && (aVar2 instanceof TextItem)) {
                return L.f(((TextItem) aVar).f246564c, ((TextItem) aVar2).f246564c);
            }
            if ((aVar instanceof SummaryItem) && (aVar2 instanceof SummaryItem)) {
                SummaryItem summaryItem = (SummaryItem) aVar;
                SummaryItem summaryItem2 = (SummaryItem) aVar2;
                if (L.f(summaryItem.f246540c, summaryItem2.f246540c) && L.f(summaryItem.f246541d, summaryItem2.f246541d) && L.f(summaryItem.f246542e, summaryItem2.f246542e) && L.f(summaryItem.f246543f, summaryItem2.f246543f)) {
                    return true;
                }
            } else if ((aVar instanceof RatingDetailsReviewItem) && (aVar2 instanceof RatingDetailsReviewItem)) {
                RatingDetailsReviewItem ratingDetailsReviewItem = (RatingDetailsReviewItem) aVar;
                RatingDetailsReviewItem ratingDetailsReviewItem2 = (RatingDetailsReviewItem) aVar2;
                if (L.f(ratingDetailsReviewItem.f246537y, ratingDetailsReviewItem2.f246537y) && L.f(ratingDetailsReviewItem.f246538z, ratingDetailsReviewItem2.f246538z) && L.f(ratingDetailsReviewItem.f246516A, ratingDetailsReviewItem2.f246516A) && L.f(ratingDetailsReviewItem.f246517B, ratingDetailsReviewItem2.f246517B) && ratingDetailsReviewItem.f246519D == ratingDetailsReviewItem2.f246519D && L.f(ratingDetailsReviewItem.f246520E, ratingDetailsReviewItem2.f246520E) && L.f(ratingDetailsReviewItem.f246521F, ratingDetailsReviewItem2.f246521F) && L.e(ratingDetailsReviewItem.f246522G, ratingDetailsReviewItem2.f246522G) && L.f(ratingDetailsReviewItem.f246523H, ratingDetailsReviewItem2.f246523H) && L.f(ratingDetailsReviewItem.f246524I, ratingDetailsReviewItem2.f246524I) && L.f(ratingDetailsReviewItem.f246525J, ratingDetailsReviewItem2.f246525J) && L.f(ratingDetailsReviewItem.f246526K, ratingDetailsReviewItem2.f246526K) && L.f(ratingDetailsReviewItem.f246527L, ratingDetailsReviewItem2.f246527L) && L.f(ratingDetailsReviewItem.f246528M, ratingDetailsReviewItem2.f246528M) && L.f(ratingDetailsReviewItem.f246529N, ratingDetailsReviewItem2.f246529N) && L.f(ratingDetailsReviewItem.f246530O, ratingDetailsReviewItem2.f246530O) && ratingDetailsReviewItem.f246531P == ratingDetailsReviewItem2.f246531P) {
                    return true;
                }
            } else if ((aVar instanceof RatingModelReviewItem) && (aVar2 instanceof RatingModelReviewItem)) {
                RatingModelReviewItem ratingModelReviewItem = (RatingModelReviewItem) aVar;
                RatingModelReviewItem ratingModelReviewItem2 = (RatingModelReviewItem) aVar2;
                if (L.f(ratingModelReviewItem.f250147c, ratingModelReviewItem2.f250147c) && L.f(ratingModelReviewItem.f250148d, ratingModelReviewItem2.f250148d) && L.f(ratingModelReviewItem.f250149e, ratingModelReviewItem2.f250149e) && ratingModelReviewItem.f250150f == ratingModelReviewItem2.f250150f && L.e(ratingModelReviewItem.f250151g, ratingModelReviewItem2.f250151g) && L.f(ratingModelReviewItem.f250152h, ratingModelReviewItem2.f250152h) && L.f(ratingModelReviewItem.f250153i, ratingModelReviewItem2.f250153i) && L.f(ratingModelReviewItem.f250154j, ratingModelReviewItem2.f250154j) && L.f(ratingModelReviewItem.f250155k, ratingModelReviewItem2.f250155k) && ratingModelReviewItem.f250156l == ratingModelReviewItem2.f250156l && L.f(ratingModelReviewItem.f250157m, ratingModelReviewItem2.f250157m) && L.f(ratingModelReviewItem.f250158n, ratingModelReviewItem2.f250158n) && L.f(ratingModelReviewItem.f250159o, ratingModelReviewItem2.f250159o) && L.f(ratingModelReviewItem.f250161q, ratingModelReviewItem2.f250161q) && L.f(ratingModelReviewItem.f250162r, ratingModelReviewItem2.f250162r) && L.f(ratingModelReviewItem.f250163s, ratingModelReviewItem2.f250163s)) {
                    return true;
                }
            } else if ((aVar instanceof RatingLLMSummaryItem) && (aVar2 instanceof RatingLLMSummaryItem)) {
                RatingLLMSummaryItem ratingLLMSummaryItem = (RatingLLMSummaryItem) aVar;
                RatingLLMSummaryItem ratingLLMSummaryItem2 = (RatingLLMSummaryItem) aVar2;
                if (L.f(ratingLLMSummaryItem.f250067h, ratingLLMSummaryItem2.f250067h) && L.f(ratingLLMSummaryItem.f250068i, ratingLLMSummaryItem2.f250068i) && L.f(ratingLLMSummaryItem.f250069j, ratingLLMSummaryItem2.f250069j) && L.f(ratingLLMSummaryItem.f250070k, ratingLLMSummaryItem2.f250070k) && ratingLLMSummaryItem.f250071l == ratingLLMSummaryItem2.f250071l) {
                    return true;
                }
            }
        }
        return false;
    }
}
