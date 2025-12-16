package com.avito.android.rating.details.answer.photo;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.review_reply.AddReviewReplyResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: RatingAddAnswerInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/answer/photo/a;", "", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface a {
    @l
    Object a(long j12, @k String str, @k List<Long> list, @k Continuation<? super TypedResult<AddReviewReplyResult>> continuation);
}
