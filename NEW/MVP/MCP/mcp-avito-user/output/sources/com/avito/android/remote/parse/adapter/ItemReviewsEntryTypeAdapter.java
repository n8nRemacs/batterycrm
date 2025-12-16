package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.item_reviews.BadgeScoreEntry;
import com.avito.android.remote.model.item_reviews.CommonModelRatingEntry;
import com.avito.android.remote.model.item_reviews.GalleryEntry;
import com.avito.android.remote.model.item_reviews.ItemReviewsEntry;
import com.avito.android.remote.model.item_reviews.RatingAttributedTextEntry;
import com.avito.android.remote.model.item_reviews.RatingBannerEntry;
import com.avito.android.remote.model.item_reviews.RatingButtonEntry;
import com.avito.android.remote.model.item_reviews.RatingEntry;
import com.avito.android.remote.model.item_reviews.RatingInfoEntry;
import com.avito.android.remote.model.item_reviews.RatingLLMSummaryEntry;
import com.avito.android.remote.model.item_reviews.RatingStatisticEntry;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.my.tracker.ads.AdFormat;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: ItemReviewsEntryTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/ItemReviewsEntryTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/remote/model/item_reviews/ItemReviewsEntry;", "<init>", "()V", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ItemReviewsEntryTypeAdapter extends RuntimeTypeAdapter<ItemReviewsEntry> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f254190a;

    public ItemReviewsEntryTypeAdapter() {
        super(null, null, null, 7, null);
        this.f254190a = P0.g(new kotlin.Q("rating", RatingEntry.class), new kotlin.Q("reviewSeller", RatingEntry.class), new kotlin.Q("reviewModel", CommonModelRatingEntry.class), new kotlin.Q("badgeScore", BadgeScoreEntry.class), new kotlin.Q("ratingStatistic", RatingStatisticEntry.class), new kotlin.Q("attributedText", RatingAttributedTextEntry.class), new kotlin.Q(RequestReviewResultKt.INFO_TYPE, RatingInfoEntry.class), new kotlin.Q("button", RatingButtonEntry.class), new kotlin.Q("photoGallery", GalleryEntry.class), new kotlin.Q("llmSummary", RatingLLMSummaryEntry.class), new kotlin.Q(AdFormat.BANNER, RatingBannerEntry.class));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.Class<? extends com.avito.android.remote.model.item_reviews.ItemReviewsEntry>>] */
    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @Y61.k
    public final Map<String, Class<? extends ItemReviewsEntry>> getMapping() {
        return this.f254190a;
    }
}
