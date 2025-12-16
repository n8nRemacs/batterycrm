package d91;

import java.util.List;
import kotlin.Metadata;

/* compiled from: GetUserVisibleMessagesResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ld91/F;", "", "Ld91/B;", "fallback", "", "", "platforms", "<init>", "(Ld91/B;Ljava/util/List;)V", "Ld91/B;", "a", "()Ld91/B;", "Ljava/util/List;", "b", "()Ljava/util/List;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class F {

    @com.google.gson.annotations.c("fallback")
    @Y61.l
    private final C39538B fallback;

    @com.google.gson.annotations.c("platforms")
    @Y61.l
    private final List<Integer> platforms;

    public F(@Y61.l C39538B c39538b, @Y61.l List<Integer> list) {
        this.fallback = c39538b;
        this.platforms = list;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final C39538B getFallback() {
        return this.fallback;
    }

    @Y61.l
    public final List<Integer> b() {
        return this.platforms;
    }
}
