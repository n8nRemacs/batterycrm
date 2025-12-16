package com.avito.android.rating.details.interactor;

import android.net.Uri;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.rating_details_mvi.RatingDetailsResult;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: RatingDetailsDataSource.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating/details/interactor/c;", "", "Lcom/avito/android/rating/details/interactor/a;", "Lcom/avito/android/rating/details/interactor/b;", "Lcom/avito/android/rating/details/interactor/q;", "Lcom/avito/android/rating/details/interactor/r;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface c {
    @Y61.l
    Object a(@Y61.k Map<String, String> map, @Y61.l List<String> list, @Y61.k Continuation<? super TypedResult<RatingDetailsResult>> continuation);

    @Y61.l
    Object b(@Y61.k Uri uri, @Y61.k Continuation<? super TypedResult<RatingDetailsResult>> continuation);
}
