package XJ0;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.text.TooltipAttribute;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1SellersPrivateStatisticsGeneralDynamicsLocationsPostResponse.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B?\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LXJ0/b;", "", "", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "", "id", "LXJ0/d;", "metrics", "", "title", "LXJ0/c;", TooltipAttribute.ATTRIBUTE_TYPE, "<init>", "(Ljava/util/List;JLjava/util/List;Ljava/lang/String;LXJ0/c;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "J", "b", "()J", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "LXJ0/c;", "e", "()LXJ0/c;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b {

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN)
    @l
    private final List<b> children;

    @com.google.gson.annotations.c("id")
    private final long id;

    @com.google.gson.annotations.c("metrics")
    @k
    private final List<d> metrics;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c(TooltipAttribute.ATTRIBUTE_TYPE)
    @l
    private final c tooltip;

    public b(@l List<b> list, long j12, @k List<d> list2, @k String str, @l c cVar) {
        this.children = list;
        this.id = j12;
        this.metrics = list2;
        this.title = str;
        this.tooltip = cVar;
    }

    @l
    public final List<b> a() {
        return this.children;
    }

    /* renamed from: b, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @k
    public final List<d> c() {
        return this.metrics;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final c getTooltip() {
        return this.tooltip;
    }
}
