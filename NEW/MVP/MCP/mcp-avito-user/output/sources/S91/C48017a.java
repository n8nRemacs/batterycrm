package s91;

import Y61.k;
import Y61.l;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: GetFloatingEntryPointApiResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ls91/a;", "", "Ls91/d;", "backgroundColor", "", "deadlineTimestamp", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Ls91/c;", "image", "<init>", "(Ls91/d;Ljava/lang/Double;Lcom/avito/android/deep_linking/links/DeepLink;Ls91/c;)V", "Ls91/d;", "a", "()Ls91/d;", "Ljava/lang/Double;", "b", "()Ljava/lang/Double;", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ls91/c;", "d", "()Ls91/c;", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: s91.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48017a {

    @com.google.gson.annotations.c("backgroundColor")
    @k
    private final d backgroundColor;

    @com.google.gson.annotations.c("deadlineTimestamp")
    @l
    private final Double deadlineTimestamp;

    @com.google.gson.annotations.c(Constants.DEEPLINK)
    @k
    private final DeepLink deeplink;

    @com.google.gson.annotations.c("image")
    @k
    private final c image;

    public C48017a(@k d dVar, @l Double d12, @k DeepLink deepLink, @k c cVar) {
        this.backgroundColor = dVar;
        this.deadlineTimestamp = d12;
        this.deeplink = deepLink;
        this.image = cVar;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final d getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Double getDeadlineTimestamp() {
        return this.deadlineTimestamp;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final c getImage() {
        return this.image;
    }
}
