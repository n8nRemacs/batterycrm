package V1;

import Y41.l;
import androidx.annotation.RestrictTo;
import java.util.HashMap;
import kotlin.Metadata;

/* compiled from: RelationUtil.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@X41.i
@RestrictTo
/* loaded from: classes10.dex */
public final class f {
    public static final void a(@Y61.k HashMap map, @Y61.k l lVar) {
        int i12;
        HashMap map2 = new HashMap(999);
        loop0: while (true) {
            i12 = 0;
            for (Object obj : map.keySet()) {
                map2.put(obj, map.get(obj));
                i12++;
                if (i12 == 999) {
                    break;
                }
            }
            lVar.invoke(map2);
            map2.clear();
        }
        if (i12 > 0) {
            lVar.invoke(map2);
        }
    }
}
