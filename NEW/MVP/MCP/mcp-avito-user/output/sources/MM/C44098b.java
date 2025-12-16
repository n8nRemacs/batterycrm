package mm;

import Y61.k;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api4CampaignsSalesByIdItemsGetResponse.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lmm/b;", "", "", "", "itemIds", "minDiscount", "<init>", "(Ljava/util/List;J)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "J", "b", "()J", "_avito-discouraged_avito-network_campaigns-sale"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mm.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C44098b {

    @com.google.gson.annotations.c("itemIds")
    @k
    private final List<Long> itemIds;

    @com.google.gson.annotations.c("minDiscount")
    private final long minDiscount;

    public C44098b(@k List<Long> list, long j12) {
        this.itemIds = list;
        this.minDiscount = j12;
    }

    @k
    public final List<Long> a() {
        return this.itemIds;
    }

    /* renamed from: b, reason: from getter */
    public final long getMinDiscount() {
        return this.minDiscount;
    }
}
