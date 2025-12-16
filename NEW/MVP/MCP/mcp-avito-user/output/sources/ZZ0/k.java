package Zz0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.Metadata;

/* compiled from: Api1StrSellerOrdersImportantToNotePostResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u0016\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"LZz0/k;", "", "", "actionType", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "fromPage", "", "iid", "orderidString", "type", "uid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "c", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "e", "f", "getUid", "_avito_str-seller-orders-important-to-note_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k {

    @com.google.gson.annotations.c("action_type")
    @l
    private final String actionType;

    @com.google.gson.annotations.c(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME)
    @l
    private final String from;

    @com.google.gson.annotations.c("from_page")
    @l
    private final String fromPage;

    @com.google.gson.annotations.c("iid")
    @l
    private final Long iid;

    @com.google.gson.annotations.c("orderid_string")
    @l
    private final String orderidString;

    @com.google.gson.annotations.c("type")
    @l
    private final String type;

    @com.google.gson.annotations.c("uid")
    @l
    private final Long uid;

    public k(@l String str, @l String str2, @l String str3, @l Long l12, @l String str4, @l String str5, @l Long l13) {
        this.actionType = str;
        this.from = str2;
        this.fromPage = str3;
        this.iid = l12;
        this.orderidString = str4;
        this.type = str5;
        this.uid = l13;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getActionType() {
        return this.actionType;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getFromPage() {
        return this.fromPage;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Long getIid() {
        return this.iid;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getOrderidString() {
        return this.orderidString;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
