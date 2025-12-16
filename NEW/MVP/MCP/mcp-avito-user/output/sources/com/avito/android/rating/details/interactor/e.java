package com.avito.android.rating.details.interactor;

import android.net.Uri;
import com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.rating_details_mvi.SearchParametersEntry;
import com.avito.android.remote.model.review_reply.DeleteBuyerReviewResult;
import com.avito.android.remote.model.review_reply.DeleteModelReviewResult;
import com.avito.android.remote.model.review_reply.DeleteReviewReplyResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: RatingDetailsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/interactor/e;", "", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface e {

    /* compiled from: RatingDetailsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.l
    Object a(long j12, @Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object b(long j12, @Y61.k Continuation<? super DeleteModelReviewResult> continuation);

    @Y61.l
    Object c(long j12, @Y61.k Continuation<? super TypedResult<DeleteReviewReplyResult>> continuation);

    @Y61.k
    InterfaceC43160i<RatingDetailsInternalAction> d(@Y61.k String str, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l String str2, @Y61.l Long l12);

    @Y61.l
    Object e(long j12, @Y61.k Continuation<? super DeleteBuyerReviewResult> continuation);

    @Y61.k
    InterfaceC43160i<RatingDetailsInternalAction> f(@Y61.k Uri uri);

    @Y61.k
    InterfaceC43160i<RatingDetailsInternalAction> g(@Y61.l List<? extends SearchParametersEntry.SearchParametersBlock> list, @Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l Long l12, @Y61.l String str5, boolean z12, boolean z13, @Y61.l List<Long> list2, @Y61.l List<String> list3, boolean z14, @Y61.l com.avito.android.rating.details.mvi.entity.a aVar, boolean z15);

    @Y61.k
    InterfaceC43160i<RatingDetailsInternalAction> h(long j12, long j13, @Y61.k BaseRatingReviewItem.ReviewAnswer reviewAnswer);
}
