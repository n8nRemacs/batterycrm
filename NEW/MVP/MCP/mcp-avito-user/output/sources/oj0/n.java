package OJ0;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedUserStatsFiltersEvent.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_user-stats_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class n {
    @Y61.k
    public static final String a(@Y61.k List<String> list) {
        StringBuilder sb2 = new StringBuilder("[");
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            String str = (String) obj;
            if (i12 > 0) {
                sb2.append(", ");
            }
            sb2.append(i12);
            sb2.append(": ");
            sb2.append(str);
            i12 = i13;
        }
        sb2.append(']');
        return sb2.toString();
    }
}
