package hk0;

import Y61.l;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: Api1RealtyEarlyAccessPayPostResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lhk0/a;", "", "", "message", "", "orderId", ContextActionHandler.Link.URL, "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "c", "_avito-discouraged_avito-api_early-access"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hk0.a, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C40951a {

    @c("message")
    @l
    private final String message;

    @c("orderId")
    @l
    private final Long orderId;

    @c(ContextActionHandler.Link.URL)
    @l
    private final String url;

    public C40951a(@l String str, @l Long l12, @l String str2) {
        this.message = str;
        this.orderId = l12;
        this.url = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Long getOrderId() {
        return this.orderId;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getUrl() {
        return this.url;
    }
}
