package z90;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: ProfileTabV1Response.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u001d\u0010\u0012R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lz90/A;", "", "", "badgeText", "", "notificationsCount", "Lz90/B;", "tfaSettings", "type", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, ContextActionHandler.Link.URL, "Lcom/avito/android/remote/model/text/AttributedText;", "value", "<init>", "(Ljava/lang/String;JLz90/B;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "J", "b", "()J", "Lz90/B;", "getTfaSettings", "()Lz90/B;", "c", "Lcom/avito/android/deep_linking/links/DeepLink;", "d", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getUrl", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: z90.A, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C50405A {

    @com.google.gson.annotations.c("badgeText")
    @Y61.l
    private final String badgeText;

    @com.google.gson.annotations.c("notificationsCount")
    private final long notificationsCount;

    @com.google.gson.annotations.c("tfaSettings")
    @Y61.l
    private final B tfaSettings;

    @com.google.gson.annotations.c("type")
    @Y61.k
    private final String type;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @Y61.l
    private final DeepLink uri;

    @com.google.gson.annotations.c(ContextActionHandler.Link.URL)
    @Y61.l
    private final String url;

    @com.google.gson.annotations.c("value")
    @Y61.k
    private final AttributedText value;

    public C50405A(@Y61.l String str, long j12, @Y61.l B b12, @Y61.k String str2, @Y61.l DeepLink deepLink, @Y61.l String str3, @Y61.k AttributedText attributedText) {
        this.badgeText = str;
        this.notificationsCount = j12;
        this.tfaSettings = b12;
        this.type = str2;
        this.uri = deepLink;
        this.url = str3;
        this.value = attributedText;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getBadgeText() {
        return this.badgeText;
    }

    /* renamed from: b, reason: from getter */
    public final long getNotificationsCount() {
        return this.notificationsCount;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final AttributedText getValue() {
        return this.value;
    }
}
