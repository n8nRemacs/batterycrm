package com.avito.android.rating_ui.score_with_statistic;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RatingScoreWithStatisticItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_ui/score_with_statistic/f;", "Lcom/avito/android/rating_ui/score_with_statistic/e;", "<init>", "()V", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements e {
    @Inject
    public f() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        RatingScoreWithStatisticItem ratingScoreWithStatisticItem = (RatingScoreWithStatisticItem) aVar;
        hVar.E(ratingScoreWithStatisticItem.f250414j);
        Float f12 = ratingScoreWithStatisticItem.f250407c;
        Float f13 = ratingScoreWithStatisticItem.f250408d;
        hVar.vc(f13 == null ? f12 : f13);
        if (f13 != null || f12 != null) {
            hVar.T(ratingScoreWithStatisticItem.f250410f);
        }
        hVar.ny(ratingScoreWithStatisticItem.f250412h);
    }
}
