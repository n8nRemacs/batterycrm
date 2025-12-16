package ZJ0;

import com.avito.android.remote.model.category_parameters.SelectionType;
import kotlin.Metadata;

/* compiled from: Api3SellersPrivateStatisticsGeneralConfigPostResponse.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"LZJ0/g;", "", "", SelectionType.TYPE_DAY, SelectionType.TYPE_MONTH, "week", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "Ljava/lang/Long;", "getDay", "()Ljava/lang/Long;", "getMonth", "getWeek", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g {

    @com.google.gson.annotations.c(SelectionType.TYPE_DAY)
    @Y61.l
    private final Long day;

    @com.google.gson.annotations.c(SelectionType.TYPE_MONTH)
    @Y61.l
    private final Long month;

    @com.google.gson.annotations.c("week")
    @Y61.l
    private final Long week;

    public g(@Y61.l Long l12, @Y61.l Long l13, @Y61.l Long l14) {
        this.day = l12;
        this.month = l13;
        this.week = l14;
    }
}
