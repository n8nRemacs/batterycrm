package ZJ0;

import com.avito.android.remote.model.AdvertStatus;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api3SellersPrivateStatisticsGeneralConfigPostResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"LZJ0/e;", "", "", "LZJ0/l;", "active", "", AdvertStatus.REMOVED, "<init>", "(Ljava/util/List;Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "b", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e {

    @com.google.gson.annotations.c("active")
    @Y61.l
    private final List<l> active;

    @com.google.gson.annotations.c(AdvertStatus.REMOVED)
    @Y61.l
    private final List<Long> removed;

    public e(@Y61.l List<l> list, @Y61.l List<Long> list2) {
        this.active = list;
        this.removed = list2;
    }

    @Y61.l
    public final List<l> a() {
        return this.active;
    }

    @Y61.l
    public final List<Long> b() {
        return this.removed;
    }
}
