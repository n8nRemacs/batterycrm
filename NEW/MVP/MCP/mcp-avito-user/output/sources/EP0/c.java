package ep0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ApiGetForecastsForAutoDispatchV1Request.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lep0/c;", "", "", "budget", "ttlDays", "<init>", "(Ljava/lang/Long;J)V", "Ljava/lang/Long;", "getBudget", "()Ljava/lang/Long;", "J", "getTtlDays", "()J", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {

    @com.google.gson.annotations.c("budget")
    @l
    private final Long budget;

    @com.google.gson.annotations.c("ttlDays")
    private final long ttlDays;

    public c(@l Long l12, long j12) {
        this.budget = l12;
        this.ttlDays = j12;
    }
}
