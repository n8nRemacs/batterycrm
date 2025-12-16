package hz0;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Api2StrSellerOrdersListPostResponse.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011¨\u0006\u0017"}, d2 = {"Lhz0/k;", "", "Lhz0/l;", "analytics", "", "approve", "cancel", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "header", "<init>", "(Lhz0/l;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "Lhz0/l;", "a", "()Lhz0/l;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "e", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k {

    @com.google.gson.annotations.c("analytics")
    @Y61.l
    private final l analytics;

    @com.google.gson.annotations.c("approve")
    @Y61.l
    private final String approve;

    @com.google.gson.annotations.c("cancel")
    @Y61.l
    private final String cancel;

    @com.google.gson.annotations.c("description")
    @Y61.l
    private final AttributedText description;

    @com.google.gson.annotations.c("header")
    @Y61.l
    private final String header;

    public k(@Y61.l l lVar, @Y61.l String str, @Y61.l String str2, @Y61.l AttributedText attributedText, @Y61.l String str3) {
        this.analytics = lVar;
        this.approve = str;
        this.cancel = str2;
        this.description = attributedText;
        this.header = str3;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final l getAnalytics() {
        return this.analytics;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getApprove() {
        return this.approve;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getCancel() {
        return this.cancel;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final String getHeader() {
        return this.header;
    }
}
