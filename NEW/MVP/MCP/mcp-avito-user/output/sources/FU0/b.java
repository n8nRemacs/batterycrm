package Fu0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.google.gson.annotations.c;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: OrderSendV4Response.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LFu0/b;", "", "", "message", "", "newButtonStyle", "LFu0/a;", "newPrimaryAction", "Lcom/avito/android/deep_linking/links/DeepLink;", "redirectLink", "<init>", "(Ljava/lang/String;Ljava/util/Map;LFu0/a;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "LFu0/a;", "c", "()LFu0/a;", "Lcom/avito/android/deep_linking/links/DeepLink;", "d", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_service-order-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    @c("message")
    @k
    private final String message;

    @c("newButtonStyle")
    @l
    private final Map<String, String> newButtonStyle;

    @c("newPrimaryAction")
    @k
    private final C13837a newPrimaryAction;

    @c("redirectLink")
    @k
    private final DeepLink redirectLink;

    public b(@k String str, @l Map<String, String> map, @k C13837a c13837a, @k DeepLink deepLink) {
        this.message = str;
        this.newButtonStyle = map;
        this.newPrimaryAction = c13837a;
        this.redirectLink = deepLink;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @l
    public final Map<String, String> b() {
        return this.newButtonStyle;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final C13837a getNewPrimaryAction() {
        return this.newPrimaryAction;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final DeepLink getRedirectLink() {
        return this.redirectLink;
    }
}
