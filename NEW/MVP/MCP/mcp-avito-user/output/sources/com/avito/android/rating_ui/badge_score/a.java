package com.avito.android.rating_ui.badge_score;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import kotlin.Metadata;

/* compiled from: BaseRatingBadgeScoreItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/badge_score/a;", "Lcom/avito/conveyor_item/a;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface a extends com.avito.conveyor_item.a {

    /* compiled from: BaseRatingBadgeScoreItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.rating_ui.badge_score.a$a, reason: collision with other inner class name */
    public static final class C7495a {
    }

    @Y61.l
    Float A();

    @Y61.k
    RatingItemsMarginHorizontal c();

    @Y61.l
    DeepLink getDeeplink();

    @Y61.k
    String s0();

    @Y61.k
    String w1();
}
