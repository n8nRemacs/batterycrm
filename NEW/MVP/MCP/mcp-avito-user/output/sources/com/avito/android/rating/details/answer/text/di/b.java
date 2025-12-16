package com.avito.android.rating.details.answer.text.di;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.rating.details.answer.text.RatingAddAnswerTextFragment;
import com.avito.android.ratings.RatingActionAnswerLengthValidationData;
import h31.d;
import kotlin.Metadata;

/* compiled from: RatingAddAnswerTextComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/details/answer/text/di/b;", "", "a", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes16.dex */
public interface b {

    /* compiled from: RatingAddAnswerTextComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/answer/text/di/b$a;", "", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@h31.b @l Long l12, @h31.b @l RatingActionAnswerLengthValidationData ratingActionAnswerLengthValidationData, @h31.b @k String str, @h31.b @k C28478k c28478k, @k com.avito.android.rating.details.answer.di.c cVar, @h31.b boolean z12);
    }

    void a(@k RatingAddAnswerTextFragment ratingAddAnswerTextFragment);
}
