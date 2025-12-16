package Za;

import Y61.l;
import com.avito.android.advert_stats.detail.tab.AdvertDetailStatsTabItem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ItemStatsStorage.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advert-stats_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f {
    @l
    public static final AdvertDetailStatsTabItem a(@l String str) {
        g.f20211a.getClass();
        ArrayList arrayList = g.f20212b;
        Object obj = null;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (L.f(((AdvertDetailStatsTabItem) next).getTitle(), str)) {
                obj = next;
                break;
            }
        }
        return (AdvertDetailStatsTabItem) obj;
    }
}
