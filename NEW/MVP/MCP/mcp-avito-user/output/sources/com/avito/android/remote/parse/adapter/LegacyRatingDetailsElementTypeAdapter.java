package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.rating_details_legacy.ActionElement;
import com.avito.android.remote.model.rating_details_legacy.ButtonElement;
import com.avito.android.remote.model.rating_details_legacy.CommentElement;
import com.avito.android.remote.model.rating_details_legacy.RatingDetailsElement;
import com.avito.android.remote.model.rating_details_legacy.RatingScoreElement;
import com.avito.android.remote.model.rating_details_legacy.TextElement;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: LegacyRatingDetailsElementTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/LegacyRatingDetailsElementTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/remote/model/rating_details_legacy/RatingDetailsElement;", "<init>", "()V", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LegacyRatingDetailsElementTypeAdapter extends RuntimeTypeAdapter<RatingDetailsElement> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f254191a;

    public LegacyRatingDetailsElementTypeAdapter() {
        super(null, null, null, 7, null);
        this.f254191a = P0.g(new kotlin.Q("rating", CommentElement.class), new kotlin.Q("action", ActionElement.class), new kotlin.Q("button", ButtonElement.class), new kotlin.Q("text", TextElement.class), new kotlin.Q("score", RatingScoreElement.class));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.Class<? extends com.avito.android.remote.model.rating_details_legacy.RatingDetailsElement>>] */
    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @Y61.k
    public final Map<String, Class<? extends RatingDetailsElement>> getMapping() {
        return this.f254191a;
    }
}
