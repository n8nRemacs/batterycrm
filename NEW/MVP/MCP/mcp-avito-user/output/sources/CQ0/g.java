package cQ0;

import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GetProfileAboutV3Response.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b \u0018\u00002\u00020\u0001Bi\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b'\u0010 R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010!\u001a\u0004\b+\u0010#R\u001a\u0010\u0012\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010!\u001a\u0004\b,\u0010#¨\u0006-"}, d2 = {"LcQ0/g;", "", "LcQ0/h;", "actionButton", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "LcQ0/i;", "footerInfo", "", "isLocked", "", "price", "", "LcQ0/j;", "progress", "showBackgroundColor", "showError", "subtitle", "title", "<init>", "(LcQ0/h;Lcom/avito/android/deep_linking/links/DeepLink;LcQ0/i;ZLjava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "LcQ0/h;", "a", "()LcQ0/h;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "LcQ0/i;", "c", "()LcQ0/i;", "Z", "j", "()Z", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Ljava/util/List;", "e", "()Ljava/util/List;", "f", "Ljava/lang/Boolean;", "g", "()Ljava/lang/Boolean;", "h", "i", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g {

    @com.google.gson.annotations.c("actionButton")
    @Y61.l
    private final h actionButton;

    @com.google.gson.annotations.c(Constants.DEEPLINK)
    @Y61.k
    private final DeepLink deeplink;

    @com.google.gson.annotations.c("footerInfo")
    @Y61.l
    private final i footerInfo;

    @com.google.gson.annotations.c("isLocked")
    private final boolean isLocked;

    @com.google.gson.annotations.c("price")
    @Y61.l
    private final String price;

    @com.google.gson.annotations.c("progress")
    @Y61.l
    private final List<j> progress;

    @com.google.gson.annotations.c("showBackgroundColor")
    private final boolean showBackgroundColor;

    @com.google.gson.annotations.c("showError")
    @Y61.l
    private final Boolean showError;

    @com.google.gson.annotations.c("subtitle")
    @Y61.l
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public g(@Y61.l h hVar, @Y61.k DeepLink deepLink, @Y61.l i iVar, boolean z12, @Y61.l String str, @Y61.l List<j> list, boolean z13, @Y61.l Boolean bool, @Y61.l String str2, @Y61.k String str3) {
        this.actionButton = hVar;
        this.deeplink = deepLink;
        this.footerInfo = iVar;
        this.isLocked = z12;
        this.price = str;
        this.progress = list;
        this.showBackgroundColor = z13;
        this.showError = bool;
        this.subtitle = str2;
        this.title = str3;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final h getActionButton() {
        return this.actionButton;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final i getFooterInfo() {
        return this.footerInfo;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @Y61.l
    public final List<j> e() {
        return this.progress;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getShowBackgroundColor() {
        return this.showBackgroundColor;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final Boolean getShowError() {
        return this.showError;
    }

    @Y61.l
    /* renamed from: h, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Y61.k
    /* renamed from: i, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getIsLocked() {
        return this.isLocked;
    }
}
