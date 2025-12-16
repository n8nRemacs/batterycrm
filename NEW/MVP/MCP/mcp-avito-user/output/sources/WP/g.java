package wP;

import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.Metadata;

/* compiled from: ApiPaidCvGetCvsRequest.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LwP/g;", "", "", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "<init>", "(Ljava/lang/Long;Ljava/lang/Long;)V", "Ljava/lang/Long;", "a", "()Ljava/lang/Long;", "b", "_avito_job_crm-paid-cvs_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g {

    @com.google.gson.annotations.c(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME)
    @Y61.l
    private final Long from;

    @com.google.gson.annotations.c(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME)
    @Y61.l
    private final Long to;

    public g(@Y61.l Long l12, @Y61.l Long l13) {
        this.from = l12;
        this.to = l13;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Long getFrom() {
        return this.from;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final Long getTo() {
        return this.to;
    }
}
