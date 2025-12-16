package Q80;

import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiSearchPositionPeriodV1Response.kt */
@P
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\b\u0010\u0016R(\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LQ80/r;", "", "LQ80/s;", "chartParams", "", "LQ80/t;", "cols", "", "isGD", "LQ80/z;", "promotions", "LQ80/C;", "scrollDepth", "<init>", "(LQ80/s;Ljava/util/List;ZLjava/util/List;LQ80/C;)V", "LQ80/s;", "getChartParams", "()LQ80/s;", "Ljava/util/List;", "getCols", "()Ljava/util/List;", "Z", "()Z", "getPromotions", "LQ80/C;", "getScrollDepth", "()LQ80/C;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class r {

    @com.google.gson.annotations.c("chartParams")
    @Y61.k
    private final s chartParams;

    @com.google.gson.annotations.c("cols")
    @Y61.k
    private final List<t> cols;

    @com.google.gson.annotations.c("isGD")
    private final boolean isGD;

    @com.google.gson.annotations.c("promotions")
    @Y61.l
    private final List<List<z>> promotions;

    @com.google.gson.annotations.c("scrollDepth")
    @Y61.l
    private final C scrollDepth;

    /* JADX WARN: Multi-variable type inference failed */
    public r(@Y61.k s sVar, @Y61.k List<t> list, boolean z12, @Y61.l List<? extends List<z>> list2, @Y61.l C c12) {
        this.chartParams = sVar;
        this.cols = list;
        this.isGD = z12;
        this.promotions = list2;
        this.scrollDepth = c12;
    }
}
