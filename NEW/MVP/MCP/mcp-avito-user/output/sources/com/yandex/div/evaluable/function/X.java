package com.yandex.div.evaluable.function;

import androidx.compose.ui.platform.C22491k0;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;

/* compiled from: FunctionRegistry.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/evaluable/function/X;", "Lcom/yandex/div/evaluable/i;", "<init>", "()V", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class X implements com.yandex.div.evaluable.i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f369629a = new LinkedHashMap();

    @Y61.k
    public final com.yandex.div.evaluable.g a(@Y61.k String str, @Y61.k ArrayList arrayList) {
        Object next;
        Object obj = this.f369629a.get(str);
        if (obj == null) {
            throw new EvaluableException(C22491k0.a('.', "Unknown function name: ", str), null, 2, null);
        }
        List list = (List) obj;
        if (list.size() != 1) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.L.f(((com.yandex.div.evaluable.g) next).g(arrayList), g.c.b.f369941a)) {
                    break;
                }
            }
            com.yandex.div.evaluable.g gVar = (com.yandex.div.evaluable.g) next;
            if (gVar != null) {
                return gVar;
            }
            if (arrayList.isEmpty()) {
                throw new EvaluableException(AK.c.k("Non empty argument list is required for function '", str, "'."), null, 2, null);
            }
            StringBuilder sbA = androidx.appcompat.app.r.A("Function '", str, "' has no matching override for given argument types: ");
            sbA.append(com.yandex.div.evaluable.d.f(arrayList));
            sbA.append('.');
            throw new EvaluableException(sbA.toString(), null, 2, null);
        }
        com.yandex.div.evaluable.g gVar2 = (com.yandex.div.evaluable.g) C42745f0.E(list);
        g.c cVarG = gVar2.g(arrayList);
        if (cVarG instanceof g.c.b) {
            return gVar2;
        }
        if (cVarG instanceof g.c.C10892c) {
            StringBuilder sbA2 = androidx.appcompat.app.r.A("Too few arguments passed to function '", str, "': expected ");
            g.c.C10892c c10892c = (g.c.C10892c) cVarG;
            sbA2.append(c10892c.f369942a);
            sbA2.append(", got ");
            throw new EvaluableException(androidx.appcompat.app.r.t(sbA2, c10892c.f369943b, '.'), null, 2, null);
        }
        if (cVarG instanceof g.c.d) {
            StringBuilder sbA3 = androidx.appcompat.app.r.A("Too many arguments passed to function '", str, "': expected ");
            g.c.d dVar = (g.c.d) cVarG;
            sbA3.append(dVar.f369944a);
            sbA3.append(", got ");
            throw new EvaluableException(androidx.appcompat.app.r.t(sbA3, dVar.f369945b, '.'), null, 2, null);
        }
        if (!(cVarG instanceof g.c.a)) {
            throw new NoWhenBranchMatchedException();
        }
        StringBuilder sbA4 = androidx.appcompat.app.r.A("Call of function '", str, "' has argument type mismatch: expected ");
        g.c.a aVar = (g.c.a) cVarG;
        sbA4.append(aVar.f369939a);
        sbA4.append(", got ");
        sbA4.append(aVar.f369940b);
        sbA4.append('.');
        throw new EvaluableException(sbA4.toString(), null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[EDGE_INSN: B:76:0x0064->B:20:0x0064 BREAK  A[LOOP:2: B:38:0x00b1->B:42:0x00c8]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(@Y61.k com.yandex.div.evaluable.g r14) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.evaluable.function.X.b(com.yandex.div.evaluable.g):void");
    }
}
