package dC0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpxLevel.kt */
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LdC0/g;", "", "Lcom/avito/android/remote/model/UniversalImage;", "icon", "", "name", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "isEnabled", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;Z)V", "Lcom/avito/android/remote/model/UniversalImage;", "c", "()Lcom/avito/android/remote/model/UniversalImage;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Z", "e", "()Z", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dC0.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C39565g {

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink deeplink;

    @com.google.gson.annotations.c("description")
    @l
    private final AttributedText description;

    @com.google.gson.annotations.c("icon")
    @k
    private final UniversalImage icon;

    @com.google.gson.annotations.c("isEnabled")
    private final boolean isEnabled;

    @com.google.gson.annotations.c("name")
    @k
    private final String name;

    public C39565g(@k UniversalImage universalImage, @k String str, @l AttributedText attributedText, @l DeepLink deepLink, boolean z12) {
        this.icon = universalImage;
        this.name = str;
        this.description = attributedText;
        this.deeplink = deepLink;
        this.isEnabled = z12;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final UniversalImage getIcon() {
        return this.icon;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39565g)) {
            return false;
        }
        C39565g c39565g = (C39565g) obj;
        return L.f(this.icon, c39565g.icon) && L.f(this.name, c39565g.name) && L.f(this.description, c39565g.description) && L.f(this.deeplink, c39565g.deeplink) && this.isEnabled == c39565g.isEnabled;
    }

    public final int hashCode() {
        int iD2 = H.d(this.icon.hashCode() * 31, 31, this.name);
        AttributedText attributedText = this.description;
        int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        DeepLink deepLink = this.deeplink;
        return Boolean.hashCode(this.isEnabled) + ((iHashCode + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CpxLevelFeature(icon=");
        sb2.append(this.icon);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", deeplink=");
        sb2.append(this.deeplink);
        sb2.append(", isEnabled=");
        return r.x(sb2, this.isEnabled, ')');
    }
}
