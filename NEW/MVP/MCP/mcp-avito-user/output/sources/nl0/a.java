package NL0;

import Y61.k;
import com.avito.android.vas_performance.screens.stickers.buy.item.stickers.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: StickersItemExtensions.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_vas-performance_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {
    @k
    public static final List<com.avito.android.vas_performance.screens.stickers.buy.item.stickers.a> a(@k List<? extends com.avito.conveyor_item.a> list) {
        ArrayList arrayList;
        List<com.avito.android.vas_performance.screens.stickers.buy.item.stickers.a> list2;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof b) {
                arrayList2.add(obj);
            }
        }
        b bVar = (b) C42745f0.G(arrayList2);
        if (bVar == null || (list2 = bVar.f320667d) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (L.f(((com.avito.android.vas_performance.screens.stickers.buy.item.stickers.a) obj2).f320663d, Boolean.TRUE)) {
                    arrayList.add(obj2);
                }
            }
        }
        return arrayList == null ? C42784z0.f406748b : arrayList;
    }
}
