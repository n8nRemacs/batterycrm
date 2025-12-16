package Sx0;

import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.Metadata;

/* compiled from: Api4StrOrderSellerByOrderIdGetResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LSx0/a;", "", "LSx0/b;", "content", "LSx0/c;", "prompt", "", ContextActionHandler.Link.URL, "<init>", "(LSx0/b;LSx0/c;Ljava/lang/String;)V", "LSx0/b;", "a", "()LSx0/b;", "LSx0/c;", "b", "()LSx0/c;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Sx0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15252a {

    @com.google.gson.annotations.c("content")
    @Y61.l
    private final C15253b content;

    @com.google.gson.annotations.c("prompt")
    @Y61.l
    private final C15254c prompt;

    @com.google.gson.annotations.c(ContextActionHandler.Link.URL)
    @Y61.l
    private final String url;

    public C15252a(@Y61.l C15253b c15253b, @Y61.l C15254c c15254c, @Y61.l String str) {
        this.content = c15253b;
        this.prompt = c15254c;
        this.url = str;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final C15253b getContent() {
        return this.content;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final C15254c getPrompt() {
        return this.prompt;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getUrl() {
        return this.url;
    }
}
