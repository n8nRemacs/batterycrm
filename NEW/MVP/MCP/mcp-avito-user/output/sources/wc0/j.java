package wC0;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: ApiTariffCptInfoV3Response.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LwC0/j;", "", "LwC0/k;", "icon", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(LwC0/k;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;)V", "LwC0/k;", "a", "()LwC0/k;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j {

    @com.google.gson.annotations.c("icon")
    @Y61.l
    private final k icon;

    @com.google.gson.annotations.c("text")
    @Y61.k
    private final AttributedText text;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @Y61.l
    private final DeepLink uri;

    public j(@Y61.l k kVar, @Y61.k AttributedText attributedText, @Y61.l DeepLink deepLink) {
        this.icon = kVar;
        this.text = attributedText;
        this.uri = deepLink;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final k getIcon() {
        return this.icon;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }
}
