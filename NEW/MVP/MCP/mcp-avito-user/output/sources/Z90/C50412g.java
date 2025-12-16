package z90;

import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: ProfileTabV1Response.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014¨\u0006\u001d"}, d2 = {"Lz90/g;", "", "Lz90/h;", "action", "", "badgeKey", "badgeText", "fromPage", "Lz90/i;", "icon", "title", TooltipAttribute.PARAM_DEEP_LINK, ContextActionHandler.Link.URL, "<init>", "(Lz90/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lz90/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lz90/h;", "a", "()Lz90/h;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "Lz90/i;", "e", "()Lz90/i;", "f", "getUri", "getUrl", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: z90.g, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C50412g {

    @com.google.gson.annotations.c("action")
    @Y61.l
    private final C50413h action;

    @com.google.gson.annotations.c("badgeKey")
    @Y61.l
    private final String badgeKey;

    @com.google.gson.annotations.c("badgeText")
    @Y61.l
    private final String badgeText;

    @com.google.gson.annotations.c("fromPage")
    @Y61.k
    private final String fromPage;

    @com.google.gson.annotations.c("icon")
    @Y61.l
    private final C50414i icon;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @Y61.l
    private final String uri;

    @com.google.gson.annotations.c(ContextActionHandler.Link.URL)
    @Y61.l
    private final String url;

    public C50412g(@Y61.l C50413h c50413h, @Y61.l String str, @Y61.l String str2, @Y61.k String str3, @Y61.l C50414i c50414i, @Y61.k String str4, @Y61.l String str5, @Y61.l String str6) {
        this.action = c50413h;
        this.badgeKey = str;
        this.badgeText = str2;
        this.fromPage = str3;
        this.icon = c50414i;
        this.title = str4;
        this.uri = str5;
        this.url = str6;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final C50413h getAction() {
        return this.action;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getBadgeKey() {
        return this.badgeKey;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getBadgeText() {
        return this.badgeText;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getFromPage() {
        return this.fromPage;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final C50414i getIcon() {
        return this.icon;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
