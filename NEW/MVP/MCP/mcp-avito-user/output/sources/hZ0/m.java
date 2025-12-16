package hz0;

import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.Metadata;

/* compiled from: Api2StrSellerOrdersListPostResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lhz0/m;", "", "Lhz0/n;", "content", "Lhz0/k;", "prompt", "", "redirect", ContextActionHandler.Link.URL, "<init>", "(Lhz0/n;Lhz0/k;Ljava/lang/String;Ljava/lang/String;)V", "Lhz0/n;", "a", "()Lhz0/n;", "Lhz0/k;", "b", "()Lhz0/k;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m {

    @com.google.gson.annotations.c("content")
    @Y61.l
    private final n content;

    @com.google.gson.annotations.c("prompt")
    @Y61.l
    private final k prompt;

    @com.google.gson.annotations.c("redirect")
    @Y61.l
    private final String redirect;

    @com.google.gson.annotations.c(ContextActionHandler.Link.URL)
    @Y61.l
    private final String url;

    public m(@Y61.l n nVar, @Y61.l k kVar, @Y61.l String str, @Y61.l String str2) {
        this.content = nVar;
        this.prompt = kVar;
        this.redirect = str;
        this.url = str2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final n getContent() {
        return this.content;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final k getPrompt() {
        return this.prompt;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getRedirect() {
        return this.redirect;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getUrl() {
        return this.url;
    }
}
