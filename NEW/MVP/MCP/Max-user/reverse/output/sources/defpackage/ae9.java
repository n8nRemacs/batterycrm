package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ae9 extends dtf implements sm6 {
    public final /* synthetic */ List X;
    public final /* synthetic */ ce9 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae9(ce9 ce9Var, List list, Continuation continuation) {
        super(2, continuation);
        this.o = ce9Var;
        this.X = list;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ae9 ae9Var = (ae9) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ae9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ae9(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Set setSingleton;
        g8j.b(obj);
        ce9 ce9Var = this.o;
        Iterator it = lee.g(new at(2, (Iterable) ce9Var.w0.a.getValue()), new y37(1, this.X)).iterator();
        if (it.hasNext()) {
            Long lValueOf = Long.valueOf(((lc9) it.next()).a);
            if (it.hasNext()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(lValueOf);
                while (it.hasNext()) {
                    linkedHashSet.add(Long.valueOf(((lc9) it.next()).a));
                }
                setSingleton = linkedHashSet;
            } else {
                setSingleton = Collections.singleton(lValueOf);
            }
        } else {
            setSingleton = rd5.a;
        }
        ce9Var.t0 = setSingleton;
        ed9 ed9Var = ce9Var.X;
        svi.e(ed9Var.b, null, null, new dd9(ed9Var, new yc9(ce9Var.b, ce9Var.c, setSingleton), null), 3);
        return qqg.a;
    }
}
