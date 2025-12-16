package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class c7c {
    public final tw0 a;
    public final k18 b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public c7c(tw0 tw0Var, k18 k18Var) {
        this.a = tw0Var;
        this.b = k18Var;
    }

    public final void a() {
        ConcurrentHashMap concurrentHashMap = this.c;
        Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            d7c d7cVar = (d7c) ((Map.Entry) it.next()).getValue();
            d7cVar.g = null;
            d7cVar.h = null;
            d7cVar.i = null;
            d7cVar.j = null;
            d7cVar.k = null;
            d7cVar.l = null;
            d7cVar.m = null;
            d7cVar.n = false;
            d7cVar.o = false;
            d7cVar.p = false;
        }
        concurrentHashMap.clear();
    }

    public final void b(pb2 pb2Var, si9 si9Var) {
        d7c d7cVarA = ((e7c) this.b.getValue()).a(null, si9Var);
        this.c.put(Long.valueOf(si9Var.a), d7cVarA);
        d7cVarA.i(pb2Var);
    }
}
