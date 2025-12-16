package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class p9h extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ List Y;
    public final /* synthetic */ x9h Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9h(x9h x9hVar, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = list;
        this.Z = x9hVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((p9h) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        p9h p9hVar = new p9h(this.Z, this.Y, continuation);
        p9hVar.X = obj;
        return p9hVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            f84 f84Var = (f84) this.X;
            List list = this.Y;
            if (list.isEmpty()) {
                return null;
            }
            ContextScope contextScopeA = d7j.a(this.b);
            ArrayList arrayList = new ArrayList(we3.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(svi.b(contextScopeA, null, new o9h(it.next(), null, f84Var, this.Z), 3));
            }
            this.o = 1;
            obj = hui.b(arrayList, this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        List list2 = (List) obj;
        Iterator it2 = list2.iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += ((bn3) it2.next()).d;
        }
        return new cn3(j, list2);
    }
}
