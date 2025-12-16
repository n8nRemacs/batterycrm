package bu0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ActiveBooking.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016¨\u0006\u001c"}, d2 = {"Lbu0/a;", "", "Lcom/avito/android/remote/model/Image;", "image", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "additionalText", "subtitle", "type", "<init>", "(Lcom/avito/android/remote/model/Image;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "getAdditionalText", "()Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "getType", "_avito_service-booking-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bu0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C25716a {

    @com.google.gson.annotations.c("additionalText")
    @l
    private final AttributedText additionalText;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink deepLink;

    @com.google.gson.annotations.c("image")
    @l
    private final Image image;

    @com.google.gson.annotations.c("subtitle")
    @k
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("type")
    @l
    private final String type;

    public C25716a(@l Image image, @k DeepLink deepLink, @k String str, @l AttributedText attributedText, @k String str2, @l String str3) {
        this.image = image;
        this.deepLink = deepLink;
        this.title = str;
        this.additionalText = attributedText;
        this.subtitle = str2;
        this.type = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25716a)) {
            return false;
        }
        C25716a c25716a = (C25716a) obj;
        return L.f(this.image, c25716a.image) && L.f(this.deepLink, c25716a.deepLink) && L.f(this.title, c25716a.title) && L.f(this.additionalText, c25716a.additionalText) && L.f(this.subtitle, c25716a.subtitle) && L.f(this.type, c25716a.type);
    }

    public final int hashCode() {
        Image image = this.image;
        int iD2 = H.d(com.avito.android.actions_sheet.a.e(this.deepLink, (image == null ? 0 : image.hashCode()) * 31, 31), 31, this.title);
        AttributedText attributedText = this.additionalText;
        int iD3 = H.d((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.subtitle);
        String str = this.type;
        return iD3 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActiveBooking(image=");
        sb2.append(this.image);
        sb2.append(", deepLink=");
        sb2.append(this.deepLink);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", additionalText=");
        sb2.append(this.additionalText);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", type=");
        return C22026a.c(sb2, this.type, ')');
    }
}
