package Np;

import Y61.k;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AgentRoomGetReportForAgentApiResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\tR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"LNp/d;", "", "", "LNp/j;", "months", "LNp/e;", "today", "weeks", "<init>", "(Ljava/util/List;LNp/e;Ljava/util/List;)V", "Ljava/util/List;", "getMonths", "()Ljava/util/List;", "LNp/e;", "getToday", "()LNp/e;", "getWeeks", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d {

    @com.google.gson.annotations.c("months")
    @k
    private final List<j> months;

    @com.google.gson.annotations.c("today")
    @k
    private final e today;

    @com.google.gson.annotations.c("weeks")
    @k
    private final List<j> weeks;

    public d(@k List<j> list, @k e eVar, @k List<j> list2) {
        this.months = list;
        this.today = eVar;
        this.weeks = list2;
    }
}
