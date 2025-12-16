package bG;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GetGigWorkerMotivationsResponse.kt */
@P
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b \b\u0007\u0018\u00002\u00020\u0001Bi\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b'\u0010 R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010!\u001a\u0004\b+\u0010#R\u001a\u0010\u0012\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010!\u001a\u0004\b,\u0010#¨\u0006-"}, d2 = {"LbG/d;", "", "LbG/e;", "actionButton", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "LbG/f;", "footerInfo", "", "isLocked", "", "price", "", "LbG/g;", "progress", "showBackgroundColor", "showError", "subtitle", "title", "<init>", "(LbG/e;Lcom/avito/android/deep_linking/links/DeepLink;LbG/f;ZLjava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "LbG/e;", "a", "()LbG/e;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "LbG/f;", "c", "()LbG/f;", "Z", "j", "()Z", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Ljava/util/List;", "e", "()Ljava/util/List;", "f", "Ljava/lang/Boolean;", "g", "()Ljava/lang/Boolean;", "h", "i", "_avito_gig_motivations-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d {

    @com.google.gson.annotations.c("actionButton")
    @l
    private final e actionButton;

    @com.google.gson.annotations.c(Constants.DEEPLINK)
    @k
    private final DeepLink deeplink;

    @com.google.gson.annotations.c("footerInfo")
    @l
    private final f footerInfo;

    @com.google.gson.annotations.c("isLocked")
    private final boolean isLocked;

    @com.google.gson.annotations.c("price")
    @l
    private final String price;

    @com.google.gson.annotations.c("progress")
    @l
    private final List<g> progress;

    @com.google.gson.annotations.c("showBackgroundColor")
    private final boolean showBackgroundColor;

    @com.google.gson.annotations.c("showError")
    @l
    private final Boolean showError;

    @com.google.gson.annotations.c("subtitle")
    @l
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public d(@l e eVar, @k DeepLink deepLink, @l f fVar, boolean z12, @l String str, @l List<g> list, boolean z13, @l Boolean bool, @l String str2, @k String str3) {
        this.actionButton = eVar;
        this.deeplink = deepLink;
        this.footerInfo = fVar;
        this.isLocked = z12;
        this.price = str;
        this.progress = list;
        this.showBackgroundColor = z13;
        this.showError = bool;
        this.subtitle = str2;
        this.title = str3;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final e getActionButton() {
        return this.actionButton;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final f getFooterInfo() {
        return this.footerInfo;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @l
    public final List<g> e() {
        return this.progress;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getShowBackgroundColor() {
        return this.showBackgroundColor;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final Boolean getShowError() {
        return this.showError;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: i, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getIsLocked() {
        return this.isLocked;
    }
}
