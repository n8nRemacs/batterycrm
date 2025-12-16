package Rb;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: SendV2Response.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LRb/k;", "", "", "cooldown", "", "isEmptyChat", "Lcom/avito/android/deep_linking/links/DeepLink;", "uxfeedback", "<init>", "(JLjava/lang/Boolean;Lcom/avito/android/deep_linking/links/DeepLink;)V", "J", "a", "()J", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k {

    @com.google.gson.annotations.c("cooldown")
    private final long cooldown;

    @com.google.gson.annotations.c("isEmptyChat")
    @Y61.l
    private final Boolean isEmptyChat;

    @com.google.gson.annotations.c("uxfeedback")
    @Y61.l
    private final DeepLink uxfeedback;

    public k(long j12, @Y61.l Boolean bool, @Y61.l DeepLink deepLink) {
        this.cooldown = j12;
        this.isEmptyChat = bool;
        this.uxfeedback = deepLink;
    }

    /* renamed from: a, reason: from getter */
    public final long getCooldown() {
        return this.cooldown;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final DeepLink getUxfeedback() {
        return this.uxfeedback;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final Boolean getIsEmptyChat() {
        return this.isEmptyChat;
    }
}
