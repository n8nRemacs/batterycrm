package kF0;

import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2StrBookingPaymentTypesGetResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"LkF0/h;", "", "", "blockSpacing", "", "LkF0/g;", "blocks", "dashHeight", "<init>", "(JLjava/util/List;J)V", "J", "a", "()J", "Ljava/util/List;", "b", "()Ljava/util/List;", "c", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h {

    @com.google.gson.annotations.c("blockSpacing")
    private final long blockSpacing;

    @com.google.gson.annotations.c("blocks")
    @Y61.k
    private final List<g> blocks;

    @com.google.gson.annotations.c("dashHeight")
    private final long dashHeight;

    public h(long j12, @Y61.k List<g> list, long j13) {
        this.blockSpacing = j12;
        this.blocks = list;
        this.dashHeight = j13;
    }

    /* renamed from: a, reason: from getter */
    public final long getBlockSpacing() {
        return this.blockSpacing;
    }

    @Y61.k
    public final List<g> b() {
        return this.blocks;
    }

    /* renamed from: c, reason: from getter */
    public final long getDashHeight() {
        return this.dashHeight;
    }
}
