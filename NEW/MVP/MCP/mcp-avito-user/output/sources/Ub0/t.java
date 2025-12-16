package UB0;

import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: ApiTariffCpxInfoV4Response.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LUB0/t;", "", "", "icon", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "c", "Lcom/avito/android/deep_linking/links/DeepLink;", "d", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class t {

    @com.google.gson.annotations.c("icon")
    @Y61.l
    private final String icon;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @Y61.l
    private final String style;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @Y61.k
    private final DeepLink uri;

    public t(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.k DeepLink deepLink) {
        this.icon = str;
        this.style = str2;
        this.title = str3;
        this.uri = deepLink;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }
}
