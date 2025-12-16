package cb0;

import Y61.k;
import Y61.l;
import com.adjust.sdk.Constants;
import kotlin.Metadata;

/* compiled from: ServicesSellerTypeOptionsListResponse.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001f\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b#\u0010!R\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b'\u0010\u0018R\u001a\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b(\u0010\u0018¨\u0006)"}, d2 = {"Lcb0/b;", "", "Lcb0/c;", "confirmBlock", "", Constants.DEEPLINK, "Lcb0/d;", "details", "", "enabled", "", "groupId", "selected", "sellerSubtype", "sellerType", "subtitle", "title", "<init>", "(Lcb0/c;Ljava/lang/String;Lcb0/d;ZLjava/lang/Long;ZLjava/lang/Long;JLjava/lang/String;Ljava/lang/String;)V", "Lcb0/c;", "a", "()Lcb0/c;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcb0/d;", "getDetails", "()Lcb0/d;", "Z", "c", "()Z", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "e", "f", "J", "g", "()J", "h", "i", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cb0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C27158b {

    @com.google.gson.annotations.c("confirmBlock")
    @l
    private final C27159c confirmBlock;

    @com.google.gson.annotations.c(Constants.DEEPLINK)
    @l
    private final String deeplink;

    @com.google.gson.annotations.c("details")
    @l
    private final C27160d details;

    @com.google.gson.annotations.c("enabled")
    private final boolean enabled;

    @com.google.gson.annotations.c("groupId")
    @l
    private final Long groupId;

    @com.google.gson.annotations.c("selected")
    private final boolean selected;

    @com.google.gson.annotations.c("sellerSubtype")
    @l
    private final Long sellerSubtype;

    @com.google.gson.annotations.c("sellerType")
    private final long sellerType;

    @com.google.gson.annotations.c("subtitle")
    @k
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public C27158b(@l C27159c c27159c, @l String str, @l C27160d c27160d, boolean z12, @l Long l12, boolean z13, @l Long l13, long j12, @k String str2, @k String str3) {
        this.confirmBlock = c27159c;
        this.deeplink = str;
        this.details = c27160d;
        this.enabled = z12;
        this.groupId = l12;
        this.selected = z13;
        this.sellerSubtype = l13;
        this.sellerType = j12;
        this.subtitle = str2;
        this.title = str3;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C27159c getConfirmBlock() {
        return this.confirmBlock;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Long getGroupId() {
        return this.groupId;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final Long getSellerSubtype() {
        return this.sellerSubtype;
    }

    /* renamed from: g, reason: from getter */
    public final long getSellerType() {
        return this.sellerType;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: i, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
