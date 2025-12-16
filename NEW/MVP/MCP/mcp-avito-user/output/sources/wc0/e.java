package wC0;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiTariffCptInfoV3Response.kt */
@P
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LwC0/e;", "", "", "bottomSpacer", "LwC0/b;", "color", "", "LwC0/f;", "content", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "", "width", "<init>", "(Ljava/lang/Long;LwC0/b;Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Ljava/lang/Long;", "a", "()Ljava/lang/Long;", "LwC0/b;", "b", "()LwC0/b;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lcom/avito/android/deep_linking/links/DeepLink;", "d", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e {

    @com.google.gson.annotations.c("bottomSpacer")
    @Y61.l
    private final Long bottomSpacer;

    @com.google.gson.annotations.c("color")
    @Y61.l
    private final b color;

    @com.google.gson.annotations.c("content")
    @Y61.k
    private final List<f> content;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @Y61.l
    private final DeepLink uri;

    @com.google.gson.annotations.c("width")
    @Y61.l
    private final String width;

    public e(@Y61.l Long l12, @Y61.l b bVar, @Y61.k List<f> list, @Y61.l DeepLink deepLink, @Y61.l String str) {
        this.bottomSpacer = l12;
        this.color = bVar;
        this.content = list;
        this.uri = deepLink;
        this.width = str;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Long getBottomSpacer() {
        return this.bottomSpacer;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final b getColor() {
        return this.color;
    }

    @Y61.k
    public final List<f> c() {
        return this.content;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final String getWidth() {
        return this.width;
    }
}
