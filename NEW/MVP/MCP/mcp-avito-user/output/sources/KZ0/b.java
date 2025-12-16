package Kz0;

import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: Api3StrSellerOrdersCalendarPostResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"LKz0/b;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "LKz0/c;", "iconWithTooltip", "", "image", "title", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;LKz0/c;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "LKz0/c;", "b", "()LKz0/c;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b {

    @com.google.gson.annotations.c(Constants.DEEPLINK)
    @Y61.k
    private final DeepLink deeplink;

    @com.google.gson.annotations.c("iconWithTooltip")
    @Y61.l
    private final c iconWithTooltip;

    @com.google.gson.annotations.c("image")
    @Y61.k
    private final String image;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public b(@Y61.k DeepLink deepLink, @Y61.l c cVar, @Y61.k String str, @Y61.k String str2) {
        this.deeplink = deepLink;
        this.iconWithTooltip = cVar;
        this.image = str;
        this.title = str2;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final c getIconWithTooltip() {
        return this.iconWithTooltip;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
