package ru.cyberity.cbr.core.data.model.remote;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import ru.cyberity.cbr.core.data.model.Document;
import ru.cyberity.cbr.core.data.model.remote.l;

/* compiled from: RemoteRequiredDoc.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0002\u001a\u00020\u0004*\u00020\u0003¨\u0006\u0005"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/l$c;", "Lru/cyberity/cbr/core/data/model/Document$b$b;", "a", "Lru/cyberity/cbr/core/data/model/remote/l;", "Lru/cyberity/cbr/core/data/model/Document$b;", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class m {
    @Y61.k
    public static final Document.b.C12444b a(@Y61.k l.c cVar) {
        return new Document.b.C12444b(cVar.e(), cVar.i(), cVar.g(), cVar.k());
    }

    @Y61.k
    public static final Document.b a(@Y61.k l lVar) {
        l.c cVarN = lVar.n();
        LinkedHashMap linkedHashMap = null;
        Document.b.C12444b c12444bA = cVarN != null ? a(cVarN) : null;
        String strF = lVar.f();
        String strH = lVar.h();
        List<Integer> listJ = lVar.j();
        Map<Integer, l.c> mapL = lVar.l();
        if (mapL != null) {
            linkedHashMap = new LinkedHashMap(P0.f(mapL.size()));
            Iterator<T> it = mapL.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), a((l.c) entry.getValue()));
            }
        }
        return new Document.b(c12444bA, strF, strH, listJ, linkedHashMap);
    }
}
