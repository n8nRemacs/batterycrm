package CM0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.Metadata;

/* compiled from: VerificationViewDisclaimerApiV4Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"LCM0/d;", "", "LCM0/b;", ContextActionHandler.Link.DEEPLINK, "", "icon", "type", "<init>", "(LCM0/b;Ljava/lang/String;Ljava/lang/String;)V", "LCM0/b;", "a", "()LCM0/b;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "getType", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d {

    @com.google.gson.annotations.c(ContextActionHandler.Link.DEEPLINK)
    @k
    private final b deepLink;

    @com.google.gson.annotations.c("icon")
    @l
    private final String icon;

    @com.google.gson.annotations.c("type")
    @k
    private final String type;

    public d(@k b bVar, @l String str, @k String str2) {
        this.deepLink = bVar;
        this.icon = str;
        this.type = str2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final b getDeepLink() {
        return this.deepLink;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }
}
