package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.rating_details_mvi.ActionEntry;
import com.avito.android.remote.model.rating_details_mvi.BadgeScoreEntry;
import com.avito.android.remote.model.rating_details_mvi.ButtonEntry;
import com.avito.android.remote.model.rating_details_mvi.BuyerReviewEntry;
import com.avito.android.remote.model.rating_details_mvi.InfoEntry;
import com.avito.android.remote.model.rating_details_mvi.ModelReviewEntry;
import com.avito.android.remote.model.rating_details_mvi.OldSearchParametersEntry;
import com.avito.android.remote.model.rating_details_mvi.PhotoGalleryEntry;
import com.avito.android.remote.model.rating_details_mvi.RatingAspectsEntry;
import com.avito.android.remote.model.rating_details_mvi.RatingDetailsEntry;
import com.avito.android.remote.model.rating_details_mvi.RatingLLMSummaryEntry;
import com.avito.android.remote.model.rating_details_mvi.RatingStatisticEntry;
import com.avito.android.remote.model.rating_details_mvi.RatingStatisticWithScoreEntry;
import com.avito.android.remote.model.rating_details_mvi.RatingSummaryEntry;
import com.avito.android.remote.model.rating_details_mvi.ReviewEntry;
import com.avito.android.remote.model.rating_details_mvi.SearchParametersEntry;
import com.avito.android.remote.model.rating_details_mvi.TextEntry;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: RatingDetailsEntryTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/RatingDetailsEntryTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/remote/model/rating_details_mvi/RatingDetailsEntry;", "<init>", "()V", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RatingDetailsEntryTypeAdapter extends RuntimeTypeAdapter<RatingDetailsEntry> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.collections.builders.d f254212a;

    public RatingDetailsEntryTypeAdapter() {
        super(null, null, null, 7, null);
        kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
        dVar.put("badgeScore", BadgeScoreEntry.class);
        dVar.put("score", RatingStatisticWithScoreEntry.class);
        dVar.put("ratingStatistic", RatingStatisticEntry.class);
        dVar.put("searchParameters", OldSearchParametersEntry.class);
        dVar.put("searchParametersV2", SearchParametersEntry.class);
        dVar.put("rating", ReviewEntry.class);
        dVar.put("seller", ReviewEntry.class);
        dVar.put("model", ModelReviewEntry.class);
        dVar.put("buyer", BuyerReviewEntry.class);
        dVar.put(RequestReviewResultKt.INFO_TYPE, InfoEntry.class);
        dVar.put("action", ActionEntry.class);
        dVar.put("button", ButtonEntry.class);
        dVar.put("text", TextEntry.class);
        dVar.put("paramScoreSummary", RatingSummaryEntry.class);
        dVar.put("photoGallery", PhotoGalleryEntry.class);
        dVar.put("llmSummary", RatingLLMSummaryEntry.class);
        dVar.put("aspects", RatingAspectsEntry.class);
        this.f254212a = dVar.b();
    }

    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @Y61.k
    public final Map<String, Type> getMapping() {
        return this.f254212a;
    }
}
