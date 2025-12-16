package shark;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ReferenceMatcher.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shark"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class h3 {
    @Y61.k
    public static final ArrayList a(@Y61.k List list, @Y61.k C48240c2 c48240c2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            g3 g3Var = (g3) obj;
            if ((g3Var instanceof C48369z2) || ((g3Var instanceof N2) && ((N2) g3Var).f438166c.invoke(c48240c2).booleanValue())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
