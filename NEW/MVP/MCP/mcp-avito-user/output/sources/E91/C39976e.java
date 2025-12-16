package e91;

import Y61.k;
import Y61.l;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.Metadata;

/* compiled from: GetUsersResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Le91/e;", "", "Le91/a;", "avatar", "Le91/b;", Constants.DEEPLINK, "", "itemID", "", ContextActionHandler.Link.URL, "<init>", "(Le91/a;Le91/b;Ljava/lang/Long;Ljava/lang/String;)V", "Le91/a;", "a", "()Le91/a;", "Le91/b;", "b", "()Le91/b;", "Ljava/lang/Long;", "getItemID", "()Ljava/lang/Long;", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: e91.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C39976e {

    @com.google.gson.annotations.c("avatar")
    @k
    private final C39972a avatar;

    @com.google.gson.annotations.c(Constants.DEEPLINK)
    @l
    private final C39973b deeplink;

    @com.google.gson.annotations.c("itemID")
    @l
    private final Long itemID;

    @com.google.gson.annotations.c(ContextActionHandler.Link.URL)
    @l
    private final String url;

    public C39976e(@k C39972a c39972a, @l C39973b c39973b, @l Long l12, @l String str) {
        this.avatar = c39972a;
        this.deeplink = c39973b;
        this.itemID = l12;
        this.url = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final C39972a getAvatar() {
        return this.avatar;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C39973b getDeeplink() {
        return this.deeplink;
    }
}
