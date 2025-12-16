package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.rating_details.ActionElement;
import com.avito.android.remote.model.rating_details.ButtonElement;
import com.avito.android.remote.model.rating_details.CommentElement;
import com.avito.android.remote.model.rating_details.InfoElement;
import com.avito.android.remote.model.rating_details.RatingDetailsElement;
import com.avito.android.remote.model.rating_details.RatingScoreElement;
import com.avito.android.remote.model.rating_details.RatingSummaryElement;
import com.avito.android.remote.model.rating_details.SearchParametersElement;
import com.avito.android.remote.model.rating_details.TextElement;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: RatingDetailsElementTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/RatingDetailsElementTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/remote/model/rating_details/RatingDetailsElement;", "<init>", "()V", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RatingDetailsElementTypeAdapter extends RuntimeTypeAdapter<RatingDetailsElement> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f254211a;

    public RatingDetailsElementTypeAdapter() {
        super(null, null, null, 7, null);
        this.f254211a = P0.g(new kotlin.Q(RequestReviewResultKt.INFO_TYPE, InfoElement.class), new kotlin.Q("rating", CommentElement.class), new kotlin.Q("action", ActionElement.class), new kotlin.Q("button", ButtonElement.class), new kotlin.Q("text", TextElement.class), new kotlin.Q("score", RatingScoreElement.class), new kotlin.Q("paramScoreSummary", RatingSummaryElement.class), new kotlin.Q("searchParameters", SearchParametersElement.class));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.Class<? extends com.avito.android.remote.model.rating_details.RatingDetailsElement>>] */
    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @Y61.k
    public final Map<String, Class<? extends RatingDetailsElement>> getMapping() {
        return this.f254211a;
    }
}
