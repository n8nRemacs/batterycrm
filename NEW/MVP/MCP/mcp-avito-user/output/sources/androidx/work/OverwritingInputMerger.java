package androidx.work;

import androidx.work.C23544h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: OverwritingInputMerger.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/OverwritingInputMerger;", "Landroidx/work/y;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OverwritingInputMerger extends AbstractC23640y {
    @Override // androidx.work.AbstractC23640y
    @Y61.k
    public final C23544h a(@Y61.k ArrayList arrayList) {
        C23544h.a aVar = new C23544h.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll(Collections.unmodifiableMap(((C23544h) it.next()).f55510a));
        }
        aVar.b(linkedHashMap);
        return aVar.a();
    }
}
