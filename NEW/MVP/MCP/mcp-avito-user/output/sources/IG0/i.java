package Ig0;

import kotlin.Metadata;

/* compiled from: Api9ProfileReviewsGetResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LIg0/i;", "", "Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/c;", "avatar", "", "title", "<init>", "(Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/c;Ljava/lang/String;)V", "Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/c;", "a", "()Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/c;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i {

    @com.google.gson.annotations.c("avatar")
    @Y61.k
    private final com.avito.android.rating.generated.api.api_9_profile_reviews_get.c avatar;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public i(@Y61.k com.avito.android.rating.generated.api.api_9_profile_reviews_get.c cVar, @Y61.k String str) {
        this.avatar = cVar;
        this.title = str;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final com.avito.android.rating.generated.api.api_9_profile_reviews_get.c getAvatar() {
        return this.avatar;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
