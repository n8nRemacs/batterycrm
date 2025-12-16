package z90;

import com.avito.android.deep_linking.links.DeepLink;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ProfileTabV1Response.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010+\u001a\u0004\b,\u0010-R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001f\u001a\u0004\b.\u0010!¨\u0006/"}, d2 = {"Lz90/G;", "", "Lz90/a;", "aiAssistant", "Lz90/c;", "analytics", "", "hideNotificationsButton", "", "Lcom/avito/android/profile/pro/impl/generated/api/profile_tab_v_1/a;", "items", "", "message", "", "notificationsCount", "Lcom/avito/android/deep_linking/links/DeepLink;", "proDeclarationSuccessDeepLinkUri", "Lz90/L;", "sharing", "uxFeedbackDeepLinks", "<init>", "(Lz90/a;Lz90/c;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Lcom/avito/android/deep_linking/links/DeepLink;Lz90/L;Ljava/util/List;)V", "Lz90/a;", "a", "()Lz90/a;", "Lz90/c;", "b", "()Lz90/c;", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "Ljava/util/List;", "d", "()Ljava/util/List;", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "Ljava/lang/Long;", "getNotificationsCount", "()Ljava/lang/Long;", "Lcom/avito/android/deep_linking/links/DeepLink;", "e", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lz90/L;", "f", "()Lz90/L;", "g", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class G {

    @com.google.gson.annotations.c("aiAssistant")
    @Y61.l
    private final C50406a aiAssistant;

    @com.google.gson.annotations.c("analytics")
    @Y61.l
    private final C50408c analytics;

    @com.google.gson.annotations.c("hideNotificationsButton")
    @Y61.l
    private final Boolean hideNotificationsButton;

    @com.google.gson.annotations.c("items")
    @Y61.k
    private final List<com.avito.android.profile.pro.impl.generated.api.profile_tab_v_1.a> items;

    @com.google.gson.annotations.c("message")
    @Y61.l
    private final String message;

    @com.google.gson.annotations.c("notificationsCount")
    @Y61.l
    private final Long notificationsCount;

    @com.google.gson.annotations.c("proDeclarationSuccessDeepLinkUri")
    @Y61.l
    private final DeepLink proDeclarationSuccessDeepLinkUri;

    @com.google.gson.annotations.c("sharing")
    @Y61.l
    private final L sharing;

    @com.google.gson.annotations.c("uxFeedbackDeepLinks")
    @Y61.l
    private final List<DeepLink> uxFeedbackDeepLinks;

    /* JADX WARN: Multi-variable type inference failed */
    public G(@Y61.l C50406a c50406a, @Y61.l C50408c c50408c, @Y61.l Boolean bool, @Y61.k List<? extends com.avito.android.profile.pro.impl.generated.api.profile_tab_v_1.a> list, @Y61.l String str, @Y61.l Long l12, @Y61.l DeepLink deepLink, @Y61.l L l13, @Y61.l List<? extends DeepLink> list2) {
        this.aiAssistant = c50406a;
        this.analytics = c50408c;
        this.hideNotificationsButton = bool;
        this.items = list;
        this.message = str;
        this.notificationsCount = l12;
        this.proDeclarationSuccessDeepLinkUri = deepLink;
        this.sharing = l13;
        this.uxFeedbackDeepLinks = list2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final C50406a getAiAssistant() {
        return this.aiAssistant;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final C50408c getAnalytics() {
        return this.analytics;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final Boolean getHideNotificationsButton() {
        return this.hideNotificationsButton;
    }

    @Y61.k
    public final List<com.avito.android.profile.pro.impl.generated.api.profile_tab_v_1.a> d() {
        return this.items;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final DeepLink getProDeclarationSuccessDeepLinkUri() {
        return this.proDeclarationSuccessDeepLinkUri;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final L getSharing() {
        return this.sharing;
    }

    @Y61.l
    public final List<DeepLink> g() {
        return this.uxFeedbackDeepLinks;
    }
}
