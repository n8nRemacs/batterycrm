package Zt0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: Api2ProfileTransactionsResponse.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017¨\u0006\u001e"}, d2 = {"LZt0/d;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "additionalText", "Lcom/avito/android/remote/model/Image;", "image", "", "subtitle", "title", "type", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, ContextActionHandler.Link.URL, "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/Image;", "b", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "e", "Lcom/avito/android/deep_linking/links/DeepLink;", "f", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getUrl", "_avito_service-booking-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zt0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19609d {

    @com.google.gson.annotations.c("additionalText")
    @k
    private final AttributedText additionalText;

    @com.google.gson.annotations.c("image")
    @k
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

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink uri;

    @com.google.gson.annotations.c(ContextActionHandler.Link.URL)
    @k
    private final String url;

    public C19609d(@k AttributedText attributedText, @k Image image, @k String str, @k String str2, @l String str3, @k DeepLink deepLink, @k String str4) {
        this.additionalText = attributedText;
        this.image = image;
        this.subtitle = str;
        this.title = str2;
        this.type = str3;
        this.uri = deepLink;
        this.url = str4;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final AttributedText getAdditionalText() {
        return this.additionalText;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }
}
