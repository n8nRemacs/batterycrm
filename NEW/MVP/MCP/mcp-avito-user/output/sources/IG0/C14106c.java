package Ig0;

import java.util.List;
import kotlin.Metadata;

/* compiled from: Api9ProfileReviewsGetResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LIg0/c;", "", "LIg0/d;", "emptyState", "", "Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/b;", "entries", "", "nextPage", "<init>", "(LIg0/d;Ljava/util/List;Ljava/lang/String;)V", "LIg0/d;", "a", "()LIg0/d;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ig0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C14106c {

    @com.google.gson.annotations.c("emptyState")
    @Y61.l
    private final C14107d emptyState;

    @com.google.gson.annotations.c("entries")
    @Y61.k
    private final List<com.avito.android.rating.generated.api.api_9_profile_reviews_get.b> entries;

    @com.google.gson.annotations.c("nextPage")
    @Y61.l
    private final String nextPage;

    /* JADX WARN: Multi-variable type inference failed */
    public C14106c(@Y61.l C14107d c14107d, @Y61.k List<? extends com.avito.android.rating.generated.api.api_9_profile_reviews_get.b> list, @Y61.l String str) {
        this.emptyState = c14107d;
        this.entries = list;
        this.nextPage = str;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final C14107d getEmptyState() {
        return this.emptyState;
    }

    @Y61.k
    public final List<com.avito.android.rating.generated.api.api_9_profile_reviews_get.b> b() {
        return this.entries;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getNextPage() {
        return this.nextPage;
    }
}
