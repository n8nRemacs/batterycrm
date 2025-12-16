package Ko0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: SubscriptionsMobileListV2Response.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001d\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u001a\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b%\u0010\u0017¨\u0006&"}, d2 = {"LKo0/a;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", "description", "editAction", "", "hasNewItems", "", "id", "openAction", "pushFrequency", "sendEmail", "ssid", "title", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;ZJLjava/lang/String;JLjava/lang/Boolean;JLjava/lang/String;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "getEditAction", "Z", "getHasNewItems", "()Z", "J", "getId", "()J", "getOpenAction", "getPushFrequency", "Ljava/lang/Boolean;", "getSendEmail", "()Ljava/lang/Boolean;", "getSsid", "getTitle", "_avito_saved-searches-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ko0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14337a {

    @c(ContextActionHandler.Link.DEEPLINK)
    @k
    private final DeepLink deepLink;

    @c("description")
    @k
    private final String description;

    @c("editAction")
    @k
    private final String editAction;

    @c("hasNewItems")
    private final boolean hasNewItems;

    @c("id")
    private final long id;

    @c("openAction")
    @k
    private final String openAction;

    @c("pushFrequency")
    private final long pushFrequency;

    @c("sendEmail")
    @l
    private final Boolean sendEmail;

    @c("ssid")
    private final long ssid;

    @c("title")
    @k
    private final String title;

    public C14337a(@k DeepLink deepLink, @k String str, @k String str2, boolean z12, long j12, @k String str3, long j13, @l Boolean bool, long j14, @k String str4) {
        this.deepLink = deepLink;
        this.description = str;
        this.editAction = str2;
        this.hasNewItems = z12;
        this.id = j12;
        this.openAction = str3;
        this.pushFrequency = j13;
        this.sendEmail = bool;
        this.ssid = j14;
        this.title = str4;
    }
}
