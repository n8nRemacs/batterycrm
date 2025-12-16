package com.avito.android.rating.details.converter;

import com.avito.android.di.InterfaceC30272y;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RatingDetailsReviewStatusConverter.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/converter/B;", "Lcom/avito/android/rating/details/converter/A;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* loaded from: classes16.dex */
public final class B implements A {
    @Inject
    public B() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // com.avito.android.rating.details.converter.A
    @Y61.k
    public final BaseRatingReviewItem.ReviewStatus a(@Y61.l String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -2016287450:
                    if (str.equals("moderation")) {
                        return BaseRatingReviewItem.ReviewStatus.f250326e;
                    }
                    break;
                case -424719401:
                    if (str.equals("arbitrageDeclined")) {
                        return BaseRatingReviewItem.ReviewStatus.f250329h;
                    }
                    break;
                case -21880626:
                    if (str.equals("arbitragePending")) {
                        return BaseRatingReviewItem.ReviewStatus.f250328g;
                    }
                    break;
                case 568196142:
                    if (str.equals("declined")) {
                        return BaseRatingReviewItem.ReviewStatus.f250325d;
                    }
                    break;
                case 1185244855:
                    if (str.equals("approved")) {
                        return BaseRatingReviewItem.ReviewStatus.f250327f;
                    }
                    break;
                case 1447404014:
                    if (str.equals("published")) {
                        return BaseRatingReviewItem.ReviewStatus.f250324c;
                    }
                    break;
            }
        }
        return BaseRatingReviewItem.ReviewStatus.f250323b;
    }
}
