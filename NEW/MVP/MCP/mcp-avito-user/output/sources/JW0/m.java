package jw0;

import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.Metadata;

/* compiled from: Api1StrBookingFormGetResponse.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0014\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001a"}, d2 = {"Ljw0/m;", "", "", "actionType", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "fromPage", "", "iid", "orderidString", SearchParamsConverterKt.SOURCE, "type", "uid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "c", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "e", "f", "g", "h", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m {

    @com.google.gson.annotations.c("action_type")
    @Y61.l
    private final String actionType;

    @com.google.gson.annotations.c(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME)
    @Y61.l
    private final String from;

    @com.google.gson.annotations.c("from_page")
    @Y61.l
    private final String fromPage;

    @com.google.gson.annotations.c("iid")
    @Y61.l
    private final Long iid;

    @com.google.gson.annotations.c("orderid_string")
    @Y61.l
    private final String orderidString;

    @com.google.gson.annotations.c(SearchParamsConverterKt.SOURCE)
    @Y61.l
    private final String source;

    @com.google.gson.annotations.c("type")
    @Y61.l
    private final String type;

    @com.google.gson.annotations.c("uid")
    @Y61.l
    private final Long uid;

    public m(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l Long l12, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l Long l13) {
        this.actionType = str;
        this.from = str2;
        this.fromPage = str3;
        this.iid = l12;
        this.orderidString = str4;
        this.source = str5;
        this.type = str6;
        this.uid = l13;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getActionType() {
        return this.actionType;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getFromPage() {
        return this.fromPage;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final Long getIid() {
        return this.iid;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final String getOrderidString() {
        return this.orderidString;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Y61.l
    /* renamed from: h, reason: from getter */
    public final Long getUid() {
        return this.uid;
    }
}
