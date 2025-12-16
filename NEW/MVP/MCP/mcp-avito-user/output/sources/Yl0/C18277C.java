package Yl0;

import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.Metadata;

/* compiled from: ProfileItemsApiV13Response.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"LYl0/C;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "finishTime", "", "statusText", "statusTextColor", ContextActionHandler.Link.URL, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "getUrl", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Yl0.C, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C18277C {

    @com.google.gson.annotations.c(Constants.DEEPLINK)
    @Y61.l
    private final DeepLink deeplink;

    @com.google.gson.annotations.c("finishTime")
    @Y61.l
    private final Long finishTime;

    @com.google.gson.annotations.c("statusText")
    @Y61.k
    private final String statusText;

    @com.google.gson.annotations.c("statusTextColor")
    @Y61.l
    private final String statusTextColor;

    @com.google.gson.annotations.c(ContextActionHandler.Link.URL)
    @Y61.l
    private final String url;

    public C18277C(@Y61.l DeepLink deepLink, @Y61.l Long l12, @Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        this.deeplink = deepLink;
        this.finishTime = l12;
        this.statusText = str;
        this.statusTextColor = str2;
        this.url = str3;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final Long getFinishTime() {
        return this.finishTime;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getStatusText() {
        return this.statusText;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getStatusTextColor() {
        return this.statusTextColor;
    }
}
