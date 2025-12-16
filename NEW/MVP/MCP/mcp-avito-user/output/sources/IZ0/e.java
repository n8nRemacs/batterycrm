package iz0;

import Y61.l;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.Metadata;

/* compiled from: Api2StrSellerOrdersRangeGetResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Liz0/e;", "", "Liz0/f;", "content", "Liz0/c;", "prompt", "", "redirect", ContextActionHandler.Link.URL, "<init>", "(Liz0/f;Liz0/c;Ljava/lang/String;Ljava/lang/String;)V", "Liz0/f;", "a", "()Liz0/f;", "Liz0/c;", "b", "()Liz0/c;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e {

    @com.google.gson.annotations.c("content")
    @l
    private final f content;

    @com.google.gson.annotations.c("prompt")
    @l
    private final C42143c prompt;

    @com.google.gson.annotations.c("redirect")
    @l
    private final String redirect;

    @com.google.gson.annotations.c(ContextActionHandler.Link.URL)
    @l
    private final String url;

    public e(@l f fVar, @l C42143c c42143c, @l String str, @l String str2) {
        this.content = fVar;
        this.prompt = c42143c;
        this.redirect = str;
        this.url = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final f getContent() {
        return this.content;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C42143c getPrompt() {
        return this.prompt;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getRedirect() {
        return this.redirect;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getUrl() {
        return this.url;
    }
}
