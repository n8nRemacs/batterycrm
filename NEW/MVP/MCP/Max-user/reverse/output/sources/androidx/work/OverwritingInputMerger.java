package androidx.work;

import defpackage.om7;
import defpackage.r5j;
import defpackage.yd4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends om7 {
    @Override // defpackage.om7
    public final yd4 a(ArrayList arrayList) {
        r5j r5jVar = new r5j(14);
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.putAll(Collections.unmodifiableMap(((yd4) it.next()).a));
        }
        r5jVar.E(map);
        return r5jVar.g();
    }
}
