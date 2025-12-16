package Q80;

import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.generated.api.api_search_position_period_v_1.SortingControl;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiSearchPositionPeriodV1Response.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LQ80/n;", "", "LQ80/o;", "header", "", "LQ80/p;", "items", "LQ80/l;", "nextPageButton", "Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/SortingControl;", "sortingControl", "<init>", "(LQ80/o;Ljava/util/List;LQ80/l;Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/SortingControl;)V", "LQ80/o;", "a", "()LQ80/o;", "Ljava/util/List;", "b", "()Ljava/util/List;", "LQ80/l;", "c", "()LQ80/l;", "Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/SortingControl;", "d", "()Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/SortingControl;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class n {

    @com.google.gson.annotations.c("header")
    @Y61.k
    private final o header;

    @com.google.gson.annotations.c("items")
    @Y61.k
    private final List<p> items;

    @com.google.gson.annotations.c("nextPageButton")
    @Y61.l
    private final l nextPageButton;

    @com.google.gson.annotations.c("sortingControl")
    @Y61.l
    private final SortingControl sortingControl;

    public n(@Y61.k o oVar, @Y61.k List<p> list, @Y61.l l lVar, @Y61.l SortingControl sortingControl) {
        this.header = oVar;
        this.items = list;
        this.nextPageButton = lVar;
        this.sortingControl = sortingControl;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final o getHeader() {
        return this.header;
    }

    @Y61.k
    public final List<p> b() {
        return this.items;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final l getNextPageButton() {
        return this.nextPageButton;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final SortingControl getSortingControl() {
        return this.sortingControl;
    }
}
