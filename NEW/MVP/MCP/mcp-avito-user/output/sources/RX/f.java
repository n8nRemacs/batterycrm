package RX;

import Y61.k;
import Y61.l;
import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: Api1MandatoryVerificationPostResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"LRX/f;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "icon", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "text", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f {

    @com.google.gson.annotations.c(Constants.DEEPLINK)
    @l
    private final DeepLink deeplink;

    @com.google.gson.annotations.c("icon")
    @l
    private final String icon;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @k
    private final String style;

    @com.google.gson.annotations.c("text")
    @k
    private final String text;

    public f(@l DeepLink deepLink, @l String str, @k String str2, @k String str3) {
        this.deeplink = deepLink;
        this.icon = str;
        this.style = str2;
        this.text = str3;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getText() {
        return this.text;
    }
}
