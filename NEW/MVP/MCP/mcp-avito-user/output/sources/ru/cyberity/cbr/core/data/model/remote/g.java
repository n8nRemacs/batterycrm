package ru.cyberity.cbr.core.data.model.remote;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import ru.cyberity.cbr.core.data.model.FlowActionType;
import ru.cyberity.cbr.core.data.model.a;
import ru.cyberity.cbr.core.data.model.remote.f;

/* compiled from: RemoteAction.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0002\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\u0002\u001a\u00020\u0006*\u00020\u0005¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/f$c$c;", "Lru/cyberity/cbr/core/data/model/a$a;", "a", "Lru/cyberity/cbr/core/data/model/remote/f$d;", "Lru/cyberity/cbr/core/data/model/a$b;", "Lru/cyberity/cbr/core/data/model/remote/f;", "Lru/cyberity/cbr/core/data/model/a;", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class g {
    @Y61.k
    public static final a.C12447a a(@Y61.k f.c.C12456c c12456c) {
        return new a.C12447a(c12456c.d(), c12456c.f(), c12456c.h());
    }

    @Y61.k
    public static final a.b a(@Y61.k f.d dVar) {
        return new a.b(dVar.l(), dVar.j(), dVar.n(), dVar.f(), dVar.h());
    }

    @Y61.k
    public static final ru.cyberity.cbr.core.data.model.a a(@Y61.k f fVar) {
        String strN = fVar.n();
        String strH = fVar.h();
        FlowActionType flowActionTypeT = fVar.t();
        String strJ = fVar.j();
        String strL = fVar.l();
        List<f.c.C12456c> listB = fVar.p().b();
        ArrayList arrayList = new ArrayList(C42745f0.q(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(a((f.c.C12456c) it.next()));
        }
        return new ru.cyberity.cbr.core.data.model.a(strN, strH, flowActionTypeT, strJ, strL, arrayList, a(fVar.r()));
    }
}
