package Qb;

import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.Metadata;

/* compiled from: OpenV2Response.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"LQb/g;", "", "", "actionType", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "fromPage", "", "iid", "type", "uid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)V", "Ljava/lang/String;", "getActionType", "()Ljava/lang/String;", "getFrom", "getFromPage", "Ljava/lang/Long;", "getIid", "()Ljava/lang/Long;", "getType", "getUid", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g {

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

    @com.google.gson.annotations.c("type")
    @Y61.l
    private final String type;

    @com.google.gson.annotations.c("uid")
    @Y61.l
    private final Long uid;

    public g(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l Long l12, @Y61.l String str4, @Y61.l Long l13) {
        this.actionType = str;
        this.from = str2;
        this.fromPage = str3;
        this.iid = l12;
        this.type = str4;
        this.uid = l13;
    }
}
