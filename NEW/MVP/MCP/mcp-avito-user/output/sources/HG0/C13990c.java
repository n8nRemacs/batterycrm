package Hg0;

import com.avito.android.rating.generated.api.api_11_profile_ratings_get.ProfileRatingsResultV2RequestReviewAction;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api11ProfileRatingsGetResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LHg0/c;", "", "", "analytics", "", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d;", "entries", "nextPage", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/ProfileRatingsResultV2RequestReviewAction;", "requestReviewAction", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/ProfileRatingsResultV2RequestReviewAction;)V", "Ljava/lang/String;", "getAnalytics", "()Ljava/lang/String;", "Ljava/util/List;", "a", "()Ljava/util/List;", "b", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/ProfileRatingsResultV2RequestReviewAction;", "c", "()Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/ProfileRatingsResultV2RequestReviewAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Hg0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C13990c {

    @com.google.gson.annotations.c("analytics")
    @Y61.l
    private final String analytics;

    @com.google.gson.annotations.c("entries")
    @Y61.k
    private final List<com.avito.android.rating.generated.api.api_11_profile_ratings_get.d> entries;

    @com.google.gson.annotations.c("nextPage")
    @Y61.l
    private final String nextPage;

    @com.google.gson.annotations.c("requestReviewAction")
    @Y61.l
    private final ProfileRatingsResultV2RequestReviewAction requestReviewAction;

    /* JADX WARN: Multi-variable type inference failed */
    public C13990c(@Y61.l String str, @Y61.k List<? extends com.avito.android.rating.generated.api.api_11_profile_ratings_get.d> list, @Y61.l String str2, @Y61.l ProfileRatingsResultV2RequestReviewAction profileRatingsResultV2RequestReviewAction) {
        this.analytics = str;
        this.entries = list;
        this.nextPage = str2;
        this.requestReviewAction = profileRatingsResultV2RequestReviewAction;
    }

    @Y61.k
    public final List<com.avito.android.rating.generated.api.api_11_profile_ratings_get.d> a() {
        return this.entries;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getNextPage() {
        return this.nextPage;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final ProfileRatingsResultV2RequestReviewAction getRequestReviewAction() {
        return this.requestReviewAction;
    }
}
