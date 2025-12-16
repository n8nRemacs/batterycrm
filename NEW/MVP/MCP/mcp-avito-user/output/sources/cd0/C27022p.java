package cD0;

import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffUpsellInfo.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LcD0/p;", "", "Lcom/avito/android/remote/model/UniversalColor;", "color", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/remote/model/UniversalColor;", "a", "()Lcom/avito/android/remote/model/UniversalColor;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/UniversalImage;", "c", "()Lcom/avito/android/remote/model/UniversalImage;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cD0.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C27022p {

    @com.google.gson.annotations.c("color")
    @Y61.k
    private final UniversalColor color;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @Y61.l
    private final DeepLink deeplink;

    @com.google.gson.annotations.c("image")
    @Y61.k
    private final UniversalImage image;

    @com.google.gson.annotations.c("text")
    @Y61.k
    private final AttributedText text;

    public C27022p(@Y61.k UniversalColor universalColor, @Y61.k AttributedText attributedText, @Y61.k UniversalImage universalImage, @Y61.l DeepLink deepLink) {
        this.color = universalColor;
        this.text = attributedText;
        this.image = universalImage;
        this.deeplink = deepLink;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final UniversalColor getColor() {
        return this.color;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27022p)) {
            return false;
        }
        C27022p c27022p = (C27022p) obj;
        return L.f(this.color, c27022p.color) && L.f(this.text, c27022p.text) && L.f(this.image, c27022p.image) && L.f(this.deeplink, c27022p.deeplink);
    }

    public final int hashCode() {
        int iA2 = com.avito.android.actions_sheet.a.a(com.avito.android.actions_sheet.a.b(this.color.hashCode() * 31, 31, this.text), 31, this.image);
        DeepLink deepLink = this.deeplink;
        return iA2 + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffUpsellBanner(color=");
        sb2.append(this.color);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.deeplink, ')');
    }
}
