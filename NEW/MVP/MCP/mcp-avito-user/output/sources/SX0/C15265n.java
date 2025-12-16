package Sx0;

import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.Metadata;

/* compiled from: Api4StrOrderSellerByOrderIdGetResponse.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011¨\u0006\u0017"}, d2 = {"LSx0/n;", "", "", "download", "", "href", "redirect", "LSx0/o;", "toast", ContextActionHandler.Link.URL, "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;LSx0/o;Ljava/lang/String;)V", "Ljava/lang/Boolean;", "getDownload", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "getHref", "()Ljava/lang/String;", "a", "LSx0/o;", "getToast", "()LSx0/o;", "getUrl", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Sx0.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15265n {

    @com.google.gson.annotations.c("download")
    @Y61.l
    private final Boolean download;

    @com.google.gson.annotations.c("href")
    @Y61.l
    private final String href;

    @com.google.gson.annotations.c("redirect")
    @Y61.l
    private final String redirect;

    @com.google.gson.annotations.c("toast")
    @Y61.l
    private final C15266o toast;

    @com.google.gson.annotations.c(ContextActionHandler.Link.URL)
    @Y61.l
    private final String url;

    public C15265n(@Y61.l Boolean bool, @Y61.l String str, @Y61.l String str2, @Y61.l C15266o c15266o, @Y61.l String str3) {
        this.download = bool;
        this.href = str;
        this.redirect = str2;
        this.toast = c15266o;
        this.url = str3;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getRedirect() {
        return this.redirect;
    }
}
