package hz0;

import com.avito.android.remote.model.AvatarStatus;
import kotlin.Metadata;

/* compiled from: Api2StrSellerOrdersListPostResponse.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lhz0/o;", "", "", "name", "picUrl", AvatarStatus.REVIEW, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "c", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class o {

    @com.google.gson.annotations.c("name")
    @Y61.l
    private final String name;

    @com.google.gson.annotations.c("picUrl")
    @Y61.l
    private final String picUrl;

    @com.google.gson.annotations.c(AvatarStatus.REVIEW)
    @Y61.l
    private final String review;

    public o(@Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
        this.name = str;
        this.picUrl = str2;
        this.review = str3;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getPicUrl() {
        return this.picUrl;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getReview() {
        return this.review;
    }
}
