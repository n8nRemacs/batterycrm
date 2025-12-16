package ep0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ApiGetForecastsForAutoDispatchV1Request.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lep0/b;", "", "", "firstDayAudience", "itemId", "Lep0/c;", "selectedOptions", "<init>", "(Ljava/lang/Long;JLep0/c;)V", "Ljava/lang/Long;", "getFirstDayAudience", "()Ljava/lang/Long;", "J", "getItemId", "()J", "Lep0/c;", "getSelectedOptions", "()Lep0/c;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ep0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40144b {

    @com.google.gson.annotations.c("firstDayAudience")
    @l
    private final Long firstDayAudience;

    @com.google.gson.annotations.c("itemId")
    private final long itemId;

    @com.google.gson.annotations.c("selectedOptions")
    @l
    private final c selectedOptions;

    public C40144b(@l Long l12, long j12, @l c cVar) {
        this.firstDayAudience = l12;
        this.itemId = j12;
        this.selectedOptions = cVar;
    }
}
