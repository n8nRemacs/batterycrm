package x90;

import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2SellersDashboardDataPostResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B1\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lx90/i;", "", "", "Lx90/j;", "metrics", "Lx90/m;", "moreButton", "Lx90/n;", "totals", "<init>", "(Ljava/util/List;Lx90/m;Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lx90/m;", "b", "()Lx90/m;", "c", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i {

    @com.google.gson.annotations.c("metrics")
    @Y61.l
    private final List<j> metrics;

    @com.google.gson.annotations.c("moreButton")
    @Y61.l
    private final m moreButton;

    @com.google.gson.annotations.c("totals")
    @Y61.l
    private final List<n> totals;

    public i(@Y61.l List<j> list, @Y61.l m mVar, @Y61.l List<n> list2) {
        this.metrics = list;
        this.moreButton = mVar;
        this.totals = list2;
    }

    @Y61.l
    public final List<j> a() {
        return this.metrics;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final m getMoreButton() {
        return this.moreButton;
    }

    @Y61.l
    public final List<n> c() {
        return this.totals;
    }
}
