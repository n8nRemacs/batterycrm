package Q80;

import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.generated.api.api_search_position_period_v_1.ChartMobileColsItemPromotionsItem;
import com.avito.android.remote.model.category_parameters.SelectionType;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiSearchPositionPeriodV1Response.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, d2 = {"LQ80/h;", "", "Lcom/avito/android/remote/model/text/AttributedText;", SelectionType.TYPE_DAY, "LQ80/i;", "position", "", "Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/ChartMobileColsItemPromotionsItem;", "promotions", "weekDay", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;LQ80/i;Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "LQ80/i;", "b", "()LQ80/i;", "Ljava/util/List;", "c", "()Ljava/util/List;", "d", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h {

    @com.google.gson.annotations.c(SelectionType.TYPE_DAY)
    @Y61.k
    private final AttributedText day;

    @com.google.gson.annotations.c("position")
    @Y61.l
    private final i position;

    @com.google.gson.annotations.c("promotions")
    @Y61.l
    private final List<ChartMobileColsItemPromotionsItem> promotions;

    @com.google.gson.annotations.c("weekDay")
    @Y61.l
    private final AttributedText weekDay;

    public h(@Y61.k AttributedText attributedText, @Y61.l i iVar, @Y61.l List<ChartMobileColsItemPromotionsItem> list, @Y61.l AttributedText attributedText2) {
        this.day = attributedText;
        this.position = iVar;
        this.promotions = list;
        this.weekDay = attributedText2;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final AttributedText getDay() {
        return this.day;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final i getPosition() {
        return this.position;
    }

    @Y61.l
    public final List<ChartMobileColsItemPromotionsItem> c() {
        return this.promotions;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final AttributedText getWeekDay() {
        return this.weekDay;
    }
}
