package YP;

import Y61.k;
import Y61.l;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.DeliverySummarySlotKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CvPackagesResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, d2 = {"LYP/b;", "", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "price", "discount", DeliverySummarySlotKt.ORIGINAL_PRICE, "singlePrice", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "d", "b", "c", "e", "_avito_job_cv-packages_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b {

    @c(Constants.DEEPLINK)
    @k
    private final DeepLink deeplink;

    @c("discount")
    @l
    private final String discount;

    @c("original_price")
    @l
    private final String originalPrice;

    @c("price")
    @k
    private final String price;

    @c("single_price")
    @l
    private final String singlePrice;

    @c("title")
    @k
    private final String title;

    public b(@k String str, @k DeepLink deepLink, @k String str2, @l String str3, @l String str4, @l String str5) {
        this.title = str;
        this.deeplink = deepLink;
        this.price = str2;
        this.discount = str3;
        this.originalPrice = str4;
        this.singlePrice = str5;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getDiscount() {
        return this.discount;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getOriginalPrice() {
        return this.originalPrice;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getSinglePrice() {
        return this.singlePrice;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ b(String str, DeepLink deepLink, String str2, String str3, String str4, String str5, int i12, C42822w c42822w) {
        this(str, deepLink, str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? null : str5);
    }
}
